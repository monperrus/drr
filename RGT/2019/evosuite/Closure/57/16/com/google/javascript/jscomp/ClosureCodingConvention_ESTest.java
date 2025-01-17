/*
 * This file was automatically generated by EvoSuite
 * Sat Jun 22 23:51:41 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.CheckPropertyOrder;
import com.google.javascript.jscomp.ClosureCodingConvention;
import com.google.javascript.jscomp.CodingConvention;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.GoogleCodingConvention;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import java.util.Collection;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ClosureCodingConvention_ESTest extends ClosureCodingConvention_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention();
      Node node0 = new Node(473, 18, 1429);
      String string0 = closureCodingConvention0.extractClassNameIfRequire(node0, node0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention();
      Node node0 = Node.newString("", 0, (-1435));
      boolean boolean0 = closureCodingConvention0.isVarArgsParameter(node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention();
      // Undeclared exception!
      try { 
        closureCodingConvention0.extractClassNameIfProvide((Node) null, (Node) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention();
      String string0 = closureCodingConvention0.getExportSymbolFunction();
      assertEquals("goog.exportSymbol", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention();
      Node node0 = Node.newString("", 0, (-1435));
      boolean boolean0 = closureCodingConvention0.isOptionalParameter(node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      boolean boolean0 = googleCodingConvention0.isSuperClassReference("goog.abstractMethod");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      String string0 = googleCodingConvention0.getAbstractMethodName();
      assertEquals("goog.abstractMethod", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention();
      boolean boolean0 = closureCodingConvention0.isPrivate("goog.asserts.assertArray");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      String string0 = googleCodingConvention0.getExportPropertyFunction();
      assertEquals("goog.exportProperty", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention();
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      JSTypeNative jSTypeNative0 = JSTypeNative.BOOLEAN_OBJECT_FUNCTION_TYPE;
      FunctionType functionType0 = jSTypeRegistry0.getNativeFunctionType(jSTypeNative0);
      closureCodingConvention0.applySingletonGetter(functionType0, functionType0, functionType0);
      assertFalse(functionType0.isEnumElementType());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention();
      String string0 = closureCodingConvention0.getGlobalObject();
      assertEquals("goog.global", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      Collection<CodingConvention.AssertionFunctionSpec> collection0 = googleCodingConvention0.getAssertionFunctions();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention();
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      JSTypeNative jSTypeNative0 = JSTypeNative.STRING_OBJECT_FUNCTION_TYPE;
      FunctionType functionType0 = jSTypeRegistry0.getNativeFunctionType(jSTypeNative0);
      CodingConvention.SubclassType codingConvention_SubclassType0 = CodingConvention.SubclassType.MIXIN;
      closureCodingConvention0.applySubclassRelationship(functionType0, functionType0, codingConvention_SubclassType0);
      assertFalse(functionType0.isNoObjectType());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention();
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      JSTypeNative jSTypeNative0 = JSTypeNative.REGEXP_FUNCTION_TYPE;
      FunctionType functionType0 = jSTypeRegistry0.getNativeFunctionType(jSTypeNative0);
      CodingConvention.SubclassType codingConvention_SubclassType0 = CodingConvention.SubclassType.INHERITS;
      closureCodingConvention0.applySubclassRelationship(functionType0, functionType0, codingConvention_SubclassType0);
      assertFalse(functionType0.isTemplateType());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention();
      Node node0 = Node.newString(" Ax`u 0#:@G,");
      Node node1 = new Node(3318, node0, 46, (-3));
      CodingConvention.SubclassRelationship codingConvention_SubclassRelationship0 = closureCodingConvention0.getClassesDefinedByCall(node1);
      assertNull(codingConvention_SubclassRelationship0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention();
      Node node0 = Node.newString(33, "Not declared as a type name", 1, 1);
      Node node1 = new Node(1, node0, node0, node0, node0, 2, 1854);
      // Undeclared exception!
      try { 
        closureCodingConvention0.getClassesDefinedByCall(node1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.ClosureCodingConvention", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      JSType[] jSTypeArray0 = new JSType[1];
      JSType jSType0 = jSTypeRegistry0.createNamedType("goog.global", "G[gwD&QWT", 122, 122);
      jSTypeArray0[0] = jSType0;
      Node node0 = jSTypeRegistry0.createOptionalParameters(jSTypeArray0);
      CodingConvention.SubclassRelationship codingConvention_SubclassRelationship0 = googleCodingConvention0.getClassesDefinedByCall(node0);
      assertNull(codingConvention_SubclassRelationship0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      JSType[] jSTypeArray0 = new JSType[1];
      ObjectType objectType0 = jSTypeRegistry0.createAnonymousObjectType();
      jSTypeArray0[0] = (JSType) objectType0;
      Node node0 = jSTypeRegistry0.createOptionalParameters(jSTypeArray0);
      List<String> list0 = googleCodingConvention0.identifyTypeDeclarationCall(node0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      JSType[] jSTypeArray0 = new JSType[1];
      ObjectType objectType0 = jSTypeRegistry0.createAnonymousObjectType();
      jSTypeArray0[0] = (JSType) objectType0;
      Node node0 = jSTypeRegistry0.createOptionalParameters(jSTypeArray0);
      String string0 = googleCodingConvention0.getSingletonGetterClassName(node0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      JSType[] jSTypeArray0 = new JSType[1];
      ObjectType objectType0 = jSTypeRegistry0.createAnonymousObjectType();
      jSTypeArray0[0] = (JSType) objectType0;
      Node node0 = jSTypeRegistry0.createOptionalParameters(jSTypeArray0);
      // Undeclared exception!
      try { 
        googleCodingConvention0.isPropertyTestFunction(node0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      Node node0 = new Node(37);
      // Undeclared exception!
      try { 
        googleCodingConvention0.isPropertyTestFunction(node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.ClosureCodingConvention", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention();
      Node node0 = new Node(93, 2777, 2777);
      Compiler compiler0 = new Compiler();
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, (NodeTraversal.Callback) null);
      // Undeclared exception!
      try { 
        closureCodingConvention0.getObjectLiteralCast(nodeTraversal0, node0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      Node node0 = new Node(37);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("getInstance");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0, true);
      Compiler compiler0 = new Compiler(mockPrintStream0);
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      CheckPropertyOrder checkPropertyOrder0 = new CheckPropertyOrder(compiler0, checkLevel0, false);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, checkPropertyOrder0);
      // Undeclared exception!
      try { 
        googleCodingConvention0.getObjectLiteralCast(nodeTraversal0, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.ClosureCodingConvention", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention();
      Node node0 = new Node(39);
      CodingConvention.Bind codingConvention_Bind0 = closureCodingConvention0.describeFunctionBind(node0);
      assertNull(codingConvention_Bind0);
  }
}
