/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 20:02:34 GMT 2014
 */

package org.apache.commons.math.analysis;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.MaxIterationsExceededException;
import org.apache.commons.math.analysis.BrentSolver;
import org.apache.commons.math.analysis.PolynomialFunction;
import org.apache.commons.math.analysis.PolynomialFunctionLagrangeForm;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;

import org.junit.runner.RunWith;

 
public class BrentSolverEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[11];
      double double0 = Double.NaN;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(10, polynomialFunction0.degree());
      assertNotNull(polynomialFunction0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(10, polynomialFunction0.degree());
      assertNotNull(brentSolver0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      int int0 = 1132;
      double double1 = brentSolver0.solve((double) int0, double0, double0);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(10, polynomialFunction0.degree());
      assertEquals(0.0, double1, 0.01D);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      double double2 = (-1775.0);
      assertFalse(double2 == double1);
      
      double double3 = brentSolver0.solve(double2, double0);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(10, polynomialFunction0.degree());
      assertEquals((-1775.0), double3, 0.01D);
      assertTrue(double2 == double3);
      assertFalse(double2 == double1);
      assertFalse(double2 == double0);
      assertFalse(double0 == double3);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertFalse(double3 == double0);
      assertFalse(double3 == double1);
      assertTrue(double3 == double2);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      brentSolver0.setFunctionValueAccuracy(double3);
      assertEquals((-1775.0), brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(10, polynomialFunction0.degree());
      assertTrue(double2 == double3);
      assertFalse(double2 == double1);
      assertFalse(double2 == double0);
      assertFalse(double0 == double3);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertFalse(double3 == double0);
      assertFalse(double3 == double1);
      assertTrue(double3 == double2);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      doubleArray0[2] = double0;
      try {
        double double4 = brentSolver0.solve(double1, doubleArray0[2], (double) int0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Maximal number of iterations (100) exceeded
         //
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[10];
      double double0 = 0.0;
      int int0 = 745;
      doubleArray0[3] = (double) int0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(9, polynomialFunction0.degree());
      assertNotNull(polynomialFunction0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 745.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(9, polynomialFunction0.degree());
      assertNotNull(brentSolver0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 745.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      double double1 = (-426.75);
      double double2 = brentSolver0.solve(double1, double0);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(9, polynomialFunction0.degree());
      assertEquals(0.0, double2, 0.01D);
      assertFalse(double2 == double1);
      assertTrue(double2 == double0);
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
      assertTrue(double0 == double2);
      assertFalse(double0 == double1);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 745.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double double0 = 1506.5377013473453;
      double[] doubleArray0 = new double[9];
      doubleArray0[1] = double0;
      double double1 = (-2375.3316944);
      doubleArray0[5] = double1;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(8, polynomialFunction0.degree());
      assertNotNull(polynomialFunction0);
      assertArrayEquals(new double[] {0.0, 1506.5377013473453, 0.0, 0.0, 0.0, (-2375.3316944), 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      PolynomialFunction polynomialFunction1 = (PolynomialFunction)polynomialFunction0.derivative();
      assertEquals(7, polynomialFunction1.degree());
      assertEquals(8, polynomialFunction0.degree());
      assertNotNull(polynomialFunction1);
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction0));
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction1));
      assertArrayEquals(new double[] {0.0, 1506.5377013473453, 0.0, 0.0, 0.0, (-2375.3316944), 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotSame(polynomialFunction1, polynomialFunction0);
      assertNotSame(polynomialFunction0, polynomialFunction1);
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction1);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(7, polynomialFunction1.degree());
      assertEquals(8, polynomialFunction0.degree());
      assertNotNull(brentSolver0);
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction0));
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction1));
      assertArrayEquals(new double[] {0.0, 1506.5377013473453, 0.0, 0.0, 0.0, (-2375.3316944), 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotSame(polynomialFunction1, polynomialFunction0);
      assertNotSame(polynomialFunction0, polynomialFunction1);
      
      double double2 = brentSolver0.solve(double1, doubleArray0[6]);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(7, polynomialFunction1.degree());
      assertEquals(8, polynomialFunction0.degree());
      assertEquals((-0.5967900990055811), double2, 0.01D);
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction0));
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction1));
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
      assertArrayEquals(new double[] {0.0, 1506.5377013473453, 0.0, 0.0, 0.0, (-2375.3316944), 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotSame(polynomialFunction1, polynomialFunction0);
      assertNotSame(polynomialFunction0, polynomialFunction1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[11];
      double double0 = Double.NaN;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(10, polynomialFunction0.degree());
      assertNotNull(polynomialFunction0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      assertEquals(10, polynomialFunction0.degree());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertNotNull(brentSolver0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      double double1 = 1.0E-6;
      double double2 = brentSolver0.solve(double0, double1);
      assertEquals(10, polynomialFunction0.degree());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-6, double2, 0.01D);
      assertTrue(double1 == double2);
      assertFalse(double1 == double0);
      assertTrue(double2 == double1);
      assertFalse(double2 == double0);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double double0 = 1506.5377013473453;
      double[] doubleArray0 = new double[9];
      doubleArray0[1] = double0;
      doubleArray0[6] = double0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(8, polynomialFunction0.degree());
      assertNotNull(polynomialFunction0);
      assertArrayEquals(new double[] {0.0, 1506.5377013473453, 0.0, 0.0, 0.0, 0.0, 1506.5377013473453, 0.0, 0.0}, doubleArray0, 0.01);
      
      PolynomialFunction polynomialFunction1 = (PolynomialFunction)polynomialFunction0.derivative();
      assertEquals(8, polynomialFunction0.degree());
      assertEquals(7, polynomialFunction1.degree());
      assertNotNull(polynomialFunction1);
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction1));
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction0));
      assertArrayEquals(new double[] {0.0, 1506.5377013473453, 0.0, 0.0, 0.0, 0.0, 1506.5377013473453, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotSame(polynomialFunction0, polynomialFunction1);
      assertNotSame(polynomialFunction1, polynomialFunction0);
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction1);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(8, polynomialFunction0.degree());
      assertEquals(7, polynomialFunction1.degree());
      assertNotNull(brentSolver0);
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction1));
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction0));
      assertArrayEquals(new double[] {0.0, 1506.5377013473453, 0.0, 0.0, 0.0, 0.0, 1506.5377013473453, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotSame(polynomialFunction0, polynomialFunction1);
      assertNotSame(polynomialFunction1, polynomialFunction0);
      
      // Undeclared exception!
      try {
        double double1 = brentSolver0.solve(doubleArray0[2], doubleArray0[6]);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [0.0,1506.5377013473453]  Values: [1506.5377013473453,7.0150581759799075E19]
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      double double0 = (-2375.3316944);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(8, polynomialFunction0.degree());
      assertNotNull(polynomialFunction0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      assertEquals(8, polynomialFunction0.degree());
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertNotNull(brentSolver0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      double double1 = brentSolver0.solve(double0, doubleArray0[1]);
      assertEquals(8, polynomialFunction0.degree());
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals((-2375.3316944), double1, 0.01D);
      assertTrue(double1 == double0);
      assertTrue(double0 == double1);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[11];
      double double0 = 1.0;
      doubleArray0[1] = double0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(10, polynomialFunction0.degree());
      assertNotNull(polynomialFunction0);
      assertArrayEquals(new double[] {0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(10, polynomialFunction0.degree());
      assertNotNull(brentSolver0);
      assertArrayEquals(new double[] {0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      double double1 = (-2315.83766);
      double double2 = brentSolver0.solve(doubleArray0[1], double1, double0);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(10, polynomialFunction0.degree());
      assertEquals(0.0, double2, 0.01D);
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
      assertFalse(double0 == double1);
      assertFalse(double0 == double2);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertArrayEquals(new double[] {0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[11];
      double double0 = 1.0;
      doubleArray0[5] = double0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(10, polynomialFunction0.degree());
      assertNotNull(polynomialFunction0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(10, polynomialFunction0.degree());
      assertNotNull(brentSolver0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      double double1 = (-2315.83766);
      doubleArray0[2] = double1;
      doubleArray0[3] = doubleArray0[5];
      double double2 = brentSolver0.solve(doubleArray0[2], doubleArray0[3], double0);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(10, polynomialFunction0.degree());
      assertEquals((-8.803792564022485E-4), double2, 0.01D);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertFalse(double0 == double1);
      assertFalse(double0 == double2);
      assertArrayEquals(new double[] {0.0, 0.0, (-2315.83766), 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double double0 = 1506.5377013473453;
      double[] doubleArray0 = new double[9];
      doubleArray0[6] = double0;
      doubleArray0[8] = double0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(8, polynomialFunction0.degree());
      assertNotNull(polynomialFunction0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1506.5377013473453, 0.0, 1506.5377013473453}, doubleArray0, 0.01);
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(8, polynomialFunction0.degree());
      assertNotNull(brentSolver0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1506.5377013473453, 0.0, 1506.5377013473453}, doubleArray0, 0.01);
      
      double double1 = brentSolver0.solve(doubleArray0[6], doubleArray0[2], doubleArray0[8]);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(8, polynomialFunction0.degree());
      assertEquals(0.0, double1, 0.01D);
      assertFalse(double1 == double0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1506.5377013473453, 0.0, 1506.5377013473453}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[10];
      double double0 = 111.3198633177579;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      assertEquals(9, polynomialFunctionLagrangeForm0.degree());
      assertNotNull(polynomialFunctionLagrangeForm0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunctionLagrangeForm0);
      assertEquals(9, polynomialFunctionLagrangeForm0.degree());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertNotNull(brentSolver0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      // Undeclared exception!
      try {
        double double1 = brentSolver0.solve(double0, double0, doubleArray0[3]);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Initial guess is not in search interval.  Initial: 0.0  Endpoints: [111.3198633177579,111.3198633177579]
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(8, polynomialFunction0.degree());
      assertNotNull(polynomialFunction0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      assertEquals(8, polynomialFunction0.degree());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertNotNull(brentSolver0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      double double0 = brentSolver0.solve(doubleArray0[6], doubleArray0[2], doubleArray0[8]);
      assertEquals(8, polynomialFunction0.degree());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(0.0, double0, 0.01D);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }
}
