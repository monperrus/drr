/*
 * This file was automatically generated by EvoSuite
 * Sun Jun 23 02:40:09 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.ClosureCodingConvention;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.GoogleCodingConvention;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.jscomp.TypedScopeCreator;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import java.io.File;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TypedScopeCreator_ESTest extends TypedScopeCreator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("Be,c");
      ClosureCodingConvention closureCodingConvention0 = (ClosureCodingConvention)compiler0.defaultCodingConvention;
      Node node1 = new Node(43, node0);
      TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0, closureCodingConvention0);
      Scope scope0 = typedScopeCreator0.createScope(node1, (Scope) null);
      assertTrue(scope0.isGlobal());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("`LQ& [ylXA]");
      Compiler compiler0 = new Compiler(mockPrintStream0);
      Node node0 = compiler0.parseTestCode("7");
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention();
      TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0, closureCodingConvention0);
      Scope scope0 = typedScopeCreator0.createScope(node0, (Scope) null);
      assertFalse(scope0.isLocal());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("Be,c");
      ClosureCodingConvention closureCodingConvention0 = (ClosureCodingConvention)compiler0.defaultCodingConvention;
      node0.setType(41);
      TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0, closureCodingConvention0);
      Scope scope0 = typedScopeCreator0.createScope(node0, (Scope) null);
      assertTrue(scope0.isGlobal());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("com.google.javascript.jscomp.TypedScopeCreator$LocalScopeBuildr");
      ClosureCodingConvention closureCodingConvention0 = (ClosureCodingConvention)compiler0.defaultCodingConvention;
      TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0, closureCodingConvention0);
      Node node1 = new Node(38, node0, node0);
      Scope scope0 = typedScopeCreator0.createInitialScope(node1);
      Scope scope1 = typedScopeCreator0.createScope(node0, scope0);
      assertEquals(1, scope1.getVarCount());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MockFile mockFile0 = new MockFile("com.google.javascript.jscomp.TypedScopeCreator$LocalScopeBuilder");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      Compiler compiler0 = new Compiler(mockPrintStream0);
      Node node0 = compiler0.parseTestCode("com.google.javascript.jscomp.TypedScopeCreator$LocalScopeBuilder");
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0, googleCodingConvention0);
      node0.setType((-530));
      // Undeclared exception!
      try { 
        typedScopeCreator0.createScope(node0, (Scope) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.TypedScopeCreator$AbstractScopeBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      File file0 = MockFile.createTempFile("goog.typedef", "goog.typedef");
      MockPrintStream mockPrintStream0 = new MockPrintStream(file0);
      Compiler compiler0 = new Compiler(mockPrintStream0);
      Node node0 = compiler0.parseTestCode("goog.typedef");
      TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0);
      Scope scope0 = typedScopeCreator0.createScope(node0, (Scope) null);
      assertEquals(33, scope0.getVarCount());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Node node0 = Node.newNumber((-1.0));
      node0.addSuppression((String) null);
      JSDocInfo jSDocInfo0 = TypedScopeCreator.getBestJSDocInfo(node0);
      assertFalse(jSDocInfo0.isNoAlias());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("Be,c");
      Node node1 = new Node(46, node0, 14, 0);
      JSDocInfo jSDocInfo0 = TypedScopeCreator.getBestJSDocInfo(node0);
      assertNull(jSDocInfo0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("com.google.javascript.jscomp.TypedScopeCreator$LocalScopeBuildr");
      Node node1 = new Node(38, node0, node0);
      // Undeclared exception!
      try { 
        TypedScopeCreator.getBestJSDocInfo(node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.TypedScopeCreator", e);
      }
  }
}
