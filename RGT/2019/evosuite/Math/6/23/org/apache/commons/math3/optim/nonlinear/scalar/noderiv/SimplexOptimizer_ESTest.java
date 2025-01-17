/*
 * This file was automatically generated by EvoSuite
 * Tue Jun 25 13:39:40 GMT 2019
 */

package org.apache.commons.math3.optim.nonlinear.scalar.noderiv;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.optim.InitialGuess;
import org.apache.commons.math3.optim.OptimizationData;
import org.apache.commons.math3.optim.SimpleBounds;
import org.apache.commons.math3.optim.nonlinear.scalar.noderiv.MultiDirectionalSimplex;
import org.apache.commons.math3.optim.nonlinear.scalar.noderiv.NelderMeadSimplex;
import org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;


public class SimplexOptimizer_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SimplexOptimizer simplexOptimizer0 = new SimplexOptimizer((-1778.9), (-1778.9));
      OptimizationData[] optimizationDataArray0 = new OptimizationData[9];
      // Undeclared exception!
      try { 
        simplexOptimizer0.optimize(optimizationDataArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SimplexOptimizer simplexOptimizer0 = new SimplexOptimizer((-1778.9), (-1778.9));
      OptimizationData[] optimizationDataArray0 = new OptimizationData[9];
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (double) Integer.MAX_VALUE;
      doubleArray0[1] = (-1778.9);
      doubleArray0[2] = (-1778.9);
      doubleArray0[3] = (double) Integer.MAX_VALUE;
      doubleArray0[4] = (double) Integer.MAX_VALUE;
      doubleArray0[5] = (double) Integer.MAX_VALUE;
      doubleArray0[6] = (double) Integer.MAX_VALUE;
      doubleArray0[7] = (double) Integer.MAX_VALUE;
      doubleArray0[8] = (double) Integer.MAX_VALUE;
      NelderMeadSimplex nelderMeadSimplex0 = new NelderMeadSimplex(doubleArray0, 1.0, 2.147483647E9, 9.223372036854776E18, 2.147483647E9);
      optimizationDataArray0[0] = (OptimizationData) nelderMeadSimplex0;
      InitialGuess initialGuess0 = new InitialGuess(doubleArray0);
      optimizationDataArray0[1] = (OptimizationData) initialGuess0;
      // Undeclared exception!
      try { 
        simplexOptimizer0.optimize(optimizationDataArray0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math3.optim.BaseOptimizer$MaxEvalCallback", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SimplexOptimizer simplexOptimizer0 = new SimplexOptimizer(432.2945929211, 432.2945929211);
      OptimizationData[] optimizationDataArray0 = new OptimizationData[2];
      double[] doubleArray0 = new double[5];
      SimpleBounds simpleBounds0 = new SimpleBounds(doubleArray0, doubleArray0);
      optimizationDataArray0[0] = (OptimizationData) simpleBounds0;
      MultiDirectionalSimplex multiDirectionalSimplex0 = new MultiDirectionalSimplex(5, 432.2945929211, 432.2945929211);
      optimizationDataArray0[1] = (OptimizationData) multiDirectionalSimplex0;
      simplexOptimizer0.parseOptimizationData(optimizationDataArray0);
      // Undeclared exception!
      try { 
        simplexOptimizer0.doOptimize();
        fail("Expecting exception: MathUnsupportedOperationException");
      
      } catch(MathUnsupportedOperationException e) {
         //
         // constraint
         //
         verifyException("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", e);
      }
  }
}
