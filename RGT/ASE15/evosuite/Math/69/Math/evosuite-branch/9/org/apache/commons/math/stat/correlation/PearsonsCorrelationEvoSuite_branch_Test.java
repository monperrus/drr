/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 19:08:45 GMT 2014
 */

package org.apache.commons.math.stat.correlation;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.MathRuntimeException;
import org.apache.commons.math.linear.Array2DRowRealMatrix;
import org.apache.commons.math.linear.BlockRealMatrix;
import org.apache.commons.math.linear.MatrixIndexException;
import org.apache.commons.math.linear.OpenMapRealMatrix;
import org.apache.commons.math.linear.RealMatrix;
import org.apache.commons.math.linear.RealMatrixImpl;
import org.apache.commons.math.stat.correlation.Covariance;
import org.apache.commons.math.stat.correlation.PearsonsCorrelation;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class PearsonsCorrelationEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      assertEquals(1, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(6, array2DRowRealMatrix0.getRowDimension());
      assertEquals(false, array2DRowRealMatrix0.isSquare());
      assertNotNull(array2DRowRealMatrix0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      PearsonsCorrelation pearsonsCorrelation0 = null;
      try {
        pearsonsCorrelation0 = new PearsonsCorrelation((RealMatrix) array2DRowRealMatrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // insufficient data: only 6 rows and 1 columns.
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      assertEquals(9, realMatrixImpl0.getRowDimension());
      assertEquals(false, realMatrixImpl0.isSquare());
      assertEquals(1, realMatrixImpl0.getColumnDimension());
      assertNotNull(realMatrixImpl0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      int int0 = 0;
      RealMatrixImpl realMatrixImpl1 = (RealMatrixImpl)realMatrixImpl0.getSubMatrix(int0, int0, int0, int0);
      assertFalse(realMatrixImpl0.equals((Object)realMatrixImpl1));
      assertFalse(realMatrixImpl1.equals((Object)realMatrixImpl0));
      assertEquals(9, realMatrixImpl0.getRowDimension());
      assertEquals(false, realMatrixImpl0.isSquare());
      assertEquals(1, realMatrixImpl0.getColumnDimension());
      assertEquals(1, realMatrixImpl1.getRowDimension());
      assertEquals(true, realMatrixImpl1.isSquare());
      assertEquals(1, realMatrixImpl1.getColumnDimension());
      assertNotSame(realMatrixImpl0, realMatrixImpl1);
      assertNotSame(realMatrixImpl1, realMatrixImpl0);
      assertNotNull(realMatrixImpl1);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      PearsonsCorrelation pearsonsCorrelation0 = null;
      try {
        pearsonsCorrelation0 = new PearsonsCorrelation((RealMatrix) realMatrixImpl1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // insufficient data: only 1 rows and 1 columns.
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int int0 = 7;
      OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(int0, int0);
      assertEquals(true, openMapRealMatrix0.isSquare());
      assertEquals(7, openMapRealMatrix0.getRowDimension());
      assertEquals(7, openMapRealMatrix0.getColumnDimension());
      assertNotNull(openMapRealMatrix0);
      
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation((RealMatrix) openMapRealMatrix0);
      assertEquals(true, openMapRealMatrix0.isSquare());
      assertEquals(7, openMapRealMatrix0.getRowDimension());
      assertEquals(7, openMapRealMatrix0.getColumnDimension());
      assertNotNull(pearsonsCorrelation0);
      
      double[] doubleArray0 = new double[10];
      double[] doubleArray1 = new double[6];
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      assertNotSame(doubleArray1, doubleArray0);
      
      try {
        double double0 = pearsonsCorrelation0.correlation(doubleArray1, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid array dimensions. xArray has size 6; yArray has 10 elements
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int int0 = 7;
      OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(int0, int0);
      assertEquals(7, openMapRealMatrix0.getRowDimension());
      assertEquals(7, openMapRealMatrix0.getColumnDimension());
      assertEquals(true, openMapRealMatrix0.isSquare());
      assertNotNull(openMapRealMatrix0);
      
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation((RealMatrix) openMapRealMatrix0);
      assertEquals(7, openMapRealMatrix0.getRowDimension());
      assertEquals(7, openMapRealMatrix0.getColumnDimension());
      assertEquals(true, openMapRealMatrix0.isSquare());
      assertNotNull(pearsonsCorrelation0);
      
      BlockRealMatrix blockRealMatrix0 = (BlockRealMatrix)pearsonsCorrelation0.getCorrelationPValues();
      assertEquals(true, blockRealMatrix0.isSquare());
      assertEquals(Double.NaN, blockRealMatrix0.getFrobeniusNorm(), 0.01D);
      assertEquals(7, blockRealMatrix0.getColumnDimension());
      assertEquals(7, blockRealMatrix0.getRowDimension());
      assertEquals(7, openMapRealMatrix0.getRowDimension());
      assertEquals(7, openMapRealMatrix0.getColumnDimension());
      assertEquals(true, openMapRealMatrix0.isSquare());
      assertNotNull(blockRealMatrix0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      double[][] doubleArray0 = new double[6][6];
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation(doubleArray0);
      assertNotNull(pearsonsCorrelation0);
      
      BlockRealMatrix blockRealMatrix0 = (BlockRealMatrix)pearsonsCorrelation0.getCorrelationStandardErrors();
      assertEquals(6, blockRealMatrix0.getColumnDimension());
      assertEquals(Double.NaN, blockRealMatrix0.getFrobeniusNorm(), 0.01D);
      assertEquals(6, blockRealMatrix0.getRowDimension());
      assertEquals(true, blockRealMatrix0.isSquare());
      assertNotNull(blockRealMatrix0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Covariance covariance0 = new Covariance();
      assertEquals(0, covariance0.getN());
      assertNotNull(covariance0);
      
      PearsonsCorrelation pearsonsCorrelation0 = null;
      try {
        pearsonsCorrelation0 = new PearsonsCorrelation(covariance0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // covariance matrix is null
         //
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      double[][] doubleArray0 = new double[2][10];
      boolean boolean0 = false;
      Covariance covariance0 = new Covariance(doubleArray0, boolean0);
      assertEquals(2, covariance0.getN());
      assertNotNull(covariance0);
      
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation(covariance0);
      assertEquals(2, covariance0.getN());
      assertNotNull(pearsonsCorrelation0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      double[][] doubleArray0 = new double[2][10];
      boolean boolean0 = false;
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0, boolean0);
      assertEquals(false, realMatrixImpl0.isSquare());
      assertEquals(2, realMatrixImpl0.getRowDimension());
      assertEquals(10, realMatrixImpl0.getColumnDimension());
      assertNotNull(realMatrixImpl0);
      
      int int0 = 52;
      PearsonsCorrelation pearsonsCorrelation0 = null;
      try {
        pearsonsCorrelation0 = new PearsonsCorrelation((RealMatrix) realMatrixImpl0, int0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no entry at indices (2, 2) in a 2x10 matrix
         //
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation();
      assertNotNull(pearsonsCorrelation0);
      
      double[][] doubleArray0 = new double[1][5];
      // Undeclared exception!
      try {
        RealMatrix realMatrix0 = pearsonsCorrelation0.computeCorrelationMatrix(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid array dimensions. xArray has size 1; yArray has 1 elements
         //
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation();
      assertNotNull(pearsonsCorrelation0);
      
      RealMatrix realMatrix0 = pearsonsCorrelation0.getCorrelationMatrix();
      assertNull(realMatrix0);
  }
}
