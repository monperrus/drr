/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 18:23:58 GMT 2014
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
      double double0 = 609.2448295658542;
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[6];
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint(double0, double0, double0);
      assertNotNull(weightedObservedPoint0);
      assertEquals(609.2448295658542, weightedObservedPoint0.getWeight(), 0.01D);
      assertEquals(609.2448295658542, weightedObservedPoint0.getY(), 0.01D);
      assertEquals(609.2448295658542, weightedObservedPoint0.getX(), 0.01D);
      
      weightedObservedPointArray0[0] = weightedObservedPoint0;
      assertNotNull(weightedObservedPointArray0[0]);
      assertEquals(609.2448295658542, weightedObservedPoint0.getWeight(), 0.01D);
      assertEquals(609.2448295658542, weightedObservedPoint0.getY(), 0.01D);
      assertEquals(609.2448295658542, weightedObservedPoint0.getX(), 0.01D);
      assertEquals(609.2448295658542, weightedObservedPointArray0[0].getY(), 0.01D);
      assertEquals(609.2448295658542, weightedObservedPointArray0[0].getX(), 0.01D);
      assertEquals(609.2448295658542, weightedObservedPointArray0[0].getWeight(), 0.01D);
      
      double double1 = 0.0;
      WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint(double1, double0, double0);
      assertNotSame(weightedObservedPoint1, weightedObservedPoint0);
      assertFalse(double0 == double1);
      assertFalse(weightedObservedPoint1.equals((Object)weightedObservedPoint0));
      assertFalse(double1 == double0);
      assertNotNull(weightedObservedPoint1);
      assertEquals(0.0, weightedObservedPoint1.getWeight(), 0.01D);
      assertEquals(609.2448295658542, weightedObservedPoint1.getX(), 0.01D);
      assertEquals(609.2448295658542, weightedObservedPoint1.getY(), 0.01D);
      
      weightedObservedPointArray0[3] = weightedObservedPoint1;
      assertNotNull(weightedObservedPointArray0[3]);
      assertEquals(0.0, weightedObservedPointArray0[3].getWeight(), 0.01D);
      assertEquals(609.2448295658542, weightedObservedPointArray0[3].getX(), 0.01D);
      assertEquals(609.2448295658542, weightedObservedPointArray0[3].getY(), 0.01D);
      assertEquals(0.0, weightedObservedPoint1.getWeight(), 0.01D);
      assertEquals(609.2448295658542, weightedObservedPoint1.getX(), 0.01D);
      assertEquals(609.2448295658542, weightedObservedPoint1.getY(), 0.01D);
      
      weightedObservedPointArray0[4] = weightedObservedPointArray0[0];
      assertNotNull(weightedObservedPointArray0[4]);
      assertEquals(609.2448295658542, weightedObservedPointArray0[4].getWeight(), 0.01D);
      assertEquals(609.2448295658542, weightedObservedPointArray0[4].getX(), 0.01D);
      assertEquals(609.2448295658542, weightedObservedPointArray0[4].getY(), 0.01D);
      
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
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[11];
      double double0 = 1475.88776545527;
      double double1 = 4708.9810947812875;
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint(double1, double1, double0);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      assertNotNull(weightedObservedPoint0);
      assertEquals(4708.9810947812875, weightedObservedPoint0.getWeight(), 0.01D);
      assertEquals(1475.88776545527, weightedObservedPoint0.getY(), 0.01D);
      assertEquals(4708.9810947812875, weightedObservedPoint0.getX(), 0.01D);
      
      weightedObservedPointArray0[2] = weightedObservedPoint0;
      assertNotNull(weightedObservedPointArray0[2]);
      assertEquals(4708.9810947812875, weightedObservedPoint0.getWeight(), 0.01D);
      assertEquals(1475.88776545527, weightedObservedPoint0.getY(), 0.01D);
      assertEquals(4708.9810947812875, weightedObservedPoint0.getX(), 0.01D);
      assertEquals(4708.9810947812875, weightedObservedPointArray0[2].getX(), 0.01D);
      assertEquals(1475.88776545527, weightedObservedPointArray0[2].getY(), 0.01D);
      assertEquals(4708.9810947812875, weightedObservedPointArray0[2].getWeight(), 0.01D);
      
      WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint(double1, double1, double1);
      assertNotSame(weightedObservedPoint1, weightedObservedPoint0);
      assertFalse(double1 == double0);
      assertFalse(weightedObservedPoint1.equals((Object)weightedObservedPoint0));
      assertNotNull(weightedObservedPoint1);
      assertEquals(4708.9810947812875, weightedObservedPoint1.getWeight(), 0.01D);
      assertEquals(4708.9810947812875, weightedObservedPoint1.getY(), 0.01D);
      assertEquals(4708.9810947812875, weightedObservedPoint1.getX(), 0.01D);
      
      weightedObservedPointArray0[3] = weightedObservedPoint1;
      assertNotNull(weightedObservedPointArray0[3]);
      assertEquals(4708.9810947812875, weightedObservedPointArray0[3].getY(), 0.01D);
      assertEquals(4708.9810947812875, weightedObservedPointArray0[3].getWeight(), 0.01D);
      assertEquals(4708.9810947812875, weightedObservedPointArray0[3].getX(), 0.01D);
      assertEquals(4708.9810947812875, weightedObservedPoint1.getWeight(), 0.01D);
      assertEquals(4708.9810947812875, weightedObservedPoint1.getY(), 0.01D);
      assertEquals(4708.9810947812875, weightedObservedPoint1.getX(), 0.01D);
      
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
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[3];
      double double0 = 2785.151718;
      double double1 = 0.99;
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint(double0, double0, double1);
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
      assertNotNull(weightedObservedPoint0);
      assertEquals(2785.151718, weightedObservedPoint0.getWeight(), 0.01D);
      assertEquals(0.99, weightedObservedPoint0.getY(), 0.01D);
      assertEquals(2785.151718, weightedObservedPoint0.getX(), 0.01D);
      
      weightedObservedPointArray0[0] = weightedObservedPoint0;
      assertNotNull(weightedObservedPointArray0[0]);
      assertEquals(2785.151718, weightedObservedPointArray0[0].getX(), 0.01D);
      assertEquals(2785.151718, weightedObservedPointArray0[0].getWeight(), 0.01D);
      assertEquals(0.99, weightedObservedPointArray0[0].getY(), 0.01D);
      assertEquals(2785.151718, weightedObservedPoint0.getWeight(), 0.01D);
      assertEquals(0.99, weightedObservedPoint0.getY(), 0.01D);
      assertEquals(2785.151718, weightedObservedPoint0.getX(), 0.01D);
      
      weightedObservedPointArray0[1] = weightedObservedPointArray0[0];
      assertNotNull(weightedObservedPointArray0[1]);
      assertEquals(2785.151718, weightedObservedPointArray0[1].getX(), 0.01D);
      assertEquals(2785.151718, weightedObservedPointArray0[1].getWeight(), 0.01D);
      assertEquals(0.99, weightedObservedPointArray0[1].getY(), 0.01D);
      
      double double2 = (-2630.4803966799705);
      WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint(double1, double2, double2);
      assertNotSame(weightedObservedPoint1, weightedObservedPoint0);
      assertFalse(double2 == double1);
      assertFalse(double2 == double0);
      assertFalse(weightedObservedPoint1.equals((Object)weightedObservedPoint0));
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
      assertNotNull(weightedObservedPoint1);
      assertEquals((-2630.4803966799705), weightedObservedPoint1.getX(), 0.01D);
      assertEquals(0.99, weightedObservedPoint1.getWeight(), 0.01D);
      assertEquals((-2630.4803966799705), weightedObservedPoint1.getY(), 0.01D);
      
      weightedObservedPointArray0[2] = weightedObservedPoint1;
      assertNotNull(weightedObservedPointArray0[2]);
      assertEquals((-2630.4803966799705), weightedObservedPoint1.getX(), 0.01D);
      assertEquals(0.99, weightedObservedPoint1.getWeight(), 0.01D);
      assertEquals((-2630.4803966799705), weightedObservedPoint1.getY(), 0.01D);
      assertEquals(0.99, weightedObservedPointArray0[2].getWeight(), 0.01D);
      assertEquals((-2630.4803966799705), weightedObservedPointArray0[2].getX(), 0.01D);
      assertEquals((-2630.4803966799705), weightedObservedPointArray0[2].getY(), 0.01D);
      
      GaussianFitter.ParameterGuesser gaussianFitter_ParameterGuesser0 = new GaussianFitter.ParameterGuesser(weightedObservedPointArray0);
      assertNotNull(gaussianFitter_ParameterGuesser0);
      
      double[] doubleArray0 = gaussianFitter_ParameterGuesser0.guess();
      assertArrayEquals(new double[] {0.99, 2785.151718, 2299.807208668802}, doubleArray0, 0.01);
      assertNotNull(doubleArray0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      double double0 = 609.2448295658542;
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[6];
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint(double0, double0, double0);
      assertNotNull(weightedObservedPoint0);
      assertEquals(609.2448295658542, weightedObservedPoint0.getY(), 0.01D);
      assertEquals(609.2448295658542, weightedObservedPoint0.getX(), 0.01D);
      assertEquals(609.2448295658542, weightedObservedPoint0.getWeight(), 0.01D);
      
      weightedObservedPointArray0[0] = weightedObservedPoint0;
      assertNotNull(weightedObservedPointArray0[0]);
      assertEquals(609.2448295658542, weightedObservedPoint0.getY(), 0.01D);
      assertEquals(609.2448295658542, weightedObservedPoint0.getX(), 0.01D);
      assertEquals(609.2448295658542, weightedObservedPoint0.getWeight(), 0.01D);
      assertEquals(609.2448295658542, weightedObservedPointArray0[0].getWeight(), 0.01D);
      assertEquals(609.2448295658542, weightedObservedPointArray0[0].getY(), 0.01D);
      assertEquals(609.2448295658542, weightedObservedPointArray0[0].getX(), 0.01D);
      
      double double1 = 0.0;
      WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint(double0, double1, double0);
      assertNotSame(weightedObservedPoint1, weightedObservedPoint0);
      assertFalse(double0 == double1);
      assertFalse(weightedObservedPoint1.equals((Object)weightedObservedPoint0));
      assertFalse(double1 == double0);
      assertNotNull(weightedObservedPoint1);
      assertEquals(609.2448295658542, weightedObservedPoint1.getY(), 0.01D);
      assertEquals(0.0, weightedObservedPoint1.getX(), 0.01D);
      assertEquals(609.2448295658542, weightedObservedPoint1.getWeight(), 0.01D);
      
      weightedObservedPointArray0[1] = weightedObservedPoint1;
      assertNotNull(weightedObservedPointArray0[1]);
      assertEquals(609.2448295658542, weightedObservedPoint1.getY(), 0.01D);
      assertEquals(0.0, weightedObservedPoint1.getX(), 0.01D);
      assertEquals(609.2448295658542, weightedObservedPoint1.getWeight(), 0.01D);
      assertEquals(609.2448295658542, weightedObservedPointArray0[1].getWeight(), 0.01D);
      assertEquals(609.2448295658542, weightedObservedPointArray0[1].getY(), 0.01D);
      assertEquals(0.0, weightedObservedPointArray0[1].getX(), 0.01D);
      
      weightedObservedPointArray0[2] = weightedObservedPointArray0[1];
      assertNotNull(weightedObservedPointArray0[2]);
      assertEquals(609.2448295658542, weightedObservedPointArray0[2].getY(), 0.01D);
      assertEquals(0.0, weightedObservedPointArray0[2].getX(), 0.01D);
      assertEquals(609.2448295658542, weightedObservedPointArray0[2].getWeight(), 0.01D);
      
      weightedObservedPointArray0[3] = weightedObservedPointArray0[1];
      assertNotNull(weightedObservedPointArray0[3]);
      assertEquals(0.0, weightedObservedPointArray0[3].getX(), 0.01D);
      assertEquals(609.2448295658542, weightedObservedPointArray0[3].getWeight(), 0.01D);
      assertEquals(609.2448295658542, weightedObservedPointArray0[3].getY(), 0.01D);
      
      weightedObservedPointArray0[4] = weightedObservedPointArray0[0];
      assertNotNull(weightedObservedPointArray0[4]);
      assertEquals(609.2448295658542, weightedObservedPointArray0[4].getWeight(), 0.01D);
      assertEquals(609.2448295658542, weightedObservedPointArray0[4].getX(), 0.01D);
      assertEquals(609.2448295658542, weightedObservedPointArray0[4].getY(), 0.01D);
      
      WeightedObservedPoint weightedObservedPoint2 = new WeightedObservedPoint(double0, double1, double1);
      assertNotSame(weightedObservedPoint2, weightedObservedPoint0);
      assertNotSame(weightedObservedPoint2, weightedObservedPoint1);
      assertFalse(double0 == double1);
      assertFalse(weightedObservedPoint2.equals((Object)weightedObservedPoint0));
      assertFalse(weightedObservedPoint2.equals((Object)weightedObservedPoint1));
      assertFalse(double1 == double0);
      assertNotNull(weightedObservedPoint2);
      assertEquals(609.2448295658542, weightedObservedPoint2.getWeight(), 0.01D);
      assertEquals(0.0, weightedObservedPoint2.getY(), 0.01D);
      assertEquals(0.0, weightedObservedPoint2.getX(), 0.01D);
      
      weightedObservedPointArray0[5] = weightedObservedPoint2;
      assertNotNull(weightedObservedPointArray0[5]);
      assertEquals(609.2448295658542, weightedObservedPoint2.getWeight(), 0.01D);
      assertEquals(0.0, weightedObservedPoint2.getY(), 0.01D);
      assertEquals(0.0, weightedObservedPoint2.getX(), 0.01D);
      assertEquals(609.2448295658542, weightedObservedPointArray0[5].getWeight(), 0.01D);
      assertEquals(0.0, weightedObservedPointArray0[5].getX(), 0.01D);
      assertEquals(0.0, weightedObservedPointArray0[5].getY(), 0.01D);
      
      GaussianFitter.ParameterGuesser gaussianFitter_ParameterGuesser0 = new GaussianFitter.ParameterGuesser(weightedObservedPointArray0);
      assertNotNull(gaussianFitter_ParameterGuesser0);
      
      double[] doubleArray0 = gaussianFitter_ParameterGuesser0.guess();
      assertArrayEquals(new double[] {609.2448295658542, 0.0, 258.7224577315193}, doubleArray0, 0.01);
      assertNotNull(doubleArray0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[3];
      double double0 = 2785.151718;
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint(double0, double0, double0);
      assertNotNull(weightedObservedPoint0);
      assertEquals(2785.151718, weightedObservedPoint0.getY(), 0.01D);
      assertEquals(2785.151718, weightedObservedPoint0.getWeight(), 0.01D);
      assertEquals(2785.151718, weightedObservedPoint0.getX(), 0.01D);
      
      weightedObservedPointArray0[0] = weightedObservedPoint0;
      assertNotNull(weightedObservedPointArray0[0]);
      assertEquals(2785.151718, weightedObservedPointArray0[0].getY(), 0.01D);
      assertEquals(2785.151718, weightedObservedPointArray0[0].getX(), 0.01D);
      assertEquals(2785.151718, weightedObservedPointArray0[0].getWeight(), 0.01D);
      assertEquals(2785.151718, weightedObservedPoint0.getY(), 0.01D);
      assertEquals(2785.151718, weightedObservedPoint0.getWeight(), 0.01D);
      assertEquals(2785.151718, weightedObservedPoint0.getX(), 0.01D);
      
      weightedObservedPointArray0[1] = weightedObservedPointArray0[0];
      assertNotNull(weightedObservedPointArray0[1]);
      assertEquals(2785.151718, weightedObservedPointArray0[1].getX(), 0.01D);
      assertEquals(2785.151718, weightedObservedPointArray0[1].getY(), 0.01D);
      assertEquals(2785.151718, weightedObservedPointArray0[1].getWeight(), 0.01D);
      
      double double1 = (-2630.4803966799705);
      WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint(double0, double1, double1);
      assertNotSame(weightedObservedPoint1, weightedObservedPoint0);
      assertFalse(weightedObservedPoint1.equals((Object)weightedObservedPoint0));
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
      assertNotNull(weightedObservedPoint1);
      assertEquals((-2630.4803966799705), weightedObservedPoint1.getY(), 0.01D);
      assertEquals((-2630.4803966799705), weightedObservedPoint1.getX(), 0.01D);
      assertEquals(2785.151718, weightedObservedPoint1.getWeight(), 0.01D);
      
      weightedObservedPointArray0[2] = weightedObservedPoint1;
      assertNotNull(weightedObservedPointArray0[2]);
      assertEquals((-2630.4803966799705), weightedObservedPoint1.getY(), 0.01D);
      assertEquals((-2630.4803966799705), weightedObservedPoint1.getX(), 0.01D);
      assertEquals(2785.151718, weightedObservedPoint1.getWeight(), 0.01D);
      assertEquals(2785.151718, weightedObservedPointArray0[2].getWeight(), 0.01D);
      assertEquals((-2630.4803966799705), weightedObservedPointArray0[2].getX(), 0.01D);
      assertEquals((-2630.4803966799705), weightedObservedPointArray0[2].getY(), 0.01D);
      
      GaussianFitter.ParameterGuesser gaussianFitter_ParameterGuesser0 = new GaussianFitter.ParameterGuesser(weightedObservedPointArray0);
      assertNotNull(gaussianFitter_ParameterGuesser0);
      
      double[] doubleArray0 = gaussianFitter_ParameterGuesser0.guess();
      assertArrayEquals(new double[] {2785.151718, 2785.151718, 0.0}, doubleArray0, 0.01);
      assertNotNull(doubleArray0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      double double0 = 609.2448295658542;
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[6];
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint(double0, double0, double0);
      assertNotNull(weightedObservedPoint0);
      assertEquals(609.2448295658542, weightedObservedPoint0.getX(), 0.01D);
      assertEquals(609.2448295658542, weightedObservedPoint0.getWeight(), 0.01D);
      assertEquals(609.2448295658542, weightedObservedPoint0.getY(), 0.01D);
      
      weightedObservedPointArray0[0] = weightedObservedPoint0;
      assertNotNull(weightedObservedPointArray0[0]);
      assertEquals(609.2448295658542, weightedObservedPointArray0[0].getWeight(), 0.01D);
      assertEquals(609.2448295658542, weightedObservedPointArray0[0].getX(), 0.01D);
      assertEquals(609.2448295658542, weightedObservedPointArray0[0].getY(), 0.01D);
      assertEquals(609.2448295658542, weightedObservedPoint0.getX(), 0.01D);
      assertEquals(609.2448295658542, weightedObservedPoint0.getWeight(), 0.01D);
      assertEquals(609.2448295658542, weightedObservedPoint0.getY(), 0.01D);
      
      weightedObservedPointArray0[1] = weightedObservedPoint0;
      assertNotNull(weightedObservedPointArray0[1]);
      assertEquals(609.2448295658542, weightedObservedPointArray0[1].getY(), 0.01D);
      assertEquals(609.2448295658542, weightedObservedPointArray0[1].getX(), 0.01D);
      assertEquals(609.2448295658542, weightedObservedPointArray0[1].getWeight(), 0.01D);
      assertEquals(609.2448295658542, weightedObservedPoint0.getX(), 0.01D);
      assertEquals(609.2448295658542, weightedObservedPoint0.getWeight(), 0.01D);
      assertEquals(609.2448295658542, weightedObservedPoint0.getY(), 0.01D);
      
      weightedObservedPointArray0[2] = weightedObservedPointArray0[1];
      assertNotNull(weightedObservedPointArray0[2]);
      assertEquals(609.2448295658542, weightedObservedPointArray0[2].getWeight(), 0.01D);
      assertEquals(609.2448295658542, weightedObservedPointArray0[2].getX(), 0.01D);
      assertEquals(609.2448295658542, weightedObservedPointArray0[2].getY(), 0.01D);
      
      weightedObservedPointArray0[3] = weightedObservedPointArray0[1];
      assertNotNull(weightedObservedPointArray0[3]);
      assertEquals(609.2448295658542, weightedObservedPointArray0[3].getWeight(), 0.01D);
      assertEquals(609.2448295658542, weightedObservedPointArray0[3].getY(), 0.01D);
      assertEquals(609.2448295658542, weightedObservedPointArray0[3].getX(), 0.01D);
      
      weightedObservedPointArray0[4] = weightedObservedPointArray0[0];
      assertNotNull(weightedObservedPointArray0[4]);
      assertEquals(609.2448295658542, weightedObservedPointArray0[4].getY(), 0.01D);
      assertEquals(609.2448295658542, weightedObservedPointArray0[4].getWeight(), 0.01D);
      assertEquals(609.2448295658542, weightedObservedPointArray0[4].getX(), 0.01D);
      
      weightedObservedPointArray0[5] = weightedObservedPointArray0[0];
      assertNotNull(weightedObservedPointArray0[5]);
      assertEquals(609.2448295658542, weightedObservedPointArray0[5].getY(), 0.01D);
      assertEquals(609.2448295658542, weightedObservedPointArray0[5].getX(), 0.01D);
      assertEquals(609.2448295658542, weightedObservedPointArray0[5].getWeight(), 0.01D);
      
      GaussianFitter.ParameterGuesser gaussianFitter_ParameterGuesser0 = new GaussianFitter.ParameterGuesser(weightedObservedPointArray0);
      assertNotNull(gaussianFitter_ParameterGuesser0);
      
      double[] doubleArray0 = gaussianFitter_ParameterGuesser0.guess();
      assertArrayEquals(new double[] {609.2448295658542, 609.2448295658542, 0.0}, doubleArray0, 0.01);
      assertNotNull(doubleArray0);
      
      double[] doubleArray1 = gaussianFitter_ParameterGuesser0.guess();
      assertArrayEquals(new double[] {609.2448295658542, 609.2448295658542, 0.0}, doubleArray1, 0.01);
      assertNotSame(doubleArray1, doubleArray0);
      assertFalse(doubleArray1.equals((Object)doubleArray0));
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
      
      double[] doubleArray0 = new double[1];
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
