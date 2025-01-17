/*
 * This file was automatically generated by EvoSuite
 * Sat Jun 22 20:59:57 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.ControlFlowAnalysis;
import com.google.javascript.jscomp.ControlFlowGraph;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.Normalize;
import com.google.javascript.jscomp.ScopeCreator;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ControlFlowAnalysis_ESTest extends ControlFlowAnalysis_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Node node0 = Node.newString("Not reachable", (-3353), (-4064));
      node0.setType(119);
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis((AbstractCompiler) null, false, false);
      // Undeclared exception!
      try { 
        controlFlowAnalysis0.process(node0, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeTraversal", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockFile mockFile0 = new MockFile("jMW,V*B mUO)&sV0D!q", "jMW,V*B mUO)&sV0D!q");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      Compiler compiler0 = new Compiler(mockPrintStream0);
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, true, true);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, controlFlowAnalysis0);
      Node node0 = new Node(77);
      // Undeclared exception!
      try { 
        controlFlowAnalysis0.visit(nodeTraversal0, node0, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.ControlFlowAnalysis", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Node node0 = new Node(1006, 1006, 1006);
      Node node1 = new Node(49, node0, node0, node0, node0);
      Compiler compiler0 = new Compiler();
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, false, false);
      controlFlowAnalysis0.process(node1, node1);
      assertFalse(node1.isAdd());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Node node0 = new Node(112, 112, (-4064));
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis((AbstractCompiler) null, true, false);
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) null, controlFlowAnalysis0, (ScopeCreator) null);
      // Undeclared exception!
      try { 
        controlFlowAnalysis0.visit(nodeTraversal0, node0, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.ControlFlowAnalysis", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis((AbstractCompiler) null, false, true);
      Node node0 = Node.newString(113, "");
      // Undeclared exception!
      try { 
        controlFlowAnalysis0.process(node0, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeTraversal", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis((AbstractCompiler) null, true, true);
      ControlFlowGraph<Node> controlFlowGraph0 = controlFlowAnalysis0.getCfg();
      assertNull(controlFlowGraph0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Node node0 = new Node(114, 114, (-4064));
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis((AbstractCompiler) null, false, false);
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) null, controlFlowAnalysis0);
      // Undeclared exception!
      try { 
        controlFlowAnalysis0.visit(nodeTraversal0, node0, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.ControlFlowAnalysis", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Node node0 = Node.newString("Not reachable", (-3353), (-4064));
      node0.setType(125);
      node0.setIsSyntheticBlock(true);
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis((AbstractCompiler) null, true, false);
      Node node1 = new Node((-897), node0, node0, node0, 968, 406);
      controlFlowAnalysis0.process(node1, node0);
      assertEquals(0, node0.getSideEffectFlags());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Node node0 = new Node(105, 105, (-4064));
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis((AbstractCompiler) null, false, false);
      // Undeclared exception!
      try { 
        controlFlowAnalysis0.process(node0, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeTraversal", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Node node0 = new Node(105, 105, (-4064));
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis((AbstractCompiler) null, true, false);
      // Undeclared exception!
      try { 
        controlFlowAnalysis0.process(node0, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeTraversal", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Node node0 = Node.newString((int) (byte)7, "");
      Node node1 = new Node((byte)4);
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis((AbstractCompiler) null, false, true);
      controlFlowAnalysis0.process(node0, node1);
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) null, controlFlowAnalysis0);
      boolean boolean0 = controlFlowAnalysis0.shouldTraverse(nodeTraversal0, node0, node1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Node node0 = Node.newString((int) (byte)118, "");
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis((AbstractCompiler) null, false, true);
      controlFlowAnalysis0.process(node0, node0);
      boolean boolean0 = controlFlowAnalysis0.shouldTraverse((NodeTraversal) null, node0, node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis((AbstractCompiler) null, false, false);
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("com.google.javascript.jscomp.ControlFlowAnalysis");
      controlFlowAnalysis0.process(node0, node0);
      assertFalse(node0.isVar());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Node node0 = new Node(105, 105, (-4064));
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis((AbstractCompiler) null, false, false);
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) null, controlFlowAnalysis0);
      // Undeclared exception!
      try { 
        controlFlowAnalysis0.visit(nodeTraversal0, node0, node0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, true, false);
      Node node0 = new Node(108, 3110, (-315));
      // Undeclared exception!
      try { 
        controlFlowAnalysis0.process(node0, node0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Node node0 = Node.newString("Not reachable", (-3359), (-4064));
      node0.setType(116);
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis((AbstractCompiler) null, false, false);
      // Undeclared exception!
      try { 
        controlFlowAnalysis0.process(node0, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeTraversal", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis((AbstractCompiler) null, false, false);
      Node node0 = Node.newString(117, "=6;i;rj)9=&(='");
      // Undeclared exception!
      try { 
        controlFlowAnalysis0.process(node0, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeTraversal", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Node node0 = Node.newString("Not r}Feachable", (-3353), (-4064));
      node0.setType(126);
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis((AbstractCompiler) null, false, false);
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) null, controlFlowAnalysis0);
      controlFlowAnalysis0.visit(nodeTraversal0, node0, node0);
      assertFalse(node0.isOnlyModifiesThisCall());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Node node0 = Node.newString("Not reachable", (-3327), (-3327));
      node0.setType(110);
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis((AbstractCompiler) null, false, false);
      node0.addChildToBack(node0);
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) null, controlFlowAnalysis0);
      // Undeclared exception!
      try { 
        controlFlowAnalysis0.visit(nodeTraversal0, node0, node0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "=,l==,rMEfiQK<L6", "");
      Node node1 = new Node(49, node0);
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, false, true);
      controlFlowAnalysis0.process(node0, node0);
      assertFalse(node0.isGetElem());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Node node0 = Node.newString("Not reachable", (-3353), (-4064));
      node0.setType(125);
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis((AbstractCompiler) null, true, false);
      Node node1 = new Node((-897), node0, node0, node0, 968, 406);
      controlFlowAnalysis0.process(node0, node0);
      assertFalse(node0.isSyntheticBlock());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Node node0 = new Node(3835);
      Node node1 = new Node(3835, node0);
      Node node2 = ControlFlowAnalysis.computeFollowNode(node0);
      assertNull(node2);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis((AbstractCompiler) null, false, false);
      Node node0 = Node.newString(114, "=6;i;rj)9=&(='");
      // Undeclared exception!
      try { 
        controlFlowAnalysis0.process(node0, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.ControlFlowAnalysis", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Node node0 = Node.newString("Not reachable", (-3353), (-4064));
      boolean boolean0 = ControlFlowAnalysis.isBreakTarget(node0, "!1c0~M ^bmj");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Node node0 = Node.newString("Not reachable", (-3353), (-4064));
      node0.setType(125);
      Node node1 = new Node((-897), node0, node0, node0, 968, 406);
      boolean boolean0 = ControlFlowAnalysis.isBreakTarget(node0, "!1c0~M ^bmj");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Node node0 = Node.newString(113, "e@^");
      boolean boolean0 = ControlFlowAnalysis.isBreakTarget(node0, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Node node0 = Node.newString("Not reachable", (-3353), (-4064));
      node0.setType(30);
      boolean boolean0 = ControlFlowAnalysis.mayThrowException(node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Node node0 = new Node(102, 102, (-4064));
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis((AbstractCompiler) null, true, false);
      Node node1 = new Node(37, node0, node0);
      controlFlowAnalysis0.process(node1, node1);
      assertEquals(51, Node.STATIC_SOURCE_FILE);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Node node0 = new Node(3835);
      Node node1 = new Node(52, node0, node0, 32, 37);
      Compiler compiler0 = new Compiler();
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, false, false);
      controlFlowAnalysis0.process(node1, node1);
      assertEquals(8, Node.FLAG_NO_THROWS);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis((AbstractCompiler) null, false, false);
      Node node0 = Node.newString(103, "=6;i;rj)9=&(='");
      controlFlowAnalysis0.process(node0, node0);
      assertFalse(node0.isWhile());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Node node0 = new Node(105, 105, (-4064));
      boolean boolean0 = ControlFlowAnalysis.mayThrowException(node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Node node0 = Node.newString("Not reachable", (-3353), (-4064));
      node0.setType(125);
      node0.addChildToBack(node0);
      boolean boolean0 = ControlFlowAnalysis.mayThrowException(node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Node node0 = Node.newString((int) (byte)118, "");
      Node node1 = new Node(2, node0, node0, node0, 48, 43);
      boolean boolean0 = ControlFlowAnalysis.mayThrowException(node1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Node node0 = Node.newString("Not reachable", (-3353), (-4064));
      node0.setType(108);
      // Undeclared exception!
      try { 
        ControlFlowAnalysis.isBreakTarget(node0, "!1c0~M ^bmj");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.ControlFlowAnalysis", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Node node0 = Node.newString("Not reachable", (-3353), (-4064));
      node0.setType(110);
      // Undeclared exception!
      try { 
        ControlFlowAnalysis.isBreakTarget(node0, "!1c0~M ^bmj");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.ControlFlowAnalysis", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Node node0 = Node.newString(113, "e@^");
      boolean boolean0 = ControlFlowAnalysis.isContinueStructure(node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "=,l==,rMEfiQK<L6", "");
      Node node1 = ControlFlowAnalysis.getExceptionHandler(node0);
      assertNull(node1);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Node node0 = new Node(105, 105, (-4064));
      Node node1 = ControlFlowAnalysis.getExceptionHandler(node0);
      assertNull(node1);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Node node0 = Node.newString("Not reachable", (-3353), (-4064));
      node0.setType(125);
      Node node1 = new Node((-897), node0, node0, node0, 968, 406);
      // Undeclared exception!
      try { 
        ControlFlowAnalysis.getExceptionHandler(node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.ControlFlowAnalysis", e);
      }
  }
}
