#!/usr/bin/python
import sys, os, subprocess,fnmatch, shutil, csv, re, datetime
import time
from os import listdir
from os.path import isfile, join

def travFolder(dir,dataset,checkdataset):
   listdirs = os.listdir(dir)
   for f in listdirs:
       pattern = 'patch*.patch'
       if os.path.isfile(os.path.join(dir, f)):
           if fnmatch.fnmatch(f, pattern):
                #first temporary checkout project
                checkout_project(f,'tmp_projects','b')
                sanity_check(f,dataset,checkdataset)
                remove_project('tmp_projects')        
       else:
           if 'tmp.patch' not in f:
                travFolder(dir+'/'+f,dataset,checkdataset)




def checkout_project(file,project,bugtype):
    filename=os.path.splitext(file)[0]
    arraynames=filename.split("-")
    projectId=arraynames[1]
    bugId=arraynames[2]
    lcProjectId=projectId.decode('utf-8').lower()
    if not os.path.exists(project):
         os.system('mkdir '+project)
         os.system('mkdir '+project+'/lib')
         os.system('cp ./lib/evosuite-standalone-runtime-1.0.5.jar  '+project+'/lib/')
    if not os.path.exists(project+'/'+projectId):
        os.system('mkdir '+project+'/'+projectId)
    os.system( d4jpath+'/defects4j checkout -p '+projectId+' -v '+bugId+bugtype+' -w ./'+project+'/'+projectId+'/'+lcProjectId+'_'+bugId+'_buggy')  


def remove_project(project):
    if  os.path.exists(project):
        os.system('rm -rf '+project)

def sanity_check(file,dataset,checkdataset):
    filename=os.path.splitext(file)[0]
    #split the patch name
    arraynames=filename.split("-")
    projectId=arraynames[1]
    bugId=arraynames[2]
    toolId=arraynames[3]
    currentpath=os.path.dirname(os.path.realpath(__file__))
    #lower case of project id
    lcProjectId=projectId.decode('utf-8').lower()
    #get patch path
    patchpath='Patches/'+dataset+'/'+toolId+'/'+projectId+'/'+file 
    print patchpath
    result=apply_patch(patchpath,dataset,toolId,projectId,bugId,lcProjectId,'tmp_projects')
    print result
    #record the applicable result in csv file
    if checkdataset == 'applicable':
        with open('./statistics/applicable_check'+date+'.csv', 'a') as csvfile:
            filewriter = csv.writer(csvfile, delimiter=',',
                            quotechar='|', quoting=csv.QUOTE_MINIMAL)
            
            if "FAILED" in result:
                filewriter.writerow([file,dataset,"FAILED"])
            else:
                filewriter.writerow([file,dataset,"OK"])
    if checkdataset == 'plausibility':
        program_path='./tmp_projects/'+projectId+'/'+lcProjectId+'_'+bugId+'_buggy/'
        os.chdir(program_path)
        os.system(d4jpath+'/defects4j compile')
        test_result=os.popen(d4jpath+'/defects4j test').read() 
        print  test_result
        resultlines=test_result.split('\n');
        failingTestsNo=''
        failingInfo=''
        for line in resultlines:
            if '::' not in line:
                if not line=='':
                    if ':' in line:
                        failingTestsNo=line.split(':')[1]   
            else:
                failingTestClass=line.split('::')[0]
                failingInfo=failingInfo+';'+line.split('::')[1]
        os.chdir('../../../')
        with open('./statistics/plausibility_check'+date+'.csv', 'a') as csvfile:
                filewriter = csv.writer(csvfile, delimiter=',',
                                quotechar='|', quoting=csv.QUOTE_MINIMAL)                  
                filewriter.writerow([file,dataset,failingTestsNo,failingInfo])
                         

