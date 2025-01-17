/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 12 08:05:07 GMT 2014
 */

package com.google.javascript.jscomp.deps;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.ErrorManager;
import com.google.javascript.jscomp.deps.DependencyInfo;
import com.google.javascript.jscomp.deps.JsFileParser;
import com.google.javascript.jscomp.deps.SimpleDependencyInfo;
import java.io.FileNotFoundException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class JsFileParserEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = "H7)$+4B%M@Sml";
      ErrorManager errorManager0 = null;
      JsFileParser jsFileParser0 = new JsFileParser(errorManager0);
      assertNotNull(jsFileParser0);
      assertEquals(false, jsFileParser0.didParseSucceed());
      
      String string1 = "";
      assertNotSame(string1, string0);
      
      boolean boolean0 = jsFileParser0.parseLine(string0);
      assertFalse(string0.equals((Object)string1));
      assertNotSame(string0, string1);
      assertEquals(false, jsFileParser0.didParseSucceed());
      assertTrue(boolean0);
      
      jsFileParser0.setShortcutMode(boolean0);
      assertFalse(string0.equals((Object)string1));
      assertNotSame(string0, string1);
      assertEquals(false, jsFileParser0.didParseSucceed());
      
      boolean boolean1 = jsFileParser0.parseLine(string1);
      assertTrue(boolean1 == boolean0);
      assertFalse(string1.equals((Object)string0));
      assertNotSame(string1, string0);
      assertEquals(false, jsFileParser0.didParseSucceed());
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String string0 = "H7)$+4B%M@Sml";
      ErrorManager errorManager0 = null;
      JsFileParser jsFileParser0 = new JsFileParser(errorManager0);
      assertNotNull(jsFileParser0);
      assertEquals(false, jsFileParser0.didParseSucceed());
      
      boolean boolean0 = jsFileParser0.parseLine(string0);
      assertEquals(false, jsFileParser0.didParseSucceed());
      assertTrue(boolean0);
      
      jsFileParser0.setShortcutMode(boolean0);
      assertEquals(false, jsFileParser0.didParseSucceed());
      
      boolean boolean1 = jsFileParser0.parseLine(string0);
      assertFalse(boolean1 == boolean0);
      assertEquals(false, jsFileParser0.didParseSucceed());
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ErrorManager errorManager0 = null;
      JsFileParser jsFileParser0 = new JsFileParser(errorManager0);
      assertNotNull(jsFileParser0);
      assertEquals(false, jsFileParser0.didParseSucceed());
      
      String string0 = "require";
      boolean boolean0 = jsFileParser0.parseLine(string0);
      assertEquals(false, jsFileParser0.didParseSucceed());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String string0 = "H7)$+4B%M@Sml";
      ErrorManager errorManager0 = null;
      JsFileParser jsFileParser0 = new JsFileParser(errorManager0);
      assertNotNull(jsFileParser0);
      assertEquals(false, jsFileParser0.didParseSucceed());
      
      String string1 = "(?:^|;)\\s*goog\\.(provide|require)\\s*\\((.*?)\\)";
      assertNotSame(string1, string0);
      
      SimpleDependencyInfo simpleDependencyInfo0 = (SimpleDependencyInfo)jsFileParser0.parseFile(string0, string0, string1);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertNotNull(simpleDependencyInfo0);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertEquals("H7)$+4B%M@Sml", simpleDependencyInfo0.getPathRelativeToClosureBase());
      assertEquals("H7)$+4B%M@Sml", simpleDependencyInfo0.getName());
      assertEquals(true, jsFileParser0.didParseSucceed());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ErrorManager errorManager0 = null;
      JsFileParser jsFileParser0 = new JsFileParser(errorManager0);
      assertNotNull(jsFileParser0);
      assertEquals(false, jsFileParser0.didParseSucceed());
      
      String string0 = "%";
      try {
        DependencyInfo dependencyInfo0 = jsFileParser0.parseFile(string0, string0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
