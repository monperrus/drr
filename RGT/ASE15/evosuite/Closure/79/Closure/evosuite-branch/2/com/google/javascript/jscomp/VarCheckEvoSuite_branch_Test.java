/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 22:17:43 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.JSSourceFile;
import com.google.javascript.jscomp.VarCheck;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.mock.java.lang.MockRuntimeException;
import org.junit.runner.RunWith;

 
public class VarCheckEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      String string0 = "com.goAgle.protobuf.Wir5Format$q;eldType";
      JSSourceFile jSSourceFile0 = JSSourceFile.fromCode(string0, string0);
      assertNotNull(jSSourceFile0);
      assertEquals("com.goAgle.protobuf.Wir5Format$q;eldType", jSSourceFile0.toString());
      assertEquals("com.goAgle.protobuf.Wir5Format$q;eldType", jSSourceFile0.getName());
      assertEquals("com.goAgle.protobuf.Wir5Format$q;eldType", jSSourceFile0.getOriginalPath());
      
      Node node0 = compiler0.parse(jSSourceFile0);
      assertNotNull(node0);
      assertEquals("com.goAgle.protobuf.Wir5Format$q;eldType", jSSourceFile0.toString());
      assertEquals("com.goAgle.protobuf.Wir5Format$q;eldType", jSSourceFile0.getName());
      assertEquals("com.goAgle.protobuf.Wir5Format$q;eldType", jSSourceFile0.getOriginalPath());
      assertEquals(2, node0.getChildCount());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(132, node0.getType());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isQuotedString());
      assertEquals(0, node0.getCharno());
      assertEquals(true, node0.hasMoreThanOneChild());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, compiler0.acceptEcmaScript5());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getWarningCount());
      
      VarCheck varCheck0 = new VarCheck(compiler0);
      assertNotNull(varCheck0);
      assertEquals(false, compiler0.acceptEcmaScript5());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getWarningCount());
      
      // Undeclared exception!
      try {
        varCheck0.process(node0, node0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // INTERNAL COMPILER ERROR.
         // Please report this problem.
         // null
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      String string0 = "JSC_INVULID_MARKjR_US,GE";
      JSSourceFile jSSourceFile0 = JSSourceFile.fromCode(string0, string0);
      assertNotNull(jSSourceFile0);
      assertEquals("JSC_INVULID_MARKjR_US,GE", jSSourceFile0.getOriginalPath());
      assertEquals("JSC_INVULID_MARKjR_US,GE", jSSourceFile0.toString());
      assertEquals("JSC_INVULID_MARKjR_US,GE", jSSourceFile0.getName());
      
      Node node0 = compiler0.parse(jSSourceFile0);
      assertNotNull(node0);
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.acceptEcmaScript5());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals("JSC_INVULID_MARKjR_US,GE", jSSourceFile0.getOriginalPath());
      assertEquals("JSC_INVULID_MARKjR_US,GE", jSSourceFile0.toString());
      assertEquals("JSC_INVULID_MARKjR_US,GE", jSSourceFile0.getName());
      assertEquals(132, node0.getType());
      assertEquals(1, node0.getChildCount());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(0, node0.getCharno());
      assertEquals(true, node0.hasOneChild());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      
      int int0 = (-28);
      Node node1 = new Node(int0, node0, node0);
      assertNotNull(node1);
      assertNotSame(node1, node0);
      assertNotSame(node0, node1);
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.acceptEcmaScript5());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, node1.isLocalResultCall());
      assertEquals(1, node1.getChildCount());
      assertEquals(-28, node1.getType());
      assertEquals(-1, node1.getLineno());
      assertEquals(false, node1.isOnlyModifiesThisCall());
      assertEquals(true, node1.hasOneChild());
      assertEquals(false, node1.isVarArgs());
      assertEquals(false, node1.isQualifiedName());
      assertEquals(false, node1.isQuotedString());
      assertEquals(-1, node1.getCharno());
      assertEquals(false, node1.isUnscopedQualifiedName());
      assertEquals(false, node1.isNoSideEffectsCall());
      assertEquals(false, node1.isOptionalArg());
      assertEquals(false, node1.wasEmptyNode());
      assertEquals(true, node1.hasChildren());
      assertEquals(false, node1.hasMoreThanOneChild());
      assertEquals(0, node1.getSideEffectFlags());
      assertEquals(false, node1.isSyntheticBlock());
      assertEquals("JSC_INVULID_MARKjR_US,GE", jSSourceFile0.getOriginalPath());
      assertEquals("JSC_INVULID_MARKjR_US,GE", jSSourceFile0.toString());
      assertEquals("JSC_INVULID_MARKjR_US,GE", jSSourceFile0.getName());
      assertEquals(132, node0.getType());
      assertEquals(1, node0.getChildCount());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(0, node0.getCharno());
      assertEquals(true, node0.hasOneChild());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertFalse(node1.equals((Object)node0));
      assertFalse(node0.equals((Object)node1));
      
      VarCheck varCheck0 = new VarCheck(compiler0);
      assertNotNull(varCheck0);
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.acceptEcmaScript5());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      
      // Undeclared exception!
      try {
        varCheck0.process(node0, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      String string0 = "rt?FSZ";
      JSSourceFile jSSourceFile0 = JSSourceFile.fromCode(string0, string0);
      assertNotNull(jSSourceFile0);
      assertEquals("rt?FSZ", jSSourceFile0.toString());
      assertEquals("rt?FSZ", jSSourceFile0.getName());
      assertEquals("rt?FSZ", jSSourceFile0.getOriginalPath());
      
      Node node0 = compiler0.parse(jSSourceFile0);
      assertNotNull(node0);
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isVarArgs());
      assertEquals(0, node0.getChildCount());
      assertEquals(125, node0.getType());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.hasChildren());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals("rt?FSZ", jSSourceFile0.toString());
      assertEquals("rt?FSZ", jSSourceFile0.getName());
      assertEquals("rt?FSZ", jSSourceFile0.getOriginalPath());
      assertEquals(true, compiler0.hasErrors());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.acceptEcmaScript5());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(1, compiler0.getErrorCount());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.acceptConstKeyword());
      
      int int0 = 0;
      Node node1 = new Node(int0, node0, node0);
      assertNotNull(node1);
      assertNotSame(node0, node1);
      assertNotSame(node1, node0);
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isVarArgs());
      assertEquals(0, node0.getChildCount());
      assertEquals(125, node0.getType());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.hasChildren());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals("rt?FSZ", jSSourceFile0.toString());
      assertEquals("rt?FSZ", jSSourceFile0.getName());
      assertEquals("rt?FSZ", jSSourceFile0.getOriginalPath());
      assertEquals(-1, node1.getLineno());
      assertEquals(false, node1.isNoSideEffectsCall());
      assertEquals(0, node1.getSideEffectFlags());
      assertEquals(true, node1.hasOneChild());
      assertEquals(false, node1.wasEmptyNode());
      assertEquals(0, node1.getType());
      assertEquals(1, node1.getChildCount());
      assertEquals(false, node1.hasMoreThanOneChild());
      assertEquals(false, node1.isUnscopedQualifiedName());
      assertEquals(false, node1.isLocalResultCall());
      assertEquals(false, node1.isSyntheticBlock());
      assertEquals(false, node1.isOptionalArg());
      assertEquals(-1, node1.getCharno());
      assertEquals(false, node1.isQuotedString());
      assertEquals(false, node1.isVarArgs());
      assertEquals(false, node1.isQualifiedName());
      assertEquals(false, node1.isOnlyModifiesThisCall());
      assertEquals(true, node1.hasChildren());
      assertEquals(true, compiler0.hasErrors());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.acceptEcmaScript5());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(1, compiler0.getErrorCount());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertFalse(node0.equals((Object)node1));
      assertFalse(node1.equals((Object)node0));
      
      VarCheck varCheck0 = new VarCheck(compiler0);
      assertNotNull(varCheck0);
      assertEquals(true, compiler0.hasErrors());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.acceptEcmaScript5());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(1, compiler0.getErrorCount());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.acceptConstKeyword());
      
      varCheck0.process(node0, node0);
      assertNotSame(node0, node1);
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isVarArgs());
      assertEquals(0, node0.getChildCount());
      assertEquals(125, node0.getType());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.hasChildren());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals("rt?FSZ", jSSourceFile0.toString());
      assertEquals("rt?FSZ", jSSourceFile0.getName());
      assertEquals("rt?FSZ", jSSourceFile0.getOriginalPath());
      assertEquals(true, compiler0.hasErrors());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.acceptEcmaScript5());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(1, compiler0.getErrorCount());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertFalse(node0.equals((Object)node1));
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      String string0 = "o.google.protobuf.WireFormat$FielType";
      JSSourceFile jSSourceFile0 = JSSourceFile.fromCode(string0, string0);
      assertNotNull(jSSourceFile0);
      assertEquals("o.google.protobuf.WireFormat$FielType", jSSourceFile0.getName());
      assertEquals("o.google.protobuf.WireFormat$FielType", jSSourceFile0.toString());
      assertEquals("o.google.protobuf.WireFormat$FielType", jSSourceFile0.getOriginalPath());
      
      Node node0 = compiler0.parse(jSSourceFile0);
      assertNotNull(node0);
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.acceptEcmaScript5());
      assertEquals("o.google.protobuf.WireFormat$FielType", jSSourceFile0.getName());
      assertEquals("o.google.protobuf.WireFormat$FielType", jSSourceFile0.toString());
      assertEquals("o.google.protobuf.WireFormat$FielType", jSSourceFile0.getOriginalPath());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(true, node0.hasOneChild());
      assertEquals(false, node0.isQuotedString());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(1, node0.getChildCount());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(0, node0.getCharno());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(true, node0.hasChildren());
      
      boolean boolean0 = true;
      VarCheck varCheck0 = new VarCheck(compiler0, boolean0);
      assertNotNull(varCheck0);
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.acceptEcmaScript5());
      
      // Undeclared exception!
      try {
        varCheck0.process(node0, node0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // INTERNAL COMPILER ERROR.
         // Please report this problem.
         // null
         //
      }
  }
}
