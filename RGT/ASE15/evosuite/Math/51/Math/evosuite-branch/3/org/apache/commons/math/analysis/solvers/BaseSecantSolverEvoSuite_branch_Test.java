/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 18:17:17 GMT 2014
 */

package org.apache.commons.math.analysis.solvers;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.function.Cos;
import org.apache.commons.math.analysis.function.HarmonicOscillator;
import org.apache.commons.math.analysis.function.Log10;
import org.apache.commons.math.analysis.function.Sin;
import org.apache.commons.math.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math.analysis.solvers.AllowedSolution;
import org.apache.commons.math.analysis.solvers.IllinoisSolver;
import org.apache.commons.math.analysis.solvers.PegasusSolver;
import org.apache.commons.math.analysis.solvers.RegulaFalsiSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class BaseSecantSolverEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double double0 = 0.6077518871122588;
      PegasusSolver pegasusSolver0 = new PegasusSolver(double0, double0);
      assertNotNull(pegasusSolver0);
      assertEquals(0.0, pegasusSolver0.getMin(), 0.01D);
      assertEquals(0.6077518871122588, pegasusSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0.6077518871122588, pegasusSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0, pegasusSolver0.getEvaluations());
      assertEquals(0.0, pegasusSolver0.getMax(), 0.01D);
      assertEquals(0, pegasusSolver0.getMaxEvaluations());
      assertEquals(0.0, pegasusSolver0.getStartValue(), 0.01D);
      assertEquals(1.0E-15, pegasusSolver0.getFunctionValueAccuracy(), 0.01D);
      
      int int0 = 100;
      double[] doubleArray0 = new double[22];
      doubleArray0[0] = (double) int0;
      doubleArray0[3] = double0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertArrayEquals(new double[] {100.0, 0.0, 0.0, 0.6077518871122588, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      assertEquals(3, polynomialFunction0.degree());
      
      double double1 = (-605.41839612);
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double2 = pegasusSolver0.solve(int0, (UnivariateRealFunction) polynomialFunction0, double1, doubleArray0[3], allowedSolution0);
      assertEquals((-5.796516941587573), double2, 0.01D);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
      assertArrayEquals(new double[] {100.0, 0.0, 0.0, 0.6077518871122588, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(3, polynomialFunction0.degree());
      assertEquals(100, pegasusSolver0.getMaxEvaluations());
      assertEquals(0.6077518871122588, pegasusSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0.6077518871122588, pegasusSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(16, pegasusSolver0.getEvaluations());
      assertEquals((-605.41839612), pegasusSolver0.getMin(), 0.01D);
      assertEquals((-302.40532211644387), pegasusSolver0.getStartValue(), 0.01D);
      assertEquals(1.0E-15, pegasusSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0.6077518871122588, pegasusSolver0.getMax(), 0.01D);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double double0 = -0.0;
      int int0 = 2147483611;
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      assertNotNull(regulaFalsiSolver0);
      assertEquals(0.0, regulaFalsiSolver0.getStartValue(), 0.01D);
      assertEquals(1.0E-6, regulaFalsiSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, regulaFalsiSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0, regulaFalsiSolver0.getEvaluations());
      assertEquals(1.0E-14, regulaFalsiSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0.0, regulaFalsiSolver0.getMin(), 0.01D);
      assertEquals(0.0, regulaFalsiSolver0.getMax(), 0.01D);
      assertEquals(0, regulaFalsiSolver0.getMaxEvaluations());
      
      double double1 = (-1.0);
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator((double) int0, double1, double1);
      assertFalse(double1 == double0);
      assertNotNull(harmonicOscillator0);
      
      double double2 = (-1381.4);
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double3 = regulaFalsiSolver0.solve(int0, (UnivariateRealFunction) harmonicOscillator0, double2, double0, double0, allowedSolution0);
      assertEquals((-850.8008127960376), double3, 0.01D);
      assertFalse(double2 == double3);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertFalse(double3 == double0);
      assertFalse(double3 == double1);
      assertFalse(double3 == double2);
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
      assertFalse(double1 == double3);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertFalse(double0 == double3);
      assertEquals(-0.0, regulaFalsiSolver0.getStartValue(), 0.01D);
      assertEquals(1.0E-6, regulaFalsiSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(2147483611, regulaFalsiSolver0.getMaxEvaluations());
      assertEquals(1.0E-15, regulaFalsiSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(11, regulaFalsiSolver0.getEvaluations());
      assertEquals(1.0E-14, regulaFalsiSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(-0.0, regulaFalsiSolver0.getMax(), 0.01D);
      assertEquals((-1381.4), regulaFalsiSolver0.getMin(), 0.01D);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double double0 = (-1.0);
      double double1 = 1066.2527529497054;
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(double1, double1, double0);
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
      assertNotNull(regulaFalsiSolver0);
      assertEquals(1066.2527529497054, regulaFalsiSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0, regulaFalsiSolver0.getMaxEvaluations());
      assertEquals(0.0, regulaFalsiSolver0.getStartValue(), 0.01D);
      assertEquals(0.0, regulaFalsiSolver0.getMax(), 0.01D);
      assertEquals((-1.0), regulaFalsiSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0.0, regulaFalsiSolver0.getMin(), 0.01D);
      assertEquals(1066.2527529497054, regulaFalsiSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0, regulaFalsiSolver0.getEvaluations());
      
      int int0 = 1769;
      Cos cos0 = new Cos();
      assertNotNull(cos0);
      
      double double2 = 1.5708;
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double3 = regulaFalsiSolver0.solve(int0, (UnivariateRealFunction) cos0, double0, double2, allowedSolution0);
      assertEquals(1.5707825227259267, double3, 0.01D);
      assertFalse(double0 == double3);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertFalse(double1 == double2);
      assertFalse(double1 == double3);
      assertFalse(double1 == double0);
      assertFalse(double3 == double1);
      assertFalse(double3 == double2);
      assertFalse(double3 == double0);
      assertFalse(double2 == double0);
      assertFalse(double2 == double3);
      assertFalse(double2 == double1);
      assertEquals(1066.2527529497054, regulaFalsiSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1769, regulaFalsiSolver0.getMaxEvaluations());
      assertEquals(0.2854000000000001, regulaFalsiSolver0.getStartValue(), 0.01D);
      assertEquals((-1.0), regulaFalsiSolver0.getMin(), 0.01D);
      assertEquals((-1.0), regulaFalsiSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(3, regulaFalsiSolver0.getEvaluations());
      assertEquals(1066.2527529497054, regulaFalsiSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.5708, regulaFalsiSolver0.getMax(), 0.01D);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double double0 = (-3359.382201369143);
      double double1 = 0.38549580435471015;
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(double0, double1, double0);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      assertNotNull(regulaFalsiSolver0);
      assertEquals(0, regulaFalsiSolver0.getEvaluations());
      assertEquals(0.0, regulaFalsiSolver0.getMin(), 0.01D);
      assertEquals((-3359.382201369143), regulaFalsiSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0.38549580435471015, regulaFalsiSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0, regulaFalsiSolver0.getMaxEvaluations());
      assertEquals(0.0, regulaFalsiSolver0.getStartValue(), 0.01D);
      assertEquals((-3359.382201369143), regulaFalsiSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0.0, regulaFalsiSolver0.getMax(), 0.01D);
      
      int int0 = 14;
      Cos cos0 = new Cos();
      assertNotNull(cos0);
      
      double double2 = 1.5708;
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double3 = regulaFalsiSolver0.solve(int0, (UnivariateRealFunction) cos0, double1, double2, allowedSolution0);
      assertEquals(1.5708, double3, 0.01D);
      assertFalse(double1 == double3);
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
      assertFalse(double2 == double0);
      assertTrue(double2 == double3);
      assertFalse(double2 == double1);
      assertFalse(double0 == double2);
      assertFalse(double0 == double3);
      assertFalse(double0 == double1);
      assertFalse(double3 == double0);
      assertTrue(double3 == double2);
      assertFalse(double3 == double1);
      assertEquals(3, regulaFalsiSolver0.getEvaluations());
      assertEquals((-3359.382201369143), regulaFalsiSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0.38549580435471015, regulaFalsiSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0.9781479021773551, regulaFalsiSolver0.getStartValue(), 0.01D);
      assertEquals(1.5708, regulaFalsiSolver0.getMax(), 0.01D);
      assertEquals(0.38549580435471015, regulaFalsiSolver0.getMin(), 0.01D);
      assertEquals((-3359.382201369143), regulaFalsiSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(14, regulaFalsiSolver0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double double0 = (-2427.946617893706);
      double double1 = 0.0;
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      assertNotNull(pegasusSolver0);
      assertEquals(1.0E-6, pegasusSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0, pegasusSolver0.getEvaluations());
      assertEquals(0, pegasusSolver0.getMaxEvaluations());
      assertEquals(0.0, pegasusSolver0.getStartValue(), 0.01D);
      assertEquals(1.0E-15, pegasusSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0.0, pegasusSolver0.getMin(), 0.01D);
      assertEquals(0.0, pegasusSolver0.getMax(), 0.01D);
      assertEquals(1.0E-14, pegasusSolver0.getRelativeAccuracy(), 0.01D);
      
      int int0 = 767;
      Cos cos0 = new Cos();
      assertNotNull(cos0);
      
      double double2 = pegasusSolver0.solve(int0, (UnivariateRealFunction) cos0, double0, double1, (double) int0);
      assertEquals((-2288.650248140164), double2, 0.01D);
      assertFalse(double0 == double1);
      assertFalse(double0 == double2);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
      assertEquals(20, pegasusSolver0.getEvaluations());
      assertEquals(1.0E-6, pegasusSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(767, pegasusSolver0.getMaxEvaluations());
      assertEquals(767.0, pegasusSolver0.getStartValue(), 0.01D);
      assertEquals(1.0E-15, pegasusSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals((-2427.946617893706), pegasusSolver0.getMin(), 0.01D);
      assertEquals(0.0, pegasusSolver0.getMax(), 0.01D);
      assertEquals(1.0E-14, pegasusSolver0.getRelativeAccuracy(), 0.01D);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int int0 = 953;
      double[] doubleArray0 = new double[12];
      double double0 = 1.01;
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(doubleArray0[2], double0, (double) int0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(regulaFalsiSolver0);
      assertEquals(953.0, regulaFalsiSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0, regulaFalsiSolver0.getMaxEvaluations());
      assertEquals(0, regulaFalsiSolver0.getEvaluations());
      assertEquals(0.0, regulaFalsiSolver0.getStartValue(), 0.01D);
      assertEquals(0.0, regulaFalsiSolver0.getMin(), 0.01D);
      assertEquals(1.01, regulaFalsiSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0.0, regulaFalsiSolver0.getMax(), 0.01D);
      assertEquals(0.0, regulaFalsiSolver0.getRelativeAccuracy(), 0.01D);
      
      Cos cos0 = new Cos();
      assertNotNull(cos0);
      
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double1 = regulaFalsiSolver0.solve(int0, (UnivariateRealFunction) cos0, double0, (double) int0, allowedSolution0);
      assertEquals(482.35351229407485, double1, 0.01D);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(477.005, regulaFalsiSolver0.getStartValue(), 0.01D);
      assertEquals(953.0, regulaFalsiSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(4, regulaFalsiSolver0.getEvaluations());
      assertEquals(953, regulaFalsiSolver0.getMaxEvaluations());
      assertEquals(953.0, regulaFalsiSolver0.getMax(), 0.01D);
      assertEquals(1.01, regulaFalsiSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0.0, regulaFalsiSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.01, regulaFalsiSolver0.getMin(), 0.01D);
  }

  //@Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double double0 = (-2630.13644395809);
      double double1 = 1.01;
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(double0, double0, double1);
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
      assertNotNull(regulaFalsiSolver0);
      assertEquals(0, regulaFalsiSolver0.getEvaluations());
      assertEquals((-2630.13644395809), regulaFalsiSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0.0, regulaFalsiSolver0.getMin(), 0.01D);
      assertEquals((-2630.13644395809), regulaFalsiSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0, regulaFalsiSolver0.getMaxEvaluations());
      assertEquals(1.01, regulaFalsiSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0.0, regulaFalsiSolver0.getStartValue(), 0.01D);
      assertEquals(0.0, regulaFalsiSolver0.getMax(), 0.01D);
      
      int int0 = 14;
      Sin sin0 = new Sin();
      assertNotNull(sin0);
      
      double double2 = 0.0;
      double double3 = regulaFalsiSolver0.solve(int0, (UnivariateRealFunction) sin0, double0, double2);
      assertEquals(0.0, double3, 0.01D);
      assertFalse(double3 == double0);
      assertFalse(double3 == double1);
      assertTrue(double3 == double2);
      assertFalse(double2 == double1);
      assertTrue(double2 == double3);
      assertFalse(double2 == double0);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertFalse(double0 == double3);
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
      assertFalse(double1 == double3);
      assertEquals((-2630.13644395809), regulaFalsiSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals((-2630.13644395809), regulaFalsiSolver0.getMin(), 0.01D);
      assertEquals((-2630.13644395809), regulaFalsiSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals((-1315.068221979045), regulaFalsiSolver0.getStartValue(), 0.01D);
      assertEquals(1.01, regulaFalsiSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(14, regulaFalsiSolver0.getMaxEvaluations());
      assertEquals(2, regulaFalsiSolver0.getEvaluations());
      assertEquals(0.0, regulaFalsiSolver0.getMax(), 0.01D);
      
      Cos cos0 = new Cos();
      assertNotNull(cos0);
      
      double double4 = 1.5708;
      assertFalse(double4 == double3);
      
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double5 = regulaFalsiSolver0.solve(int0, (UnivariateRealFunction) cos0, double3, double4, allowedSolution0);
      assertEquals(1.5707963267949812, double5, 0.01D);
      assertFalse(double3 == double5);
      assertFalse(double3 == double0);
      assertFalse(double3 == double1);
      assertFalse(double3 == double4);
      assertTrue(double3 == double2);
      assertFalse(double2 == double1);
      assertTrue(double2 == double3);
      assertFalse(double2 == double0);
      assertFalse(double2 == double4);
      assertFalse(double2 == double5);
      assertFalse(double4 == double2);
      assertFalse(double4 == double3);
      assertFalse(double4 == double1);
      assertFalse(double4 == double0);
      assertFalse(double4 == double5);
      assertFalse(double5 == double3);
      assertFalse(double5 == double4);
      assertFalse(double5 == double2);
      assertFalse(double5 == double1);
      assertFalse(double5 == double0);
      assertFalse(double0 == double5);
      assertFalse(double0 == double4);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertFalse(double0 == double3);
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
      assertFalse(double1 == double3);
      assertFalse(double1 == double4);
      assertFalse(double1 == double5);
      assertEquals((-2630.13644395809), regulaFalsiSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0.0, regulaFalsiSolver0.getMin(), 0.01D);
      assertEquals((-2630.13644395809), regulaFalsiSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0.7854, regulaFalsiSolver0.getStartValue(), 0.01D);
      assertEquals(1.01, regulaFalsiSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(14, regulaFalsiSolver0.getMaxEvaluations());
      assertEquals(7, regulaFalsiSolver0.getEvaluations());
      assertEquals(1.5708, regulaFalsiSolver0.getMax(), 0.01D);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double double0 = 1068.897983;
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(double0, double0, double0);
      assertNotNull(regulaFalsiSolver0);
      assertEquals(0, regulaFalsiSolver0.getEvaluations());
      assertEquals(1068.897983, regulaFalsiSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1068.897983, regulaFalsiSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0.0, regulaFalsiSolver0.getMax(), 0.01D);
      assertEquals(0.0, regulaFalsiSolver0.getStartValue(), 0.01D);
      assertEquals(0.0, regulaFalsiSolver0.getMin(), 0.01D);
      assertEquals(1068.897983, regulaFalsiSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0, regulaFalsiSolver0.getMaxEvaluations());
      
      int int0 = 3;
      Cos cos0 = new Cos();
      assertNotNull(cos0);
      
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double1 = regulaFalsiSolver0.solve(int0, (UnivariateRealFunction) cos0, (double) int0, double0, allowedSolution0);
      assertEquals(1068.897983, double1, 0.01D);
      assertTrue(double0 == double1);
      assertTrue(double1 == double0);
      assertEquals(1068.897983, regulaFalsiSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(535.9489915, regulaFalsiSolver0.getStartValue(), 0.01D);
      assertEquals(1068.897983, regulaFalsiSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(3, regulaFalsiSolver0.getMaxEvaluations());
      assertEquals(3, regulaFalsiSolver0.getEvaluations());
      assertEquals(3.0, regulaFalsiSolver0.getMin(), 0.01D);
      assertEquals(1068.897983, regulaFalsiSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1068.897983, regulaFalsiSolver0.getMax(), 0.01D);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double double0 = 1068.897983;
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(double0, double0, double0);
      assertNotNull(regulaFalsiSolver0);
      assertEquals(1068.897983, regulaFalsiSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0, regulaFalsiSolver0.getEvaluations());
      assertEquals(0, regulaFalsiSolver0.getMaxEvaluations());
      assertEquals(0.0, regulaFalsiSolver0.getStartValue(), 0.01D);
      assertEquals(1068.897983, regulaFalsiSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1068.897983, regulaFalsiSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0.0, regulaFalsiSolver0.getMax(), 0.01D);
      assertEquals(0.0, regulaFalsiSolver0.getMin(), 0.01D);
      
      int int0 = 1780;
      Cos cos0 = new Cos();
      assertNotNull(cos0);
      
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double1 = regulaFalsiSolver0.solve(int0, (UnivariateRealFunction) cos0, double0, (double) int0, allowedSolution0);
      assertEquals(1068.897983, double1, 0.01D);
      assertTrue(double1 == double0);
      assertTrue(double0 == double1);
      assertEquals(1068.897983, regulaFalsiSolver0.getMin(), 0.01D);
      assertEquals(1068.897983, regulaFalsiSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(3, regulaFalsiSolver0.getEvaluations());
      assertEquals(1780, regulaFalsiSolver0.getMaxEvaluations());
      assertEquals(1780.0, regulaFalsiSolver0.getMax(), 0.01D);
      assertEquals(1068.897983, regulaFalsiSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1068.897983, regulaFalsiSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1424.4489915, regulaFalsiSolver0.getStartValue(), 0.01D);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int int0 = 953;
      double double0 = 1.01;
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((double) int0, double0, (double) int0);
      assertNotNull(regulaFalsiSolver0);
      assertEquals(0, regulaFalsiSolver0.getEvaluations());
      assertEquals(0.0, regulaFalsiSolver0.getMax(), 0.01D);
      assertEquals(953.0, regulaFalsiSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0.0, regulaFalsiSolver0.getStartValue(), 0.01D);
      assertEquals(0.0, regulaFalsiSolver0.getMin(), 0.01D);
      assertEquals(1.01, regulaFalsiSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0, regulaFalsiSolver0.getMaxEvaluations());
      assertEquals(953.0, regulaFalsiSolver0.getRelativeAccuracy(), 0.01D);
      
      Cos cos0 = new Cos();
      assertNotNull(cos0);
      
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double1 = regulaFalsiSolver0.solve(int0, (UnivariateRealFunction) cos0, double0, (double) int0, allowedSolution0);
      assertEquals(1.01, double1, 0.01D);
      assertTrue(double0 == double1);
      assertTrue(double1 == double0);
      assertEquals(477.005, regulaFalsiSolver0.getStartValue(), 0.01D);
      assertEquals(953.0, regulaFalsiSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(953.0, regulaFalsiSolver0.getMax(), 0.01D);
      assertEquals(953, regulaFalsiSolver0.getMaxEvaluations());
      assertEquals(1.01, regulaFalsiSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.01, regulaFalsiSolver0.getMin(), 0.01D);
      assertEquals(3, regulaFalsiSolver0.getEvaluations());
      assertEquals(953.0, regulaFalsiSolver0.getRelativeAccuracy(), 0.01D);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double double0 = 0.0;
      double double1 = 1568.8133669017645;
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(double0, double0, double1);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      assertNotNull(regulaFalsiSolver0);
      assertEquals(0.0, regulaFalsiSolver0.getMax(), 0.01D);
      assertEquals(0.0, regulaFalsiSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0, regulaFalsiSolver0.getEvaluations());
      assertEquals(1568.8133669017645, regulaFalsiSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0.0, regulaFalsiSolver0.getStartValue(), 0.01D);
      assertEquals(0, regulaFalsiSolver0.getMaxEvaluations());
      assertEquals(0.0, regulaFalsiSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0.0, regulaFalsiSolver0.getMin(), 0.01D);
      
      int int0 = 7;
      Cos cos0 = new Cos();
      assertNotNull(cos0);
      
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double2 = regulaFalsiSolver0.solve(int0, (UnivariateRealFunction) cos0, double0, double1, allowedSolution0);
      assertEquals(1120.10681496, double2, 0.01D);
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
      assertFalse(double0 == double1);
      assertFalse(double0 == double2);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertEquals(784.4066834508823, regulaFalsiSolver0.getStartValue(), 0.01D);
      assertEquals(7, regulaFalsiSolver0.getMaxEvaluations());
      assertEquals(0.0, regulaFalsiSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1568.8133669017645, regulaFalsiSolver0.getMax(), 0.01D);
      assertEquals(1568.8133669017645, regulaFalsiSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(3, regulaFalsiSolver0.getEvaluations());
      assertEquals(0.0, regulaFalsiSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0.0, regulaFalsiSolver0.getMin(), 0.01D);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double double0 = 0.6077518871122588;
      int int0 = 100;
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(double0, (double) int0, double0);
      assertNotNull(regulaFalsiSolver0);
      assertEquals(0.0, regulaFalsiSolver0.getMax(), 0.01D);
      assertEquals(0.0, regulaFalsiSolver0.getStartValue(), 0.01D);
      assertEquals(0, regulaFalsiSolver0.getEvaluations());
      assertEquals(100.0, regulaFalsiSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0.6077518871122588, regulaFalsiSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0.6077518871122588, regulaFalsiSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0, regulaFalsiSolver0.getMaxEvaluations());
      assertEquals(0.0, regulaFalsiSolver0.getMin(), 0.01D);
      
      Cos cos0 = new Cos();
      assertNotNull(cos0);
      
      double double1 = 1.5708;
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double2 = regulaFalsiSolver0.solve(int0, (UnivariateRealFunction) cos0, double0, double1, allowedSolution0);
      assertEquals(1.5707956909347074, double2, 0.01D);
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertEquals(1.5708, regulaFalsiSolver0.getMax(), 0.01D);
      assertEquals(0.6077518871122588, regulaFalsiSolver0.getMin(), 0.01D);
      assertEquals(100.0, regulaFalsiSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0.6077518871122588, regulaFalsiSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(3, regulaFalsiSolver0.getEvaluations());
      assertEquals(1.0892759435561294, regulaFalsiSolver0.getStartValue(), 0.01D);
      assertEquals(0.6077518871122588, regulaFalsiSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(100, regulaFalsiSolver0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double double0 = 1.5874010519682;
      int int0 = 2147483643;
      double double1 = 0.0;
      double double2 = (-1.0);
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator((double) int0, double2, double0);
      assertFalse(double0 == double1);
      assertFalse(double0 == double2);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertNotNull(harmonicOscillator0);
      
      PegasusSolver pegasusSolver0 = new PegasusSolver(double1, double1, double0);
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      assertFalse(double0 == double2);
      assertNotNull(pegasusSolver0);
      assertEquals(0.0, pegasusSolver0.getStartValue(), 0.01D);
      assertEquals(0.0, pegasusSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0.0, pegasusSolver0.getMax(), 0.01D);
      assertEquals(1.5874010519682, pegasusSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0, pegasusSolver0.getMaxEvaluations());
      assertEquals(0.0, pegasusSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0.0, pegasusSolver0.getMin(), 0.01D);
      assertEquals(0, pegasusSolver0.getEvaluations());
      
      double double3 = pegasusSolver0.solve(int0, (UnivariateRealFunction) harmonicOscillator0, double2, double0, double2);
      assertEquals(0.01660472517330387, double3, 0.01D);
      assertFalse(double1 == double3);
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      assertFalse(double0 == double3);
      assertFalse(double0 == double2);
      assertFalse(double3 == double0);
      assertFalse(double3 == double1);
      assertFalse(double3 == double2);
      assertFalse(double2 == double3);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertEquals(0.0, pegasusSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(2147483643, pegasusSolver0.getMaxEvaluations());
      assertEquals(1.5874010519682, pegasusSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0.0, pegasusSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(7, pegasusSolver0.getEvaluations());
      assertEquals((-1.0), pegasusSolver0.getStartValue(), 0.01D);
      assertEquals(1.5874010519682, pegasusSolver0.getMax(), 0.01D);
      assertEquals((-1.0), pegasusSolver0.getMin(), 0.01D);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double double0 = 1.5874010519682;
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(double0, double0);
      assertNotNull(illinoisSolver0);
      assertEquals(0, illinoisSolver0.getEvaluations());
      assertEquals(0, illinoisSolver0.getMaxEvaluations());
      assertEquals(0.0, illinoisSolver0.getStartValue(), 0.01D);
      assertEquals(0.0, illinoisSolver0.getMin(), 0.01D);
      assertEquals(1.5874010519682, illinoisSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0.0, illinoisSolver0.getMax(), 0.01D);
      assertEquals(1.0E-15, illinoisSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.5874010519682, illinoisSolver0.getRelativeAccuracy(), 0.01D);
      
      int int0 = 2147483643;
      Log10 log10_0 = new Log10();
      assertNotNull(log10_0);
      
      double double1 = 0.10227236023404615;
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double2 = illinoisSolver0.solve(int0, (UnivariateRealFunction) log10_0, double1, (double) int0, double1, allowedSolution0);
      assertEquals(2.0601555422802162E8, double2, 0.01D);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertEquals(1.5874010519682, illinoisSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, illinoisSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0.10227236023404615, illinoisSolver0.getMin(), 0.01D);
      assertEquals(2.147483643E9, illinoisSolver0.getMax(), 0.01D);
      assertEquals(0.10227236023404615, illinoisSolver0.getStartValue(), 0.01D);
      assertEquals(2147483643, illinoisSolver0.getMaxEvaluations());
      assertEquals(3, illinoisSolver0.getEvaluations());
      assertEquals(1.5874010519682, illinoisSolver0.getRelativeAccuracy(), 0.01D);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double double0 = (-9.184821375951536);
      double double1 = 1079.5642268513282;
      PegasusSolver pegasusSolver0 = new PegasusSolver(double0, double1);
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
      assertNotNull(pegasusSolver0);
      assertEquals(0.0, pegasusSolver0.getMax(), 0.01D);
      assertEquals(1079.5642268513282, pegasusSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0.0, pegasusSolver0.getMin(), 0.01D);
      assertEquals(1.0E-15, pegasusSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0.0, pegasusSolver0.getStartValue(), 0.01D);
      assertEquals((-9.184821375951536), pegasusSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0, pegasusSolver0.getEvaluations());
      assertEquals(0, pegasusSolver0.getMaxEvaluations());
      
      int int0 = 125;
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (double) int0;
      doubleArray0[1] = double1;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertArrayEquals(new double[] {125.0, 1079.5642268513282, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      assertEquals(1, polynomialFunction0.degree());
      
      double double2 = (-648.0620488218906);
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double3 = pegasusSolver0.solve(int0, (UnivariateRealFunction) polynomialFunction0, double2, doubleArray0[3], allowedSolution0);
      assertEquals((-0.11578746024641509), double3, 0.01D);
      assertFalse(double2 == double3);
      assertFalse(double2 == double1);
      assertFalse(double2 == double0);
      assertFalse(double3 == double2);
      assertFalse(double3 == double0);
      assertFalse(double3 == double1);
      assertFalse(double0 == double3);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
      assertFalse(double1 == double3);
      assertArrayEquals(new double[] {125.0, 1079.5642268513282, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(1, polynomialFunction0.degree());
      assertEquals(0.0, pegasusSolver0.getMax(), 0.01D);
      assertEquals((-324.0310244109453), pegasusSolver0.getStartValue(), 0.01D);
      assertEquals(3, pegasusSolver0.getEvaluations());
      assertEquals(1079.5642268513282, pegasusSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, pegasusSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals((-648.0620488218906), pegasusSolver0.getMin(), 0.01D);
      assertEquals((-9.184821375951536), pegasusSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(125, pegasusSolver0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double double0 = 0.0;
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(double0, double0, double0);
      assertNotNull(regulaFalsiSolver0);
      assertEquals(0.0, regulaFalsiSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0.0, regulaFalsiSolver0.getMin(), 0.01D);
      assertEquals(0.0, regulaFalsiSolver0.getStartValue(), 0.01D);
      assertEquals(0.0, regulaFalsiSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0.0, regulaFalsiSolver0.getMax(), 0.01D);
      assertEquals(0, regulaFalsiSolver0.getMaxEvaluations());
      assertEquals(0.0, regulaFalsiSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0, regulaFalsiSolver0.getEvaluations());
      
      int int0 = 7;
      Sin sin0 = new Sin();
      assertNotNull(sin0);
      
      double double1 = regulaFalsiSolver0.solve(int0, (UnivariateRealFunction) sin0, double0, double0);
      assertEquals(0.0, double1, 0.01D);
      assertTrue(double1 == double0);
      assertTrue(double0 == double1);
      assertEquals(7, regulaFalsiSolver0.getMaxEvaluations());
      assertEquals(0.0, regulaFalsiSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0.0, regulaFalsiSolver0.getMin(), 0.01D);
      assertEquals(0.0, regulaFalsiSolver0.getStartValue(), 0.01D);
      assertEquals(2, regulaFalsiSolver0.getEvaluations());
      assertEquals(0.0, regulaFalsiSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0.0, regulaFalsiSolver0.getMax(), 0.01D);
      assertEquals(0.0, regulaFalsiSolver0.getRelativeAccuracy(), 0.01D);
  }
}
