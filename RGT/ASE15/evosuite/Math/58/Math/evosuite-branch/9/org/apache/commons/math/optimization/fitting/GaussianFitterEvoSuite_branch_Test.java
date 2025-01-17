/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 19:36:44 GMT 2014
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
      double double0 = 2686.8616990212645;
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[10];
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint(double0, double0, double0);
      assertEquals(2686.8616990212645, weightedObservedPoint0.getY(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPoint0.getX(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPoint0.getWeight(), 0.01D);
      assertNotNull(weightedObservedPoint0);
      
      weightedObservedPointArray0[0] = weightedObservedPoint0;
      assertEquals(2686.8616990212645, weightedObservedPoint0.getY(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPoint0.getX(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPoint0.getWeight(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPointArray0[0].getWeight(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPointArray0[0].getX(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPointArray0[0].getY(), 0.01D);
      assertNotNull(weightedObservedPointArray0[0]);
      
      double double1 = 0.0;
      WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint(double1, double0, double0);
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
      assertFalse(weightedObservedPoint1.equals((Object)weightedObservedPoint0));
      assertNotSame(weightedObservedPoint1, weightedObservedPoint0);
      assertEquals(0.0, weightedObservedPoint1.getWeight(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPoint1.getY(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPoint1.getX(), 0.01D);
      assertNotNull(weightedObservedPoint1);
      
      weightedObservedPointArray0[1] = weightedObservedPoint1;
      assertEquals(0.0, weightedObservedPointArray0[1].getWeight(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPointArray0[1].getX(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPointArray0[1].getY(), 0.01D);
      assertEquals(0.0, weightedObservedPoint1.getWeight(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPoint1.getY(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPoint1.getX(), 0.01D);
      assertNotNull(weightedObservedPointArray0[1]);
      
      weightedObservedPointArray0[3] = weightedObservedPointArray0[0];
      assertEquals(2686.8616990212645, weightedObservedPointArray0[3].getY(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPointArray0[3].getX(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPointArray0[3].getWeight(), 0.01D);
      assertNotNull(weightedObservedPointArray0[3]);
      
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
      double double0 = 2686.8616990212645;
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[10];
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint(double0, double0, double0);
      assertEquals(2686.8616990212645, weightedObservedPoint0.getX(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPoint0.getY(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPoint0.getWeight(), 0.01D);
      assertNotNull(weightedObservedPoint0);
      
      weightedObservedPointArray0[0] = weightedObservedPoint0;
      assertEquals(2686.8616990212645, weightedObservedPointArray0[0].getX(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPointArray0[0].getWeight(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPointArray0[0].getY(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPoint0.getX(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPoint0.getY(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPoint0.getWeight(), 0.01D);
      assertNotNull(weightedObservedPointArray0[0]);
      
      double double1 = 0.0;
      WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint(double0, double1, double0);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      assertFalse(weightedObservedPoint1.equals((Object)weightedObservedPoint0));
      assertNotSame(weightedObservedPoint1, weightedObservedPoint0);
      assertEquals(2686.8616990212645, weightedObservedPoint1.getY(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPoint1.getWeight(), 0.01D);
      assertEquals(0.0, weightedObservedPoint1.getX(), 0.01D);
      assertNotNull(weightedObservedPoint1);
      
      weightedObservedPointArray0[2] = weightedObservedPoint1;
      assertEquals(0.0, weightedObservedPointArray0[2].getX(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPointArray0[2].getY(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPointArray0[2].getWeight(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPoint1.getY(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPoint1.getWeight(), 0.01D);
      assertEquals(0.0, weightedObservedPoint1.getX(), 0.01D);
      assertNotNull(weightedObservedPointArray0[2]);
      
      weightedObservedPointArray0[3] = weightedObservedPointArray0[0];
      assertEquals(2686.8616990212645, weightedObservedPointArray0[3].getWeight(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPointArray0[3].getX(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPointArray0[3].getY(), 0.01D);
      assertNotNull(weightedObservedPointArray0[3]);
      
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
  public void test2()  throws Throwable  {
      double double0 = 2686.8616990212645;
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[10];
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint(double0, double0, double0);
      assertEquals(2686.8616990212645, weightedObservedPoint0.getWeight(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPoint0.getX(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPoint0.getY(), 0.01D);
      assertNotNull(weightedObservedPoint0);
      
      weightedObservedPointArray0[0] = weightedObservedPoint0;
      assertEquals(2686.8616990212645, weightedObservedPointArray0[0].getX(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPointArray0[0].getY(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPointArray0[0].getWeight(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPoint0.getWeight(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPoint0.getX(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPoint0.getY(), 0.01D);
      assertNotNull(weightedObservedPointArray0[0]);
      
      double double1 = 0.0;
      weightedObservedPointArray0[1] = weightedObservedPointArray0[0];
      assertEquals(2686.8616990212645, weightedObservedPointArray0[1].getX(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPointArray0[1].getY(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPointArray0[1].getWeight(), 0.01D);
      assertNotNull(weightedObservedPointArray0[1]);
      
      WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint(double0, double1, double0);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      assertFalse(weightedObservedPoint1.equals((Object)weightedObservedPoint0));
      assertNotSame(weightedObservedPoint1, weightedObservedPoint0);
      assertEquals(2686.8616990212645, weightedObservedPoint1.getWeight(), 0.01D);
      assertEquals(0.0, weightedObservedPoint1.getX(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPoint1.getY(), 0.01D);
      assertNotNull(weightedObservedPoint1);
      
      weightedObservedPointArray0[2] = weightedObservedPoint1;
      assertEquals(2686.8616990212645, weightedObservedPointArray0[2].getY(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPointArray0[2].getWeight(), 0.01D);
      assertEquals(0.0, weightedObservedPointArray0[2].getX(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPoint1.getWeight(), 0.01D);
      assertEquals(0.0, weightedObservedPoint1.getX(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPoint1.getY(), 0.01D);
      assertNotNull(weightedObservedPointArray0[2]);
      
      weightedObservedPointArray0[3] = weightedObservedPointArray0[0];
      assertEquals(2686.8616990212645, weightedObservedPointArray0[3].getY(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPointArray0[3].getWeight(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPointArray0[3].getX(), 0.01D);
      assertNotNull(weightedObservedPointArray0[3]);
      
      weightedObservedPointArray0[4] = weightedObservedPointArray0[2];
      assertEquals(2686.8616990212645, weightedObservedPointArray0[4].getY(), 0.01D);
      assertEquals(0.0, weightedObservedPointArray0[4].getX(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPointArray0[4].getWeight(), 0.01D);
      assertNotNull(weightedObservedPointArray0[4]);
      
      double double2 = weightedObservedPoint0.getY();
      assertFalse(double2 == double1);
      assertTrue(double2 == double0);
      assertFalse(double0 == double1);
      assertTrue(double0 == double2);
      assertFalse(weightedObservedPoint0.equals((Object)weightedObservedPoint1));
      assertEquals(2686.8616990212645, double2, 0.01D);
      assertNotSame(weightedObservedPoint0, weightedObservedPoint1);
      assertEquals(2686.8616990212645, weightedObservedPoint0.getWeight(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPoint0.getX(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPoint0.getY(), 0.01D);
      
      weightedObservedPointArray0[5] = weightedObservedPoint0;
      assertEquals(2686.8616990212645, weightedObservedPointArray0[5].getWeight(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPointArray0[5].getX(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPointArray0[5].getY(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPoint0.getWeight(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPoint0.getX(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPoint0.getY(), 0.01D);
      assertNotNull(weightedObservedPointArray0[5]);
      
      WeightedObservedPoint weightedObservedPoint2 = new WeightedObservedPoint(double2, double1, double1);
      assertFalse(double2 == double1);
      assertTrue(double2 == double0);
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      assertTrue(double0 == double2);
      assertFalse(weightedObservedPoint0.equals((Object)weightedObservedPoint2));
      assertFalse(weightedObservedPoint0.equals((Object)weightedObservedPoint1));
      assertFalse(weightedObservedPoint2.equals((Object)weightedObservedPoint1));
      assertFalse(weightedObservedPoint2.equals((Object)weightedObservedPoint0));
      assertNotSame(weightedObservedPoint0, weightedObservedPoint2);
      assertNotSame(weightedObservedPoint0, weightedObservedPoint1);
      assertNotSame(weightedObservedPoint2, weightedObservedPoint1);
      assertNotSame(weightedObservedPoint2, weightedObservedPoint0);
      assertEquals(2686.8616990212645, weightedObservedPoint0.getWeight(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPoint0.getX(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPoint0.getY(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPoint2.getWeight(), 0.01D);
      assertEquals(0.0, weightedObservedPoint2.getX(), 0.01D);
      assertEquals(0.0, weightedObservedPoint2.getY(), 0.01D);
      assertNotNull(weightedObservedPoint2);
      
      weightedObservedPointArray0[6] = weightedObservedPoint2;
      assertEquals(2686.8616990212645, weightedObservedPointArray0[6].getWeight(), 0.01D);
      assertEquals(0.0, weightedObservedPointArray0[6].getX(), 0.01D);
      assertEquals(0.0, weightedObservedPointArray0[6].getY(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPoint0.getWeight(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPoint0.getX(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPoint0.getY(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPoint2.getWeight(), 0.01D);
      assertEquals(0.0, weightedObservedPoint2.getX(), 0.01D);
      assertEquals(0.0, weightedObservedPoint2.getY(), 0.01D);
      assertNotNull(weightedObservedPointArray0[6]);
      
      weightedObservedPointArray0[7] = weightedObservedPointArray0[0];
      assertEquals(2686.8616990212645, weightedObservedPointArray0[7].getWeight(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPointArray0[7].getY(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPointArray0[7].getX(), 0.01D);
      assertNotNull(weightedObservedPointArray0[7]);
      
      weightedObservedPointArray0[8] = weightedObservedPoint0;
      assertEquals(2686.8616990212645, weightedObservedPointArray0[8].getWeight(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPointArray0[8].getX(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPointArray0[8].getY(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPoint0.getWeight(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPoint0.getX(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPoint0.getY(), 0.01D);
      assertNotNull(weightedObservedPointArray0[8]);
      
      weightedObservedPointArray0[9] = weightedObservedPointArray0[2];
      assertEquals(2686.8616990212645, weightedObservedPointArray0[9].getY(), 0.01D);
      assertEquals(0.0, weightedObservedPointArray0[9].getX(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPointArray0[9].getWeight(), 0.01D);
      assertNotNull(weightedObservedPointArray0[9]);
      
      GaussianFitter.ParameterGuesser gaussianFitter_ParameterGuesser0 = new GaussianFitter.ParameterGuesser(weightedObservedPointArray0);
      assertNotNull(gaussianFitter_ParameterGuesser0);
      
      double[] doubleArray0 = gaussianFitter_ParameterGuesser0.guess();
      assertArrayEquals(new double[] {2686.8616990212645, 0.0, 1141.005107668833}, doubleArray0, 0.01);
      assertNotNull(doubleArray0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      double double0 = 2686.8616990212645;
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[10];
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint(double0, double0, double0);
      assertEquals(2686.8616990212645, weightedObservedPoint0.getWeight(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPoint0.getX(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPoint0.getY(), 0.01D);
      assertNotNull(weightedObservedPoint0);
      
      weightedObservedPointArray0[0] = weightedObservedPoint0;
      assertEquals(2686.8616990212645, weightedObservedPoint0.getWeight(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPoint0.getX(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPoint0.getY(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPointArray0[0].getX(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPointArray0[0].getWeight(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPointArray0[0].getY(), 0.01D);
      assertNotNull(weightedObservedPointArray0[0]);
      
      double double1 = 0.0;
      weightedObservedPointArray0[1] = weightedObservedPointArray0[0];
      assertEquals(2686.8616990212645, weightedObservedPointArray0[1].getX(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPointArray0[1].getY(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPointArray0[1].getWeight(), 0.01D);
      assertNotNull(weightedObservedPointArray0[1]);
      
      weightedObservedPointArray0[2] = weightedObservedPointArray0[1];
      assertEquals(2686.8616990212645, weightedObservedPointArray0[2].getX(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPointArray0[2].getY(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPointArray0[2].getWeight(), 0.01D);
      assertNotNull(weightedObservedPointArray0[2]);
      
      weightedObservedPointArray0[3] = weightedObservedPointArray0[0];
      assertEquals(2686.8616990212645, weightedObservedPointArray0[3].getWeight(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPointArray0[3].getX(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPointArray0[3].getY(), 0.01D);
      assertNotNull(weightedObservedPointArray0[3]);
      
      weightedObservedPointArray0[4] = weightedObservedPointArray0[2];
      assertEquals(2686.8616990212645, weightedObservedPointArray0[4].getY(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPointArray0[4].getWeight(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPointArray0[4].getX(), 0.01D);
      assertNotNull(weightedObservedPointArray0[4]);
      
      double double2 = weightedObservedPoint0.getY();
      assertTrue(double2 == double0);
      assertFalse(double2 == double1);
      assertTrue(double0 == double2);
      assertFalse(double0 == double1);
      assertEquals(2686.8616990212645, double2, 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPoint0.getWeight(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPoint0.getX(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPoint0.getY(), 0.01D);
      
      weightedObservedPointArray0[5] = weightedObservedPoint0;
      assertEquals(2686.8616990212645, weightedObservedPointArray0[5].getWeight(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPointArray0[5].getX(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPointArray0[5].getY(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPoint0.getWeight(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPoint0.getX(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPoint0.getY(), 0.01D);
      assertNotNull(weightedObservedPointArray0[5]);
      
      WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint(double2, double1, double1);
      assertTrue(double2 == double0);
      assertFalse(double2 == double1);
      assertFalse(weightedObservedPoint0.equals((Object)weightedObservedPoint1));
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
      assertFalse(weightedObservedPoint1.equals((Object)weightedObservedPoint0));
      assertTrue(double0 == double2);
      assertFalse(double0 == double1);
      assertNotSame(weightedObservedPoint0, weightedObservedPoint1);
      assertNotSame(weightedObservedPoint1, weightedObservedPoint0);
      assertEquals(2686.8616990212645, weightedObservedPoint0.getWeight(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPoint0.getX(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPoint0.getY(), 0.01D);
      assertEquals(0.0, weightedObservedPoint1.getY(), 0.01D);
      assertEquals(0.0, weightedObservedPoint1.getX(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPoint1.getWeight(), 0.01D);
      assertNotNull(weightedObservedPoint1);
      
      weightedObservedPointArray0[6] = weightedObservedPoint1;
      assertEquals(2686.8616990212645, weightedObservedPoint0.getWeight(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPoint0.getX(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPoint0.getY(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPointArray0[6].getWeight(), 0.01D);
      assertEquals(0.0, weightedObservedPointArray0[6].getX(), 0.01D);
      assertEquals(0.0, weightedObservedPointArray0[6].getY(), 0.01D);
      assertEquals(0.0, weightedObservedPoint1.getY(), 0.01D);
      assertEquals(0.0, weightedObservedPoint1.getX(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPoint1.getWeight(), 0.01D);
      assertNotNull(weightedObservedPointArray0[6]);
      
      weightedObservedPointArray0[7] = weightedObservedPointArray0[0];
      assertEquals(2686.8616990212645, weightedObservedPointArray0[7].getY(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPointArray0[7].getWeight(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPointArray0[7].getX(), 0.01D);
      assertNotNull(weightedObservedPointArray0[7]);
      
      weightedObservedPointArray0[8] = weightedObservedPoint0;
      assertEquals(2686.8616990212645, weightedObservedPoint0.getWeight(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPoint0.getX(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPoint0.getY(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPointArray0[8].getY(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPointArray0[8].getX(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPointArray0[8].getWeight(), 0.01D);
      assertNotNull(weightedObservedPointArray0[8]);
      
      weightedObservedPointArray0[9] = weightedObservedPointArray0[2];
      assertEquals(2686.8616990212645, weightedObservedPointArray0[9].getX(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPointArray0[9].getWeight(), 0.01D);
      assertEquals(2686.8616990212645, weightedObservedPointArray0[9].getY(), 0.01D);
      assertNotNull(weightedObservedPointArray0[9]);
      
      GaussianFitter.ParameterGuesser gaussianFitter_ParameterGuesser0 = new GaussianFitter.ParameterGuesser(weightedObservedPointArray0);
      assertNotNull(gaussianFitter_ParameterGuesser0);
      
      double[] doubleArray0 = gaussianFitter_ParameterGuesser0.guess();
      assertArrayEquals(new double[] {2686.8616990212645, 2686.8616990212645, 0.0}, doubleArray0, 0.01);
      assertNotNull(doubleArray0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      double double0 = 1049.62;
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[3];
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint(double0, double0, double0);
      assertEquals(1049.62, weightedObservedPoint0.getX(), 0.01D);
      assertEquals(1049.62, weightedObservedPoint0.getY(), 0.01D);
      assertEquals(1049.62, weightedObservedPoint0.getWeight(), 0.01D);
      assertNotNull(weightedObservedPoint0);
      
      weightedObservedPointArray0[0] = weightedObservedPoint0;
      assertEquals(1049.62, weightedObservedPoint0.getX(), 0.01D);
      assertEquals(1049.62, weightedObservedPoint0.getY(), 0.01D);
      assertEquals(1049.62, weightedObservedPoint0.getWeight(), 0.01D);
      assertEquals(1049.62, weightedObservedPointArray0[0].getWeight(), 0.01D);
      assertEquals(1049.62, weightedObservedPointArray0[0].getY(), 0.01D);
      assertEquals(1049.62, weightedObservedPointArray0[0].getX(), 0.01D);
      assertNotNull(weightedObservedPointArray0[0]);
      
      double double1 = Double.POSITIVE_INFINITY;
      WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint(double0, double0, double1);
      assertFalse(double0 == double1);
      assertFalse(weightedObservedPoint1.equals((Object)weightedObservedPoint0));
      assertFalse(double1 == double0);
      assertNotSame(weightedObservedPoint1, weightedObservedPoint0);
      assertEquals(1049.62, weightedObservedPoint1.getWeight(), 0.01D);
      assertEquals(Double.POSITIVE_INFINITY, weightedObservedPoint1.getY(), 0.01D);
      assertEquals(1049.62, weightedObservedPoint1.getX(), 0.01D);
      assertNotNull(weightedObservedPoint1);
      
      weightedObservedPointArray0[1] = weightedObservedPoint0;
      assertEquals(1049.62, weightedObservedPointArray0[1].getWeight(), 0.01D);
      assertEquals(1049.62, weightedObservedPointArray0[1].getY(), 0.01D);
      assertEquals(1049.62, weightedObservedPointArray0[1].getX(), 0.01D);
      assertEquals(1049.62, weightedObservedPoint0.getX(), 0.01D);
      assertEquals(1049.62, weightedObservedPoint0.getY(), 0.01D);
      assertEquals(1049.62, weightedObservedPoint0.getWeight(), 0.01D);
      assertNotNull(weightedObservedPointArray0[1]);
      
      weightedObservedPointArray0[2] = weightedObservedPoint1;
      assertEquals(1049.62, weightedObservedPoint1.getWeight(), 0.01D);
      assertEquals(Double.POSITIVE_INFINITY, weightedObservedPoint1.getY(), 0.01D);
      assertEquals(1049.62, weightedObservedPoint1.getX(), 0.01D);
      assertEquals(1049.62, weightedObservedPointArray0[2].getWeight(), 0.01D);
      assertEquals(1049.62, weightedObservedPointArray0[2].getX(), 0.01D);
      assertEquals(Double.POSITIVE_INFINITY, weightedObservedPointArray0[2].getY(), 0.01D);
      assertNotNull(weightedObservedPointArray0[2]);
      
      GaussianFitter.ParameterGuesser gaussianFitter_ParameterGuesser0 = new GaussianFitter.ParameterGuesser(weightedObservedPointArray0);
      assertNotNull(gaussianFitter_ParameterGuesser0);
      
      double[] doubleArray0 = gaussianFitter_ParameterGuesser0.guess();
      assertArrayEquals(new double[] {Double.POSITIVE_INFINITY, 1049.62, 0.0}, doubleArray0, 0.01);
      assertNotNull(doubleArray0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      int int0 = (-59);
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[4];
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint((double) int0, (double) int0, (double) int0);
      assertEquals((-59.0), weightedObservedPoint0.getX(), 0.01D);
      assertEquals((-59.0), weightedObservedPoint0.getY(), 0.01D);
      assertEquals((-59.0), weightedObservedPoint0.getWeight(), 0.01D);
      assertNotNull(weightedObservedPoint0);
      
      weightedObservedPointArray0[0] = weightedObservedPoint0;
      assertEquals((-59.0), weightedObservedPointArray0[0].getWeight(), 0.01D);
      assertEquals((-59.0), weightedObservedPointArray0[0].getY(), 0.01D);
      assertEquals((-59.0), weightedObservedPointArray0[0].getX(), 0.01D);
      assertEquals((-59.0), weightedObservedPoint0.getX(), 0.01D);
      assertEquals((-59.0), weightedObservedPoint0.getY(), 0.01D);
      assertEquals((-59.0), weightedObservedPoint0.getWeight(), 0.01D);
      assertNotNull(weightedObservedPointArray0[0]);
      
      weightedObservedPointArray0[1] = weightedObservedPointArray0[0];
      assertEquals((-59.0), weightedObservedPointArray0[1].getY(), 0.01D);
      assertEquals((-59.0), weightedObservedPointArray0[1].getWeight(), 0.01D);
      assertEquals((-59.0), weightedObservedPointArray0[1].getX(), 0.01D);
      assertNotNull(weightedObservedPointArray0[1]);
      
      weightedObservedPointArray0[2] = weightedObservedPointArray0[0];
      assertEquals((-59.0), weightedObservedPointArray0[2].getWeight(), 0.01D);
      assertEquals((-59.0), weightedObservedPointArray0[2].getX(), 0.01D);
      assertEquals((-59.0), weightedObservedPointArray0[2].getY(), 0.01D);
      assertNotNull(weightedObservedPointArray0[2]);
      
      weightedObservedPointArray0[3] = weightedObservedPoint0;
      assertEquals((-59.0), weightedObservedPointArray0[3].getX(), 0.01D);
      assertEquals((-59.0), weightedObservedPointArray0[3].getY(), 0.01D);
      assertEquals((-59.0), weightedObservedPointArray0[3].getWeight(), 0.01D);
      assertEquals((-59.0), weightedObservedPoint0.getX(), 0.01D);
      assertEquals((-59.0), weightedObservedPoint0.getY(), 0.01D);
      assertEquals((-59.0), weightedObservedPoint0.getWeight(), 0.01D);
      assertNotNull(weightedObservedPointArray0[3]);
      
      GaussianFitter.ParameterGuesser gaussianFitter_ParameterGuesser0 = new GaussianFitter.ParameterGuesser(weightedObservedPointArray0);
      assertNotNull(gaussianFitter_ParameterGuesser0);
      
      double[] doubleArray0 = gaussianFitter_ParameterGuesser0.guess();
      assertArrayEquals(new double[] {(-59.0), (-59.0), 0.0}, doubleArray0, 0.01);
      assertNotNull(doubleArray0);
      
      double[] doubleArray1 = gaussianFitter_ParameterGuesser0.guess();
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      assertArrayEquals(new double[] {(-59.0), (-59.0), 0.0}, doubleArray1, 0.01);
      assertNotSame(doubleArray1, doubleArray0);
      assertNotNull(doubleArray1);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
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
  public void test7()  throws Throwable  {
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
  public void test8()  throws Throwable  {
      DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
      GaussianFitter gaussianFitter0 = new GaussianFitter(differentiableMultivariateVectorialOptimizer0);
      assertNotNull(gaussianFitter0);
      
      double[] doubleArray0 = new double[2];
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
