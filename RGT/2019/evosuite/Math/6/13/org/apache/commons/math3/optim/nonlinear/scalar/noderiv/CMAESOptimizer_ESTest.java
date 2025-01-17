/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 24 06:58:14 GMT 2019
 */

package org.apache.commons.math3.optim.nonlinear.scalar.noderiv;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.optim.ConvergenceChecker;
import org.apache.commons.math3.optim.InitialGuess;
import org.apache.commons.math3.optim.OptimizationData;
import org.apache.commons.math3.optim.PointValuePair;
import org.apache.commons.math3.optim.SimpleBounds;
import org.apache.commons.math3.optim.SimplePointChecker;
import org.apache.commons.math3.optim.SimpleValueChecker;
import org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer;
import org.apache.commons.math3.random.JDKRandomGenerator;
import org.apache.commons.math3.random.MersenneTwister;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well44497a;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;


public class CMAESOptimizer_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SimpleValueChecker simpleValueChecker0 = new SimpleValueChecker(891.304, 891.304, 2);
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer((-1188), 2639.0105148355387, true, (-1188), 0, (RandomGenerator) null, true, simpleValueChecker0);
      List<Double> list0 = cMAESOptimizer0.getStatisticsSigmaHistory();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JDKRandomGenerator jDKRandomGenerator0 = new JDKRandomGenerator();
      SimpleValueChecker simpleValueChecker0 = new SimpleValueChecker(0.0, (-80.948841233707));
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(4, 4, false, 4, 4, jDKRandomGenerator0, true, simpleValueChecker0);
      List<RealMatrix> list0 = cMAESOptimizer0.getStatisticsDHistory();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MersenneTwister mersenneTwister0 = new MersenneTwister((-1658038656));
      SimplePointChecker<PointValuePair> simplePointChecker0 = new SimplePointChecker<PointValuePair>((-1658038656), (-1380.663));
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer((-1658038656), (-1658038656), false, (-1658038656), (-1658038656), mersenneTwister0, false, simplePointChecker0);
      List<Double> list0 = cMAESOptimizer0.getStatisticsFitnessHistory();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Well44497a well44497a0 = new Well44497a();
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(0, 1421.6349739445639, true, 1, 0, well44497a0, false, (ConvergenceChecker<PointValuePair>) null);
      List<RealMatrix> list0 = cMAESOptimizer0.getStatisticsMeanHistory();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (-2131.0);
      CMAESOptimizer.Sigma cMAESOptimizer_Sigma0 = null;
      try {
        cMAESOptimizer_Sigma0 = new CMAESOptimizer.Sigma(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -2,131 is smaller than the minimum (0)
         //
         verifyException("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer$Sigma", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      CMAESOptimizer.PopulationSize cMAESOptimizer_PopulationSize0 = null;
      try {
        cMAESOptimizer_PopulationSize0 = new CMAESOptimizer.PopulationSize((-508));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -508 is smaller than, or equal to, the minimum (0)
         //
         verifyException("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer$PopulationSize", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      JDKRandomGenerator jDKRandomGenerator0 = new JDKRandomGenerator();
      SimpleValueChecker simpleValueChecker0 = new SimpleValueChecker(0.0, (-80.948841233707));
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(4, 4, false, 4, 4, jDKRandomGenerator0, true, simpleValueChecker0);
      CMAESOptimizer.PopulationSize cMAESOptimizer_PopulationSize0 = new CMAESOptimizer.PopulationSize(4);
      OptimizationData[] optimizationDataArray0 = new OptimizationData[6];
      optimizationDataArray0[0] = (OptimizationData) cMAESOptimizer_PopulationSize0;
      // Undeclared exception!
      try { 
        cMAESOptimizer0.optimize(optimizationDataArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      SimplePointChecker<PointValuePair> simplePointChecker0 = new SimplePointChecker<PointValuePair>(2, 2, 2);
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(2, 2, false, 2, 2, (RandomGenerator) null, false, simplePointChecker0);
      OptimizationData[] optimizationDataArray0 = new OptimizationData[4];
      double[] doubleArray0 = new double[8];
      CMAESOptimizer.Sigma cMAESOptimizer_Sigma0 = new CMAESOptimizer.Sigma(doubleArray0);
      optimizationDataArray0[0] = (OptimizationData) cMAESOptimizer_Sigma0;
      double[] doubleArray1 = new double[5];
      InitialGuess initialGuess0 = new InitialGuess(doubleArray1);
      optimizationDataArray0[3] = (OptimizationData) initialGuess0;
      // Undeclared exception!
      try { 
        cMAESOptimizer0.parseOptimizationData(optimizationDataArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 8 != 5
         //
         verifyException("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      SimplePointChecker<PointValuePair> simplePointChecker0 = new SimplePointChecker<PointValuePair>(2, 2, 2);
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(2, 1.0E-11, false, 30, 2, (RandomGenerator) null, true, simplePointChecker0);
      OptimizationData[] optimizationDataArray0 = new OptimizationData[7];
      double[] doubleArray0 = new double[4];
      SimpleBounds simpleBounds0 = new SimpleBounds(doubleArray0, doubleArray0);
      optimizationDataArray0[0] = (OptimizationData) simpleBounds0;
      InitialGuess initialGuess0 = new InitialGuess(doubleArray0);
      optimizationDataArray0[5] = (OptimizationData) initialGuess0;
      CMAESOptimizer.Sigma cMAESOptimizer_Sigma0 = new CMAESOptimizer.Sigma(doubleArray0);
      optimizationDataArray0[6] = (OptimizationData) cMAESOptimizer_Sigma0;
      // Undeclared exception!
      try { 
        cMAESOptimizer0.optimize(optimizationDataArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      SimplePointChecker<PointValuePair> simplePointChecker0 = new SimplePointChecker<PointValuePair>(2, 2, 2);
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(2, 1.0E-11, false, 30, 2, (RandomGenerator) null, true, simplePointChecker0);
      OptimizationData[] optimizationDataArray0 = new OptimizationData[7];
      double[] doubleArray0 = new double[4];
      doubleArray0[2] = (double) 30;
      SimpleBounds simpleBounds0 = new SimpleBounds(doubleArray0, doubleArray0);
      optimizationDataArray0[0] = (OptimizationData) simpleBounds0;
      InitialGuess initialGuess0 = new InitialGuess(doubleArray0);
      optimizationDataArray0[5] = (OptimizationData) initialGuess0;
      CMAESOptimizer.Sigma cMAESOptimizer_Sigma0 = new CMAESOptimizer.Sigma(doubleArray0);
      optimizationDataArray0[6] = (OptimizationData) cMAESOptimizer_Sigma0;
      // Undeclared exception!
      try { 
        cMAESOptimizer0.optimize(optimizationDataArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 30 out of [0, 0] range
         //
         verifyException("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", e);
      }
  }
}
