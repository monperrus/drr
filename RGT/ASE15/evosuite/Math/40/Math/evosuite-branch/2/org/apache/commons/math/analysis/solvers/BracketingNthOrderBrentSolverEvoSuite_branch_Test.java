/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 17:53:52 GMT 2014
 */

package org.apache.commons.math.analysis.solvers;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.analysis.UnivariateFunction;
import org.apache.commons.math.analysis.function.Abs;
import org.apache.commons.math.analysis.function.Log10;
import org.apache.commons.math.analysis.function.Sinc;
import org.apache.commons.math.analysis.function.Sinh;
import org.apache.commons.math.analysis.function.Tanh;
import org.apache.commons.math.analysis.solvers.AllowedSolution;
import org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver;
import org.apache.commons.math.exception.NoBracketingException;
import org.apache.commons.math.exception.NumberIsTooLargeException;
import org.apache.commons.math.exception.NumberIsTooSmallException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class BracketingNthOrderBrentSolverEvoSuite_branch_Test   {

  //@Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      assertNotNull(bracketingNthOrderBrentSolver0);
      assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
      assertEquals(1.0E-6, bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0, bracketingNthOrderBrentSolver0.getMaxEvaluations());
      assertEquals(1.0E-14, bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
      assertEquals(0, bracketingNthOrderBrentSolver0.getEvaluations());
      
      int int0 = 2214;
      Sinh sinh0 = new Sinh();
      assertNotNull(sinh0);
      
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = (-1581.91);
      double double1 = bracketingNthOrderBrentSolver0.solve(int0, (UnivariateFunction) sinh0, double0, (double) int0, allowedSolution0);
      assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals(1.0E-6, bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(18, bracketingNthOrderBrentSolver0.getEvaluations());
      assertEquals(1.0E-14, bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(2214, bracketingNthOrderBrentSolver0.getMaxEvaluations());
      assertEquals(316.04499999999985, bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
      assertEquals((-1581.91), bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      assertEquals(2214.0, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
      assertEquals(0.0, double1, 0.01D);
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double double0 = (-1581.383376);
      double double1 = 0.0;
      double double2 = 169.3967140645423;
      int int0 = 826;
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(double0, double1, double2, int0);
      assertNotNull(bracketingNthOrderBrentSolver0);
      assertEquals(169.3967140645423, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0, bracketingNthOrderBrentSolver0.getEvaluations());
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      assertEquals(826, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
      assertEquals((-1581.383376), bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0, bracketingNthOrderBrentSolver0.getMaxEvaluations());
      assertFalse(double0 == double1);
      assertFalse(double0 == double2);
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      
      boolean boolean0 = false;
      Sinc sinc0 = new Sinc(boolean0);
      assertNotNull(sinc0);
      
      UnivariateFunction univariateFunction0 = sinc0.derivative();
      assertNotNull(univariateFunction0);
      
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double3 = bracketingNthOrderBrentSolver0.solve(int0, univariateFunction0, double0, double1, allowedSolution0);
      assertEquals(169.3967140645423, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(2, bracketingNthOrderBrentSolver0.getEvaluations());
      assertEquals((-1581.383376), bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      assertEquals((-790.691688), bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(826, bracketingNthOrderBrentSolver0.getMaxEvaluations());
      assertEquals(826, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
      assertEquals((-1581.383376), bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals((-1581.383376), double3, 0.01D);
      assertFalse(double0 == double1);
      assertFalse(double0 == double2);
      assertTrue(double0 == double3);
      assertFalse(double3 == double2);
      assertTrue(double3 == double0);
      assertFalse(double3 == double1);
      assertFalse(double1 == double3);
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
      assertFalse(double2 == double0);
      assertFalse(double2 == double3);
      assertFalse(double2 == double1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double double0 = (-1581.383376);
      double double1 = 0.0;
      double double2 = 169.3967140645423;
      int int0 = 826;
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(double0, double1, double2, int0);
      assertNotNull(bracketingNthOrderBrentSolver0);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
      assertEquals(826, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals(169.3967140645423, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0, bracketingNthOrderBrentSolver0.getEvaluations());
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      assertEquals((-1581.383376), bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0, bracketingNthOrderBrentSolver0.getMaxEvaluations());
      assertFalse(double0 == double1);
      assertFalse(double0 == double2);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
      
      boolean boolean0 = false;
      Sinc sinc0 = new Sinc(boolean0);
      assertNotNull(sinc0);
      
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double3 = bracketingNthOrderBrentSolver0.solve(int0, (UnivariateFunction) sinc0, double1, (double) int0, allowedSolution0);
      assertEquals(826.0, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
      assertEquals(2, bracketingNthOrderBrentSolver0.getEvaluations());
      assertEquals(826, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals(826, bracketingNthOrderBrentSolver0.getMaxEvaluations());
      assertEquals(413.0, bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
      assertEquals(169.3967140645423, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      assertEquals((-1581.383376), bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(413.0, double3, 0.01D);
      assertFalse(double0 == double1);
      assertFalse(double0 == double3);
      assertFalse(double0 == double2);
      assertFalse(double2 == double3);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertFalse(double3 == double2);
      assertFalse(double3 == double0);
      assertFalse(double3 == double1);
      assertFalse(double1 == double3);
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
  }

  //@Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      assertNotNull(bracketingNthOrderBrentSolver0);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
      assertEquals(1.0E-15, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0, bracketingNthOrderBrentSolver0.getEvaluations());
      assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals(0, bracketingNthOrderBrentSolver0.getMaxEvaluations());
      assertEquals(1.0E-6, bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
      
      int int0 = 2179;
      Sinh sinh0 = new Sinh();
      assertNotNull(sinh0);
      
      double double0 = (-1581.987059);
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double1 = bracketingNthOrderBrentSolver0.solve(int0, (UnivariateFunction) sinh0, double0, (double) int0, allowedSolution0);
      assertEquals(2179.0, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
      assertEquals(24, bracketingNthOrderBrentSolver0.getEvaluations());
      assertEquals(1.0E-15, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals((-1581.987059), bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      assertEquals(1.0E-6, bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(2179, bracketingNthOrderBrentSolver0.getMaxEvaluations());
      assertEquals(298.5064705, bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
      assertEquals(1.0E-14, bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(3.648821067514518E-8, double1, 0.01D);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
  }

  //@Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      assertNotNull(bracketingNthOrderBrentSolver0);
      assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals(1.0E-14, bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0, bracketingNthOrderBrentSolver0.getMaxEvaluations());
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
      assertEquals(1.0E-6, bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0, bracketingNthOrderBrentSolver0.getEvaluations());
      assertEquals(1.0E-15, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      
      double double0 = (-3412.271703224103);
      int int0 = 2214;
      Sinh sinh0 = new Sinh();
      assertNotNull(sinh0);
      
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double1 = bracketingNthOrderBrentSolver0.solve(int0, (UnivariateFunction) sinh0, double0, (double) int0, allowedSolution0);
      assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals(1.0E-14, bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(2214.0, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
      assertEquals(1.0E-6, bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(2214, bracketingNthOrderBrentSolver0.getMaxEvaluations());
      assertEquals(1.0E-15, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals((-3412.271703224103), bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      assertEquals((-599.1358516120513), bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
      assertEquals(19, bracketingNthOrderBrentSolver0.getEvaluations());
      assertEquals(6.3884755263643456E-9, double1, 0.01D);
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
  }

  //@Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      assertNotNull(bracketingNthOrderBrentSolver0);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
      assertEquals(1.0E-15, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-14, bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0, bracketingNthOrderBrentSolver0.getMaxEvaluations());
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
      assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals(0, bracketingNthOrderBrentSolver0.getEvaluations());
      assertEquals(1.0E-6, bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      
      int int0 = 2201;
      Sinh sinh0 = new Sinh();
      assertNotNull(sinh0);
      
      double double0 = (-1581.553599961862);
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double1 = bracketingNthOrderBrentSolver0.solve(int0, (UnivariateFunction) sinh0, double0, (double) int0, allowedSolution0);
      assertEquals((-1581.553599961862), bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      assertEquals(309.72320001906905, bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
      assertEquals(1.0E-15, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-14, bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals(2201, bracketingNthOrderBrentSolver0.getMaxEvaluations());
      assertEquals(2201.0, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
      assertEquals(22, bracketingNthOrderBrentSolver0.getEvaluations());
      assertEquals(1.0E-6, bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals((-1.3877787807814457E-17), double1, 0.01D);
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double double0 = (-1581.383376);
      double double1 = 169.3967140645423;
      int int0 = 826;
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(double0, double0, double1, int0);
      assertNotNull(bracketingNthOrderBrentSolver0);
      assertEquals(0, bracketingNthOrderBrentSolver0.getMaxEvaluations());
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
      assertEquals(826, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
      assertEquals((-1581.383376), bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(169.3967140645423, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0, bracketingNthOrderBrentSolver0.getEvaluations());
      assertEquals((-1581.383376), bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      
      boolean boolean0 = false;
      Sinc sinc0 = new Sinc(boolean0);
      assertNotNull(sinc0);
      
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double2 = bracketingNthOrderBrentSolver0.solve(int0, (UnivariateFunction) sinc0, double0, (double) int0, allowedSolution0);
      assertEquals(826.0, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
      assertEquals((-377.6916880000001), bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
      assertEquals(826, bracketingNthOrderBrentSolver0.getMaxEvaluations());
      assertEquals(826, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals((-1581.383376), bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(169.3967140645423, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals((-1581.383376), bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      assertEquals(2, bracketingNthOrderBrentSolver0.getEvaluations());
      assertEquals((-1581.383376), bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals((-1581.383376), double2, 0.01D);
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
      assertTrue(double0 == double2);
      assertFalse(double0 == double1);
      assertTrue(double2 == double0);
      assertFalse(double2 == double1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double double0 = 647.87;
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      assertNotNull(bracketingNthOrderBrentSolver0);
      assertEquals(1.0E-15, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      assertEquals(0, bracketingNthOrderBrentSolver0.getMaxEvaluations());
      assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals(1.0E-6, bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
      assertEquals(1.0E-14, bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0, bracketingNthOrderBrentSolver0.getEvaluations());
      
      int int0 = 621;
      Tanh tanh0 = new Tanh();
      assertNotNull(tanh0);
      
      int int1 = (-730);
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double1 = bracketingNthOrderBrentSolver0.solve(int0, (UnivariateFunction) tanh0, (double) int1, double0, allowedSolution0);
      assertEquals(1.0E-15, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(621, bracketingNthOrderBrentSolver0.getMaxEvaluations());
      assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals(1.0E-6, bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(17, bracketingNthOrderBrentSolver0.getEvaluations());
      assertEquals((-730.0), bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      assertEquals(1.0E-14, bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(647.87, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
      assertEquals((-41.065000000000055), bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
      assertEquals(2.005023702622566E-9, double1, 0.01D);
      assertFalse(int1 == int0);
      assertFalse(double1 == double0);
      assertFalse(int0 == int1);
      assertFalse(double0 == double1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double double0 = (-224.208618265);
      int int0 = 2582;
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(double0, int0);
      assertNotNull(bracketingNthOrderBrentSolver0);
      assertEquals(1.0E-15, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(2582, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      assertEquals(1.0E-14, bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0, bracketingNthOrderBrentSolver0.getEvaluations());
      assertEquals((-224.208618265), bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
      assertEquals(0, bracketingNthOrderBrentSolver0.getMaxEvaluations());
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
      
      Abs abs0 = new Abs();
      assertNotNull(abs0);
      
      double double1 = 0.0;
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double2 = bracketingNthOrderBrentSolver0.solve(int0, (UnivariateFunction) abs0, double0, double1, allowedSolution0);
      assertEquals((-224.208618265), bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      assertEquals(2582, bracketingNthOrderBrentSolver0.getMaxEvaluations());
      assertEquals(1.0E-15, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(3, bracketingNthOrderBrentSolver0.getEvaluations());
      assertEquals(2582, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals(1.0E-14, bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals((-224.208618265), bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
      assertEquals((-112.1043091325), bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
      assertEquals(0.0, double2, 0.01D);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertTrue(double1 == double2);
      assertFalse(double1 == double0);
      assertTrue(double2 == double1);
      assertFalse(double2 == double0);
      
      double double3 = bracketingNthOrderBrentSolver0.solve(int0, (UnivariateFunction) abs0, double2, (double) int0, allowedSolution0);
      assertEquals(2582, bracketingNthOrderBrentSolver0.getMaxEvaluations());
      assertEquals(1.0E-15, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(2582, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      assertEquals(2, bracketingNthOrderBrentSolver0.getEvaluations());
      assertEquals(1291.0, bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
      assertEquals(1.0E-14, bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals((-224.208618265), bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(2582.0, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
      assertEquals(0.0, double3, 0.01D);
      assertFalse(double0 == double2);
      assertFalse(double0 == double3);
      assertFalse(double0 == double1);
      assertTrue(double1 == double2);
      assertTrue(double1 == double3);
      assertFalse(double1 == double0);
      assertTrue(double2 == double3);
      assertTrue(double2 == double1);
      assertFalse(double2 == double0);
      assertTrue(double3 == double2);
      assertFalse(double3 == double0);
      assertTrue(double3 == double1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      assertNotNull(bracketingNthOrderBrentSolver0);
      assertEquals(1.0E-6, bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      assertEquals(0, bracketingNthOrderBrentSolver0.getMaxEvaluations());
      assertEquals(1.0E-14, bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
      assertEquals(0, bracketingNthOrderBrentSolver0.getEvaluations());
      assertEquals(1.0E-15, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
      
      int int0 = 621;
      Tanh tanh0 = new Tanh();
      assertNotNull(tanh0);
      
      UnivariateFunction univariateFunction0 = tanh0.derivative();
      assertNotNull(univariateFunction0);
      
      double double0 = bracketingNthOrderBrentSolver0.solve(int0, univariateFunction0, (double) int0);
      assertEquals(1, bracketingNthOrderBrentSolver0.getEvaluations());
      assertEquals(1.0E-6, bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(621, bracketingNthOrderBrentSolver0.getMaxEvaluations());
      assertEquals(621.0, bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
      assertEquals(1.0E-14, bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(Double.NaN, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
      assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals(1.0E-15, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(Double.NaN, bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      assertEquals(621.0, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double double0 = 2417.76857247;
      int int0 = (-8);
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = null;
      try {
        bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(double0, double0, double0, int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -8 is smaller than the minimum (2)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int int0 = 0;
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = null;
      try {
        bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((double) int0, (double) int0, int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is smaller than the minimum (2)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double double0 = 647.87;
      int int0 = 621;
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(double0, double0, int0);
      assertNotNull(bracketingNthOrderBrentSolver0);
      assertEquals(1.0E-15, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(647.87, bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
      assertEquals(0, bracketingNthOrderBrentSolver0.getEvaluations());
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      assertEquals(621, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals(647.87, bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0, bracketingNthOrderBrentSolver0.getMaxEvaluations());
  }

  //@Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      assertNotNull(bracketingNthOrderBrentSolver0);
      assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals(1.0E-15, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
      assertEquals(0, bracketingNthOrderBrentSolver0.getEvaluations());
      assertEquals(1.0E-14, bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0, bracketingNthOrderBrentSolver0.getMaxEvaluations());
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      assertEquals(1.0E-6, bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      
      int int0 = 2189;
      Sinh sinh0 = new Sinh();
      assertNotNull(sinh0);
      
      double double0 = (-1581.91);
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double1 = bracketingNthOrderBrentSolver0.solve(int0, (UnivariateFunction) sinh0, double0, (double) int0, allowedSolution0);
      assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals(2189.0, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
      assertEquals(1.0E-15, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals((-1581.91), bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      assertEquals(1.0E-14, bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(2189, bracketingNthOrderBrentSolver0.getMaxEvaluations());
      assertEquals(32, bracketingNthOrderBrentSolver0.getEvaluations());
      assertEquals(1.0E-6, bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(303.54499999999985, bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
      assertEquals((-4.440892098500626E-16), double1, 0.01D);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      
      int int1 = (-36);
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver1 = null;
      try {
        bracketingNthOrderBrentSolver1 = new BracketingNthOrderBrentSolver(double1, int1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -36 is smaller than the minimum (2)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double double0 = 647.87;
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      assertNotNull(bracketingNthOrderBrentSolver0);
      assertEquals(0, bracketingNthOrderBrentSolver0.getEvaluations());
      assertEquals(1.0E-15, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0, bracketingNthOrderBrentSolver0.getMaxEvaluations());
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
      assertEquals(1.0E-6, bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
      assertEquals(1.0E-14, bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
      
      int int0 = 621;
      Tanh tanh0 = new Tanh();
      assertNotNull(tanh0);
      
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      try {
        double double1 = bracketingNthOrderBrentSolver0.solve(int0, (UnivariateFunction) tanh0, (double) int0, double0, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [621, 647.87], values: [1, 1]
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double double0 = (-1171.425825430254);
      int int0 = 839;
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(double0, double0, double0, int0);
      assertNotNull(bracketingNthOrderBrentSolver0);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
      assertEquals((-1171.425825430254), bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(839, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
      assertEquals(0, bracketingNthOrderBrentSolver0.getEvaluations());
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      assertEquals((-1171.425825430254), bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals((-1171.425825430254), bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0, bracketingNthOrderBrentSolver0.getMaxEvaluations());
      
      Log10 log10_0 = new Log10();
      assertNotNull(log10_0);
      
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try {
        double double1 = bracketingNthOrderBrentSolver0.solve(int0, (UnivariateFunction) log10_0, double0, double0, double0, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [-1,171.426, -1,171.426]
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      assertNotNull(bracketingNthOrderBrentSolver0);
      assertEquals(1.0E-15, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-14, bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0, bracketingNthOrderBrentSolver0.getMaxEvaluations());
      assertEquals(0, bracketingNthOrderBrentSolver0.getEvaluations());
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      assertEquals(1.0E-6, bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
      assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
      
      int int0 = bracketingNthOrderBrentSolver0.getMaximalOrder();
      assertEquals(1.0E-15, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-14, bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0, bracketingNthOrderBrentSolver0.getMaxEvaluations());
      assertEquals(0, bracketingNthOrderBrentSolver0.getEvaluations());
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      assertEquals(1.0E-6, bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
      assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
      assertEquals(5, int0);
  }
}