def patches_overview(dir,dataset):
    with open('./statistics/patches_overview.csv', 'a') as csvfile:
        filewriter = csv.writer(csvfile, delimiter=',',
                                quotechar='|', quoting=csv.QUOTE_MINIMAL) 
        listdirs = os.listdir(dir)
        for f in listdirs:
            #patch1-Chart-14-ACS.patch
            pattern = 'patch*.patch'
            if os.path.isfile(os.path.join(dir, f)):
                if fnmatch.fnmatch(f, pattern):              
                    filename=os.path.splitext(f)[0]
                    arraynames=filename.split("-")
                    projectId=arraynames[1] 
                    bugId=arraynames[2]
                    toolId=arraynames[3]                                                             
                    link='https://github.com/kth-tcs/defects4-repair-reloaded/blob/master/Patches/'+dataset+'/'+toolId+'/'+projectId+'/'+f
                    #Get the stored path of a patch
                    # patchpath='./Patches/'+dataset+'/'+toolId+'/'+projectId+'/'+f 
                    patchpath=dir+'/'+f
                    addcount=0
                    minuscount=0
                    with open(patchpath) as file:
                        lines = file.readlines()
                        for l in lines:
                            if "+"==l[0]:
                                #ignore +++
                                if "+" !=l[1]:
                                    #ignore comment
                                    if "//" not in l:
                                        addcount = addcount+1
                            if "-"==l[0]:
                                #ignore ---
                                if "-" !=l[1]:
                                    minuscount=minuscount+1
                        # writing to csv file
                        filewriter.writerow([f,projectId+bugId,toolId,dataset,addcount,minuscount,link])
            else:
                patches_overview(dir+'/'+f,dataset)
        

def append_header(csvfile, header):
    with open('./statistics/'+csvfile, 'w') as csvfile:
        filewriter = csv.writer(csvfile, delimiter=',',
                                quotechar='|', quoting=csv.QUOTE_MINIMAL) 
        filewriter.writerow([header])

