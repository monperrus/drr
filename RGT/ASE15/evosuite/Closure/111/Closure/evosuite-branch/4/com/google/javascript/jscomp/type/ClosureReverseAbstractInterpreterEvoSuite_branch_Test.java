/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 19:57:29 GMT 2014
 */

package com.google.javascript.jscomp.type;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.CodingConvention;
import com.google.javascript.jscomp.GoogleCodingConvention;
import com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter;
import com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter;
import com.google.javascript.jscomp.type.FlowScope;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import java.util.ArrayList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class ClosureReverseAbstractInterpreterEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      assertNotNull(googleCodingConvention0);
      
      ErrorReporter errorReporter0 = null;
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0);
      assertNotNull(jSTypeRegistry0);
      assertEquals(false, jSTypeRegistry0.shouldTolerateUndefinedValues());
      
      ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter0 = new ClosureReverseAbstractInterpreter((CodingConvention) googleCodingConvention0, jSTypeRegistry0);
      assertNotNull(closureReverseAbstractInterpreter0);
      assertEquals(false, jSTypeRegistry0.shouldTolerateUndefinedValues());
      
      ArrayList<JSType> arrayList0 = new ArrayList<JSType>();
      assertNotNull(arrayList0);
      assertEquals(true, arrayList0.isEmpty());
      assertEquals("[]", arrayList0.toString());
      assertEquals(0, arrayList0.size());
      
      ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter1 = (ClosureReverseAbstractInterpreter)closureReverseAbstractInterpreter0.append((ChainableReverseAbstractInterpreter) closureReverseAbstractInterpreter0);
      assertNotNull(closureReverseAbstractInterpreter1);
      assertEquals(false, jSTypeRegistry0.shouldTolerateUndefinedValues());
      assertSame(closureReverseAbstractInterpreter1, closureReverseAbstractInterpreter0);
      assertSame(closureReverseAbstractInterpreter0, closureReverseAbstractInterpreter1);
      
      Node node0 = jSTypeRegistry0.createParametersWithVarArgs((List<JSType>) arrayList0);
      assertNotNull(node0);
      assertEquals(false, node0.isDec());
      assertEquals(false, node0.isNot());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(false, node0.isOr());
      assertEquals(true, node0.isParamList());
      assertEquals(true, node0.mayMutateArguments());
      assertEquals(false, node0.isHook());
      assertEquals(true, node0.mayMutateGlobalStateOrThrow());
      assertEquals(false, node0.isCase());
      assertEquals(false, node0.isDelProp());
      assertEquals(false, node0.isWhile());
      assertEquals(false, node0.isReturn());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isNew());
      assertEquals(false, node0.isObjectLit());
      assertEquals(0, node0.getChangeTime());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isBlock());
      assertEquals(false, node0.isDefaultCase());
      assertEquals(false, node0.isSetterDef());
      assertEquals(false, node0.isCatch());
      assertEquals(false, node0.isLabel());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isInc());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(false, node0.isFalse());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isEmpty());
      assertEquals(false, node0.isName());
      assertEquals(0, node0.getChildCount());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isComma());
      assertEquals(false, node0.isStringKey());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isFunction());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isDebugger());
      assertEquals(false, node0.isNumber());
      assertEquals(false, node0.isIn());
      assertEquals(false, node0.isTry());
      assertEquals(false, node0.isWith());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.isNE());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isGetterDef());
      assertEquals(false, node0.isIf());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.isScript());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isVar());
      assertEquals(false, node0.isExprResult());
      assertEquals(false, node0.isNull());
      assertEquals(false, node0.isGetProp());
      assertEquals(false, node0.isContinue());
      assertEquals(false, node0.isAnd());
      assertEquals(false, node0.isRegExp());
      assertEquals(false, node0.isAdd());
      assertEquals(false, node0.isThrow());
      assertEquals(false, node0.isArrayLit());
      assertEquals(false, node0.isCall());
      assertEquals(false, node0.isLabelName());
      assertEquals(false, node0.isFor());
      assertEquals(false, node0.isTypeOf());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isThis());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isGetElem());
      assertEquals(false, node0.isAssign());
      assertEquals(false, node0.isString());
      assertEquals(false, node0.isBreak());
      assertEquals(false, node0.isDo());
      assertEquals(false, node0.isCast());
      assertEquals(false, node0.isTrue());
      assertEquals(false, node0.isVoid());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isSwitch());
      assertEquals(83, node0.getType());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isOnlyModifiesArgumentsCall());
      assertEquals(true, arrayList0.isEmpty());
      assertEquals("[]", arrayList0.toString());
      assertEquals(0, arrayList0.size());
      assertEquals(false, jSTypeRegistry0.shouldTolerateUndefinedValues());
      
      FlowScope flowScope0 = null;
      boolean boolean0 = true;
      // Undeclared exception!
      try {
        FlowScope flowScope1 = closureReverseAbstractInterpreter0.nextPreciserScopeKnowingConditionOutcome(node0, flowScope0, boolean0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
