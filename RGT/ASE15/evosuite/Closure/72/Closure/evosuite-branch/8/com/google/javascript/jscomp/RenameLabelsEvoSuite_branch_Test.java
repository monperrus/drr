/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 12 00:23:54 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.CombinedCompilerPass;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.RenameLabels;
import com.google.javascript.rhino.Node;
import java.util.ArrayList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.mock.java.lang.MockIllegalStateException;
import org.junit.runner.RunWith;

 
public class RenameLabelsEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = "|qU,H";
      AbstractCompiler abstractCompiler0 = null;
      RenameLabels renameLabels0 = new RenameLabels(abstractCompiler0);
      assertNotNull(renameLabels0);
      
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      Node node0 = compiler0.parseSyntheticCode(string0, string0);
      assertNotNull(node0);
      assertEquals(true, compiler0.hasErrors());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(1, compiler0.getErrorCount());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.isVarArgs());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(125, node0.getType());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(-1, node0.getCharno());
      
      renameLabels0.process(node0, node0);
      assertEquals(true, compiler0.hasErrors());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(1, compiler0.getErrorCount());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.isVarArgs());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(125, node0.getType());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(-1, node0.getCharno());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AbstractCompiler abstractCompiler0 = null;
      RenameLabels.DefaultNameSupplier renameLabels_DefaultNameSupplier0 = new RenameLabels.DefaultNameSupplier();
      assertNotNull(renameLabels_DefaultNameSupplier0);
      
      boolean boolean0 = false;
      String string0 = renameLabels_DefaultNameSupplier0.get();
      assertNotNull(string0);
      assertEquals("a", string0);
      
      RenameLabels renameLabels0 = new RenameLabels(abstractCompiler0, renameLabels_DefaultNameSupplier0, boolean0);
      assertNotNull(renameLabels0);
      
      RenameLabels.ProcessLabels renameLabels_ProcessLabels0 = renameLabels0.new ProcessLabels();
      assertNotNull(renameLabels_ProcessLabels0);
      
      NodeTraversal nodeTraversal0 = new NodeTraversal(abstractCompiler0, (NodeTraversal.Callback) renameLabels_ProcessLabels0);
      assertNotNull(nodeTraversal0);
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(0, nodeTraversal0.getLineNumber());
      
      int int0 = 126;
      Node node0 = Node.newString(int0, string0);
      assertNotNull(node0);
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(-1, node0.getLineno());
      assertEquals(0, node0.getChildCount());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isQuotedString());
      assertEquals(126, node0.getType());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isVarArgs());
      
      // Undeclared exception!
      try {
        renameLabels_ProcessLabels0.visit(nodeTraversal0, node0, node0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AbstractCompiler abstractCompiler0 = null;
      RenameLabels.DefaultNameSupplier renameLabels_DefaultNameSupplier0 = new RenameLabels.DefaultNameSupplier();
      assertNotNull(renameLabels_DefaultNameSupplier0);
      
      boolean boolean0 = true;
      String string0 = renameLabels_DefaultNameSupplier0.get();
      assertNotNull(string0);
      assertEquals("a", string0);
      
      RenameLabels renameLabels0 = new RenameLabels(abstractCompiler0, renameLabels_DefaultNameSupplier0, boolean0);
      assertNotNull(renameLabels0);
      
      RenameLabels.ProcessLabels renameLabels_ProcessLabels0 = renameLabels0.new ProcessLabels();
      assertNotNull(renameLabels_ProcessLabels0);
      
      NodeTraversal nodeTraversal0 = new NodeTraversal(abstractCompiler0, (NodeTraversal.Callback) renameLabels_ProcessLabels0);
      assertNotNull(nodeTraversal0);
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(0, nodeTraversal0.getLineNumber());
      
      int int0 = 116;
      Node node0 = Node.newString(int0, string0);
      assertNotNull(node0);
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(116, node0.getType());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isVarArgs());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isNoSideEffectsCall());
      
      renameLabels_ProcessLabels0.visit(nodeTraversal0, node0, node0);
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(116, node0.getType());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isVarArgs());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(0, nodeTraversal0.getLineNumber());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      RenameLabels renameLabels0 = new RenameLabels(compiler0);
      assertNotNull(renameLabels0);
      
      RenameLabels.ProcessLabels renameLabels_ProcessLabels0 = renameLabels0.new ProcessLabels();
      assertNotNull(renameLabels_ProcessLabels0);
      
      ArrayList<NodeTraversal.Callback> arrayList0 = new ArrayList<NodeTraversal.Callback>();
      assertNotNull(arrayList0);
      assertEquals(true, arrayList0.isEmpty());
      assertEquals(0, arrayList0.size());
      assertEquals("[]", arrayList0.toString());
      
      CombinedCompilerPass combinedCompilerPass0 = new CombinedCompilerPass(compiler0, arrayList0);
      assertNotNull(combinedCompilerPass0);
      assertEquals(true, arrayList0.isEmpty());
      assertEquals(0, arrayList0.size());
      assertEquals("[]", arrayList0.toString());
      
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) compiler0, (NodeTraversal.Callback) combinedCompilerPass0);
      assertNotNull(nodeTraversal0);
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(true, arrayList0.isEmpty());
      assertEquals(0, arrayList0.size());
      assertEquals("[]", arrayList0.toString());
      
      int int0 = 126;
      Node node0 = new Node(int0);
      assertNotNull(node0);
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isVarArgs());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(126, node0.getType());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(-1, node0.getCharno());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.hasOneChild());
      
      // Undeclared exception!
      try {
        boolean boolean0 = renameLabels_ProcessLabels0.shouldTraverse(nodeTraversal0, node0, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      AbstractCompiler abstractCompiler0 = null;
      RenameLabels.DefaultNameSupplier renameLabels_DefaultNameSupplier0 = new RenameLabels.DefaultNameSupplier();
      assertNotNull(renameLabels_DefaultNameSupplier0);
      
      boolean boolean0 = false;
      String string0 = renameLabels_DefaultNameSupplier0.get();
      assertNotNull(string0);
      assertEquals("a", string0);
      
      RenameLabels renameLabels0 = new RenameLabels(abstractCompiler0, renameLabels_DefaultNameSupplier0, boolean0);
      assertNotNull(renameLabels0);
      
      RenameLabels.ProcessLabels renameLabels_ProcessLabels0 = renameLabels0.new ProcessLabels();
      assertNotNull(renameLabels_ProcessLabels0);
      
      NodeTraversal nodeTraversal0 = new NodeTraversal(abstractCompiler0, (NodeTraversal.Callback) renameLabels_ProcessLabels0);
      assertNotNull(nodeTraversal0);
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(0, nodeTraversal0.getLineNumber());
      
      int int0 = 117;
      Node node0 = Node.newString(int0, string0);
      assertNotNull(node0);
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(0, node0.getChildCount());
      assertEquals(-1, node0.getCharno());
      assertEquals(117, node0.getType());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      
      Node node1 = new Node(int0, node0, node0);
      assertNotNull(node1);
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(0, node0.getChildCount());
      assertEquals(-1, node0.getCharno());
      assertEquals(117, node0.getType());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(true, node1.hasChildren());
      assertEquals(false, node1.isNoSideEffectsCall());
      assertEquals(false, node1.isQualifiedName());
      assertEquals(-1, node1.getCharno());
      assertEquals(false, node1.isOnlyModifiesThisCall());
      assertEquals(0, node1.getSideEffectFlags());
      assertEquals(117, node1.getType());
      assertEquals(false, node1.isLocalResultCall());
      assertEquals(false, node1.isSyntheticBlock());
      assertEquals(false, node1.wasEmptyNode());
      assertEquals(-1, node1.getLineno());
      assertEquals(true, node1.hasOneChild());
      assertEquals(-1, node1.getSourcePosition());
      assertEquals(false, node1.isQuotedString());
      assertEquals(false, node1.hasMoreThanOneChild());
      assertEquals(1, node1.getChildCount());
      assertEquals(false, node1.isUnscopedQualifiedName());
      assertEquals(false, node1.isOptionalArg());
      assertEquals(false, node1.isVarArgs());
      assertNotSame(node0, node1);
      assertNotSame(node1, node0);
      assertFalse(node0.equals((Object)node1));
      assertFalse(node1.equals((Object)node0));
      
      renameLabels_ProcessLabels0.visit(nodeTraversal0, node1, node1);
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(0, node0.getChildCount());
      assertEquals(-1, node0.getCharno());
      assertEquals(117, node0.getType());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertEquals(true, node1.hasChildren());
      assertEquals(false, node1.isNoSideEffectsCall());
      assertEquals(false, node1.isQualifiedName());
      assertEquals(-1, node1.getCharno());
      assertEquals(false, node1.isOnlyModifiesThisCall());
      assertEquals(0, node1.getSideEffectFlags());
      assertEquals(117, node1.getType());
      assertEquals(false, node1.isLocalResultCall());
      assertEquals(false, node1.isSyntheticBlock());
      assertEquals(false, node1.wasEmptyNode());
      assertEquals(-1, node1.getLineno());
      assertEquals(true, node1.hasOneChild());
      assertEquals(-1, node1.getSourcePosition());
      assertEquals(false, node1.isQuotedString());
      assertEquals(false, node1.hasMoreThanOneChild());
      assertEquals(1, node1.getChildCount());
      assertEquals(false, node1.isUnscopedQualifiedName());
      assertEquals(false, node1.isOptionalArg());
      assertEquals(false, node1.isVarArgs());
      assertNotSame(node0, node1);
      assertNotSame(node1, node0);
      assertFalse(node0.equals((Object)node1));
      assertFalse(node1.equals((Object)node0));
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      RenameLabels renameLabels0 = new RenameLabels(compiler0);
      assertNotNull(renameLabels0);
      
      RenameLabels.ProcessLabels renameLabels_ProcessLabels0 = renameLabels0.new ProcessLabels();
      assertNotNull(renameLabels_ProcessLabels0);
      
      int int0 = (-3199);
      // Undeclared exception!
      try {
        String string0 = renameLabels_ProcessLabels0.getNameForId(int0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