def autotest(patchName,dataset,testSuite,isflakyCheck,removeindicator):
    print patchName
    libpath=currentpath+'/lib/evosuite-standalone-runtime-1.0.5.jar:'+currentpath+'/lib/junit-4.12.jar:'+currentpath+'/lib/hamcrest-core-1.3.jar'
    patchName=patchName.replace('|','').replace('\n','')
    arraynames=os.path.splitext(patchName)[0].split("-")   
    # arraynames ['patch1', 'Chart', '1', 'CapGen']
    patchNo=arraynames[0] 
    projectId=arraynames[1] 
    bugId=arraynames[2]
    toolId=arraynames[3]
    lcProjectId=projectId.decode('utf-8').lower()

    # checkout the original buggy programs to buggy_projects
    if isflakyCheck=="true":
        checkout_project(patchName,'buggy_projects','f')
        if removeindicator=='':
            reportname="flaky_check_"+date+'.csv'
        else:
            reportname="flaky_check_"+date+removeindicator+'.csv'
    elif isflakyCheck=="false":
        checkout_project(patchName,'buggy_projects','b')
        reportname="Autotest_check_"+date+'.csv'
        # apply patches to buggy programs
        patchpath='Patches/'+dataset+'/'+toolId+'/'+projectId+'/'+patchName 
        applyresult=apply_patch(patchpath,dataset,toolId,projectId,bugId,lcProjectId,'buggy_projects')
        print applyresult
   
    # derermine the target patch of the tests
    program_path='./buggy_projects/'+projectId+'/'+lcProjectId+'_'+bugId+'_buggy'
    if projectId=='Lang':
        target_test_path=program_path+'/src/test/java'
        if not os.path.isdir(target_test_path):
                target_test_path=program_path+'/src/test'
    if projectId=='Math':
        target_test_path=program_path+'/src/test/java'
        if not os.path.isdir(target_test_path):
                target_test_path=program_path+'/src/test'
    if projectId=='Chart':
        target_test_path=program_path+'/tests'
    if projectId=='Time':
        target_test_path=program_path+'/src/test/java'
    if projectId=='Closure':
        target_test_path=program_path+'/test'
    
    if 'Evosuite' in testSuite:
        if testSuite=='ASE15_Evosuite':
            testpath='./RGT/ASE15/evosuite/'+projectId+'/'+bugId+'/'+projectId+'/evosuite-branch/'
            testseed=10
        if testSuite=='EMSE18_Evosuite':
            testpath='./RGT/EMSE18/'+projectId+'/'+projectId+bugId+'/'
            testseed=30
        if testSuite=='2019_Evosuite':
            testpath='./RGT/2019/evosuite/'+projectId+'/'+bugId+'/'
            testseed=30
    
        for i in range (0,testseed):
            seedpath=testpath+str(i)
            # copy test file
            if os.path.isdir(seedpath):
                # os.system('cp -r '+seedpath+'/.  '+target_test_path)
                # compile the tests
                os.chdir(program_path)
                os.system(d4jpath+'/defects4j compile')
                os.chdir('../../../')  
                os.system('cp -r '+seedpath+'/.  '+target_test_path)
                compath=commonTestPath(seedpath)
                comfolder=compath.rsplit('/',1)[0]
                evotestpath = target_test_path.split(program_path)[1][1:]+compath
                evotestpath=evotestpath.replace('ESTest','ESTest*')
                os.chdir(program_path)
                compileTest=''
                if os.path.exists("./target/classes"):
                    compileTest = 'javac -cp '+libpath+':./target/classes '
                    if os.path.exists("./target/test-classes"):
                        compileTest = 'javac -cp '+libpath+':./target/classes:./target/test-classes '
                    elif os.path.exists("./target/tests"):
                        compileTest = 'javac -cp '+libpath+':./target/classes:./target/tests '
                if os.path.exists("./build/classes"):
                    compileTest = 'javac -cp '+libpath+':./build/classes '
                    if os.path.exists("./build/tests"):
                        compileTest = 'javac -cp '+libpath+':./build/classes:./build/tests '
                    if os.path.exists("./build/test"):
                        compileTest = 'javac -cp '+libpath+':./build/classes:./build/test '
                        if os.path.exists("./build/lib/classes"):
                            compileTest = 'javac -cp '+libpath+':./build/classes:./build/test:./build/lib/classes '
                            if os.path.exists("./build/classess/rhino_ast"):
                                compileTest = 'javac -cp '+libpath+':./build/classes:./build/test:./build/lib/classes:./build/classes/rhino_ast/java '
                            if os.path.exists("./build/lib/rhino.jar"):
                                compileTest = compileTest[:-1]+':./build/lib/rhino.jar '                           
                
                if os.path.exists("./build/"):
                    if compileTest=='':
                        compileTest = 'javac -cp '+libpath+':./build '
                    else:
                        compileTest = compileTest[:-1]+':./build '
                if os.path.exists("./build-tests"):
                    compileTest = 'javac -cp '+libpath+':./build:./build-tests '
                if os.path.exists("./lib/libtrunk_rhino_parser_jarjared.jar"):
                    compileTest = compileTest[:-1]+':./lib/libtrunk_rhino_parser_jarjared.jar '
                if os.path.exists("./lib/guava.jar"):
                    compileTest = compileTest[:-1]+':./lib/guava.jar:./lib/protobuf-java.jar '
                if os.path.exists("./lib/guava-r06.jar"):
                    compileTest = compileTest[:-1]+':./lib/guava-r06.jar:./lib/protobuf-java-2.3.0.jar:./lib/libtrunk_rhino_parser_jarjared.jar '
                if os.path.exists("./lib/itext.jar"):
                    compileTest = compileTest[:-1]+':./lib/itext.jar '
                

                compileTestscript=compileTest+evotestpath
                print compileTestscript
                os.system('gtimeout 300 '+compileTestscript)
                ###### Move the build classes to target
                #MATH: target/test-classes
                evotestclass=evotestpath.replace(".java",".class")
                evotargetclass=comfolder
                print comfolder
                if os.path.exists("./target/test-classes"):
                    os.system('cp -rf '+evotestclass+' ./target/test-classes'+evotargetclass)
                    # shutil.copy(evotestclass,"./target/test-classes"+evotargetclass)
                if os.path.exists("./target/tests"):
                    os.system('cp -rf '+evotestclass+' ./target/tests'+evotargetclass)
                    # shutil.copy(evotestclass,"./target/tests"+evotargetclass)
                if os.path.exists("./build-tests"):
                    os.system('cp -rf '+evotestclass+' ./build-tests'+evotargetclass)
                    # shutil.copy(evotestclass,"./build-tests"+evotargetclass)
                if os.path.exists("./build/test"):
                    print '$$$$$$$$cp -rf '+evotestclass+' ./build/test'+evotargetclass
                    os.system('cp -rf '+evotestclass+' ./build/test'+evotargetclass)
                    # shutil.copy(evotestpath.replace(".java",".class"),"./build/test"+compath.replace(".java",".class"))
                if os.path.exists("./build/tests"):
                    os.system('cp -rf '+evotestclass+' ./build/tests'+evotargetclass)
                    # shutil.copy(evotestclass,"./build/tests"+evotargetclass)

                #####run the specfic target test case
                clazzpath = compath[1:].replace('.java','').replace('/','.')
                print clazzpath
                executeTest=compileTest.replace("javac","java")+" org.junit.runner.JUnitCore "+clazzpath
                print executeTest
                
                result=os.popen('gtimeout 300 '+executeTest).read()
                # result=os.popen(d4jpath+'/defects4j test').read()
                print result               
                os.chdir('../../../')  

                with open('./statistics/'+reportname, 'a') as csvfile:
                    filewriter = csv.writer(csvfile, delimiter=',',
                                    quotechar='|', quoting=csv.QUOTE_MINIMAL)
                    resultlines=result.split('\n')
                    patchName=patchName.replace('|','').replace('\n','')
                    time=''
                    okpattern='OK (* tests)'
                    failpattern='Tests run: *,  Failures: *'         
                    failInfoPattern='*test*(*)'           
                    failingInfo=''
                    failingTestsNo=0
                    testrun=''
                    assertionfailpattern='*org.junit.ComparisonFailure:*expected*but was*'
                    assertfailinfo=''
                    exceptionpattern='*java.lang.AssertionError: Expecting exception*'
                    exceptioninfo=''
                    otherreason=''
                    for k in range(0,len(resultlines)):
                        line=resultlines[k]
                        if 'Time:' in line:
                            time=line.split('Time: ')[1]
                        if fnmatch.fnmatch(line, okpattern):
                            failingTestsNo=0
                            testrun=line.split('(')[1].split(' ')[0]
                        if fnmatch.fnmatch(line, failpattern):
                            failingTestsNo=line.split("Failures:")[1]
                            testrun=line.split(",")[0].split("Tests run: ")[1]
                            print testrun
                            print failingTestsNo
                        if fnmatch.fnmatch(line, failInfoPattern):
                            failingInfo=failingInfo+line
                            otherreason+=resultlines[k+1]
                        if fnmatch.fnmatch(line, assertionfailpattern):
                            assertfailinfo+=line+'^'
                        if fnmatch.fnmatch(line, exceptionpattern):
                            exceptioninfo+=line+'^'                        
 
                    filewriter.writerow([patchName,projectId, bugId, testSuite, i, testrun, failingTestsNo, time, failingInfo, assertfailinfo,exceptioninfo,otherreason])      
            else:
                print 'No tests for '+patchName+' in test suite '+testSuite
        remove_project('buggy_projects')  
  


    if 'Randoop' in testSuite:
        if testSuite=='ASE15_Randoop':
            randoop_path='./RGT/ASE15/randoop/'
            testseed=11
        elif testSuite=='2019_Randoop':
            randoop_path='./RGT/2019/randoop/'
            testseed=31
        
        #copy randoop tests       
        os.chdir(program_path)
        os.system(d4jpath+'/defects4j compile')
        os.chdir('../../../') 
        for i in range(1,testseed):
            print i
            #extract the bz2 file first
            print 'tar -jxvf '+randoop_path+projectId+'/randoop/'+str(i)+'/'+projectId+'-'+bugId+'f-randoop.'+str(i)+'.tar.bz2'
            if testSuite=='ASE15_Randoop':
                os.system('tar -jxvf '+randoop_path+projectId+'/randoop/'+str(i)+'/'+projectId+'-'+bugId+'f-randoop.'+str(i)+'.tar.bz2')
            if testSuite=='2019_Randoop':
                if projectId=='Time':
                    os.system('tar -jxvf '+randoop_path+projectId+'/randoop/'+str(i)+'/'+projectId+'-'+bugId+'f-randoop.'+str(i)+'.tar.bz2')
                else:
                    print "mkdir"+ '   ./'+projectId+'-'+bugId+'f-randoop.'+str(i)
                    os.system('mkdir '+projectId+'-'+bugId+'f-randoop.'+str(i))
                    os.system('tar -jxvf '+randoop_path+projectId+'/randoop/'+str(i)+'/'+projectId+'-'+bugId+'f-randoop.'+str(i)+'.tar.bz2  -C ./'+projectId+'-'+bugId+'f-randoop.'+str(i))
            original_test_path='./'+projectId+'-'+bugId+'f-randoop.'+str(i)
            
            if os.path.exists(original_test_path):
                print 'original_test_path:'+original_test_path     
                listdirs = os.listdir(original_test_path)
                for f in listdirs:
                    if os.path.isfile(os.path.join(original_test_path, f)):
                        os.system('cp -r '+original_test_path+'/.  '+target_test_path)
                    else:
                        os.system('cp -r '+original_test_path+'/'+f+'/.  '+target_test_path)
                #delete extracted file
                os.system('rm -r '+projectId+'-'+bugId+'f-randoop.'+str(i))
                #check the build targer
                os.chdir(program_path)    
                compileTest=''           
                
                if os.path.exists("./target/classes"):
                    compileTest = 'javac -cp '+libpath+':./target/classes '
                    if os.path.exists("./target/test-classes"):
                        compileTest = 'javac -cp '+libpath+':./target/classes:./target/test-classes '
                    elif os.path.exists("./target/tests"):
                        compileTest = 'javac -cp '+libpath+':./target/classes:./target/tests '
                if os.path.exists("./build/classes"):
                    compileTest = 'javac -cp '+libpath+':./build/classes '
                    if os.path.exists("./build/tests"):
                        compileTest = 'javac -cp '+libpath+':./build/classes:./build/tests '
                    if os.path.exists("./build/test"):
                        compileTest = 'javac -cp '+libpath+':./build/classes:./build/test '
                        if os.path.exists("./build/lib/classes"):
                            compileTest = 'javac -cp '+libpath+':./build/classes:./build/test:./build/lib/classes '
                            if os.path.exists("./build/classess/rhino_ast"):
                                compileTest = 'javac -cp '+libpath+':./build/classes:./build/test:./build/lib/classes:./build/classes/rhino_ast/java '
                            if os.path.exists("./build/lib/rhino.jar"):
                                compileTest = compileTest[:-1]+':./build/lib/rhino.jar '                           
                
                if os.path.exists("./build/"):
                    if compileTest=='':
                        compileTest = 'javac -cp '+libpath+':./build '
                    else:
                        compileTest = compileTest[:-1]+':./build '
                if os.path.exists("./build-tests"):
                    compileTest = 'javac -cp '+libpath+':./build:./build-tests '
                if os.path.exists("./lib/libtrunk_rhino_parser_jarjared.jar"):
                    compileTest = compileTest[:-1]+':./lib/libtrunk_rhino_parser_jarjared.jar '
                if os.path.exists("./lib/guava.jar"):
                    compileTest = compileTest[:-1]+':./lib/guava.jar:./lib/protobuf-java.jar '
                if os.path.exists("./lib/guava-r06.jar"):
                    compileTest = compileTest[:-1]+':./lib/guava-r06.jar:./lib/protobuf-java-2.3.0.jar:./lib/libtrunk_rhino_parser_jarjared.jar '
                if os.path.exists("./lib/itext.jar"):
                    compileTest = compileTest[:-1]+':./lib/itext.jar '

                #compile
                if testSuite=='ASE15_Randoop':
                    randoopSrcFiles=target_test_path.split(program_path)[1][1:]+"/RandoopTest*.java"
                if testSuite=='2019_Randoop':
                    randoopSrcFiles=target_test_path.split(program_path)[1][1:]+"/RegressionTest*.java"
                print 'randoopSrcFiles'+randoopSrcFiles
                compilescript=compileTest+randoopSrcFiles

                
                print compilescript
                os.system('gtimeout  300 '+compilescript)
                target_class_path=''
                #move compile to test target
                if os.path.exists("./target/test-classes"):
                    target_class_path="./target/test-classes"
                    os.system('cp -rf ./'+randoopSrcFiles.replace(".java",".class") + "  ./target/test-classes/")
                if os.path.exists("./target/tests"):
                    target_class_path="./target/tests"
                    os.system('cp -rf ./'+randoopSrcFiles.replace(".java",".class") + "  ./target/tests/")
                if os.path.exists("./build-tests"):
                    target_class_path="./build-tests"
                    os.system('cp -rf ./'+randoopSrcFiles.replace(".java",".class") + "  ./build-tests/")
                if os.path.exists("./build/test"):
                    target_class_path="./build/test"
                    os.system('cp -rf ./'+randoopSrcFiles.replace(".java",".class") + "  ./build/test/")
                if os.path.exists("./build/tests"):
                    target_class_path="./build/tests"
                    os.system('cp -rf ./'+randoopSrcFiles.replace(".java",".class") + "  ./build/tests/")

                #execute test cases
                target_class_files=''
                listdirs = os.listdir(target_class_path)
                for f in listdirs:
                    if testSuite=='ASE15_Randoop':
                        pattern = 'RandoopTest*.class'
                    elif testSuite=='2019_Randoop':
                        pattern = 'RegressionTest*.class'
                    if os.path.isfile(os.path.join(target_class_path, f)):
                        if fnmatch.fnmatch(f, pattern):
                            target_class_files=target_class_files+f.split(".")[0]+' '
                       
                executeTest=compileTest.replace("javac","java")+" org.junit.runner.JUnitCore "+target_class_files
                print executeTest
                result=""           
                result=os.popen('gtimeout 300 '+executeTest).read()
                print result

                #remove the classes files
                if os.path.exists(target_class_path):
                    if testSuite=='ASE15_Randoop':
                        os.system('rm -rf '+target_class_path+'/Randoop*')
                    elif testSuite=='2019_Randoop':
                        os.system('rm -rf '+target_class_path+'/Regression*')


                os.chdir('../../../')                 
                with open('./statistics/'+reportname, 'a') as csvfile:
                    filewriter = csv.writer(csvfile, delimiter=',',
                                    quotechar='|', quoting=csv.QUOTE_MINIMAL)
                    resultlines=result.split('\n')
                    time=''
                    okpattern='OK (* tests)'
                    failpattern='Tests run: *,  Failures: *'         
                    failInfoPattern='*test*(*)'           
                    failingInfo=''
                    failingTestsNo=0
                    testrun=''
                    NoTestFoundCount=0
                    warningpatern='*warning*'
                    reason=''

                    for k in range(0,len(resultlines)):
                        line=resultlines[k]
                        if 'Time:' in line:
                            time=line.split('Time: ')[1]
                        if fnmatch.fnmatch(line, okpattern):
                            failingTestsNo='0'
                            testrun=line.split('(')[1].split(' ')[0]
                        if fnmatch.fnmatch(line, failpattern):
                            failingTestsNo=line.split("Failures:")[1]
                            testrun=line.split(",")[0].split("Tests run: ")[1]
                            print testrun
                            print failingTestsNo
                        if fnmatch.fnmatch(line, failInfoPattern):
                            line=line.split('at')[0].replace(' ','')
                            failingInfo+=line+'^'
                            reason+=resultlines[k+1]+'^'
                        if fnmatch.fnmatch(line, warningpatern):
                            NoTestFoundCount=int(NoTestFoundCount)+1
                        
                        
                    filewriter.writerow([patchName,projectId, bugId, testSuite, i, testrun, int(failingTestsNo)-int(NoTestFoundCount), time, failingInfo,reason])    
            else:
                with open('./statistics/'+reportname, 'a') as csvfile:
                    filewriter = csv.writer(csvfile, delimiter=',',
                                    quotechar='|', quoting=csv.QUOTE_MINIMAL)
                    filewriter.writerow([patchName,projectId, bugId, testSuite, i,'0','0','0', 'No tests'])   

        remove_project('buggy_projects')  
            

