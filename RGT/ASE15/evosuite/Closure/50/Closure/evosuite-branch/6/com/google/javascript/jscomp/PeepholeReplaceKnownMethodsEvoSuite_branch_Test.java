/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 22:05:22 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.FlowSensitiveInlineVariables;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.PeepholeReplaceKnownMethods;
import com.google.javascript.rhino.Node;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

 
public class PeepholeReplaceKnownMethodsEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PeepholeReplaceKnownMethods peepholeReplaceKnownMethods0 = new PeepholeReplaceKnownMethods();
      assertNotNull(peepholeReplaceKnownMethods0);
      
      int int0 = 37;
      Node node0 = new Node(int0);
      assertNotNull(node0);
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isVarArgs());
      assertEquals(0, node0.getChildCount());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(37, node0.getType());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isQualifiedName());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.hasChildren());
      assertEquals(0, node0.getLength());
      
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      assertNotNull(byteArrayOutputStream0);
      assertEquals("", byteArrayOutputStream0.toString());
      assertEquals(0, byteArrayOutputStream0.size());
      
      MockPrintStream mockPrintStream0 = new MockPrintStream((OutputStream) byteArrayOutputStream0);
      assertNotNull(mockPrintStream0);
      assertEquals("", byteArrayOutputStream0.toString());
      assertEquals(0, byteArrayOutputStream0.size());
      
      Compiler compiler0 = new Compiler((PrintStream) mockPrintStream0);
      assertNotNull(compiler0);
      assertEquals("", byteArrayOutputStream0.toString());
      assertEquals(0, byteArrayOutputStream0.size());
      
      FlowSensitiveInlineVariables flowSensitiveInlineVariables0 = new FlowSensitiveInlineVariables((AbstractCompiler) compiler0);
      assertNotNull(flowSensitiveInlineVariables0);
      assertEquals("", byteArrayOutputStream0.toString());
      assertEquals(0, byteArrayOutputStream0.size());
      
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) compiler0, (NodeTraversal.Callback) flowSensitiveInlineVariables0);
      assertNotNull(nodeTraversal0);
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertEquals("", byteArrayOutputStream0.toString());
      assertEquals(0, byteArrayOutputStream0.size());
      
      peepholeReplaceKnownMethods0.beginTraversal(nodeTraversal0);
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertEquals("", byteArrayOutputStream0.toString());
      assertEquals(0, byteArrayOutputStream0.size());
      
      node0.addChildToBack(node0);
      assertEquals(1, node0.getChildCount());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(-1, node0.getLineno());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isVarArgs());
      assertEquals(-1, node0.getCharno());
      assertEquals(true, node0.hasOneChild());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(37, node0.getType());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isQualifiedName());
      assertNull(node0.getSourceFileName());
      assertEquals(0, node0.getLength());
      
      Node node1 = peepholeReplaceKnownMethods0.optimizeSubtree(node0);
      assertNotNull(node1);
      assertEquals(false, node1.wasEmptyNode());
      assertEquals(true, node1.hasOneChild());
      assertEquals(false, node1.isFromExterns());
      assertEquals(0, node1.getSideEffectFlags());
      assertEquals(false, node1.isSyntheticBlock());
      assertEquals(-1, node1.getCharno());
      assertEquals(true, node1.hasChildren());
      assertNull(node1.getSourceFileName());
      assertEquals(false, node1.isLocalResultCall());
      assertEquals(-1, node1.getSourcePosition());
      assertEquals(0, node1.getLength());
      assertEquals(37, node1.getType());
      assertEquals(false, node1.isUnscopedQualifiedName());
      assertEquals(-1, node1.getLineno());
      assertEquals(false, node1.isOptionalArg());
      assertEquals(false, node1.isNoSideEffectsCall());
      assertEquals(false, node1.hasMoreThanOneChild());
      assertEquals(false, node1.isQualifiedName());
      assertEquals(false, node1.isOnlyModifiesThisCall());
      assertEquals(1, node1.getChildCount());
      assertEquals(false, node1.isVarArgs());
      assertEquals(false, node1.isQuotedString());
      assertEquals(1, node0.getChildCount());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(-1, node0.getLineno());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isVarArgs());
      assertEquals(-1, node0.getCharno());
      assertEquals(true, node0.hasOneChild());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(37, node0.getType());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isQualifiedName());
      assertNull(node0.getSourceFileName());
      assertEquals(0, node0.getLength());
      assertSame(node1, node0);
      assertSame(node0, node1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PeepholeReplaceKnownMethods peepholeReplaceKnownMethods0 = new PeepholeReplaceKnownMethods();
      assertNotNull(peepholeReplaceKnownMethods0);
      
      int int0 = 37;
      Node node0 = new Node(int0);
      assertNotNull(node0);
      assertEquals(37, node0.getType());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isVarArgs());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(-1, node0.getSourcePosition());
      assertNull(node0.getSourceFileName());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isNoSideEffectsCall());
      
      Node node1 = peepholeReplaceKnownMethods0.optimizeSubtree(node0);
      assertNotNull(node1);
      assertEquals(37, node1.getType());
      assertEquals(false, node1.isOnlyModifiesThisCall());
      assertNull(node1.getSourceFileName());
      assertEquals(0, node1.getChildCount());
      assertEquals(false, node1.hasMoreThanOneChild());
      assertEquals(false, node1.hasChildren());
      assertEquals(-1, node1.getLineno());
      assertEquals(false, node1.wasEmptyNode());
      assertEquals(-1, node1.getSourcePosition());
      assertEquals(0, node1.getLength());
      assertEquals(false, node1.isNoSideEffectsCall());
      assertEquals(false, node1.isUnscopedQualifiedName());
      assertEquals(false, node1.isLocalResultCall());
      assertEquals(-1, node1.getCharno());
      assertEquals(false, node1.isQualifiedName());
      assertEquals(false, node1.hasOneChild());
      assertEquals(false, node1.isSyntheticBlock());
      assertEquals(false, node1.isQuotedString());
      assertEquals(false, node1.isFromExterns());
      assertEquals(false, node1.isOptionalArg());
      assertEquals(false, node1.isVarArgs());
      assertEquals(0, node1.getSideEffectFlags());
      assertEquals(37, node0.getType());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isVarArgs());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(-1, node0.getSourcePosition());
      assertNull(node0.getSourceFileName());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertSame(node1, node0);
      assertSame(node0, node1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PeepholeReplaceKnownMethods peepholeReplaceKnownMethods0 = new PeepholeReplaceKnownMethods();
      assertNotNull(peepholeReplaceKnownMethods0);
      
      int int0 = 0;
      Node node0 = new Node(int0);
      assertNotNull(node0);
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isQuotedString());
      assertEquals(0, node0.getType());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isVarArgs());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(0, node0.getLength());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.hasChildren());
      
      Node node1 = peepholeReplaceKnownMethods0.optimizeSubtree(node0);
      assertNotNull(node1);
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isQuotedString());
      assertEquals(0, node0.getType());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isVarArgs());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(0, node0.getLength());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node1.isLocalResultCall());
      assertEquals(false, node1.isVarArgs());
      assertEquals(false, node1.isQuotedString());
      assertEquals(-1, node1.getLineno());
      assertEquals(0, node1.getType());
      assertEquals(0, node1.getChildCount());
      assertEquals(false, node1.hasOneChild());
      assertEquals(false, node1.isSyntheticBlock());
      assertNull(node1.getSourceFileName());
      assertEquals(false, node1.isQualifiedName());
      assertEquals(false, node1.wasEmptyNode());
      assertEquals(false, node1.hasMoreThanOneChild());
      assertEquals(-1, node1.getCharno());
      assertEquals(-1, node1.getSourcePosition());
      assertEquals(0, node1.getLength());
      assertEquals(false, node1.isFromExterns());
      assertEquals(false, node1.isUnscopedQualifiedName());
      assertEquals(false, node1.isOptionalArg());
      assertEquals(false, node1.isOnlyModifiesThisCall());
      assertEquals(false, node1.isNoSideEffectsCall());
      assertEquals(false, node1.hasChildren());
      assertEquals(0, node1.getSideEffectFlags());
      assertSame(node0, node1);
      assertSame(node1, node0);
  }
}
