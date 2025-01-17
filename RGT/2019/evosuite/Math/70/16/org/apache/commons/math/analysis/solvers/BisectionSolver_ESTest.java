/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 24 10:23:53 GMT 2019
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.polynomials.PolynomialFunctionLagrangeForm;
import org.apache.commons.math.analysis.solvers.BisectionSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;


public class BisectionSolver_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      try { 
        bisectionSolver0.solve(0.0, (-286.0));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0, -286]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      BisectionSolver bisectionSolver0 = new BisectionSolver(polynomialFunctionLagrangeForm0);
      try { 
        bisectionSolver0.solve((UnivariateRealFunction) polynomialFunctionLagrangeForm0, (-1879.00968506159), 0.0, 1.0E-6);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Abscissa 0 is duplicated at both indices 1 and 1
         //
         verifyException("org.apache.commons.math.analysis.polynomials.PolynomialFunctionLagrangeForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      bisectionSolver0.setMaximalIterationCount(0);
      try { 
        bisectionSolver0.solve(354.386143013, 1628.2075, 1628.2075);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Maximal number of iterations (0) exceeded
         //
         verifyException("org.apache.commons.math.analysis.solvers.BisectionSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (-710.299);
      doubleArray0[1] = 1610.574550169684;
      doubleArray0[3] = 3375.23528724;
      doubleArray0[4] = (-3154.9392498);
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      BisectionSolver bisectionSolver0 = new BisectionSolver(polynomialFunctionLagrangeForm0);
      double double0 = bisectionSolver0.solve((-710.299), 1.0E-6, 1610.574550169684);
      assertEquals(29, bisectionSolver0.getIterationCount());
      assertEquals(7.723758462816386E-9, double0, 0.01);
  }
}