def commonTestPath(path):
    for root, dirs, files in os.walk(path, topdown=False):
        for name in files:
            pattern = '*Test.java'
            if fnmatch.fnmatch(name, pattern):
                return os.path.join(root, name).split(path)[1]
    return ''


def apply_patch(patchpath,dataset,toolId,projectId,bugId,lcProjectId,buggyProject):
    with open(patchpath) as f:
        difffiles=f.read().split('\n\n\n')
        for diffs in difffiles:
            # split a patch to several temporary patches in case one patch containes many fixes for different files
            filepath='./tmp.patch'
            f=open(filepath,"w")
            f.write(diffs)
            f.close()
            tmppatch='./tmp.patch'
            first_line = diffs.split('\n')[0]
            # original buggy file patch
            filepath=first_line.split('--- ')[1]
            original_file='./'+buggyProject+'/'+projectId+'/'+lcProjectId+'_'+bugId+'_buggy/'+filepath
            result=os.popen("patch -u -l --fuzz=10  -i  " +tmppatch +"  "+ original_file).read()
            os.remove(tmppatch)
            return result



def flaky_tests_check():
   with open('./statistics/fixbugs.txt') as fixbugs:
       lines=fixbugs.readlines()
       for f in lines:
           print f
           #first temporary checkout the fix version of project
           autotest(f,"D_correct","2019_Evosuite","true")
           autotest(f,"D_correct","2019_Randoop","true")
        #    autotest(f,"D_correct","EMSE18_Evosuite","true")
                

