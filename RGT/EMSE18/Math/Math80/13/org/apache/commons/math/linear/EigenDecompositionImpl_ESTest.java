/*
 * This file was automatically generated by EvoSuite
 * Tue Jan 17 02:25:23 GMT 2017
 */

package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.linear.Array2DRowRealMatrix;
import org.apache.commons.math.linear.ArrayRealVector;
import org.apache.commons.math.linear.DecompositionSolver;
import org.apache.commons.math.linear.EigenDecompositionImpl;
import org.apache.commons.math.linear.RealMatrix;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

public class EigenDecompositionImpl_ESTest  {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (-1250.834475315);
      double[] doubleArray1 = new double[0];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1250.834475315));
      eigenDecompositionImpl0.getVT();
      assertEquals((-1250.834475315), eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[6] = 2138.7;
      double[] doubleArray1 = new double[8];
      doubleArray1[3] = 0.563;
      doubleArray1[4] = 13.953588961344309;
      doubleArray1[5] = 13.953588961344309;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.563);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  //@Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[7] = 0.563;
      doubleArray0[8] = 2.449489742783178;
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, 0.563);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  //@Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, 0.08325);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = new double[0];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      double double0 = eigenDecompositionImpl0.getRealEigenvalue(0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = new double[0];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      double double0 = eigenDecompositionImpl0.getImagEigenvalue(0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = new double[0];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      ArrayRealVector arrayRealVector0 = (ArrayRealVector)eigenDecompositionImpl0.getEigenvector(0);
      assertEquals(1.0, arrayRealVector0.getLInfNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 1120599.6570806336;
      double[] doubleArray1 = new double[0];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1120599.6570806336);
      double double0 = eigenDecompositionImpl0.getDeterminant();
      assertEquals(1120599.6570806336, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl((double[]) null, (double[]) null, 0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //@Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = new double[0];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getVT();
      double[][] doubleArray2 = new double[5][4];
      array2DRowRealMatrix0.data = doubleArray2;
      EigenDecompositionImpl eigenDecompositionImpl1 = null;
      try {
        eigenDecompositionImpl1 = new EigenDecompositionImpl((RealMatrix) array2DRowRealMatrix0, (-2431.9644439));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // a 5x4 matrix was provided instead of a square matrix
         //
         verifyException("org.apache.commons.math.linear.TriDiagonalTransformer", e);
      }
  }

  //@Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl((RealMatrix) null, 32.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  //@Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = new double[1];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getVT();
      array2DRowRealMatrix0.data = null;
      EigenDecompositionImpl eigenDecompositionImpl1 = null;
      try {
        eigenDecompositionImpl1 = new EigenDecompositionImpl((RealMatrix) array2DRowRealMatrix0, 0.4);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.linear.TriDiagonalTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[1] = 2.0;
      doubleArray0[2] = 1.05;
      doubleArray0[3] = 0.563;
      doubleArray0[4] = 0.25;
      doubleArray0[6] = 2138.7;
      doubleArray0[7] = (-903.34974761603);
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = 2.0;
      doubleArray1[1] = 1.05;
      doubleArray1[2] = 1.05;
      doubleArray1[3] = 0.563;
      doubleArray1[4] = 13.953588961344309;
      doubleArray1[5] = (-903.34974761603);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-903.34974761603));
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[1] = 2.0;
      doubleArray0[3] = 0.563;
      doubleArray0[4] = 0.25;
      doubleArray0[6] = 2138.7;
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = 2.0;
      doubleArray1[1] = 1.05;
      doubleArray1[2] = 1.05;
      doubleArray1[4] = 13.953588961344309;
      doubleArray1[5] = (-903.34974761603);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-903.34974761603));
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[1] = 2.0;
      doubleArray0[2] = 1.05;
      doubleArray0[3] = (-0.557109391460306);
      doubleArray0[4] = 0.25;
      doubleArray0[6] = 2138.7;
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = 2.0;
      doubleArray1[1] = 1.05;
      doubleArray1[2] = 0.25;
      doubleArray1[3] = (-0.557109391460306);
      doubleArray1[4] = 13.953588961344309;
      doubleArray1[5] = (-903.349747616035);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-0.557109391460306));
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[1] = 2.0;
      doubleArray0[2] = 1.05;
      doubleArray0[4] = 0.25;
      doubleArray0[6] = 2138.7;
      doubleArray0[7] = (-903.349747616035);
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = 2.0;
      doubleArray1[1] = 1.05;
      doubleArray1[2] = 1.05;
      doubleArray1[3] = 0.563;
      doubleArray1[4] = 13.953588961344309;
      doubleArray1[5] = (-903.349747616035);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-903.349747616035));
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[4] = 2.0;
      double[] doubleArray1 = new double[8];
      doubleArray1[6] = 1.05;
      doubleArray1[3] = 0.563;
      doubleArray1[4] = 1.05;
      doubleArray1[5] = (-903.349747616035);
      doubleArray1[7] = 2.0;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-903.349747616035));
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[1] = 2.0;
      doubleArray0[2] = 1.05;
      doubleArray0[3] = 0.563;
      doubleArray0[4] = 0.25;
      doubleArray0[6] = 2138.7;
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = 2.0;
      doubleArray1[1] = 1.05;
      doubleArray1[4] = 13.953588961344309;
      doubleArray1[5] = (-903.349747616035);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-903.349747616035));
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[6] = 2138.7;
      doubleArray0[1] = (-903.349747616035);
      double[] doubleArray1 = new double[8];
      doubleArray1[1] = 1.05;
      doubleArray1[2] = 1.05;
      doubleArray1[3] = 0.563;
      doubleArray1[4] = 1.05;
      doubleArray1[5] = (-903.349747616035);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[1] = 2.0;
      doubleArray0[2] = 1.05;
      doubleArray0[3] = 0.563;
      double[] doubleArray1 = new double[8];
      doubleArray1[3] = 0.563;
      doubleArray1[4] = 1.05;
      doubleArray1[5] = (-903.349747616035);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-903.349747616035));
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[6] = 2138.7;
      doubleArray0[7] = (-0.557109391460306);
      double[] doubleArray1 = new double[8];
      doubleArray1[5] = (-903.349747616035);
      doubleArray1[7] = 2.0;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-0.557109391460306));
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[1] = 2.0;
      doubleArray0[2] = 1.05;
      doubleArray0[3] = 2.0;
      doubleArray0[6] = 1.05;
      doubleArray0[7] = (-903.349747616035);
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = 2.0;
      doubleArray1[1] = 1.05;
      doubleArray1[2] = 1.05;
      doubleArray1[3] = 1.05;
      doubleArray1[4] = 1.05;
      doubleArray1[5] = (-903.349747616035);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-903.349747616035));
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = 2.0;
      doubleArray1[1] = 1.05;
      doubleArray1[2] = 0.25;
      doubleArray1[3] = (-0.557109391460306);
      doubleArray1[4] = 13.953588961344309;
      doubleArray1[5] = (-903.349747616035);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-0.557109391460306));
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  //@Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = Double.NEGATIVE_INFINITY;
      doubleArray0[1] = 2.0;
      doubleArray0[2] = 1.05;
      doubleArray0[3] = 0.563;
      double[] doubleArray1 = new double[8];
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-903.349747616035));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[6] = 2138.7;
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = Double.NEGATIVE_INFINITY;
      doubleArray1[3] = 0.563;
      doubleArray1[4] = 13.953588961344309;
      doubleArray1[5] = 1.05;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.563);
      assertEquals(Double.NaN, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      double[] doubleArray1 = new double[8];
      doubleArray1[5] = 0.25;
      doubleArray1[6] = Double.NEGATIVE_INFINITY;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 13.743241801626539);
      assertEquals(Double.NaN, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      double[] doubleArray1 = new double[8];
      doubleArray1[2] = 1.05;
      doubleArray1[3] = 0.563;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 13.743241801626539);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = new double[1];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getVT();
      EigenDecompositionImpl eigenDecompositionImpl1 = new EigenDecompositionImpl((RealMatrix) array2DRowRealMatrix0, 0.4);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
      assertEquals(Double.NaN, eigenDecompositionImpl1.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = new double[0];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
      assertFalse(decompositionSolver0.isNonSingular());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = new double[0];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1250.834475315));
      eigenDecompositionImpl0.getVT();
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
      assertFalse(decompositionSolver0.isNonSingular());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = new double[0];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1120599.6570806336);
      double double0 = eigenDecompositionImpl0.getDeterminant();
      assertEquals(0.0, double0, 0.01);
  }

  //@Test(timeout = 4000)
  public void test31()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = new double[0];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1120599.6570806336);
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getVT();
      EigenDecompositionImpl eigenDecompositionImpl1 = new EigenDecompositionImpl((RealMatrix) array2DRowRealMatrix0, 3.0);
      try { 
        eigenDecompositionImpl1.getEigenvector(2147483328);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2147483328
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  //@Test(timeout = 4000)
  public void test32()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = new double[0];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      eigenDecompositionImpl0.getV();
      try { 
        eigenDecompositionImpl0.getEigenvector((-1332));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1332
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = new double[0];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      eigenDecompositionImpl0.getV();
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getVT();
      assertEquals(1, array2DRowRealMatrix0.getColumnDimension());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = new double[0];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      eigenDecompositionImpl0.getVT();
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getVT();
      assertEquals(1, array2DRowRealMatrix0.getRowDimension());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = new double[0];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1250.834475315));
      eigenDecompositionImpl0.getD();
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getD();
      assertEquals(1, array2DRowRealMatrix0.getRowDimension());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      double[] doubleArray1 = new double[8];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      eigenDecompositionImpl0.getVT();
      eigenDecompositionImpl0.getV();
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = new double[0];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      eigenDecompositionImpl0.getV();
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getV();
      assertEquals(1, array2DRowRealMatrix0.getRowDimension());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = new double[0];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1250.834475315));
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getVT();
      assertNotNull(array2DRowRealMatrix0);
      
      EigenDecompositionImpl eigenDecompositionImpl1 = new EigenDecompositionImpl((RealMatrix) array2DRowRealMatrix0, 3.0);
      Array2DRowRealMatrix array2DRowRealMatrix1 = (Array2DRowRealMatrix)eigenDecompositionImpl1.getV();
      assertTrue(array2DRowRealMatrix1.equals((Object)array2DRowRealMatrix0));
  }

  //@Test(timeout = 4000)
  public void test39()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[8] = 2.449489742783178;
      double[] doubleArray1 = new double[8];
      doubleArray1[1] = 1.05;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getVT();
      EigenDecompositionImpl eigenDecompositionImpl1 = null;
      try {
        eigenDecompositionImpl1 = new EigenDecompositionImpl((RealMatrix) array2DRowRealMatrix0, 1.0E-13);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // eigen decomposition of assymetric matrices not supported yet
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = new double[0];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
      assertFalse(doubleArray2.equals((Object)doubleArray1));
  }

  //@Test(timeout = 4000)
  public void test41()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = new double[0];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1250.834475315));
      try { 
        eigenDecompositionImpl0.getRealEigenvalue(2147483328);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2147483328
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  //@Test(timeout = 4000)
  public void test42()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = new double[0];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      try { 
        eigenDecompositionImpl0.getImagEigenvalue((-793));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -793
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = new double[0];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      double[] doubleArray2 = eigenDecompositionImpl0.getImagEigenvalues();
      assertArrayEquals(new double[] {0.0}, doubleArray2, 0.01);
  }
}
