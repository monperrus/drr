/*
 * This file was automatically generated by EvoSuite
 * Sun Jun 23 06:38:34 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.JSSourceFile;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.ProcessClosurePrimitives;
import com.google.javascript.rhino.Node;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ProcessClosurePrimitives_ESTest extends ProcessClosurePrimitives_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, true);
      JSSourceFile jSSourceFile0 = JSSourceFile.fromCode("goog.base", "goog.base");
      Node node0 = compiler0.parse(jSSourceFile0);
      processClosurePrimitives0.process(node0, node0);
      assertEquals(1, compiler0.getErrorCount());
      assertEquals(0, compiler0.getWarningCount());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, false);
      Set<String> set0 = processClosurePrimitives0.getExportedVariableNames();
      assertTrue(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CheckLevel checkLevel0 = CheckLevel.OFF;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, true);
      Node node0 = Node.newNumber((-1.0));
      processClosurePrimitives0.process(node0, node0);
      assertFalse(node0.isUnscopedQualifiedName());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, false);
      Node node0 = Node.newString(114, "3I?S81wQ<]A<\"(");
      Node node1 = new Node(30, node0, node0, node0, node0);
      processClosurePrimitives0.process(node1, node1);
      assertEquals(29, Node.VAR_ARGS_NAME);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, false);
      Node node0 = compiler0.parseSyntheticCode("com.goole.j,vascritrhino.stypeJS=p8$Type$r", "com.goole.j,vascritrhino.stypeJS=p8$Type$r");
      processClosurePrimitives0.process(node0, node0);
      assertEquals(9, Node.FIXUPS_PROP);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, false);
      Node node0 = Node.newNumber((double) (-2097152L), 45, 37);
      node0.setType(37);
      // Undeclared exception!
      try { 
        processClosurePrimitives0.visit((NodeTraversal) null, node0, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.ProcessClosurePrimitives", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, false);
      Node node0 = compiler0.parseSyntheticCode("com.goole.jvascript.rino.stypeJS=yp8$yYe$r", "com.goole.jvascript.rino.stypeJS=yp8$yYe$r");
      processClosurePrimitives0.process(node0, node0);
      assertEquals(0, Node.NON_SPECIALCALL);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, true);
      Node node0 = Node.newString(114, "3I?S81wQ<]A<\"(");
      Node node1 = new Node(30, node0, node0, node0, node0);
      processClosurePrimitives0.process(node1, node1);
      assertEquals(1, node1.getChildCount());
  }
}
