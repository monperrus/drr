/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 21:11:20 GMT 2014
 */

package com.google.javascript.rhino.jstype;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.BooleanLiteralSet;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.StaticScope;
import com.google.javascript.rhino.jstype.UnresolvedTypeExpression;
import com.google.javascript.rhino.testing.EmptyScope;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class UnresolvedTypeExpressionEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = null;
      double double0 = 0.0;
      int int0 = (-2277);
      Node node0 = Node.newNumber(double0, int0, int0);
      assertNotNull(node0);
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(-1, node0.getCharno());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.hasOneChild());
      assertEquals(39, node0.getType());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isOptionalArg());
      
      String string0 = "is_dispatcher";
      boolean boolean0 = true;
      UnresolvedTypeExpression unresolvedTypeExpression0 = new UnresolvedTypeExpression(jSTypeRegistry0, node0, string0, boolean0);
      assertNotNull(unresolvedTypeExpression0);
      assertEquals("?", unresolvedTypeExpression0.toString());
      assertEquals(false, unresolvedTypeExpression0.isUnionType());
      assertEquals(false, unresolvedTypeExpression0.isNullType());
      assertEquals(false, unresolvedTypeExpression0.isFunctionType());
      assertEquals(false, unresolvedTypeExpression0.isNoType());
      assertEquals(2147483647, unresolvedTypeExpression0.getPropertiesCount());
      assertEquals(false, unresolvedTypeExpression0.isAllType());
      assertEquals(false, unresolvedTypeExpression0.isRecordType());
      assertEquals(BooleanLiteralSet.BOTH, unresolvedTypeExpression0.getPossibleToBooleanOutcomes());
      assertEquals(false, unresolvedTypeExpression0.isTemplateType());
      assertEquals(true, unresolvedTypeExpression0.matchesObjectContext());
      assertEquals(true, unresolvedTypeExpression0.matchesStringContext());
      assertEquals(false, unresolvedTypeExpression0.isCheckedUnknownType());
      assertEquals(false, unresolvedTypeExpression0.hasReferenceName());
      assertEquals(true, unresolvedTypeExpression0.isNullable());
      assertEquals(false, unresolvedTypeExpression0.isEmptyType());
      assertEquals(false, unresolvedTypeExpression0.isNoObjectType());
      assertEquals(true, unresolvedTypeExpression0.canBeCalled());
      assertEquals(false, unresolvedTypeExpression0.isNativeObjectType());
      assertEquals(false, unresolvedTypeExpression0.isVoidType());
      assertEquals(false, unresolvedTypeExpression0.isNumberValueType());
      assertEquals(false, unresolvedTypeExpression0.isStringValueType());
      assertEquals(false, unresolvedTypeExpression0.isBooleanValueType());
      assertEquals(false, unresolvedTypeExpression0.isResolved());
      assertEquals(true, unresolvedTypeExpression0.isUnknownType());
      assertEquals(false, unresolvedTypeExpression0.hasCachedValues());
      assertEquals(true, unresolvedTypeExpression0.matchesNumberContext());
      assertEquals("?", unresolvedTypeExpression0.getReferenceName());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(-1, node0.getCharno());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.hasOneChild());
      assertEquals(39, node0.getType());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isOptionalArg());
      
      ErrorReporter errorReporter0 = null;
      EmptyScope emptyScope0 = new EmptyScope();
      assertNotNull(emptyScope0);
      
      // Undeclared exception!
      try {
        JSType jSType0 = unresolvedTypeExpression0.resolve(errorReporter0, (StaticScope<JSType>) emptyScope0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
