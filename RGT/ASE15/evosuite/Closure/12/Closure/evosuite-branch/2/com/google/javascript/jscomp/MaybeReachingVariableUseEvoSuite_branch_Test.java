/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 19:43:24 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.CleanupPasses;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.ControlFlowAnalysis;
import com.google.javascript.jscomp.ControlFlowGraph;
import com.google.javascript.jscomp.MaybeReachingVariableUse;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class MaybeReachingVariableUseEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MaybeReachingVariableUse.ReachingUses maybeReachingVariableUse_ReachingUses0 = new MaybeReachingVariableUse.ReachingUses();
      assertNotNull(maybeReachingVariableUse_ReachingUses0);
      
      boolean boolean0 = maybeReachingVariableUse_ReachingUses0.equals((Object) maybeReachingVariableUse_ReachingUses0);
      assertTrue(boolean0);
      
      boolean boolean1 = maybeReachingVariableUse_ReachingUses0.equals((Object) boolean0);
      assertFalse(boolean0 == boolean1);
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      boolean boolean0 = true;
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, boolean0, boolean0);
      assertNotNull(controlFlowAnalysis0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      ControlFlowGraph<Node> controlFlowGraph0 = controlFlowAnalysis0.getCfg();
      assertNull(controlFlowGraph0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      CompilerOptions compilerOptions0 = compiler0.newCompilerOptions();
      assertNotNull(compilerOptions0);
      assertFalse(compilerOptions0.checkSymbols);
      assertFalse(compilerOptions0.convertToDottedProperties);
      assertFalse(compilerOptions0.gatherCssNames);
      assertFalse(compilerOptions0.checkSuspiciousCode);
      assertFalse(compilerOptions0.collapseProperties);
      assertFalse(compilerOptions0.collapseVariableDeclarations);
      assertFalse(compilerOptions0.foldConstants);
      assertFalse(compilerOptions0.reserveRawExports);
      assertFalse(compilerOptions0.closurePass);
      assertFalse(compilerOptions0.exportTestFunctions);
      assertFalse(compilerOptions0.aliasKeywords);
      assertFalse(compilerOptions0.removeUnusedClassProperties);
      assertFalse(compilerOptions0.aliasExternals);
      assertFalse(compilerOptions0.flowSensitiveInlineVariables);
      assertFalse(compilerOptions0.lineBreak);
      assertFalse(compilerOptions0.inlineFunctions);
      assertFalse(compilerOptions0.generatePseudoNames);
      assertFalse(compilerOptions0.inlineLocalFunctions);
      assertFalse(compilerOptions0.jqueryPass);
      assertFalse(compilerOptions0.deadAssignmentElimination);
      assertFalse(compilerOptions0.markNoSideEffectCalls);
      assertFalse(compilerOptions0.removeTryCatchFinally);
      assertFalse(compilerOptions0.optimizeCalls);
      assertFalse(compilerOptions0.coalesceVariableNames);
      assertFalse(compilerOptions0.disambiguateProperties);
      assertFalse(compilerOptions0.removeUnusedLocalVars);
      assertFalse(compilerOptions0.printInputDelimiter);
      assertFalse(compilerOptions0.collapseAnonymousFunctions);
      assertFalse(compilerOptions0.optimizeParameters);
      assertFalse(compilerOptions0.crossModuleCodeMotion);
      assertFalse(compilerOptions0.rewriteFunctionExpressions);
      assertFalse(compilerOptions0.generateExports);
      assertFalse(compilerOptions0.optimizeReturns);
      assertFalse(compilerOptions0.smartNameRemoval);
      assertFalse(compilerOptions0.markAsCompiled);
      assertFalse(compilerOptions0.inlineConstantVars);
      assertFalse(compilerOptions0.crossModuleMethodMotion);
      assertFalse(compilerOptions0.extractPrototypeMemberDeclarations);
      assertFalse(compilerOptions0.labelRenaming);
      assertFalse(compilerOptions0.removeUnusedPrototypeProperties);
      assertFalse(compilerOptions0.checkTypes);
      assertFalse(compilerOptions0.ideMode);
      assertFalse(compilerOptions0.aliasAllStrings);
      assertFalse(compilerOptions0.checkControlStructures);
      assertFalse(compilerOptions0.preferLineBreakAtEndOfFile);
      assertFalse(compilerOptions0.ambiguateProperties);
      assertFalse(compilerOptions0.computeFunctionSideEffects);
      assertFalse(compilerOptions0.removeDeadCode);
      assertFalse(compilerOptions0.inlineVariables);
      assertFalse(compilerOptions0.recordFunctionInformation);
      assertFalse(compilerOptions0.moveFunctionDeclarations);
      assertFalse(compilerOptions0.prettyPrint);
      assertFalse(compilerOptions0.removeUnusedPrototypePropertiesInExterns);
      assertFalse(compilerOptions0.devirtualizePrototypeMethods);
      assertFalse(compilerOptions0.removeUnusedVars);
      assertFalse(compilerOptions0.inlineGetters);
      assertFalse(compilerOptions0.optimizeArgumentsArray);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNull(compilerOptions0.getLanguageOut());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compilerOptions0.getLanguageIn());
      assertEquals(false, compilerOptions0.isExternExportsEnabled());
      assertEquals(false, compilerOptions0.getInferTypes());
      assertEquals(CompilerOptions.TweakProcessing.OFF, compilerOptions0.getTweakProcessing());
      assertEquals(false, compilerOptions0.assumeStrictThis());
      assertEquals(false, compilerOptions0.isRemoveUnusedClassProperties());
      assertEquals(false, compilerOptions0.assumeClosuresOnlyCaptureReferences());
      assertEquals(CompilerOptions.TracerMode.OFF, compilerOptions0.getTracerMode());
      assertEquals(false, compilerOptions0.shouldColorizeErrorOutput());
      
      CleanupPasses cleanupPasses0 = new CleanupPasses(compilerOptions0);
      assertNotNull(cleanupPasses0);
      assertFalse(compilerOptions0.checkSymbols);
      assertFalse(compilerOptions0.convertToDottedProperties);
      assertFalse(compilerOptions0.gatherCssNames);
      assertFalse(compilerOptions0.checkSuspiciousCode);
      assertFalse(compilerOptions0.collapseProperties);
      assertFalse(compilerOptions0.collapseVariableDeclarations);
      assertFalse(compilerOptions0.foldConstants);
      assertFalse(compilerOptions0.reserveRawExports);
      assertFalse(compilerOptions0.closurePass);
      assertFalse(compilerOptions0.exportTestFunctions);
      assertFalse(compilerOptions0.aliasKeywords);
      assertFalse(compilerOptions0.removeUnusedClassProperties);
      assertFalse(compilerOptions0.aliasExternals);
      assertFalse(compilerOptions0.flowSensitiveInlineVariables);
      assertFalse(compilerOptions0.lineBreak);
      assertFalse(compilerOptions0.inlineFunctions);
      assertFalse(compilerOptions0.generatePseudoNames);
      assertFalse(compilerOptions0.inlineLocalFunctions);
      assertFalse(compilerOptions0.jqueryPass);
      assertFalse(compilerOptions0.deadAssignmentElimination);
      assertFalse(compilerOptions0.markNoSideEffectCalls);
      assertFalse(compilerOptions0.removeTryCatchFinally);
      assertFalse(compilerOptions0.optimizeCalls);
      assertFalse(compilerOptions0.coalesceVariableNames);
      assertFalse(compilerOptions0.disambiguateProperties);
      assertFalse(compilerOptions0.removeUnusedLocalVars);
      assertFalse(compilerOptions0.printInputDelimiter);
      assertFalse(compilerOptions0.collapseAnonymousFunctions);
      assertFalse(compilerOptions0.optimizeParameters);
      assertFalse(compilerOptions0.crossModuleCodeMotion);
      assertFalse(compilerOptions0.rewriteFunctionExpressions);
      assertFalse(compilerOptions0.generateExports);
      assertFalse(compilerOptions0.optimizeReturns);
      assertFalse(compilerOptions0.smartNameRemoval);
      assertFalse(compilerOptions0.markAsCompiled);
      assertFalse(compilerOptions0.inlineConstantVars);
      assertFalse(compilerOptions0.crossModuleMethodMotion);
      assertFalse(compilerOptions0.extractPrototypeMemberDeclarations);
      assertFalse(compilerOptions0.labelRenaming);
      assertFalse(compilerOptions0.removeUnusedPrototypeProperties);
      assertFalse(compilerOptions0.checkTypes);
      assertFalse(compilerOptions0.ideMode);
      assertFalse(compilerOptions0.aliasAllStrings);
      assertFalse(compilerOptions0.checkControlStructures);
      assertFalse(compilerOptions0.preferLineBreakAtEndOfFile);
      assertFalse(compilerOptions0.ambiguateProperties);
      assertFalse(compilerOptions0.computeFunctionSideEffects);
      assertFalse(compilerOptions0.removeDeadCode);
      assertFalse(compilerOptions0.inlineVariables);
      assertFalse(compilerOptions0.recordFunctionInformation);
      assertFalse(compilerOptions0.moveFunctionDeclarations);
      assertFalse(compilerOptions0.prettyPrint);
      assertFalse(compilerOptions0.removeUnusedPrototypePropertiesInExterns);
      assertFalse(compilerOptions0.devirtualizePrototypeMethods);
      assertFalse(compilerOptions0.removeUnusedVars);
      assertFalse(compilerOptions0.inlineGetters);
      assertFalse(compilerOptions0.optimizeArgumentsArray);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNull(compilerOptions0.getLanguageOut());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compilerOptions0.getLanguageIn());
      assertEquals(false, compilerOptions0.isExternExportsEnabled());
      assertEquals(false, compilerOptions0.getInferTypes());
      assertEquals(CompilerOptions.TweakProcessing.OFF, compilerOptions0.getTweakProcessing());
      assertEquals(false, compilerOptions0.assumeStrictThis());
      assertEquals(false, compilerOptions0.isRemoveUnusedClassProperties());
      assertEquals(false, compilerOptions0.assumeClosuresOnlyCaptureReferences());
      assertEquals(CompilerOptions.TracerMode.OFF, compilerOptions0.getTracerMode());
      assertEquals(false, compilerOptions0.shouldColorizeErrorOutput());
      
      Scope scope0 = cleanupPasses0.getTopScope();
      assertNull(scope0);
      assertFalse(compilerOptions0.checkSymbols);
      assertFalse(compilerOptions0.convertToDottedProperties);
      assertFalse(compilerOptions0.gatherCssNames);
      assertFalse(compilerOptions0.checkSuspiciousCode);
      assertFalse(compilerOptions0.collapseProperties);
      assertFalse(compilerOptions0.collapseVariableDeclarations);
      assertFalse(compilerOptions0.foldConstants);
      assertFalse(compilerOptions0.reserveRawExports);
      assertFalse(compilerOptions0.closurePass);
      assertFalse(compilerOptions0.exportTestFunctions);
      assertFalse(compilerOptions0.aliasKeywords);
      assertFalse(compilerOptions0.removeUnusedClassProperties);
      assertFalse(compilerOptions0.aliasExternals);
      assertFalse(compilerOptions0.flowSensitiveInlineVariables);
      assertFalse(compilerOptions0.lineBreak);
      assertFalse(compilerOptions0.inlineFunctions);
      assertFalse(compilerOptions0.generatePseudoNames);
      assertFalse(compilerOptions0.inlineLocalFunctions);
      assertFalse(compilerOptions0.jqueryPass);
      assertFalse(compilerOptions0.deadAssignmentElimination);
      assertFalse(compilerOptions0.markNoSideEffectCalls);
      assertFalse(compilerOptions0.removeTryCatchFinally);
      assertFalse(compilerOptions0.optimizeCalls);
      assertFalse(compilerOptions0.coalesceVariableNames);
      assertFalse(compilerOptions0.disambiguateProperties);
      assertFalse(compilerOptions0.removeUnusedLocalVars);
      assertFalse(compilerOptions0.printInputDelimiter);
      assertFalse(compilerOptions0.collapseAnonymousFunctions);
      assertFalse(compilerOptions0.optimizeParameters);
      assertFalse(compilerOptions0.crossModuleCodeMotion);
      assertFalse(compilerOptions0.rewriteFunctionExpressions);
      assertFalse(compilerOptions0.generateExports);
      assertFalse(compilerOptions0.optimizeReturns);
      assertFalse(compilerOptions0.smartNameRemoval);
      assertFalse(compilerOptions0.markAsCompiled);
      assertFalse(compilerOptions0.inlineConstantVars);
      assertFalse(compilerOptions0.crossModuleMethodMotion);
      assertFalse(compilerOptions0.extractPrototypeMemberDeclarations);
      assertFalse(compilerOptions0.labelRenaming);
      assertFalse(compilerOptions0.removeUnusedPrototypeProperties);
      assertFalse(compilerOptions0.checkTypes);
      assertFalse(compilerOptions0.ideMode);
      assertFalse(compilerOptions0.aliasAllStrings);
      assertFalse(compilerOptions0.checkControlStructures);
      assertFalse(compilerOptions0.preferLineBreakAtEndOfFile);
      assertFalse(compilerOptions0.ambiguateProperties);
      assertFalse(compilerOptions0.computeFunctionSideEffects);
      assertFalse(compilerOptions0.removeDeadCode);
      assertFalse(compilerOptions0.inlineVariables);
      assertFalse(compilerOptions0.recordFunctionInformation);
      assertFalse(compilerOptions0.moveFunctionDeclarations);
      assertFalse(compilerOptions0.prettyPrint);
      assertFalse(compilerOptions0.removeUnusedPrototypePropertiesInExterns);
      assertFalse(compilerOptions0.devirtualizePrototypeMethods);
      assertFalse(compilerOptions0.removeUnusedVars);
      assertFalse(compilerOptions0.inlineGetters);
      assertFalse(compilerOptions0.optimizeArgumentsArray);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNull(compilerOptions0.getLanguageOut());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compilerOptions0.getLanguageIn());
      assertEquals(false, compilerOptions0.isExternExportsEnabled());
      assertEquals(false, compilerOptions0.getInferTypes());
      assertEquals(CompilerOptions.TweakProcessing.OFF, compilerOptions0.getTweakProcessing());
      assertEquals(false, compilerOptions0.assumeStrictThis());
      assertEquals(false, compilerOptions0.isRemoveUnusedClassProperties());
      assertEquals(false, compilerOptions0.assumeClosuresOnlyCaptureReferences());
      assertEquals(CompilerOptions.TracerMode.OFF, compilerOptions0.getTracerMode());
      assertEquals(false, compilerOptions0.shouldColorizeErrorOutput());
      
      MaybeReachingVariableUse maybeReachingVariableUse0 = null;
      try {
        maybeReachingVariableUse0 = new MaybeReachingVariableUse(controlFlowGraph0, scope0, compiler0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MaybeReachingVariableUse.ReachingUses maybeReachingVariableUse_ReachingUses0 = new MaybeReachingVariableUse.ReachingUses();
      assertNotNull(maybeReachingVariableUse_ReachingUses0);
      
      MaybeReachingVariableUse.ReachingUses maybeReachingVariableUse_ReachingUses1 = new MaybeReachingVariableUse.ReachingUses(maybeReachingVariableUse_ReachingUses0);
      assertTrue(maybeReachingVariableUse_ReachingUses0.equals((Object)maybeReachingVariableUse_ReachingUses1));
      assertTrue(maybeReachingVariableUse_ReachingUses1.equals((Object)maybeReachingVariableUse_ReachingUses0));
      assertNotNull(maybeReachingVariableUse_ReachingUses1);
      assertNotSame(maybeReachingVariableUse_ReachingUses0, maybeReachingVariableUse_ReachingUses1);
      assertNotSame(maybeReachingVariableUse_ReachingUses1, maybeReachingVariableUse_ReachingUses0);
  }
}
