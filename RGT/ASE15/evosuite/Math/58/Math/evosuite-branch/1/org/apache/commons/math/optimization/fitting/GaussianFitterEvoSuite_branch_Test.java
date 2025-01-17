/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 18:13:37 GMT 2014
 */

package org.apache.commons.math.optimization.fitting;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.exception.NullArgumentException;
import org.apache.commons.math.exception.NumberIsTooSmallException;
import org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer;
import org.apache.commons.math.optimization.fitting.GaussianFitter;
import org.apache.commons.math.optimization.fitting.WeightedObservedPoint;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class GaussianFitterEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[7];
      double double0 = 4.23211018857745;
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint(double0, double0, double0);
      assertNotNull(weightedObservedPoint0);
      assertEquals(4.23211018857745, weightedObservedPoint0.getY(), 0.01D);
      assertEquals(4.23211018857745, weightedObservedPoint0.getX(), 0.01D);
      assertEquals(4.23211018857745, weightedObservedPoint0.getWeight(), 0.01D);
      
      double double1 = Double.POSITIVE_INFINITY;
      weightedObservedPointArray0[2] = weightedObservedPoint0;
      assertNotNull(weightedObservedPointArray0[2]);
      assertEquals(4.23211018857745, weightedObservedPoint0.getY(), 0.01D);
      assertEquals(4.23211018857745, weightedObservedPoint0.getX(), 0.01D);
      assertEquals(4.23211018857745, weightedObservedPoint0.getWeight(), 0.01D);
      assertEquals(4.23211018857745, weightedObservedPointArray0[2].getWeight(), 0.01D);
      assertEquals(4.23211018857745, weightedObservedPointArray0[2].getX(), 0.01D);
      assertEquals(4.23211018857745, weightedObservedPointArray0[2].getY(), 0.01D);
      
      weightedObservedPointArray0[3] = weightedObservedPointArray0[2];
      assertNotNull(weightedObservedPointArray0[3]);
      assertEquals(4.23211018857745, weightedObservedPointArray0[3].getY(), 0.01D);
      assertEquals(4.23211018857745, weightedObservedPointArray0[3].getWeight(), 0.01D);
      assertEquals(4.23211018857745, weightedObservedPointArray0[3].getX(), 0.01D);
      
      WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint(double1, double0, double0);
      assertNotSame(weightedObservedPoint1, weightedObservedPoint0);
      assertNotNull(weightedObservedPoint1);
      assertEquals(4.23211018857745, weightedObservedPoint1.getY(), 0.01D);
      assertEquals(4.23211018857745, weightedObservedPoint1.getX(), 0.01D);
      assertEquals(Double.POSITIVE_INFINITY, weightedObservedPoint1.getWeight(), 0.01D);
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
      assertFalse(weightedObservedPoint1.equals((Object)weightedObservedPoint0));
      
      weightedObservedPointArray0[4] = weightedObservedPoint1;
      assertNotNull(weightedObservedPointArray0[4]);
      assertEquals(4.23211018857745, weightedObservedPoint1.getY(), 0.01D);
      assertEquals(4.23211018857745, weightedObservedPoint1.getX(), 0.01D);
      assertEquals(Double.POSITIVE_INFINITY, weightedObservedPoint1.getWeight(), 0.01D);
      assertEquals(4.23211018857745, weightedObservedPointArray0[4].getX(), 0.01D);
      assertEquals(Double.POSITIVE_INFINITY, weightedObservedPointArray0[4].getWeight(), 0.01D);
      assertEquals(4.23211018857745, weightedObservedPointArray0[4].getY(), 0.01D);
      
      weightedObservedPointArray0[5] = weightedObservedPointArray0[3];
      assertNotNull(weightedObservedPointArray0[5]);
      assertEquals(4.23211018857745, weightedObservedPointArray0[5].getWeight(), 0.01D);
      assertEquals(4.23211018857745, weightedObservedPointArray0[5].getY(), 0.01D);
      assertEquals(4.23211018857745, weightedObservedPointArray0[5].getX(), 0.01D);
      
      GaussianFitter.ParameterGuesser gaussianFitter_ParameterGuesser0 = new GaussianFitter.ParameterGuesser(weightedObservedPointArray0);
      assertNotNull(gaussianFitter_ParameterGuesser0);
      
      // Undeclared exception!
      try {
        double[] doubleArray0 = gaussianFitter_ParameterGuesser0.guess();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[7];
      double double0 = 4.23211018857745;
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint(double0, double0, double0);
      assertNotNull(weightedObservedPoint0);
      assertEquals(4.23211018857745, weightedObservedPoint0.getX(), 0.01D);
      assertEquals(4.23211018857745, weightedObservedPoint0.getY(), 0.01D);
      assertEquals(4.23211018857745, weightedObservedPoint0.getWeight(), 0.01D);
      
      weightedObservedPointArray0[0] = weightedObservedPoint0;
      assertNotNull(weightedObservedPointArray0[0]);
      assertEquals(4.23211018857745, weightedObservedPointArray0[0].getY(), 0.01D);
      assertEquals(4.23211018857745, weightedObservedPointArray0[0].getX(), 0.01D);
      assertEquals(4.23211018857745, weightedObservedPointArray0[0].getWeight(), 0.01D);
      assertEquals(4.23211018857745, weightedObservedPoint0.getX(), 0.01D);
      assertEquals(4.23211018857745, weightedObservedPoint0.getY(), 0.01D);
      assertEquals(4.23211018857745, weightedObservedPoint0.getWeight(), 0.01D);
      
      double double1 = Double.POSITIVE_INFINITY;
      WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint(double0, double0, double1);
      assertNotSame(weightedObservedPoint1, weightedObservedPoint0);
      assertNotNull(weightedObservedPoint1);
      assertEquals(Double.POSITIVE_INFINITY, weightedObservedPoint1.getY(), 0.01D);
      assertEquals(4.23211018857745, weightedObservedPoint1.getWeight(), 0.01D);
      assertEquals(4.23211018857745, weightedObservedPoint1.getX(), 0.01D);
      assertFalse(weightedObservedPoint1.equals((Object)weightedObservedPoint0));
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      
      weightedObservedPointArray0[1] = weightedObservedPoint1;
      assertNotNull(weightedObservedPointArray0[1]);
      assertEquals(Double.POSITIVE_INFINITY, weightedObservedPoint1.getY(), 0.01D);
      assertEquals(4.23211018857745, weightedObservedPoint1.getWeight(), 0.01D);
      assertEquals(4.23211018857745, weightedObservedPoint1.getX(), 0.01D);
      assertEquals(4.23211018857745, weightedObservedPointArray0[1].getX(), 0.01D);
      assertEquals(Double.POSITIVE_INFINITY, weightedObservedPointArray0[1].getY(), 0.01D);
      assertEquals(4.23211018857745, weightedObservedPointArray0[1].getWeight(), 0.01D);
      
      weightedObservedPointArray0[2] = weightedObservedPoint0;
      assertNotNull(weightedObservedPointArray0[2]);
      assertEquals(4.23211018857745, weightedObservedPointArray0[2].getWeight(), 0.01D);
      assertEquals(4.23211018857745, weightedObservedPointArray0[2].getX(), 0.01D);
      assertEquals(4.23211018857745, weightedObservedPointArray0[2].getY(), 0.01D);
      assertEquals(4.23211018857745, weightedObservedPoint0.getX(), 0.01D);
      assertEquals(4.23211018857745, weightedObservedPoint0.getY(), 0.01D);
      assertEquals(4.23211018857745, weightedObservedPoint0.getWeight(), 0.01D);
      
      weightedObservedPointArray0[3] = weightedObservedPointArray0[2];
      assertNotNull(weightedObservedPointArray0[3]);
      assertEquals(4.23211018857745, weightedObservedPointArray0[3].getY(), 0.01D);
      assertEquals(4.23211018857745, weightedObservedPointArray0[3].getWeight(), 0.01D);
      assertEquals(4.23211018857745, weightedObservedPointArray0[3].getX(), 0.01D);
      
      weightedObservedPointArray0[4] = weightedObservedPointArray0[0];
      assertNotNull(weightedObservedPointArray0[4]);
      assertEquals(4.23211018857745, weightedObservedPointArray0[4].getWeight(), 0.01D);
      assertEquals(4.23211018857745, weightedObservedPointArray0[4].getY(), 0.01D);
      assertEquals(4.23211018857745, weightedObservedPointArray0[4].getX(), 0.01D);
      
      weightedObservedPointArray0[5] = weightedObservedPointArray0[3];
      assertNotNull(weightedObservedPointArray0[5]);
      assertEquals(4.23211018857745, weightedObservedPointArray0[5].getY(), 0.01D);
      assertEquals(4.23211018857745, weightedObservedPointArray0[5].getX(), 0.01D);
      assertEquals(4.23211018857745, weightedObservedPointArray0[5].getWeight(), 0.01D);
      
      weightedObservedPointArray0[6] = weightedObservedPoint1;
      assertNotNull(weightedObservedPointArray0[6]);
      assertEquals(Double.POSITIVE_INFINITY, weightedObservedPoint1.getY(), 0.01D);
      assertEquals(4.23211018857745, weightedObservedPoint1.getWeight(), 0.01D);
      assertEquals(4.23211018857745, weightedObservedPoint1.getX(), 0.01D);
      assertEquals(4.23211018857745, weightedObservedPointArray0[6].getWeight(), 0.01D);
      assertEquals(Double.POSITIVE_INFINITY, weightedObservedPointArray0[6].getY(), 0.01D);
      assertEquals(4.23211018857745, weightedObservedPointArray0[6].getX(), 0.01D);
      
      GaussianFitter.ParameterGuesser gaussianFitter_ParameterGuesser0 = new GaussianFitter.ParameterGuesser(weightedObservedPointArray0);
      assertNotNull(gaussianFitter_ParameterGuesser0);
      
      double[] doubleArray0 = gaussianFitter_ParameterGuesser0.guess();
      assertArrayEquals(new double[] {Double.POSITIVE_INFINITY, 4.23211018857745, 0.0}, doubleArray0, 0.01);
      assertNotNull(doubleArray0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[7];
      double double0 = 1092.0;
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint(double0, double0, double0);
      assertNotNull(weightedObservedPoint0);
      assertEquals(1092.0, weightedObservedPoint0.getY(), 0.01D);
      assertEquals(1092.0, weightedObservedPoint0.getWeight(), 0.01D);
      assertEquals(1092.0, weightedObservedPoint0.getX(), 0.01D);
      
      weightedObservedPointArray0[0] = weightedObservedPoint0;
      assertNotNull(weightedObservedPointArray0[0]);
      assertEquals(1092.0, weightedObservedPointArray0[0].getX(), 0.01D);
      assertEquals(1092.0, weightedObservedPointArray0[0].getWeight(), 0.01D);
      assertEquals(1092.0, weightedObservedPointArray0[0].getY(), 0.01D);
      assertEquals(1092.0, weightedObservedPoint0.getY(), 0.01D);
      assertEquals(1092.0, weightedObservedPoint0.getWeight(), 0.01D);
      assertEquals(1092.0, weightedObservedPoint0.getX(), 0.01D);
      
      double double1 = Double.NEGATIVE_INFINITY;
      double double2 = (-832.62573);
      WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint(double0, double1, double2);
      assertNotSame(weightedObservedPoint1, weightedObservedPoint0);
      assertNotNull(weightedObservedPoint1);
      assertEquals(Double.NEGATIVE_INFINITY, weightedObservedPoint1.getX(), 0.01D);
      assertEquals(1092.0, weightedObservedPoint1.getWeight(), 0.01D);
      assertEquals((-832.62573), weightedObservedPoint1.getY(), 0.01D);
      assertFalse(double2 == double1);
      assertFalse(double2 == double0);
      assertFalse(weightedObservedPoint1.equals((Object)weightedObservedPoint0));
      assertFalse(double0 == double1);
      assertFalse(double0 == double2);
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
      
      weightedObservedPointArray0[1] = weightedObservedPoint1;
      assertNotNull(weightedObservedPointArray0[1]);
      assertEquals(Double.NEGATIVE_INFINITY, weightedObservedPoint1.getX(), 0.01D);
      assertEquals(1092.0, weightedObservedPoint1.getWeight(), 0.01D);
      assertEquals((-832.62573), weightedObservedPoint1.getY(), 0.01D);
      assertEquals(1092.0, weightedObservedPointArray0[1].getWeight(), 0.01D);
      assertEquals(Double.NEGATIVE_INFINITY, weightedObservedPointArray0[1].getX(), 0.01D);
      assertEquals((-832.62573), weightedObservedPointArray0[1].getY(), 0.01D);
      
      weightedObservedPointArray0[2] = weightedObservedPoint0;
      assertNotNull(weightedObservedPointArray0[2]);
      assertEquals(1092.0, weightedObservedPointArray0[2].getWeight(), 0.01D);
      assertEquals(1092.0, weightedObservedPointArray0[2].getX(), 0.01D);
      assertEquals(1092.0, weightedObservedPointArray0[2].getY(), 0.01D);
      assertEquals(1092.0, weightedObservedPoint0.getY(), 0.01D);
      assertEquals(1092.0, weightedObservedPoint0.getWeight(), 0.01D);
      assertEquals(1092.0, weightedObservedPoint0.getX(), 0.01D);
      
      weightedObservedPointArray0[3] = weightedObservedPointArray0[2];
      assertNotNull(weightedObservedPointArray0[3]);
      assertEquals(1092.0, weightedObservedPointArray0[3].getY(), 0.01D);
      assertEquals(1092.0, weightedObservedPointArray0[3].getX(), 0.01D);
      assertEquals(1092.0, weightedObservedPointArray0[3].getWeight(), 0.01D);
      
      weightedObservedPointArray0[4] = weightedObservedPointArray0[2];
      assertNotNull(weightedObservedPointArray0[4]);
      assertEquals(1092.0, weightedObservedPointArray0[4].getY(), 0.01D);
      assertEquals(1092.0, weightedObservedPointArray0[4].getX(), 0.01D);
      assertEquals(1092.0, weightedObservedPointArray0[4].getWeight(), 0.01D);
      
      weightedObservedPointArray0[5] = weightedObservedPointArray0[2];
      assertNotNull(weightedObservedPointArray0[5]);
      assertEquals(1092.0, weightedObservedPointArray0[5].getY(), 0.01D);
      assertEquals(1092.0, weightedObservedPointArray0[5].getX(), 0.01D);
      assertEquals(1092.0, weightedObservedPointArray0[5].getWeight(), 0.01D);
      
      WeightedObservedPoint weightedObservedPoint2 = new WeightedObservedPoint(double1, double2, double0);
      assertNotSame(weightedObservedPoint2, weightedObservedPoint0);
      assertNotSame(weightedObservedPoint2, weightedObservedPoint1);
      assertNotNull(weightedObservedPoint2);
      assertEquals(Double.NEGATIVE_INFINITY, weightedObservedPoint2.getWeight(), 0.01D);
      assertEquals((-832.62573), weightedObservedPoint2.getX(), 0.01D);
      assertEquals(1092.0, weightedObservedPoint2.getY(), 0.01D);
      assertFalse(double2 == double1);
      assertFalse(double2 == double0);
      assertFalse(double0 == double1);
      assertFalse(double0 == double2);
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
      assertFalse(weightedObservedPoint2.equals((Object)weightedObservedPoint0));
      assertFalse(weightedObservedPoint2.equals((Object)weightedObservedPoint1));
      
      weightedObservedPointArray0[6] = weightedObservedPoint2;
      assertNotNull(weightedObservedPointArray0[6]);
      assertEquals(Double.NEGATIVE_INFINITY, weightedObservedPoint2.getWeight(), 0.01D);
      assertEquals((-832.62573), weightedObservedPoint2.getX(), 0.01D);
      assertEquals(1092.0, weightedObservedPoint2.getY(), 0.01D);
      assertEquals(Double.NEGATIVE_INFINITY, weightedObservedPointArray0[6].getWeight(), 0.01D);
      assertEquals(1092.0, weightedObservedPointArray0[6].getY(), 0.01D);
      assertEquals((-832.62573), weightedObservedPointArray0[6].getX(), 0.01D);
      
      GaussianFitter.ParameterGuesser gaussianFitter_ParameterGuesser0 = new GaussianFitter.ParameterGuesser(weightedObservedPointArray0);
      assertNotNull(gaussianFitter_ParameterGuesser0);
      
      double[] doubleArray0 = gaussianFitter_ParameterGuesser0.guess();
      assertArrayEquals(new double[] {1092.0, (-832.62573), Double.POSITIVE_INFINITY}, doubleArray0, 0.01);
      assertNotNull(doubleArray0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[4];
      double double0 = 0.0;
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint(double0, double0, double0);
      assertNotNull(weightedObservedPoint0);
      assertEquals(0.0, weightedObservedPoint0.getY(), 0.01D);
      assertEquals(0.0, weightedObservedPoint0.getWeight(), 0.01D);
      assertEquals(0.0, weightedObservedPoint0.getX(), 0.01D);
      
      weightedObservedPointArray0[0] = weightedObservedPoint0;
      assertNotNull(weightedObservedPointArray0[0]);
      assertEquals(0.0, weightedObservedPoint0.getY(), 0.01D);
      assertEquals(0.0, weightedObservedPoint0.getWeight(), 0.01D);
      assertEquals(0.0, weightedObservedPoint0.getX(), 0.01D);
      assertEquals(0.0, weightedObservedPointArray0[0].getX(), 0.01D);
      assertEquals(0.0, weightedObservedPointArray0[0].getWeight(), 0.01D);
      assertEquals(0.0, weightedObservedPointArray0[0].getY(), 0.01D);
      
      weightedObservedPointArray0[1] = weightedObservedPointArray0[0];
      assertNotNull(weightedObservedPointArray0[1]);
      assertEquals(0.0, weightedObservedPointArray0[1].getY(), 0.01D);
      assertEquals(0.0, weightedObservedPointArray0[1].getX(), 0.01D);
      assertEquals(0.0, weightedObservedPointArray0[1].getWeight(), 0.01D);
      
      weightedObservedPointArray0[2] = weightedObservedPointArray0[0];
      assertNotNull(weightedObservedPointArray0[2]);
      assertEquals(0.0, weightedObservedPointArray0[2].getX(), 0.01D);
      assertEquals(0.0, weightedObservedPointArray0[2].getY(), 0.01D);
      assertEquals(0.0, weightedObservedPointArray0[2].getWeight(), 0.01D);
      
      double double1 = (-1.0);
      WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint(double1, double0, double1);
      assertNotSame(weightedObservedPoint1, weightedObservedPoint0);
      assertNotNull(weightedObservedPoint1);
      assertEquals((-1.0), weightedObservedPoint1.getY(), 0.01D);
      assertEquals((-1.0), weightedObservedPoint1.getWeight(), 0.01D);
      assertEquals(0.0, weightedObservedPoint1.getX(), 0.01D);
      assertFalse(double0 == double1);
      assertFalse(weightedObservedPoint1.equals((Object)weightedObservedPoint0));
      assertFalse(double1 == double0);
      
      weightedObservedPointArray0[3] = weightedObservedPoint1;
      assertNotNull(weightedObservedPointArray0[3]);
      assertEquals(0.0, weightedObservedPointArray0[3].getX(), 0.01D);
      assertEquals((-1.0), weightedObservedPointArray0[3].getWeight(), 0.01D);
      assertEquals((-1.0), weightedObservedPointArray0[3].getY(), 0.01D);
      assertEquals((-1.0), weightedObservedPoint1.getY(), 0.01D);
      assertEquals((-1.0), weightedObservedPoint1.getWeight(), 0.01D);
      assertEquals(0.0, weightedObservedPoint1.getX(), 0.01D);
      
      GaussianFitter.ParameterGuesser gaussianFitter_ParameterGuesser0 = new GaussianFitter.ParameterGuesser(weightedObservedPointArray0);
      assertNotNull(gaussianFitter_ParameterGuesser0);
      
      double[] doubleArray0 = gaussianFitter_ParameterGuesser0.guess();
      assertArrayEquals(new double[] {0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(doubleArray0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[3];
      double double0 = 56.521563314743744;
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint(double0, double0, double0);
      assertNotNull(weightedObservedPoint0);
      assertEquals(56.521563314743744, weightedObservedPoint0.getY(), 0.01D);
      assertEquals(56.521563314743744, weightedObservedPoint0.getX(), 0.01D);
      assertEquals(56.521563314743744, weightedObservedPoint0.getWeight(), 0.01D);
      
      weightedObservedPointArray0[0] = weightedObservedPoint0;
      assertNotNull(weightedObservedPointArray0[0]);
      assertEquals(56.521563314743744, weightedObservedPointArray0[0].getWeight(), 0.01D);
      assertEquals(56.521563314743744, weightedObservedPointArray0[0].getY(), 0.01D);
      assertEquals(56.521563314743744, weightedObservedPointArray0[0].getX(), 0.01D);
      assertEquals(56.521563314743744, weightedObservedPoint0.getY(), 0.01D);
      assertEquals(56.521563314743744, weightedObservedPoint0.getX(), 0.01D);
      assertEquals(56.521563314743744, weightedObservedPoint0.getWeight(), 0.01D);
      
      weightedObservedPointArray0[1] = weightedObservedPointArray0[0];
      assertNotNull(weightedObservedPointArray0[1]);
      assertEquals(56.521563314743744, weightedObservedPointArray0[1].getX(), 0.01D);
      assertEquals(56.521563314743744, weightedObservedPointArray0[1].getY(), 0.01D);
      assertEquals(56.521563314743744, weightedObservedPointArray0[1].getWeight(), 0.01D);
      
      weightedObservedPointArray0[2] = weightedObservedPointArray0[1];
      assertNotNull(weightedObservedPointArray0[2]);
      assertEquals(56.521563314743744, weightedObservedPointArray0[2].getY(), 0.01D);
      assertEquals(56.521563314743744, weightedObservedPointArray0[2].getX(), 0.01D);
      assertEquals(56.521563314743744, weightedObservedPointArray0[2].getWeight(), 0.01D);
      
      GaussianFitter.ParameterGuesser gaussianFitter_ParameterGuesser0 = new GaussianFitter.ParameterGuesser(weightedObservedPointArray0);
      assertNotNull(gaussianFitter_ParameterGuesser0);
      
      double[] doubleArray0 = gaussianFitter_ParameterGuesser0.guess();
      assertArrayEquals(new double[] {56.521563314743744, 56.521563314743744, 0.0}, doubleArray0, 0.01);
      assertNotNull(doubleArray0);
      
      double[] doubleArray1 = gaussianFitter_ParameterGuesser0.guess();
      assertNotSame(doubleArray1, doubleArray0);
      assertArrayEquals(new double[] {56.521563314743744, 56.521563314743744, 0.0}, doubleArray1, 0.01);
      assertNotNull(doubleArray1);
      assertFalse(doubleArray1.equals((Object)doubleArray0));
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      WeightedObservedPoint[] weightedObservedPointArray0 = null;
      GaussianFitter.ParameterGuesser gaussianFitter_ParameterGuesser0 = null;
      try {
        gaussianFitter_ParameterGuesser0 = new GaussianFitter.ParameterGuesser(weightedObservedPointArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // null is not allowed: input array
         //
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
      GaussianFitter gaussianFitter0 = new GaussianFitter(differentiableMultivariateVectorialOptimizer0);
      assertNotNull(gaussianFitter0);
      
      // Undeclared exception!
      try {
        double[] doubleArray0 = gaussianFitter0.fit();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 0 is smaller than the minimum (3)
         //
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
      GaussianFitter gaussianFitter0 = new GaussianFitter(differentiableMultivariateVectorialOptimizer0);
      assertNotNull(gaussianFitter0);
      
      double[] doubleArray0 = new double[3];
      // Undeclared exception!
      try {
        double[] doubleArray1 = gaussianFitter0.fit(doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