def post_init():
    os.system('cp ./lib/Chart.build.xml ./defects4j/framework/projects/Chart/ ')
    os.system('cp ./lib/Closure.build.xml ./defects4j/framework/projects/Closure/ ')
    os.system('cp ./lib/Math.build.xml ./defects4j/framework/projects/Math/ ')
    os.system('cp ./lib/Lang.build.xml ./defects4j/framework/projects/Lang/ ')


def rq1_3(dir,dataset):
    listdirs = os.listdir(dir)
    for f in listdirs:
        pattern = 'patch*.patch'
        if os.path.isfile(os.path.join(dir, f)):
            if fnmatch.fnmatch(f, pattern):
                os.system("./run.py patch_assessment  "+f+'  ' + dataset+"  2019_Evosuite")
                os.system("./run.py patch_assessment  "+f+'  ' + dataset+"  2019_Randoop")
        else:
            rq1_3(dir+'/'+f,dataset)
        

def rq4(dir,dataset):
    listdirs = os.listdir(dir)
    for f in listdirs:
        pattern = 'patch*.patch'
        if os.path.isfile(os.path.join(dir, f)):
            if fnmatch.fnmatch(f, pattern):
                os.system("./run.py patch_assessment  "+f+'  ' + dataset+"  ASE15_Evosuite")
                os.system("./run.py patch_assessment  "+f+'  ' + dataset+"  ASE15_Randoop")
                os.system("./run.py patch_assessment  "+f+'  ' + dataset+"  EMSE18_Evosuite")
        else:
            rq4(dir+'/'+f,dataset)

