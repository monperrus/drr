/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 20:37:21 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.ConcreteType;
import com.google.javascript.jscomp.DisambiguateProperties;
import com.google.javascript.jscomp.TightenTypes;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.BooleanLiteralSet;
import com.google.javascript.rhino.jstype.EnumElementType;
import com.google.javascript.rhino.jstype.EnumType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.NamedType;
import com.google.javascript.rhino.jstype.RecordType;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

 
public class DisambiguatePropertiesEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isIdeMode());
      assertNotNull(compiler0);
      
      TightenTypes tightenTypes0 = new TightenTypes(compiler0);
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isIdeMode());
      assertNotNull(tightenTypes0);
      
      DisambiguateProperties<ConcreteType> disambiguateProperties0 = DisambiguateProperties.forConcreteTypeSystem(compiler0, tightenTypes0);
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isIdeMode());
      assertNotNull(disambiguateProperties0);
      
      CompilerOptions compilerOptions0 = compiler0.getOptions();
      assertFalse(compilerOptions0.optimizeArgumentsArray);
      assertFalse(compilerOptions0.checkCaja);
      assertFalse(compilerOptions0.tightenTypes);
      assertFalse(compilerOptions0.moveFunctionDeclarations);
      assertFalse(compilerOptions0.crossModuleMethodMotion);
      assertFalse(compilerOptions0.coalesceVariableNames);
      assertFalse(compilerOptions0.removeUnusedPrototypeProperties);
      assertFalse(compilerOptions0.gatherCssNames);
      assertFalse(compilerOptions0.generatePseudoNames);
      assertFalse(compilerOptions0.checkTypedPropertyCalls);
      assertFalse(compilerOptions0.ambiguateProperties);
      assertFalse(compilerOptions0.smartNameRemoval);
      assertFalse(compilerOptions0.checkSymbols);
      assertFalse(compilerOptions0.foldConstants);
      assertFalse(compilerOptions0.aliasExternals);
      assertFalse(compilerOptions0.strictMessageReplacement);
      assertFalse(compilerOptions0.inlineGetters);
      assertFalse(compilerOptions0.extractPrototypeMemberDeclarations);
      assertFalse(compilerOptions0.collapseProperties);
      assertFalse(compilerOptions0.removeUnusedPrototypePropertiesInExterns);
      assertFalse(compilerOptions0.removeTryCatchFinally);
      assertFalse(compilerOptions0.labelRenaming);
      assertFalse(compilerOptions0.instrumentForCoverageOnly);
      assertFalse(compilerOptions0.lineBreak);
      assertFalse(compilerOptions0.inlineAnonymousFunctionExpressions);
      assertFalse(compilerOptions0.recordFunctionInformation);
      assertFalse(compilerOptions0.crossModuleCodeMotion);
      assertFalse(compilerOptions0.collapseVariableDeclarations);
      assertFalse(compilerOptions0.disambiguateProperties);
      assertFalse(compilerOptions0.inlineFunctions);
      assertFalse(compilerOptions0.reserveRawExports);
      assertFalse(compilerOptions0.closurePass);
      assertFalse(compilerOptions0.computeFunctionSideEffects);
      assertFalse(compilerOptions0.printInputDelimiter);
      assertFalse(compilerOptions0.flowSensitiveInlineVariables);
      assertFalse(compilerOptions0.exportTestFunctions);
      assertFalse(compilerOptions0.checkTypes);
      assertFalse(compilerOptions0.allowLegacyJsMessages);
      assertFalse(compilerOptions0.instrumentForCoverage);
      assertFalse(compilerOptions0.ignoreCajaProperties);
      assertFalse(compilerOptions0.inlineConstantVars);
      assertFalse(compilerOptions0.markNoSideEffectCalls);
      assertFalse(compilerOptions0.aliasAllStrings);
      assertFalse(compilerOptions0.checkUnusedPropertiesEarly);
      assertFalse(compilerOptions0.inlineLocalFunctions);
      assertFalse(compilerOptions0.rewriteFunctionExpressions);
      assertTrue(compilerOptions0.removeUnusedVarsInGlobalScope);
      assertFalse(compilerOptions0.deadAssignmentElimination);
      assertFalse(compilerOptions0.checkSuspiciousCode);
      assertFalse(compilerOptions0.removeDeadCode);
      assertFalse(compilerOptions0.aliasKeywords);
      assertFalse(compilerOptions0.ideMode);
      assertFalse(compilerOptions0.inlineLocalVariables);
      assertFalse(compilerOptions0.inlineVariables);
      assertFalse(compilerOptions0.removeConstantExpressions);
      assertFalse(compilerOptions0.inferTypesInGlobalScope);
      assertFalse(compilerOptions0.removeUnusedVars);
      assertFalse(compilerOptions0.decomposeExpressions);
      assertFalse(compilerOptions0.optimizeParameters);
      assertFalse(compilerOptions0.collapseAnonymousFunctions);
      assertFalse(compilerOptions0.convertToDottedProperties);
      assertFalse(compilerOptions0.removeEmptyFunctions);
      assertFalse(compilerOptions0.checkControlStructures);
      assertFalse(compilerOptions0.checkDuplicateMessages);
      assertFalse(compilerOptions0.prettyPrint);
      assertFalse(compilerOptions0.markAsCompiled);
      assertFalse(compilerOptions0.devirtualizePrototypeMethods);
      assertFalse(compilerOptions0.generateExports);
      assertFalse(compilerOptions0.checkEs5Strict);
      assertEquals(false, compilerOptions0.shouldColorizeErrorOutput());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isIdeMode());
      assertNotNull(compilerOptions0);
      
      ConcreteType concreteType0 = ConcreteType.ALL;
      assertNotNull(concreteType0);
      
      ConcreteType concreteType1 = disambiguateProperties0.getTypeWithProperty(compilerOptions0.appNameStr, concreteType0);
      assertFalse(compilerOptions0.optimizeArgumentsArray);
      assertFalse(compilerOptions0.checkCaja);
      assertFalse(compilerOptions0.tightenTypes);
      assertFalse(compilerOptions0.moveFunctionDeclarations);
      assertFalse(compilerOptions0.crossModuleMethodMotion);
      assertFalse(compilerOptions0.coalesceVariableNames);
      assertFalse(compilerOptions0.removeUnusedPrototypeProperties);
      assertFalse(compilerOptions0.gatherCssNames);
      assertFalse(compilerOptions0.generatePseudoNames);
      assertFalse(compilerOptions0.checkTypedPropertyCalls);
      assertFalse(compilerOptions0.ambiguateProperties);
      assertFalse(compilerOptions0.smartNameRemoval);
      assertFalse(compilerOptions0.checkSymbols);
      assertFalse(compilerOptions0.foldConstants);
      assertFalse(compilerOptions0.aliasExternals);
      assertFalse(compilerOptions0.strictMessageReplacement);
      assertFalse(compilerOptions0.inlineGetters);
      assertFalse(compilerOptions0.extractPrototypeMemberDeclarations);
      assertFalse(compilerOptions0.collapseProperties);
      assertFalse(compilerOptions0.removeUnusedPrototypePropertiesInExterns);
      assertFalse(compilerOptions0.removeTryCatchFinally);
      assertFalse(compilerOptions0.labelRenaming);
      assertFalse(compilerOptions0.instrumentForCoverageOnly);
      assertFalse(compilerOptions0.lineBreak);
      assertFalse(compilerOptions0.inlineAnonymousFunctionExpressions);
      assertFalse(compilerOptions0.recordFunctionInformation);
      assertFalse(compilerOptions0.crossModuleCodeMotion);
      assertFalse(compilerOptions0.collapseVariableDeclarations);
      assertFalse(compilerOptions0.disambiguateProperties);
      assertFalse(compilerOptions0.inlineFunctions);
      assertFalse(compilerOptions0.reserveRawExports);
      assertFalse(compilerOptions0.closurePass);
      assertFalse(compilerOptions0.computeFunctionSideEffects);
      assertFalse(compilerOptions0.printInputDelimiter);
      assertFalse(compilerOptions0.flowSensitiveInlineVariables);
      assertFalse(compilerOptions0.exportTestFunctions);
      assertFalse(compilerOptions0.checkTypes);
      assertFalse(compilerOptions0.allowLegacyJsMessages);
      assertFalse(compilerOptions0.instrumentForCoverage);
      assertFalse(compilerOptions0.ignoreCajaProperties);
      assertFalse(compilerOptions0.inlineConstantVars);
      assertFalse(compilerOptions0.markNoSideEffectCalls);
      assertFalse(compilerOptions0.aliasAllStrings);
      assertFalse(compilerOptions0.checkUnusedPropertiesEarly);
      assertFalse(compilerOptions0.inlineLocalFunctions);
      assertFalse(compilerOptions0.rewriteFunctionExpressions);
      assertTrue(compilerOptions0.removeUnusedVarsInGlobalScope);
      assertFalse(compilerOptions0.deadAssignmentElimination);
      assertFalse(compilerOptions0.checkSuspiciousCode);
      assertFalse(compilerOptions0.removeDeadCode);
      assertFalse(compilerOptions0.aliasKeywords);
      assertFalse(compilerOptions0.ideMode);
      assertFalse(compilerOptions0.inlineLocalVariables);
      assertFalse(compilerOptions0.inlineVariables);
      assertFalse(compilerOptions0.removeConstantExpressions);
      assertFalse(compilerOptions0.inferTypesInGlobalScope);
      assertFalse(compilerOptions0.removeUnusedVars);
      assertFalse(compilerOptions0.decomposeExpressions);
      assertFalse(compilerOptions0.optimizeParameters);
      assertFalse(compilerOptions0.collapseAnonymousFunctions);
      assertFalse(compilerOptions0.convertToDottedProperties);
      assertFalse(compilerOptions0.removeEmptyFunctions);
      assertFalse(compilerOptions0.checkControlStructures);
      assertFalse(compilerOptions0.checkDuplicateMessages);
      assertFalse(compilerOptions0.prettyPrint);
      assertFalse(compilerOptions0.markAsCompiled);
      assertFalse(compilerOptions0.devirtualizePrototypeMethods);
      assertFalse(compilerOptions0.generateExports);
      assertFalse(compilerOptions0.checkEs5Strict);
      assertEquals(false, compilerOptions0.shouldColorizeErrorOutput());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isIdeMode());
      assertNull(concreteType1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.hasErrors());
      assertNotNull(compiler0);
      
      TightenTypes tightenTypes0 = new TightenTypes(compiler0);
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.hasErrors());
      assertNotNull(tightenTypes0);
      
      DisambiguateProperties<ConcreteType> disambiguateProperties0 = DisambiguateProperties.forConcreteTypeSystem(compiler0, tightenTypes0);
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.hasErrors());
      assertNotNull(disambiguateProperties0);
      
      String string0 = ";  ";
      Vector<ConcreteType> vector0 = new Vector<ConcreteType>();
      assertEquals(true, vector0.isEmpty());
      assertEquals(0, vector0.size());
      assertEquals("[]", vector0.toString());
      assertEquals(10, vector0.capacity());
      assertNotNull(vector0);
      
      ConcreteType concreteType0 = ConcreteType.createForTypes(vector0);
      assertEquals(true, vector0.isEmpty());
      assertEquals(0, vector0.size());
      assertEquals("[]", vector0.toString());
      assertEquals(10, vector0.capacity());
      assertNotNull(concreteType0);
      
      ConcreteType.ConcreteUniqueType concreteType_ConcreteUniqueType0 = (ConcreteType.ConcreteUniqueType)disambiguateProperties0.getTypeWithProperty(string0, concreteType0);
      assertEquals(true, vector0.isEmpty());
      assertEquals(0, vector0.size());
      assertEquals("[]", vector0.toString());
      assertEquals(10, vector0.capacity());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.hasErrors());
      assertNotNull(concreteType_ConcreteUniqueType0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertNotNull(compiler0);
      
      DisambiguateProperties<JSType> disambiguateProperties0 = DisambiguateProperties.forJSTypeSystem(compiler0);
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertNotNull(disambiguateProperties0);
      
      String string0 = "Renamed ";
      TightenTypes tightenTypes0 = new TightenTypes(compiler0);
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertNotNull(tightenTypes0);
      
      JSTypeRegistry jSTypeRegistry0 = tightenTypes0.getTypeRegistry();
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertNotNull(jSTypeRegistry0);
      
      int int0 = (-1920);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, string0, string0, int0, int0);
      assertEquals(false, namedType0.isNoType());
      assertEquals(false, namedType0.isNullType());
      assertEquals(false, namedType0.isResolved());
      assertEquals(true, namedType0.isNominalType());
      assertEquals(false, namedType0.isTemplateType());
      assertEquals(false, namedType0.isFunctionType());
      assertEquals(false, namedType0.isBooleanValueType());
      assertEquals("Renamed ", namedType0.getReferenceName());
      assertEquals(false, namedType0.isNoObjectType());
      assertEquals(true, namedType0.isNamedType());
      assertEquals(BooleanLiteralSet.TRUE, namedType0.getPossibleToBooleanOutcomes());
      assertEquals(false, namedType0.isVoidType());
      assertEquals(true, namedType0.hasReferenceName());
      assertEquals(false, namedType0.isStringValueType());
      assertEquals(false, namedType0.isAllType());
      assertEquals(false, namedType0.isUnionType());
      assertEquals(false, namedType0.isRecordType());
      assertEquals(false, namedType0.isNativeObjectType());
      assertEquals("Renamed ", namedType0.toString());
      assertEquals(false, namedType0.hasCachedValues());
      assertEquals(false, namedType0.isNumberValueType());
      assertEquals(false, namedType0.isEmptyType());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertNotNull(namedType0);
      
      NamedType namedType1 = (NamedType)disambiguateProperties0.getTypeWithProperty(string0, namedType0);
      assertSame(namedType0, namedType1);
      assertSame(namedType1, namedType0);
      assertEquals(false, namedType0.isNoType());
      assertEquals(false, namedType0.isNullType());
      assertEquals(false, namedType0.isResolved());
      assertEquals(true, namedType0.isNominalType());
      assertEquals(false, namedType0.isTemplateType());
      assertEquals(false, namedType0.isFunctionType());
      assertEquals(false, namedType0.isBooleanValueType());
      assertEquals("Renamed ", namedType0.getReferenceName());
      assertEquals(false, namedType0.isNoObjectType());
      assertEquals(true, namedType0.isNamedType());
      assertEquals(BooleanLiteralSet.TRUE, namedType0.getPossibleToBooleanOutcomes());
      assertEquals(false, namedType0.isVoidType());
      assertEquals(true, namedType0.hasReferenceName());
      assertEquals(false, namedType0.isStringValueType());
      assertEquals(false, namedType0.isAllType());
      assertEquals(false, namedType0.isUnionType());
      assertEquals(false, namedType0.isRecordType());
      assertEquals(false, namedType0.isNativeObjectType());
      assertEquals("Renamed ", namedType0.toString());
      assertEquals(false, namedType0.hasCachedValues());
      assertEquals(false, namedType0.isNumberValueType());
      assertEquals(false, namedType0.isEmptyType());
      assertEquals(true, namedType1.isNominalType());
      assertEquals(false, namedType1.isStringValueType());
      assertEquals(false, namedType1.isRecordType());
      assertEquals(false, namedType1.hasCachedValues());
      assertEquals(false, namedType1.isEmptyType());
      assertEquals(false, namedType1.isNoObjectType());
      assertEquals(false, namedType1.isResolved());
      assertEquals("Renamed ", namedType1.getReferenceName());
      assertEquals(true, namedType1.isNamedType());
      assertEquals(false, namedType1.isUnionType());
      assertEquals(false, namedType1.isAllType());
      assertEquals(BooleanLiteralSet.TRUE, namedType1.getPossibleToBooleanOutcomes());
      assertEquals(false, namedType1.isNativeObjectType());
      assertEquals(false, namedType1.isBooleanValueType());
      assertEquals(false, namedType1.isTemplateType());
      assertEquals("Renamed ", namedType1.toString());
      assertEquals(false, namedType1.isFunctionType());
      assertEquals(false, namedType1.isNoType());
      assertEquals(false, namedType1.isVoidType());
      assertEquals(false, namedType1.isNullType());
      assertEquals(true, namedType1.hasReferenceName());
      assertEquals(false, namedType1.isNumberValueType());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertNotNull(namedType1);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertNotNull(compiler0);
      
      DisambiguateProperties<JSType> disambiguateProperties0 = DisambiguateProperties.forJSTypeSystem(compiler0);
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertNotNull(disambiguateProperties0);
      
      String string0 = "Renamed ";
      TightenTypes tightenTypes0 = new TightenTypes(compiler0);
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertNotNull(tightenTypes0);
      
      JSTypeRegistry jSTypeRegistry0 = tightenTypes0.getTypeRegistry();
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertNotNull(jSTypeRegistry0);
      
      HashMap<String, JSType> hashMap0 = new HashMap<String, JSType>();
      assertEquals(0, hashMap0.size());
      assertEquals(true, hashMap0.isEmpty());
      assertEquals("{}", hashMap0.toString());
      assertNotNull(hashMap0);
      
      RecordType recordType0 = jSTypeRegistry0.createRecordType((Map<String, JSType>) hashMap0);
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, recordType0.isBooleanValueType());
      assertEquals(false, recordType0.isNamedType());
      assertEquals(false, recordType0.isUnionType());
      assertEquals(false, recordType0.isResolved());
      assertEquals(false, recordType0.isStringValueType());
      assertEquals(BooleanLiteralSet.TRUE, recordType0.getPossibleToBooleanOutcomes());
      assertEquals(false, recordType0.isTemplateType());
      assertEquals(false, recordType0.isEmptyType());
      assertEquals(false, recordType0.isNoType());
      assertEquals(true, recordType0.isRecordType());
      assertEquals(false, recordType0.isFunctionType());
      assertEquals(false, recordType0.isVoidType());
      assertEquals(false, recordType0.isNoObjectType());
      assertEquals(false, recordType0.isAllType());
      assertEquals(false, recordType0.isNumberValueType());
      assertEquals(false, recordType0.isNullType());
      assertEquals(0, hashMap0.size());
      assertEquals(true, hashMap0.isEmpty());
      assertEquals("{}", hashMap0.toString());
      assertNotNull(recordType0);
      
      EnumType enumType0 = jSTypeRegistry0.createEnumType(string0, (JSType) recordType0);
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, enumType0.isNoObjectType());
      assertEquals(true, enumType0.matchesObjectContext());
      assertEquals(false, enumType0.isBooleanValueType());
      assertEquals(true, enumType0.matchesStringContext());
      assertEquals(false, enumType0.isResolved());
      assertEquals(false, enumType0.isNullType());
      assertEquals(false, enumType0.isNamedType());
      assertEquals(false, enumType0.isUnionType());
      assertEquals(false, enumType0.isNumberValueType());
      assertEquals(false, enumType0.isRecordType());
      assertEquals(false, enumType0.isTemplateType());
      assertEquals(false, enumType0.isFunctionType());
      assertEquals(false, enumType0.isAllType());
      assertEquals(false, enumType0.isStringValueType());
      assertEquals(BooleanLiteralSet.TRUE, enumType0.getPossibleToBooleanOutcomes());
      assertEquals(false, enumType0.isNoType());
      assertEquals(false, enumType0.isVoidType());
      assertEquals(false, enumType0.matchesNumberContext());
      assertEquals(true, enumType0.isEnumType());
      assertEquals(false, enumType0.isEmptyType());
      assertEquals(false, recordType0.isBooleanValueType());
      assertEquals(false, recordType0.isNamedType());
      assertEquals(false, recordType0.isUnionType());
      assertEquals(false, recordType0.isResolved());
      assertEquals(false, recordType0.isStringValueType());
      assertEquals(BooleanLiteralSet.TRUE, recordType0.getPossibleToBooleanOutcomes());
      assertEquals(false, recordType0.isTemplateType());
      assertEquals(false, recordType0.isEmptyType());
      assertEquals(false, recordType0.isNoType());
      assertEquals(true, recordType0.isRecordType());
      assertEquals(false, recordType0.isFunctionType());
      assertEquals(false, recordType0.isVoidType());
      assertEquals(false, recordType0.isNoObjectType());
      assertEquals(false, recordType0.isAllType());
      assertEquals(false, recordType0.isNumberValueType());
      assertEquals(false, recordType0.isNullType());
      assertEquals(0, hashMap0.size());
      assertEquals(true, hashMap0.isEmpty());
      assertEquals("{}", hashMap0.toString());
      assertNotNull(enumType0);
      
      EnumElementType enumElementType0 = enumType0.getElementsType();
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, enumType0.isNoObjectType());
      assertEquals(true, enumType0.matchesObjectContext());
      assertEquals(false, enumType0.isBooleanValueType());
      assertEquals(true, enumType0.matchesStringContext());
      assertEquals(false, enumType0.isResolved());
      assertEquals(false, enumType0.isNullType());
      assertEquals(false, enumType0.isNamedType());
      assertEquals(false, enumType0.isUnionType());
      assertEquals(false, enumType0.isNumberValueType());
      assertEquals(false, enumType0.isRecordType());
      assertEquals(false, enumType0.isTemplateType());
      assertEquals(false, enumType0.isFunctionType());
      assertEquals(false, enumType0.isAllType());
      assertEquals(false, enumType0.isStringValueType());
      assertEquals(BooleanLiteralSet.TRUE, enumType0.getPossibleToBooleanOutcomes());
      assertEquals(false, enumType0.isNoType());
      assertEquals(false, enumType0.isVoidType());
      assertEquals(false, enumType0.matchesNumberContext());
      assertEquals(true, enumType0.isEnumType());
      assertEquals(false, enumType0.isEmptyType());
      assertEquals(false, enumElementType0.isRecordType());
      assertEquals(false, enumElementType0.isVoidType());
      assertEquals(false, enumElementType0.isEmptyType());
      assertEquals(true, enumElementType0.hasReferenceName());
      assertEquals(false, enumElementType0.isNoType());
      assertEquals(false, enumElementType0.isNamedType());
      assertEquals(false, enumElementType0.isNullType());
      assertEquals(BooleanLiteralSet.TRUE, enumElementType0.getPossibleToBooleanOutcomes());
      assertEquals(false, enumElementType0.isFunctionType());
      assertEquals("Renamed ", enumElementType0.getReferenceName());
      assertEquals(false, enumElementType0.isNoObjectType());
      assertEquals(false, enumElementType0.isNumberValueType());
      assertEquals(false, enumElementType0.isStringValueType());
      assertEquals(true, enumElementType0.isNominalType());
      assertEquals(false, enumElementType0.isNativeObjectType());
      assertEquals(false, enumElementType0.isAllType());
      assertEquals(false, enumElementType0.isUnionType());
      assertEquals(false, enumElementType0.isTemplateType());
      assertEquals(true, enumElementType0.isEnumElementType());
      assertEquals(false, enumElementType0.hasCachedValues());
      assertEquals(false, enumElementType0.isResolved());
      assertEquals(false, enumElementType0.isBooleanValueType());
      assertEquals(false, recordType0.isBooleanValueType());
      assertEquals(false, recordType0.isNamedType());
      assertEquals(false, recordType0.isUnionType());
      assertEquals(false, recordType0.isResolved());
      assertEquals(false, recordType0.isStringValueType());
      assertEquals(BooleanLiteralSet.TRUE, recordType0.getPossibleToBooleanOutcomes());
      assertEquals(false, recordType0.isTemplateType());
      assertEquals(false, recordType0.isEmptyType());
      assertEquals(false, recordType0.isNoType());
      assertEquals(true, recordType0.isRecordType());
      assertEquals(false, recordType0.isFunctionType());
      assertEquals(false, recordType0.isVoidType());
      assertEquals(false, recordType0.isNoObjectType());
      assertEquals(false, recordType0.isAllType());
      assertEquals(false, recordType0.isNumberValueType());
      assertEquals(false, recordType0.isNullType());
      assertEquals(0, hashMap0.size());
      assertEquals(true, hashMap0.isEmpty());
      assertEquals("{}", hashMap0.toString());
      assertNotNull(enumElementType0);
      
      JSType jSType0 = disambiguateProperties0.getTypeWithProperty(string0, enumElementType0);
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, enumType0.isNoObjectType());
      assertEquals(true, enumType0.matchesObjectContext());
      assertEquals(false, enumType0.isBooleanValueType());
      assertEquals(true, enumType0.matchesStringContext());
      assertEquals(false, enumType0.isResolved());
      assertEquals(false, enumType0.isNullType());
      assertEquals(false, enumType0.isNamedType());
      assertEquals(false, enumType0.isUnionType());
      assertEquals(false, enumType0.isNumberValueType());
      assertEquals(false, enumType0.isRecordType());
      assertEquals(false, enumType0.isTemplateType());
      assertEquals(false, enumType0.isFunctionType());
      assertEquals(false, enumType0.isAllType());
      assertEquals(false, enumType0.isStringValueType());
      assertEquals(BooleanLiteralSet.TRUE, enumType0.getPossibleToBooleanOutcomes());
      assertEquals(false, enumType0.isNoType());
      assertEquals(false, enumType0.isVoidType());
      assertEquals(false, enumType0.matchesNumberContext());
      assertEquals(true, enumType0.isEnumType());
      assertEquals(false, enumType0.isEmptyType());
      assertEquals(false, enumElementType0.isRecordType());
      assertEquals(false, enumElementType0.isVoidType());
      assertEquals(false, enumElementType0.isEmptyType());
      assertEquals(true, enumElementType0.hasReferenceName());
      assertEquals(false, enumElementType0.isNoType());
      assertEquals(false, enumElementType0.isNamedType());
      assertEquals(false, enumElementType0.isNullType());
      assertEquals(BooleanLiteralSet.TRUE, enumElementType0.getPossibleToBooleanOutcomes());
      assertEquals(false, enumElementType0.isFunctionType());
      assertEquals("Renamed ", enumElementType0.getReferenceName());
      assertEquals(false, enumElementType0.isNoObjectType());
      assertEquals(false, enumElementType0.isNumberValueType());
      assertEquals(false, enumElementType0.isStringValueType());
      assertEquals(true, enumElementType0.isNominalType());
      assertEquals(false, enumElementType0.isNativeObjectType());
      assertEquals(false, enumElementType0.isAllType());
      assertEquals(false, enumElementType0.isUnionType());
      assertEquals(false, enumElementType0.isTemplateType());
      assertEquals(true, enumElementType0.isEnumElementType());
      assertEquals(false, enumElementType0.hasCachedValues());
      assertEquals(false, enumElementType0.isResolved());
      assertEquals(false, enumElementType0.isBooleanValueType());
      assertEquals(false, recordType0.isBooleanValueType());
      assertEquals(false, recordType0.isNamedType());
      assertEquals(false, recordType0.isUnionType());
      assertEquals(false, recordType0.isResolved());
      assertEquals(false, recordType0.isStringValueType());
      assertEquals(BooleanLiteralSet.TRUE, recordType0.getPossibleToBooleanOutcomes());
      assertEquals(false, recordType0.isTemplateType());
      assertEquals(false, recordType0.isEmptyType());
      assertEquals(false, recordType0.isNoType());
      assertEquals(true, recordType0.isRecordType());
      assertEquals(false, recordType0.isFunctionType());
      assertEquals(false, recordType0.isVoidType());
      assertEquals(false, recordType0.isNoObjectType());
      assertEquals(false, recordType0.isAllType());
      assertEquals(false, recordType0.isNumberValueType());
      assertEquals(false, recordType0.isNullType());
      assertEquals(0, hashMap0.size());
      assertEquals(true, hashMap0.isEmpty());
      assertEquals("{}", hashMap0.toString());
      assertNull(jSType0);
      
      // Undeclared exception!
      try {
        JSType jSType1 = disambiguateProperties0.getTypeWithProperty(string0, jSType0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      String string0 = "\"=Bc";
      MockPrintStream mockPrintStream0 = new MockPrintStream(string0);
      assertNotNull(mockPrintStream0);
      
      Compiler compiler0 = new Compiler((PrintStream) mockPrintStream0);
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertNotNull(compiler0);
      
      TightenTypes tightenTypes0 = new TightenTypes(compiler0);
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertNotNull(tightenTypes0);
      
      DisambiguateProperties<ConcreteType> disambiguateProperties0 = DisambiguateProperties.forConcreteTypeSystem(compiler0, tightenTypes0);
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertNotNull(disambiguateProperties0);
      
      Node node0 = compiler0.parseSyntheticCode(string0, string0);
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isVarArgs());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(125, node0.getType());
      assertEquals(false, node0.hasOneChild());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(1, compiler0.getErrorCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(true, compiler0.hasErrors());
      assertNotNull(node0);
      
      disambiguateProperties0.process(node0, node0);
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isVarArgs());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(125, node0.getType());
      assertEquals(false, node0.hasOneChild());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(1, compiler0.getErrorCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(true, compiler0.hasErrors());
  }
}
