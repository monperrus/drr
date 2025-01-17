/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 17:17:32 GMT 2014
 */

package org.apache.commons.math.stat.regression;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.stat.regression.SimpleRegression;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;

import org.junit.runner.RunWith;

 
public class SimpleRegressionEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      assertNotNull(simpleRegression0);
      assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getTotalSumSquares(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getInterceptStdErr(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getSlope(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getR(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getRSquare(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getRegressionSumSquares(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getMeanSquareError(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getIntercept(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getSlopeStdErr(), 0.01D);
      assertEquals(0L, simpleRegression0.getN());
      
      double[] doubleArray0 = new double[6];
      // Undeclared exception!
      try {
        double double0 = simpleRegression0.getSlopeConfidenceInterval(doubleArray0[2]);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      assertNotNull(simpleRegression0);
      assertEquals(0L, simpleRegression0.getN());
      assertEquals(Double.NaN, simpleRegression0.getMeanSquareError(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getIntercept(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getSlope(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getRSquare(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getInterceptStdErr(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getSlopeStdErr(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getRegressionSumSquares(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getR(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getTotalSumSquares(), 0.01D);
      
      double double0 = simpleRegression0.getR();
      assertEquals(0L, simpleRegression0.getN());
      assertEquals(Double.NaN, simpleRegression0.getMeanSquareError(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getIntercept(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getSlope(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getRSquare(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getInterceptStdErr(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getSlopeStdErr(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getRegressionSumSquares(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getR(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getTotalSumSquares(), 0.01D);
      assertEquals(Double.NaN, double0, 0.01D);
      
      // Undeclared exception!
      try {
        double double1 = simpleRegression0.getSlopeConfidenceInterval(double0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      assertNotNull(simpleRegression0);
      assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getSlope(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getRegressionSumSquares(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getTotalSumSquares(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getSlopeStdErr(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getMeanSquareError(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getRSquare(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getInterceptStdErr(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getR(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getIntercept(), 0.01D);
      assertEquals(0L, simpleRegression0.getN());
      
      double[][] doubleArray0 = new double[1][1];
      double[] doubleArray1 = new double[6];
      double double0 = (-506.93899);
      doubleArray1[0] = double0;
      doubleArray0[0] = doubleArray1;
      assertNotNull(doubleArray0[0]);
      
      simpleRegression0.addData(doubleArray0);
      assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getSlope(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getRegressionSumSquares(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getTotalSumSquares(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getSlopeStdErr(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getMeanSquareError(), 0.01D);
      assertEquals(1L, simpleRegression0.getN());
      assertEquals(Double.NaN, simpleRegression0.getRSquare(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getInterceptStdErr(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getR(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getIntercept(), 0.01D);
      
      simpleRegression0.addData(doubleArray1[5], doubleArray1[0]);
      assertArrayEquals(new double[] {(-506.93899), 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray1, 0.01);
      assertEquals((-1.0), simpleRegression0.getSlope(), 0.01D);
      assertEquals(128493.56979111004, simpleRegression0.getRegressionSumSquares(), 0.01D);
      assertEquals(128493.56979111004, simpleRegression0.getTotalSumSquares(), 0.01D);
      assertEquals(2L, simpleRegression0.getN());
      assertEquals(1.0, simpleRegression0.getRSquare(), 0.01D);
      assertEquals(0.0, simpleRegression0.getSumSquaredErrors(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getSlopeStdErr(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getMeanSquareError(), 0.01D);
      assertEquals((-1.0), simpleRegression0.getR(), 0.01D);
      assertEquals((-506.93899), simpleRegression0.getIntercept(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getInterceptStdErr(), 0.01D);
      
      double double1 = simpleRegression0.getR();
      assertFalse(double1 == double0);
      assertEquals((-1.0), simpleRegression0.getSlope(), 0.01D);
      assertEquals(128493.56979111004, simpleRegression0.getRegressionSumSquares(), 0.01D);
      assertEquals(128493.56979111004, simpleRegression0.getTotalSumSquares(), 0.01D);
      assertEquals(2L, simpleRegression0.getN());
      assertEquals(1.0, simpleRegression0.getRSquare(), 0.01D);
      assertEquals(0.0, simpleRegression0.getSumSquaredErrors(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getSlopeStdErr(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getMeanSquareError(), 0.01D);
      assertEquals((-1.0), simpleRegression0.getR(), 0.01D);
      assertEquals((-506.93899), simpleRegression0.getIntercept(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getInterceptStdErr(), 0.01D);
      assertEquals((-1.0), double1, 0.01D);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      assertNotNull(simpleRegression0);
      assertEquals(Double.NaN, simpleRegression0.getRSquare(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getInterceptStdErr(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getMeanSquareError(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getTotalSumSquares(), 0.01D);
      assertEquals(0L, simpleRegression0.getN());
      assertEquals(Double.NaN, simpleRegression0.getSlopeStdErr(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getR(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getIntercept(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getRegressionSumSquares(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getSlope(), 0.01D);
      
      double double0 = 1.0;
      double double1 = simpleRegression0.predict(double0);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      assertEquals(Double.NaN, simpleRegression0.getRSquare(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getInterceptStdErr(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getMeanSquareError(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getTotalSumSquares(), 0.01D);
      assertEquals(0L, simpleRegression0.getN());
      assertEquals(Double.NaN, simpleRegression0.getSlopeStdErr(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getR(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getIntercept(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getRegressionSumSquares(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getSlope(), 0.01D);
      assertEquals(Double.NaN, double1, 0.01D);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      assertNotNull(simpleRegression0);
      assertEquals(Double.NaN, simpleRegression0.getRegressionSumSquares(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getInterceptStdErr(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getIntercept(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getSlopeStdErr(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getR(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getRSquare(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getTotalSumSquares(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getMeanSquareError(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getSlope(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01D);
      assertEquals(0L, simpleRegression0.getN());
      
      double double0 = simpleRegression0.getInterceptStdErr();
      assertEquals(Double.NaN, simpleRegression0.getRegressionSumSquares(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getInterceptStdErr(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getIntercept(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getSlopeStdErr(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getR(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getRSquare(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getTotalSumSquares(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getMeanSquareError(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getSlope(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01D);
      assertEquals(0L, simpleRegression0.getN());
      assertEquals(Double.NaN, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      assertNotNull(simpleRegression0);
      assertEquals(Double.NaN, simpleRegression0.getSlope(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getRSquare(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getInterceptStdErr(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getRegressionSumSquares(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getIntercept(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getR(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getSlopeStdErr(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getTotalSumSquares(), 0.01D);
      assertEquals(0L, simpleRegression0.getN());
      assertEquals(Double.NaN, simpleRegression0.getMeanSquareError(), 0.01D);
      
      double double0 = 0.0;
      simpleRegression0.addData(double0, double0);
      assertEquals(Double.NaN, simpleRegression0.getSlope(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getRSquare(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getInterceptStdErr(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getRegressionSumSquares(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getIntercept(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getR(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getSlopeStdErr(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getTotalSumSquares(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getMeanSquareError(), 0.01D);
      assertEquals(1L, simpleRegression0.getN());
      
      double[][] doubleArray0 = new double[1][6];
      simpleRegression0.addData(doubleArray0);
      assertEquals(Double.NaN, simpleRegression0.getSlope(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getRSquare(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getInterceptStdErr(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getRegressionSumSquares(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getIntercept(), 0.01D);
      assertEquals(0.0, simpleRegression0.getTotalSumSquares(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getR(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getSlopeStdErr(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getMeanSquareError(), 0.01D);
      assertEquals(2L, simpleRegression0.getN());
      
      simpleRegression0.addData(doubleArray0);
      assertEquals(Double.NaN, simpleRegression0.getSlope(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getRSquare(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getInterceptStdErr(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getRegressionSumSquares(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getIntercept(), 0.01D);
      assertEquals(0.0, simpleRegression0.getTotalSumSquares(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getR(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getSlopeStdErr(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getMeanSquareError(), 0.01D);
      assertEquals(3L, simpleRegression0.getN());
      
      double double1 = simpleRegression0.getSignificance();
      assertFalse(double1 == double0);
      assertEquals(Double.NaN, simpleRegression0.getSlope(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getRSquare(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getInterceptStdErr(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getRegressionSumSquares(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getIntercept(), 0.01D);
      assertEquals(0.0, simpleRegression0.getTotalSumSquares(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getR(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getSlopeStdErr(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getMeanSquareError(), 0.01D);
      assertEquals(3L, simpleRegression0.getN());
      assertEquals(Double.NaN, double1, 0.01D);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      assertNotNull(simpleRegression0);
      assertEquals(Double.NaN, simpleRegression0.getSlope(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getIntercept(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getTotalSumSquares(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getInterceptStdErr(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getRSquare(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getSlopeStdErr(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getRegressionSumSquares(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getR(), 0.01D);
      assertEquals(0L, simpleRegression0.getN());
      assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getMeanSquareError(), 0.01D);
      
      long long0 = simpleRegression0.getN();
      assertEquals(Double.NaN, simpleRegression0.getSlope(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getIntercept(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getTotalSumSquares(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getInterceptStdErr(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getRSquare(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getSlopeStdErr(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getRegressionSumSquares(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getR(), 0.01D);
      assertEquals(0L, simpleRegression0.getN());
      assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getMeanSquareError(), 0.01D);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      assertNotNull(simpleRegression0);
      assertEquals(Double.NaN, simpleRegression0.getTotalSumSquares(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getRSquare(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getSlope(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getIntercept(), 0.01D);
      assertEquals(0L, simpleRegression0.getN());
      assertEquals(Double.NaN, simpleRegression0.getRegressionSumSquares(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getSlopeStdErr(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getMeanSquareError(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getInterceptStdErr(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getR(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01D);
      
      double double0 = simpleRegression0.getRegressionSumSquares();
      assertEquals(Double.NaN, simpleRegression0.getTotalSumSquares(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getRSquare(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getSlope(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getIntercept(), 0.01D);
      assertEquals(0L, simpleRegression0.getN());
      assertEquals(Double.NaN, simpleRegression0.getRegressionSumSquares(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getSlopeStdErr(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getMeanSquareError(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getInterceptStdErr(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getR(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01D);
      assertEquals(Double.NaN, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      assertNotNull(simpleRegression0);
      assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getSlope(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getInterceptStdErr(), 0.01D);
      assertEquals(0L, simpleRegression0.getN());
      assertEquals(Double.NaN, simpleRegression0.getRSquare(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getR(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getSlopeStdErr(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getRegressionSumSquares(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getIntercept(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getMeanSquareError(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getTotalSumSquares(), 0.01D);
      
      simpleRegression0.clear();
      assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getSlope(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getInterceptStdErr(), 0.01D);
      assertEquals(0L, simpleRegression0.getN());
      assertEquals(Double.NaN, simpleRegression0.getRSquare(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getR(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getSlopeStdErr(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getRegressionSumSquares(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getIntercept(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getMeanSquareError(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getTotalSumSquares(), 0.01D);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      assertNotNull(simpleRegression0);
      assertEquals(Double.NaN, simpleRegression0.getTotalSumSquares(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getSlope(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getRSquare(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getMeanSquareError(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getIntercept(), 0.01D);
      assertEquals(0L, simpleRegression0.getN());
      assertEquals(Double.NaN, simpleRegression0.getRegressionSumSquares(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getInterceptStdErr(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getSlopeStdErr(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getR(), 0.01D);
      
      // Undeclared exception!
      try {
        double double0 = simpleRegression0.getSlopeConfidenceInterval();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // degrees of freedom must be positive.
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      assertNotNull(simpleRegression0);
      assertEquals(Double.NaN, simpleRegression0.getMeanSquareError(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getTotalSumSquares(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getR(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getRegressionSumSquares(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getIntercept(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getInterceptStdErr(), 0.01D);
      assertEquals(0L, simpleRegression0.getN());
      assertEquals(Double.NaN, simpleRegression0.getSlopeStdErr(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getSlope(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getRSquare(), 0.01D);
      
      double double0 = simpleRegression0.getIntercept();
      assertEquals(Double.NaN, simpleRegression0.getMeanSquareError(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getTotalSumSquares(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getR(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getRegressionSumSquares(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getIntercept(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getInterceptStdErr(), 0.01D);
      assertEquals(0L, simpleRegression0.getN());
      assertEquals(Double.NaN, simpleRegression0.getSlopeStdErr(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getSlope(), 0.01D);
      assertEquals(Double.NaN, simpleRegression0.getRSquare(), 0.01D);
      assertEquals(Double.NaN, double0, 0.01D);
  }
}