def rmflakyevosuite(testSuite, project, bug, seed, specific_tests):
    print project
    print bug
    print seed
    testpath='./RGT/'+testSuite.split('_')[0]+'/evosuite/'+project+'/'+bug+'/'+seed
    print testpath
    commonpath=commonTestPath(testpath)
    testpath=testpath+commonpath
    print testpath
    source=''
    tests = specific_tests.split('^')
    for test in tests:
        with open(testpath) as testfile:
            lines=testfile.readlines()
            source=lines[0]
            sz= len(lines)
            print sz
            for k in range(2,sz):
                l = lines[k]
                if 'public void '+test+'()'  in l:
                        print l
                        source+='//'+lines[k-1]
                else:
                    source+=lines[k-1]
            source+=lines[sz-1]
        with open(testpath,'w') as writetestfile:
            writetestfile.truncate(0)
            writetestfile.write(source)


def rmflakyrandoop(testSuite, project, bug, seed, specific_tests):
    print project
    print bug
    print seed
    testpath='./RGT/'+testSuite.split('_')[0]+'/randoop/'+project+'/randoop/'+seed
    print testpath
    commonpath=commonTestPath(testpath)
    testpath=testpath+commonpath
    print testpath
    source=''
    tests = specific_tests.split('^')
   
    os.chdir(testpath)
    #extract
    achivename=project+'-'+bug+'f-randoop.'+seed
    os.system('mkdir ./'+achivename)
    extract = 'tar -jxvf '+achivename+'.tar.bz2 -C '+achivename
    os.system(extract)
    os.chdir(achivename) 
    
    for flakytest in tests:
        method=flakytest.split('(')[0]
        test=flakytest.split('(')[1]
        print method
        print test
        if  os.path.exists(test+'.java'):
            with open(test+'.java') as testfile:
                    modified=''
                    tlines=testfile.readlines()
                    modified=tlines[0]
                    startflag=False
                    sz=len(tlines)
                    for i in range(1, sz):
                        l=tlines[i]
                        if startflag == False:
                            if 'public void '+method+'()' in l:
                                print l
                                startflag=True
                                start=i
                                modified=modified+'//'+tlines[i-1]
                            else:
                                modified=modified+tlines[i-1]
                        if startflag == True:
                            if i-start>0:
                                # when no @test in the file
                                # if 'public void ' not in l:
                                if '@Test' not in l:
                                    modified=modified+'//'+tlines[i-1]
                                else:
                                    modified=modified+tlines[i-1]
                                    startflag=False
                    modified+=tlines[sz-1]

            with open(test+'.java','w') as wfile:
                wfile.write(modified)

    # compress the target files
    os.chdir("..")
    compress = 'tar -czvf '+achivename+'.tar.bz2  ' +achivename        
    os.system(compress)
    os.system('rm -rf '+achivename)                            
    os.chdir("../../../../../../")
        

