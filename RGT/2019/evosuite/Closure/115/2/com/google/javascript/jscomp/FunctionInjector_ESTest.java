/*
 * This file was automatically generated by EvoSuite
 * Sun Jun 02 03:34:44 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.CheckSideEffects;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.FunctionInjector;
import com.google.javascript.jscomp.FunctionToBlockMutator;
import com.google.javascript.jscomp.InlineSimpleMethods;
import com.google.javascript.jscomp.JSModule;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.PrintStreamErrorManager;
import com.google.javascript.jscomp.ScopeCreator;
import com.google.javascript.rhino.Node;
import java.nio.charset.Charset;
import java.util.LinkedHashSet;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FunctionInjector_ESTest extends FunctionInjector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
      FunctionInjector functionInjector0 = new FunctionInjector(compiler0, supplier0, false, false, false);
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      CheckSideEffects checkSideEffects0 = new CheckSideEffects(compiler0, checkLevel0, true);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, checkSideEffects0, (ScopeCreator) null);
      Node node0 = Node.newNumber((double) 2422);
      Node node1 = new Node(2422, node0, node0);
      InlineSimpleMethods inlineSimpleMethods0 = new InlineSimpleMethods(compiler0);
      Set<String> set0 = inlineSimpleMethods0.nonMethodProperties;
      FunctionInjector.InliningMode functionInjector_InliningMode0 = FunctionInjector.InliningMode.BLOCK;
      // Undeclared exception!
      try { 
        functionInjector0.canInlineReferenceToFunction(nodeTraversal0, node1, node0, set0, functionInjector_InliningMode0, false, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.FunctionInjector", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Node node0 = new Node(1636, 1636, 1636);
      Compiler compiler0 = new Compiler();
      Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
      FunctionInjector functionInjector0 = new FunctionInjector(compiler0, supplier0, true, true, true);
      // Undeclared exception!
      try { 
        functionInjector0.maybePrepareCall(node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.FunctionInjector", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
      FunctionInjector functionInjector0 = new FunctionInjector(compiler0, supplier0, true, true, true);
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      CheckSideEffects checkSideEffects0 = new CheckSideEffects(compiler0, checkLevel0, true);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, checkSideEffects0, (ScopeCreator) null);
      Node node0 = Node.newNumber((double) 2422);
      Node node1 = new Node(2422, node0, node0);
      InlineSimpleMethods inlineSimpleMethods0 = new InlineSimpleMethods(compiler0);
      Set<String> set0 = inlineSimpleMethods0.nonMethodProperties;
      FunctionInjector.InliningMode functionInjector_InliningMode0 = FunctionInjector.InliningMode.BLOCK;
      functionInjector0.canInlineReferenceToFunction(nodeTraversal0, node1, node0, set0, functionInjector_InliningMode0, true, true);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
      FunctionInjector functionInjector0 = new FunctionInjector(compiler0, supplier0, true, true, true);
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      CheckSideEffects checkSideEffects0 = new CheckSideEffects(compiler0, checkLevel0, true);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, checkSideEffects0, (ScopeCreator) null);
      Node node0 = Node.newNumber((double) 2422);
      Node node1 = new Node(2422, node0, node0);
      InlineSimpleMethods inlineSimpleMethods0 = new InlineSimpleMethods(compiler0);
      Set<String> set0 = inlineSimpleMethods0.nonMethodProperties;
      FunctionInjector.InliningMode functionInjector_InliningMode0 = FunctionInjector.InliningMode.DIRECT;
      // Undeclared exception!
      try { 
        functionInjector0.canInlineReferenceToFunction(nodeTraversal0, node1, node0, set0, functionInjector_InliningMode0, false, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
      FunctionInjector functionInjector0 = new FunctionInjector(compiler0, supplier0, true, true, true);
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      CheckSideEffects checkSideEffects0 = new CheckSideEffects(compiler0, checkLevel0, true);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, checkSideEffects0, (ScopeCreator) null);
      Node node0 = Node.newNumber((double) 2422);
      InlineSimpleMethods inlineSimpleMethods0 = new InlineSimpleMethods(compiler0);
      Set<String> set0 = inlineSimpleMethods0.nonMethodProperties;
      FunctionInjector.InliningMode functionInjector_InliningMode0 = FunctionInjector.InliningMode.BLOCK;
      node0.addChildrenToFront(node0);
      // Undeclared exception!
      functionInjector0.canInlineReferenceToFunction(nodeTraversal0, node0, node0, set0, functionInjector_InliningMode0, false, false);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FunctionInjector.InliningMode functionInjector_InliningMode0 = FunctionInjector.InliningMode.DIRECT;
      Compiler compiler0 = new Compiler();
      Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
      FunctionInjector functionInjector0 = new FunctionInjector(compiler0, supplier0, false, false, false);
      FunctionInjector.Reference functionInjector_Reference0 = new FunctionInjector.Reference((Node) null, (JSModule) null, functionInjector_InliningMode0);
      FunctionInjector.Reference[] functionInjector_ReferenceArray0 = new FunctionInjector.Reference[3];
      functionInjector_ReferenceArray0[0] = functionInjector_Reference0;
      functionInjector_ReferenceArray0[1] = functionInjector_Reference0;
      functionInjector_ReferenceArray0[2] = functionInjector_Reference0;
      ImmutableList<FunctionInjector.Reference> immutableList0 = ImmutableList.copyOf(functionInjector_ReferenceArray0);
      LinkedHashSet<FunctionInjector.Reference> linkedHashSet0 = new LinkedHashSet<FunctionInjector.Reference>(immutableList0);
      boolean boolean0 = functionInjector0.inliningLowersCost((JSModule) null, (Node) null, linkedHashSet0, (Set<String>) null, true, false);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
      FunctionInjector functionInjector0 = new FunctionInjector(compiler0, supplier0, false, false, false);
      LinkedHashSet<FunctionInjector.Reference> linkedHashSet0 = new LinkedHashSet<FunctionInjector.Reference>();
      boolean boolean0 = functionInjector0.inliningLowersCost((JSModule) null, (Node) null, linkedHashSet0, (Set<String>) null, false, false);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
      FunctionInjector functionInjector0 = new FunctionInjector(compiler0, supplier0, false, false, false);
      FunctionInjector.InliningMode functionInjector_InliningMode0 = FunctionInjector.InliningMode.DIRECT;
      FunctionInjector.Reference functionInjector_Reference0 = new FunctionInjector.Reference((Node) null, (JSModule) null, functionInjector_InliningMode0);
      FunctionInjector.Reference[] functionInjector_ReferenceArray0 = new FunctionInjector.Reference[3];
      functionInjector_ReferenceArray0[0] = functionInjector_Reference0;
      functionInjector_ReferenceArray0[1] = functionInjector_Reference0;
      functionInjector_ReferenceArray0[2] = functionInjector_Reference0;
      ImmutableList<FunctionInjector.Reference> immutableList0 = ImmutableList.copyOf(functionInjector_ReferenceArray0);
      LinkedHashSet<FunctionInjector.Reference> linkedHashSet0 = new LinkedHashSet<FunctionInjector.Reference>(immutableList0);
      // Undeclared exception!
      try { 
        functionInjector0.inliningLowersCost((JSModule) null, (Node) null, linkedHashSet0, (Set<String>) null, false, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FunctionInjector.InliningMode functionInjector_InliningMode0 = FunctionInjector.InliningMode.BLOCK;
      Node node0 = Node.newString("arguments");
      MockPrintStream mockPrintStream0 = new MockPrintStream("EjPQldvPaCT8");
      PrintStreamErrorManager printStreamErrorManager0 = new PrintStreamErrorManager(mockPrintStream0);
      Compiler compiler0 = new Compiler(printStreamErrorManager0);
      Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
      FunctionInjector functionInjector0 = new FunctionInjector(compiler0, supplier0, true, true, true);
      JSModule jSModule0 = new JSModule("EjPQldvPaCT8");
      FunctionInjector.Reference functionInjector_Reference0 = new FunctionInjector.Reference(node0, jSModule0, functionInjector_InliningMode0);
      ImmutableList<FunctionInjector.Reference> immutableList0 = ImmutableList.of(functionInjector_Reference0, functionInjector_Reference0, functionInjector_Reference0, functionInjector_Reference0, functionInjector_Reference0, functionInjector_Reference0, functionInjector_Reference0);
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>(56);
      // Undeclared exception!
      try { 
        functionInjector0.inliningLowersCost(jSModule0, node0, immutableList0, linkedHashSet0, true, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FunctionInjector.InliningMode functionInjector_InliningMode0 = FunctionInjector.InliningMode.BLOCK;
      Compiler compiler0 = new Compiler();
      Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
      FunctionInjector functionInjector0 = new FunctionInjector(compiler0, supplier0, false, false, false);
      FunctionInjector.Reference functionInjector_Reference0 = new FunctionInjector.Reference((Node) null, (JSModule) null, functionInjector_InliningMode0);
      FunctionInjector.Reference[] functionInjector_ReferenceArray0 = new FunctionInjector.Reference[3];
      functionInjector_ReferenceArray0[0] = functionInjector_Reference0;
      functionInjector_ReferenceArray0[1] = functionInjector_Reference0;
      functionInjector_ReferenceArray0[2] = functionInjector_Reference0;
      ImmutableList<FunctionInjector.Reference> immutableList0 = ImmutableList.copyOf(functionInjector_ReferenceArray0);
      LinkedHashSet<FunctionInjector.Reference> linkedHashSet0 = new LinkedHashSet<FunctionInjector.Reference>(immutableList0);
      // Undeclared exception!
      try { 
        functionInjector0.inliningLowersCost((JSModule) null, (Node) null, linkedHashSet0, (Set<String>) null, true, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream(";}4SB.q|");
      PrintStreamErrorManager printStreamErrorManager0 = new PrintStreamErrorManager(mockPrintStream0);
      Compiler compiler0 = new Compiler(printStreamErrorManager0);
      Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
      FunctionToBlockMutator.LabelNameSupplier functionToBlockMutator_LabelNameSupplier0 = new FunctionToBlockMutator.LabelNameSupplier(supplier0);
      FunctionInjector functionInjector0 = new FunctionInjector(compiler0, functionToBlockMutator_LabelNameSupplier0, false, true, false);
      Charset charset0 = Charset.defaultCharset();
      Set<String> set0 = charset0.aliases();
      functionInjector0.setKnownConstants(set0);
      // Undeclared exception!
      try { 
        functionInjector0.setKnownConstants(set0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }
}
