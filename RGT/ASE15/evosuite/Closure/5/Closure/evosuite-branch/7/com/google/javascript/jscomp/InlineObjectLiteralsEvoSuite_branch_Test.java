/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 22:23:57 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.InlineObjectLiterals;
import com.google.javascript.jscomp.Normalize;
import com.google.javascript.jscomp.RenameLabels;
import com.google.javascript.rhino.Node;
import java.io.PrintStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.mock.java.lang.MockRuntimeException;
import org.junit.runner.RunWith;

 
public class InlineObjectLiteralsEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PrintStream printStream0 = null;
      Compiler compiler0 = new Compiler(printStream0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(compiler0);
      
      RenameLabels.DefaultNameSupplier renameLabels_DefaultNameSupplier0 = new RenameLabels.DefaultNameSupplier();
      assertNotNull(renameLabels_DefaultNameSupplier0);
      
      InlineObjectLiterals inlineObjectLiterals0 = new InlineObjectLiterals(compiler0, renameLabels_DefaultNameSupplier0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(inlineObjectLiterals0);
      
      String string0 = "";
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, string0, string0);
      assertEquals(4096, node0.getSourcePosition());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(false, node0.isVar());
      assertEquals(false, node0.isAnd());
      assertEquals(false, node0.isCast());
      assertEquals(false, node0.isEmpty());
      assertEquals(false, node0.isBlock());
      assertEquals(false, node0.isSetterDef());
      assertEquals(false, node0.isCall());
      assertEquals(false, node0.isDec());
      assertEquals(false, node0.isFor());
      assertEquals(false, node0.isExprResult());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isComma());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isCatch());
      assertEquals(false, node0.isArrayLit());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isInc());
      assertEquals(false, node0.isCase());
      assertEquals(false, node0.isOr());
      assertEquals(false, node0.isVoid());
      assertEquals(false, node0.isString());
      assertEquals(false, node0.isSwitch());
      assertEquals(false, node0.isReturn());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isAdd());
      assertEquals(false, node0.isLabelName());
      assertEquals(false, node0.isRegExp());
      assertEquals(false, node0.isName());
      assertEquals(false, node0.isStringKey());
      assertEquals(false, node0.isFunction());
      assertEquals(false, node0.isDefaultCase());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isDo());
      assertEquals(false, node0.isHook());
      assertEquals(false, node0.isWith());
      assertEquals(0, node0.getCharno());
      assertEquals(false, node0.isNew());
      assertEquals(false, node0.isDelProp());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isDebugger());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isThis());
      assertEquals(false, node0.isGetterDef());
      assertEquals(true, node0.isScript());
      assertEquals("[testcode]", node0.getSourceFileName());
      assertEquals(false, node0.isGetProp());
      assertEquals(false, node0.isGetElem());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.isTypeOf());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(false, node0.isNot());
      assertEquals(false, node0.isFalse());
      assertEquals(false, node0.isObjectLit());
      assertEquals(false, node0.isThrow());
      assertEquals(false, node0.isNull());
      assertEquals(false, node0.isTrue());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.isParamList());
      assertEquals(false, node0.isWhile());
      assertEquals(false, node0.isIf());
      assertEquals(false, node0.isTry());
      assertEquals(false, node0.isContinue());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.isIn());
      assertEquals(false, node0.isNE());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isBreak());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isLabel());
      assertEquals(false, node0.isNumber());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isAssign());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isIdeMode());
      assertNotNull(node0);
      
      // Undeclared exception!
      try {
        inlineObjectLiterals0.process(node0, node0);
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
