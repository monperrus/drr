/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 18:35:22 GMT 2014
 */

package org.apache.commons.math.analysis.solvers;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.analysis.UnivariateFunction;
import org.apache.commons.math.analysis.function.Cbrt;
import org.apache.commons.math.analysis.function.Cosh;
import org.apache.commons.math.analysis.function.Log10;
import org.apache.commons.math.analysis.function.Rint;
import org.apache.commons.math.analysis.function.Sinc;
import org.apache.commons.math.analysis.function.Sinh;
import org.apache.commons.math.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math.analysis.solvers.AllowedSolution;
import org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver;
import org.apache.commons.math.exception.NoBracketingException;
import org.apache.commons.math.exception.NumberIsTooSmallException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class BracketingNthOrderBrentSolverEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int int0 = 714;
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((double) int0, int0);
      assertNotNull(bracketingNthOrderBrentSolver0);
      assertEquals(1.0E-15, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
      assertEquals(714.0, bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0, bracketingNthOrderBrentSolver0.getMaxEvaluations());
      assertEquals(714, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      assertEquals(1.0E-14, bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0, bracketingNthOrderBrentSolver0.getEvaluations());
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
      
      Rint rint0 = new Rint();
      assertNotNull(rint0);
      
      double double0 = (-1.0);
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double1 = bracketingNthOrderBrentSolver0.solve(int0, (UnivariateFunction) rint0, double0, (double) int0, allowedSolution0);
      assertEquals(356.5, double1, 0.01D);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      assertEquals((-1.0), bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      assertEquals(1.0E-15, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(2, bracketingNthOrderBrentSolver0.getEvaluations());
      assertEquals(714.0, bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(714, bracketingNthOrderBrentSolver0.getMaxEvaluations());
      assertEquals(714, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals(1.0E-14, bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(356.5, bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
      assertEquals(714.0, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int int0 = 787;
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((double) int0, int0);
      assertNotNull(bracketingNthOrderBrentSolver0);
      assertEquals(1.0E-15, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
      assertEquals(0, bracketingNthOrderBrentSolver0.getMaxEvaluations());
      assertEquals(0, bracketingNthOrderBrentSolver0.getEvaluations());
      assertEquals(787, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals(787.0, bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
      assertEquals(1.0E-14, bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      
      Rint rint0 = new Rint();
      assertNotNull(rint0);
      
      double double0 = (-1.0);
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double1 = bracketingNthOrderBrentSolver0.solve(int0, (UnivariateFunction) rint0, double0, (double) int0, allowedSolution0);
      assertEquals((-1.0), double1, 0.01D);
      assertTrue(double0 == double1);
      assertTrue(double1 == double0);
      assertEquals(787.0, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
      assertEquals(1.0E-15, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(787, bracketingNthOrderBrentSolver0.getMaxEvaluations());
      assertEquals(393.0, bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
      assertEquals(787, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals(2, bracketingNthOrderBrentSolver0.getEvaluations());
      assertEquals((-1.0), bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      assertEquals(787.0, bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
  }

  //@Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int int0 = 2815;
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      assertNotNull(bracketingNthOrderBrentSolver0);
      assertEquals(1.0E-15, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      assertEquals(1.0E-6, bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals(0, bracketingNthOrderBrentSolver0.getEvaluations());
      assertEquals(0, bracketingNthOrderBrentSolver0.getMaxEvaluations());
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
      assertEquals(1.0E-14, bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
      
      Sinc sinc0 = new Sinc();
      assertNotNull(sinc0);
      
      double double0 = 3522.418002305981;
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double1 = bracketingNthOrderBrentSolver0.solve(int0, (UnivariateFunction) sinc0, (double) int0, double0, allowedSolution0);
      assertEquals(3245.2652106943483, double1, 0.01D);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      assertEquals(1.0E-15, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(2815, bracketingNthOrderBrentSolver0.getMaxEvaluations());
      assertEquals(2815.0, bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals(20, bracketingNthOrderBrentSolver0.getEvaluations());
      assertEquals(3522.418002305981, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
      assertEquals(3168.709001152991, bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
      assertEquals(1.0E-14, bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double double0 = Double.NaN;
      int int0 = 369;
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(double0, double0, int0);
      //  // Unstable assertion: assertNotNull(bracketingNthOrderBrentSolver0);
      //  // Unstable assertion: assertEquals(0.0, bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
      //  // Unstable assertion: assertEquals(0.0, bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      //  // Unstable assertion: assertEquals(0, bracketingNthOrderBrentSolver0.getMaxEvaluations());
      //  // Unstable assertion: assertEquals(1.0E-15, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
      //  // Unstable assertion: assertEquals(0.0, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
      //  // Unstable assertion: assertEquals(Double.NaN, bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      //  // Unstable assertion: assertEquals(369, bracketingNthOrderBrentSolver0.getMaximalOrder());
      //  // Unstable assertion: assertEquals(0, bracketingNthOrderBrentSolver0.getEvaluations());
      //  // Unstable assertion: assertEquals(Double.NaN, bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
      
      Sinc sinc0 = new Sinc();
      //  // Unstable assertion: assertNotNull(sinc0);
      
      double double1 = 26.13;
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double2 = bracketingNthOrderBrentSolver0.solve(int0, (UnivariateFunction) sinc0, double1, (double) int0, allowedSolution0);
      //  // Unstable assertion: assertEquals(369.0, double2, 0.01D);
      //  // Unstable assertion: assertFalse(double1 == double2);
      //  // Unstable assertion: assertFalse(double1 == double0);
      //  // Unstable assertion: assertFalse(double0 == double1);
      //  // Unstable assertion: assertFalse(double0 == double2);
      //  // Unstable assertion: assertFalse(double2 == double0);
      //  // Unstable assertion: assertFalse(double2 == double1);
      //  // Unstable assertion: assertEquals(369, bracketingNthOrderBrentSolver0.getMaxEvaluations());
      //  // Unstable assertion: assertEquals(3, bracketingNthOrderBrentSolver0.getEvaluations());
      //  // Unstable assertion: assertEquals(1.0E-15, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
      //  // Unstable assertion: assertEquals(Double.NaN, bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      //  // Unstable assertion: assertEquals(369, bracketingNthOrderBrentSolver0.getMaximalOrder());
      //  // Unstable assertion: assertEquals(26.13, bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      //  // Unstable assertion: assertEquals(Double.NaN, bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
      //  // Unstable assertion: assertEquals(369.0, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
      //  // Unstable assertion: assertEquals(197.565, bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int int0 = 836;
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((double) int0, int0);
      assertNotNull(bracketingNthOrderBrentSolver0);
      assertEquals(1.0E-15, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      assertEquals(836.0, bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0, bracketingNthOrderBrentSolver0.getEvaluations());
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
      assertEquals(1.0E-14, bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(836, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals(0, bracketingNthOrderBrentSolver0.getMaxEvaluations());
      
      Rint rint0 = new Rint();
      assertNotNull(rint0);
      
      double double0 = (-8.9346);
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double1 = bracketingNthOrderBrentSolver0.solve(int0, (UnivariateFunction) rint0, double0, (double) int0, allowedSolution0);
      assertEquals((-8.9346), double1, 0.01D);
      assertTrue(double0 == double1);
      assertTrue(double1 == double0);
      assertEquals(1.0E-15, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(836.0, bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(2, bracketingNthOrderBrentSolver0.getEvaluations());
      assertEquals(836, bracketingNthOrderBrentSolver0.getMaxEvaluations());
      assertEquals(836.0, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
      assertEquals(1.0E-14, bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals((-8.9346), bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      assertEquals(836, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals(413.53270000000003, bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
  }

  //@Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      assertNotNull(bracketingNthOrderBrentSolver0);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals(0, bracketingNthOrderBrentSolver0.getEvaluations());
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
      assertEquals(1.0E-14, bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
      assertEquals(0, bracketingNthOrderBrentSolver0.getMaxEvaluations());
      
      int int0 = 1491;
      Log10 log10_0 = new Log10();
      assertNotNull(log10_0);
      
      double double0 = 0.4246321117464;
      double double1 = 283.27216120548485;
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double2 = bracketingNthOrderBrentSolver0.solve(int0, (UnivariateFunction) log10_0, double0, (double) int0, double1, allowedSolution0);
      assertEquals(1.0000000000000044, double2, 0.01D);
      assertFalse(double0 == double1);
      assertFalse(double0 == double2);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
      assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals(1491.0, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
      assertEquals(1.0E-14, bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1491, bracketingNthOrderBrentSolver0.getMaxEvaluations());
      assertEquals(0.4246321117464, bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      assertEquals(1.0E-6, bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(11, bracketingNthOrderBrentSolver0.getEvaluations());
      assertEquals(1.0E-15, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(283.27216120548485, bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int int0 = 112;
      double double0 = (-916.8542460986498);
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(double0, int0);
      assertNotNull(bracketingNthOrderBrentSolver0);
      assertEquals(0, bracketingNthOrderBrentSolver0.getEvaluations());
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
      assertEquals(0, bracketingNthOrderBrentSolver0.getMaxEvaluations());
      assertEquals(1.0E-14, bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals((-916.8542460986498), bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(112, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals(1.0E-15, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      
      Sinc sinc0 = new Sinc();
      assertNotNull(sinc0);
      
      double double1 = (-7.675790582869644E157);
      double double2 = bracketingNthOrderBrentSolver0.solve(int0, (UnivariateFunction) sinc0, double1, (double) int0, double0);
      assertEquals((-7.675790582869644E157), double2, 0.01D);
      assertTrue(double2 == double1);
      assertFalse(double2 == double0);
      assertFalse(double0 == double1);
      assertFalse(double0 == double2);
      assertTrue(double1 == double2);
      assertFalse(double1 == double0);
      assertEquals((-916.8542460986498), bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
      assertEquals(1.0E-14, bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals((-916.8542460986498), bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(112, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals((-7.675790582869644E157), bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      assertEquals(3, bracketingNthOrderBrentSolver0.getEvaluations());
      assertEquals(112, bracketingNthOrderBrentSolver0.getMaxEvaluations());
      assertEquals(112.0, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
      assertEquals(1.0E-15, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
  }

  //@Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      assertNotNull(bracketingNthOrderBrentSolver0);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      assertEquals(0, bracketingNthOrderBrentSolver0.getEvaluations());
      assertEquals(1.0E-15, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
      assertEquals(0, bracketingNthOrderBrentSolver0.getMaxEvaluations());
      assertEquals(1.0E-14, bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals(1.0E-6, bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
      
      double double0 = 18.86935404156631;
      int int0 = 1297;
      Cosh cosh0 = new Cosh();
      assertNotNull(cosh0);
      
      Sinh sinh0 = (Sinh)cosh0.derivative();
      assertNotNull(sinh0);
      
      double double1 = (-1912.0221);
      double double2 = bracketingNthOrderBrentSolver0.solve(int0, (UnivariateFunction) sinh0, double1, double0);
      assertEquals(2.7755575615628914E-17, double2, 0.01D);
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
      assertFalse(double2 == double1);
      assertFalse(double2 == double0);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertEquals(1.0E-15, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1297, bracketingNthOrderBrentSolver0.getMaxEvaluations());
      assertEquals(1.0E-14, bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals(21, bracketingNthOrderBrentSolver0.getEvaluations());
      assertEquals((-1912.0221), bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      assertEquals((-946.5763729792168), bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
      assertEquals(1.0E-6, bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(18.86935404156631, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int int0 = 714;
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((double) int0, int0);
      assertNotNull(bracketingNthOrderBrentSolver0);
      assertEquals(1.0E-14, bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-15, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
      assertEquals(0, bracketingNthOrderBrentSolver0.getMaxEvaluations());
      assertEquals(714, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
      assertEquals(714.0, bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0, bracketingNthOrderBrentSolver0.getEvaluations());
      
      double double0 = (-1.0);
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      Cbrt cbrt0 = new Cbrt();
      assertNotNull(cbrt0);
      
      double double1 = 0.0;
      double double2 = bracketingNthOrderBrentSolver0.solve(int0, (UnivariateFunction) cbrt0, double0, double1, allowedSolution0);
      assertEquals(0.0, double2, 0.01D);
      assertTrue(double1 == double2);
      assertFalse(double1 == double0);
      assertTrue(double2 == double1);
      assertFalse(double2 == double0);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertEquals(1.0E-14, bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-15, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
      assertEquals(3, bracketingNthOrderBrentSolver0.getEvaluations());
      assertEquals((-1.0), bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      assertEquals(714, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals((-0.5), bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
      assertEquals(714.0, bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(714, bracketingNthOrderBrentSolver0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      assertNotNull(bracketingNthOrderBrentSolver0);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
      assertEquals(1.0E-15, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      assertEquals(0, bracketingNthOrderBrentSolver0.getEvaluations());
      assertEquals(1.0E-14, bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals(0, bracketingNthOrderBrentSolver0.getMaxEvaluations());
      assertEquals(1.0E-6, bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      
      double double0 = bracketingNthOrderBrentSolver0.getStartValue();
      assertEquals(0.0, double0, 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
      assertEquals(1.0E-15, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      assertEquals(0, bracketingNthOrderBrentSolver0.getEvaluations());
      assertEquals(1.0E-14, bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals(0, bracketingNthOrderBrentSolver0.getMaxEvaluations());
      assertEquals(1.0E-6, bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      
      int int0 = bracketingNthOrderBrentSolver0.getMaximalOrder();
      assertEquals(5, int0);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
      assertEquals(1.0E-15, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      assertEquals(0, bracketingNthOrderBrentSolver0.getEvaluations());
      assertEquals(1.0E-14, bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals(0, bracketingNthOrderBrentSolver0.getMaxEvaluations());
      assertEquals(1.0E-6, bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      
      int int1 = 2;
      assertFalse(int1 == int0);
      
      Log10 log10_0 = new Log10();
      assertNotNull(log10_0);
      
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double1 = bracketingNthOrderBrentSolver0.solve(int0, (UnivariateFunction) log10_0, double0, (double) int0, (double) int1, allowedSolution0);
      assertEquals(1.0, double1, 0.01D);
      assertFalse(int0 == int1);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      assertFalse(int1 == int0);
      assertEquals(3, bracketingNthOrderBrentSolver0.getEvaluations());
      assertEquals(5.0, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
      assertEquals(1.0E-15, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      assertEquals(2.0, bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
      assertEquals(5, bracketingNthOrderBrentSolver0.getMaxEvaluations());
      assertEquals(1.0E-14, bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals(1.0E-6, bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int int0 = 787;
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((double) int0, int0);
      assertNotNull(bracketingNthOrderBrentSolver0);
      assertEquals(1.0E-15, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0, bracketingNthOrderBrentSolver0.getMaxEvaluations());
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      assertEquals(787.0, bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0, bracketingNthOrderBrentSolver0.getEvaluations());
      assertEquals(1.0E-14, bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(787, bracketingNthOrderBrentSolver0.getMaximalOrder());
      
      double double0 = bracketingNthOrderBrentSolver0.getRelativeAccuracy();
      assertEquals(1.0E-14, double0, 0.01D);
      assertEquals(1.0E-15, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0, bracketingNthOrderBrentSolver0.getMaxEvaluations());
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      assertEquals(787.0, bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0, bracketingNthOrderBrentSolver0.getEvaluations());
      assertEquals(1.0E-14, bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(787, bracketingNthOrderBrentSolver0.getMaximalOrder());
      
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      Cbrt cbrt0 = new Cbrt();
      assertNotNull(cbrt0);
      
      double double1 = 0.0;
      assertFalse(double1 == double0);
      
      double double2 = bracketingNthOrderBrentSolver0.solve(int0, (UnivariateFunction) cbrt0, double1, double0, allowedSolution0);
      assertEquals(0.0, double2, 0.01D);
      assertTrue(double1 == double2);
      assertFalse(double1 == double0);
      assertFalse(double2 == double0);
      assertTrue(double2 == double1);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertEquals(1.0E-15, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(5.0E-15, bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      assertEquals(2, bracketingNthOrderBrentSolver0.getEvaluations());
      assertEquals(787, bracketingNthOrderBrentSolver0.getMaxEvaluations());
      assertEquals(787.0, bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(787, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals(1.0E-14, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      assertNotNull(bracketingNthOrderBrentSolver0);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
      assertEquals(0, bracketingNthOrderBrentSolver0.getMaxEvaluations());
      assertEquals(0, bracketingNthOrderBrentSolver0.getEvaluations());
      assertEquals(1.0E-15, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
      assertEquals(1.0E-14, bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      
      int int0 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
      assertEquals(0, int0);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
      assertEquals(0, bracketingNthOrderBrentSolver0.getMaxEvaluations());
      assertEquals(0, bracketingNthOrderBrentSolver0.getEvaluations());
      assertEquals(1.0E-15, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
      assertEquals(1.0E-14, bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      
      int int1 = 1235;
      assertFalse(int1 == int0);
      
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertNotNull(polynomialFunction0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, polynomialFunction0.degree());
      
      double double0 = bracketingNthOrderBrentSolver0.solve(int1, (UnivariateFunction) polynomialFunction0, (double) int0);
      assertEquals(0.0, double0, 0.01D);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
      assertEquals(Double.NaN, bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      assertEquals(1.0E-15, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals(Double.NaN, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
      assertEquals(1235, bracketingNthOrderBrentSolver0.getMaxEvaluations());
      assertEquals(1.0E-14, bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1, bracketingNthOrderBrentSolver0.getEvaluations());
      assertEquals(0, polynomialFunction0.degree());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double double0 = (-4025.24);
      int int0 = (-26);
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = null;
      try {
        bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(double0, double0, double0, int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -26 is smaller than the minimum (2)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double double0 = (-2672.1980916293983);
      int int0 = 13;
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(double0, double0, double0, int0);
      assertNotNull(bracketingNthOrderBrentSolver0);
      assertEquals(13, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
      assertEquals((-2672.1980916293983), bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals((-2672.1980916293983), bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0, bracketingNthOrderBrentSolver0.getMaxEvaluations());
      assertEquals(0, bracketingNthOrderBrentSolver0.getEvaluations());
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      assertEquals((-2672.1980916293983), bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      assertNotNull(bracketingNthOrderBrentSolver0);
      assertEquals(1.0E-14, bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals(0, bracketingNthOrderBrentSolver0.getMaxEvaluations());
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
      assertEquals(0, bracketingNthOrderBrentSolver0.getEvaluations());
      assertEquals(1.0E-15, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      
      double double0 = 18.86935404156631;
      int int0 = (-2057);
      int int1 = bracketingNthOrderBrentSolver0.getMaxEvaluations();
      assertEquals(0, int1);
      assertFalse(int1 == int0);
      assertEquals(1.0E-14, bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals(0, bracketingNthOrderBrentSolver0.getMaxEvaluations());
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
      assertEquals(0, bracketingNthOrderBrentSolver0.getEvaluations());
      assertEquals(1.0E-15, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver1 = null;
      try {
        bracketingNthOrderBrentSolver1 = new BracketingNthOrderBrentSolver(double0, (double) int1, int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -2,057 is smaller than the minimum (2)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int int0 = 369;
      int int1 = (-929);
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = null;
      try {
        bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((double) int0, int1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -929 is smaller than the minimum (2)
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double double0 = Double.NaN;
      int int0 = 369;
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(double0, double0, int0);
      assertNotNull(bracketingNthOrderBrentSolver0);
      assertEquals(1.0E-15, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      assertEquals(0, bracketingNthOrderBrentSolver0.getMaxEvaluations());
      assertEquals(369, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
      assertEquals(Double.NaN, bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0, bracketingNthOrderBrentSolver0.getEvaluations());
      assertEquals(Double.NaN, bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
      
      Sinc sinc0 = new Sinc();
      assertNotNull(sinc0);
      
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try {
        double double1 = bracketingNthOrderBrentSolver0.solve(int0, (UnivariateFunction) sinc0, double0, (double) int0, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [\uFFFD, 369], values: [\uFFFD, -0.003]
         //
      }
  }
}