if __name__ == '__main__':
    currentpath=os.path.dirname(os.path.realpath(__file__))
    d4jpath=currentpath+'/defects4j/framework/bin'
    Dcorrect='./Patches/Dcorrect'
    Doverfitting='./Patches/Doverfitting'
    command=sys.argv[1]
    now = datetime.datetime.now()
    date = now.strftime("%Y-%m-%d")
    if command=='applicable_check': 
        travFolder(Dcorrect,'Dcorrect','applicable')
        travFolder(Doverfitting,'Doverfitting','applicable')       

    elif command=='plausible_check':  
        travFolder(Dcorrect,'Dcorrect','plausibility')
        travFolder(Doverfitting,'Doverfitting','plausibility')
        
    elif command=='patches_overview':
        append_header('patches_overview.csv','patch_name,bug_id,tool_name,dataset,#added_lines,#removed_lines,url_link')
        patches_overview(Dcorrect,'Dcorrect')
        patches_overview(Doverfitting,'Doverfitting')
       
    # ./run.py patch_assessment patch1-Chart-1-CapGen.patch Dcorrect ASE15_Evosuite "true" for fix version
    # and false for buggy version
    elif command=='patch_assessment':
        patchName=sys.argv[2] #e.g.patch1-Chart-1-CapGen.patch
        dataset=sys.argv[3] # Dcorrect,Doverfitting,
        testSuite=sys.argv[4] # ASE15_Evosuite|ASE15_Randoop|EMSE18_Evosuite|2019_Evosuite|2019_Randoop
        autotest(patchName,dataset,testSuite,"false",'')

    elif command=='flaky_check':
        patchName=sys.argv[2] #e.g.patch1-Chart-1-CapGen.patch
        dataset=sys.argv[3] # Dcorrect,Doverfitting,
        testSuite=sys.argv[4] # ASE15_Evosuite|ASE15_Randoop|EMSE18_Evosuite|2019_Evosuite|2019_Randoop
        autotest(patchName,dataset,testSuite,"true",'')

    elif command=='flaky_check_and_remove':
        patchName=sys.argv[2] #e.g.patch1-Chart-1-CapGen.patch
        dataset=sys.argv[3] # Dcorrect,Doverfitting
        testSuite=sys.argv[4] # ASE15_Evosuite|ASE15_Randoop|EMSE18_Evosuite|2019_Evosuite|2019_Randoop
        indicator=str(now).split(" ")[1]
        autotest(patchName,dataset,testSuite,"true",indicator)
        reportname="flaky_check_"+date+indicator+'.csv'
        if 'Evosuite' in testSuite:
            os.system('./run.py rmevosuiteflaky ./statistics/'+reportname)
        elif 'Randoop' in testSuite:
            os.system('./run.py rmRandoopFlaky ./statistics/'+reportname)

    elif command=='RQ1':
        rq1_3('./Patches/Dcorrect','Dcorrect')
    
    elif command=='RQ3':
        rq1_3('./Patches/Doverfitting','Doverfitting')

    elif command=='RQ4':
        rq4('./Patches/Doverfitting','Doverfitting')
   
    elif command=='rmevosuiteflaky':
        path = sys.argv[2]
        with open(path) as flakytests:
            lines=flakytests.readlines()
            #index 1 = patch number
            #index 7 = fail number
            #index 9 = failing tests
            for i in range(0,len(lines)):
                line=lines[i]
                infos=line.split(',')
                if ".patch" in infos[0]:
                    if int(infos[6])>0:
                        if len(infos)>8:
                            specific_tests=''
                            fails= infos[8]
                            print fails
                            fails= fails.split('(')
                            for f in fails:
                                m=re.search('\stest\d+', f)
                                if m!=None:
                                   specific_tests += m.group(0).replace(' ','')+'^'
                            # removeflaky(testSuite, project, bug, seed, specific_tests[:-1])
                            rmflakyevosuite(infos[3], infos[1], infos[2], infos[4], specific_tests[:-1])
                      
    elif command=='rmRandoopFlaky':
        path = sys.argv[2]
        print path
        with open(path) as flakytests:
            lines=flakytests.readlines()
            #index 1 = patch number
            #index 7 = fail number
            #index 9 = failing tests
            for i in range(0,len(lines)):
                line=lines[i]
                infos=line.split(',')
                if ".patch" in infos[0]:
                    if int(infos[6])>0:
                        if len(infos)>8:
                            specific_tests=''
                            fails= infos[8]
                            print fails
                            fails= fails.split('^')
                            for f in fails:
                                print f
                                if 'test' in f:
                                    t=f.split(')')[1]                              
                                    specific_tests += t+'^'
                        
                            rmflakyrandoop(infos[3], infos[1], infos[2], infos[4], specific_tests[:-1])

