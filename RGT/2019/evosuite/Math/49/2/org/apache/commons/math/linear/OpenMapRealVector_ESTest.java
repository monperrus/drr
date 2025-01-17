/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 24 00:42:25 GMT 2019
 */

package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.function.Ceil;
import org.apache.commons.math.linear.ArrayRealVector;
import org.apache.commons.math.linear.OpenMapRealVector;
import org.apache.commons.math.linear.RealVector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;


public class OpenMapRealVector_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Double[] doubleArray0 = new Double[2];
      Double double0 = new Double(192.44633270483);
      doubleArray0[0] = double0;
      doubleArray0[1] = doubleArray0[0];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      Ceil ceil0 = new Ceil();
      openMapRealVector0.map(ceil0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector();
      OpenMapRealVector.OpenMapSparseIterator openMapRealVector_OpenMapSparseIterator0 = openMapRealVector0.new OpenMapSparseIterator();
      // Undeclared exception!
      try { 
        openMapRealVector_OpenMapSparseIterator0.remove();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not supported
         //
         verifyException("org.apache.commons.math.linear.OpenMapRealVector$OpenMapSparseIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(3035, 3035);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.append(1.0E-12);
      assertEquals(3035, openMapRealVector0.getDimension());
      assertEquals(3.2938076416337287E-4, openMapRealVector1.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      double[] doubleArray1 = openMapRealVector0.toArray();
      assertEquals(2, doubleArray1.length);
      assertEquals(0.0, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(253, 0, 0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.mapAdd(1.0E-12);
      boolean boolean0 = openMapRealVector0.equals(openMapRealVector1);
      assertFalse(boolean0);
      assertEquals(253, openMapRealVector1.getDimension());
      assertEquals(1.0, openMapRealVector1.getSparsity(), 0.01);
      assertFalse(openMapRealVector1.equals((Object)openMapRealVector0));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Double[] doubleArray0 = new Double[3];
      Double double0 = new Double(913.0736842203);
      doubleArray0[0] = double0;
      doubleArray0[1] = double0;
      doubleArray0[2] = doubleArray0[1];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 0.0);
      double double1 = openMapRealVector0.getSparsity();
      assertEquals(1.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, (-3.141592653589793));
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.projection(doubleArray0);
      assertEquals(1.0, openMapRealVector0.getSparsity(), 0.01);
      assertEquals(1.0, openMapRealVector1.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Double[] doubleArray0 = new Double[6];
      Double double0 = new Double(4018.1761636954516);
      doubleArray0[0] = double0;
      doubleArray0[1] = double0;
      doubleArray0[2] = double0;
      doubleArray0[3] = double0;
      doubleArray0[4] = doubleArray0[0];
      doubleArray0[5] = doubleArray0[3];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(arrayRealVector0);
      openMapRealVector0.add((RealVector) arrayRealVector0);
      assertEquals(1.0, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Double[] doubleArray0 = new Double[4];
      Double double0 = new Double(388.72932267);
      doubleArray0[0] = double0;
      doubleArray0[1] = double0;
      doubleArray0[2] = doubleArray0[0];
      doubleArray0[3] = doubleArray0[1];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 1028.63150866883);
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector2 = (OpenMapRealVector)openMapRealVector1.add((RealVector) openMapRealVector0);
      assertEquals(1.0, openMapRealVector2.getSparsity(), 0.01);
      assertNotSame(openMapRealVector2, openMapRealVector1);
      assertTrue(openMapRealVector2.equals((Object)openMapRealVector1));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Double[] doubleArray0 = new Double[4];
      Double double0 = new Double(388.72932267);
      doubleArray0[0] = double0;
      Double double1 = new Double(3241.232);
      doubleArray0[1] = double1;
      doubleArray0[2] = doubleArray0[0];
      doubleArray0[3] = doubleArray0[1];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 1028.63150866883);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.add(openMapRealVector0);
      assertEquals(0.5, openMapRealVector0.getSparsity(), 0.01);
      assertEquals(0.5, openMapRealVector1.getSparsity(), 0.01);
      assertFalse(openMapRealVector1.equals((Object)openMapRealVector0));
      assertNotSame(openMapRealVector1, openMapRealVector0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[4] = 1081.96;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = (OpenMapRealVector)openMapRealVector0.mapSubtract(1081.96);
      OpenMapRealVector openMapRealVector2 = openMapRealVector1.add(openMapRealVector0);
      assertEquals(0.8, openMapRealVector1.getSparsity(), 0.01);
      assertEquals(1.0, openMapRealVector2.getSparsity(), 0.01);
      assertEquals(0.2, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Double[] doubleArray0 = new Double[2];
      Double double0 = new Double(192.44633270483);
      doubleArray0[0] = double0;
      doubleArray0[1] = doubleArray0[0];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.append((RealVector) openMapRealVector0);
      assertEquals(4, openMapRealVector1.getDimension());
      assertEquals(1.0, openMapRealVector1.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector();
      ArrayRealVector arrayRealVector1 = new ArrayRealVector(doubleArray0, arrayRealVector0);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(arrayRealVector1);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.append((RealVector) arrayRealVector1);
      assertEquals(16, openMapRealVector1.getDimension());
      assertEquals(0.0, openMapRealVector1.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = 0.6366197723675814;
      doubleArray0[1] = (-864.1207);
      doubleArray0[2] = (-1.0);
      doubleArray0[3] = 1.0;
      doubleArray0[4] = 1081.96;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = (OpenMapRealVector)openMapRealVector0.mapSubtract(1081.96);
      double double0 = openMapRealVector1.cosine((RealVector) openMapRealVector0);
      assertEquals(0.44937911267585884, double0, 0.01);
      assertEquals(0.8, openMapRealVector1.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[3] = Double.NEGATIVE_INFINITY;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 144.91);
      openMapRealVector0.cosine(doubleArray0);
      assertEquals(0.125, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, (-3.141592653589793));
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.ebeDivide((RealVector) openMapRealVector0);
      assertFalse(openMapRealVector1.equals((Object)openMapRealVector0));
      assertNotSame(openMapRealVector1, openMapRealVector0);
      assertEquals(1.0, openMapRealVector1.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = 0.6366197723675814;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.ebeDivide(doubleArray0);
      assertFalse(openMapRealVector1.equals((Object)openMapRealVector0));
      assertNotSame(openMapRealVector1, openMapRealVector0);
      assertEquals(0.2, openMapRealVector1.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = 0.6366197723675814;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.ebeMultiply((RealVector) openMapRealVector0);
      boolean boolean0 = openMapRealVector0.equals(openMapRealVector1);
      assertEquals(0.2, openMapRealVector1.getSparsity(), 0.01);
      assertEquals(0.2, openMapRealVector0.getSparsity(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Double[] doubleArray0 = new Double[6];
      Double double0 = new Double(0.0);
      doubleArray0[0] = double0;
      doubleArray0[1] = double0;
      doubleArray0[2] = doubleArray0[1];
      doubleArray0[3] = doubleArray0[2];
      doubleArray0[4] = doubleArray0[2];
      doubleArray0[5] = doubleArray0[1];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 0.0);
      double[] doubleArray1 = new double[6];
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.ebeMultiply(doubleArray1);
      assertNotSame(openMapRealVector1, openMapRealVector0);
      assertTrue(openMapRealVector1.equals((Object)openMapRealVector0));
      assertEquals(1.0, openMapRealVector1.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 1.0;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.getSubVector(1, 1);
      assertEquals(0.0, openMapRealVector1.getSparsity(), 0.01);
      assertEquals(1, openMapRealVector1.getDimension());
      assertEquals(0.14285714285714285, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[1] = 1183.467738;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.getSubVector(1, 1);
      assertEquals(1.0, openMapRealVector1.getSparsity(), 0.01);
      assertEquals(0.14285714285714285, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[2] = 726.4461122;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.getSubVector(1, 1);
      assertEquals(0.0, openMapRealVector1.getSparsity(), 0.01);
      assertEquals(1, openMapRealVector1.getDimension());
      assertEquals(0.14285714285714285, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[3] = Double.NEGATIVE_INFINITY;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 144.91);
      double[] doubleArray1 = openMapRealVector0.getData();
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, Double.NEGATIVE_INFINITY, 0.0, 0.0, 0.0, 0.0}, doubleArray1, 0.01);
      assertEquals(0.125, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = 0.6366197723675814;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      double double0 = openMapRealVector0.getDistance((RealVector) openMapRealVector0);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.2, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, (-538.50400834));
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(doubleArray0, 60.579);
      double double0 = openMapRealVector1.getDistance((RealVector) openMapRealVector0);
      assertEquals(0.0, openMapRealVector1.getSparsity(), 0.01);
      assertEquals(1.0, openMapRealVector0.getSparsity(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(0, 0);
      assertEquals(Double.NaN, openMapRealVector0.getSparsity(), 0.01);
      
      double[] doubleArray0 = new double[0];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      double double0 = openMapRealVector0.getDistance((RealVector) arrayRealVector0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, false);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(arrayRealVector0);
      double double0 = openMapRealVector0.getDistance(doubleArray0);
      assertEquals(0.0, openMapRealVector0.getSparsity(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, (-538.50400834));
      double double0 = openMapRealVector0.getL1Distance(openMapRealVector0);
      assertEquals(1.0, openMapRealVector0.getSparsity(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      Double[] doubleArray1 = new Double[5];
      doubleArray1[0] = (Double) 2660.10815667926;
      doubleArray1[1] = (Double) 1.0E-12;
      doubleArray1[2] = (Double) 1.0E-12;
      doubleArray1[3] = (Double) (-2178.4);
      doubleArray1[4] = (Double) 1.0E-12;
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(doubleArray1, 0.0);
      double double0 = openMapRealVector0.getL1Distance(openMapRealVector1);
      assertEquals(0.0, openMapRealVector0.getSparsity(), 0.01);
      assertEquals(4838.508156679262, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(213);
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(openMapRealVector0);
      double double0 = openMapRealVector0.getL1Distance((RealVector) arrayRealVector0);
      assertEquals(213, arrayRealVector0.getDimension());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 1.0E-12);
      double double0 = openMapRealVector0.getL1Distance((RealVector) openMapRealVector0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (-3078.452268820653);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      double double0 = openMapRealVector0.getLInfDistance((RealVector) openMapRealVector0);
      assertEquals(0.2, openMapRealVector0.getSparsity(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (-3078.452268820653);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.unitVector();
      double double0 = openMapRealVector1.getLInfDistance((RealVector) openMapRealVector0);
      assertEquals(0.2, openMapRealVector0.getSparsity(), 0.01);
      assertEquals(3077.452268820653, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[1] = (-407.86488799);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.subtract(doubleArray0);
      double double0 = openMapRealVector1.getLInfDistance((RealVector) openMapRealVector0);
      assertEquals(0.0, openMapRealVector1.getSparsity(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.14285714285714285, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[2] = 1.0E-12;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.subtract(doubleArray0);
      double double0 = openMapRealVector1.getLInfDistance((RealVector) openMapRealVector0);
      assertEquals(0.14285714285714285, openMapRealVector0.getSparsity(), 0.01);
      assertEquals(0.0, openMapRealVector1.getSparsity(), 0.01);
      assertEquals(1.0E-12, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(3829, 3829);
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(openMapRealVector0);
      double double0 = openMapRealVector0.getLInfDistance((RealVector) arrayRealVector0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Double[] doubleArray0 = new Double[3];
      Double double0 = new Double(913.0736842203);
      doubleArray0[0] = double0;
      doubleArray0[1] = doubleArray0[0];
      doubleArray0[2] = doubleArray0[0];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 0.0);
      double[] doubleArray1 = new double[3];
      double double1 = openMapRealVector0.getLInfDistance(doubleArray1);
      assertEquals(1.0, openMapRealVector0.getSparsity(), 0.01);
      assertEquals(913.0736842203, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 319.85464481401436;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 1.0E-12);
      boolean boolean0 = openMapRealVector0.isInfinite();
      assertFalse(boolean0);
      assertEquals(0.16666666666666666, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[3] = Double.NEGATIVE_INFINITY;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 144.91);
      openMapRealVector0.unitize();
      boolean boolean0 = openMapRealVector0.isInfinite();
      assertEquals(0.125, openMapRealVector0.getSparsity(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[3] = Double.NEGATIVE_INFINITY;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 144.91);
      boolean boolean0 = openMapRealVector0.isInfinite();
      assertTrue(boolean0);
      assertEquals(0.125, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 319.85464481401436;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 1.0E-12);
      boolean boolean0 = openMapRealVector0.isNaN();
      assertEquals(0.16666666666666666, openMapRealVector0.getSparsity(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[3] = Double.NEGATIVE_INFINITY;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 144.91);
      openMapRealVector0.unitize();
      boolean boolean0 = openMapRealVector0.isNaN();
      assertTrue(boolean0);
      assertEquals(0.125, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector();
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(openMapRealVector0, 2730);
      double[] doubleArray0 = new double[1];
      openMapRealVector1.mapSubtractToSelf((-1270.3026258183));
      // Undeclared exception!
      openMapRealVector1.outerProduct(doubleArray0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      openMapRealVector0.setSubVector(0, (RealVector) openMapRealVector0);
      assertEquals(0.0, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(4029, 4029, 4029);
      openMapRealVector0.set(openMapRealVector0.DEFAULT_ZERO_TOLERANCE);
      assertEquals(0.0, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Double[] doubleArray0 = new Double[6];
      Double double0 = new Double(0.0);
      doubleArray0[0] = double0;
      doubleArray0[1] = doubleArray0[0];
      doubleArray0[2] = double0;
      doubleArray0[3] = doubleArray0[2];
      doubleArray0[4] = doubleArray0[3];
      doubleArray0[5] = doubleArray0[0];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 0.0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.subtract((RealVector) openMapRealVector0);
      assertTrue(openMapRealVector1.equals((Object)openMapRealVector0));
      assertEquals(1.0, openMapRealVector1.getSparsity(), 0.01);
      assertNotSame(openMapRealVector1, openMapRealVector0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.subtract(doubleArray0);
      assertEquals(0.0, openMapRealVector1.getSparsity(), 0.01);
      
      openMapRealVector1.mapAddToSelf((-679.522174748));
      openMapRealVector0.subtract(openMapRealVector1);
      assertFalse(openMapRealVector1.equals((Object)openMapRealVector0));
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(0, 0, (-1323.9362));
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(openMapRealVector0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.subtract((RealVector) arrayRealVector0);
      assertTrue(openMapRealVector1.equals((Object)openMapRealVector0));
      assertNotSame(openMapRealVector1, openMapRealVector0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ArrayRealVector arrayRealVector0 = new ArrayRealVector();
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(arrayRealVector0);
      // Undeclared exception!
      try { 
        openMapRealVector0.unitize();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // zero norm
         //
         verifyException("org.apache.commons.math.linear.OpenMapRealVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (-3078.452268820653);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      openMapRealVector0.hashCode();
      assertEquals(0.2, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(arrayRealVector0);
      Object object0 = new Object();
      boolean boolean0 = openMapRealVector0.equals(object0);
      assertFalse(boolean0);
      assertEquals(0.0, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(867, 867);
      double[] doubleArray0 = new double[2];
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(doubleArray0);
      boolean boolean0 = openMapRealVector0.equals(openMapRealVector1);
      assertFalse(boolean0);
      assertEquals(0.0, openMapRealVector1.getSparsity(), 0.01);
      assertFalse(openMapRealVector1.equals((Object)openMapRealVector0));
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, (-538.50400834));
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(doubleArray0, 60.579);
      boolean boolean0 = openMapRealVector0.equals(openMapRealVector1);
      assertFalse(boolean0);
      assertEquals(0.0, openMapRealVector1.getSparsity(), 0.01);
      assertFalse(openMapRealVector1.equals((Object)openMapRealVector0));
      assertEquals(1.0, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 1.0E-12);
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(openMapRealVector0);
      boolean boolean0 = openMapRealVector0.equals(openMapRealVector1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 319.85464481401436;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 1.0E-12);
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector((RealVector) openMapRealVector0);
      boolean boolean0 = openMapRealVector1.equals(openMapRealVector0);
      assertEquals(0.16666666666666666, openMapRealVector1.getSparsity(), 0.01);
      assertTrue(boolean0);
  }
}
