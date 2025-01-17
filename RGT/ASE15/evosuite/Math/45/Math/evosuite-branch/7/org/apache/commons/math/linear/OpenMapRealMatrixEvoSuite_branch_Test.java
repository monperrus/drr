/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 19:06:16 GMT 2014
 */

package org.apache.commons.math.linear;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.exception.NumberIsTooLargeException;
import org.apache.commons.math.linear.ArrayRealVector;
import org.apache.commons.math.linear.OpenMapRealMatrix;
import org.apache.commons.math.linear.RealMatrix;
import org.apache.commons.math.linear.RealVector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class OpenMapRealMatrixEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = 1695;
      OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(int0, int0);
      assertNotNull(openMapRealMatrix0);
      assertEquals(1695, openMapRealMatrix0.getRowDimension());
      assertEquals(true, openMapRealMatrix0.isSquare());
      assertEquals(1695, openMapRealMatrix0.getColumnDimension());
      
      OpenMapRealMatrix openMapRealMatrix1 = openMapRealMatrix0.multiply(openMapRealMatrix0);
      assertTrue(openMapRealMatrix0.equals((Object)openMapRealMatrix1));
      assertTrue(openMapRealMatrix1.equals((Object)openMapRealMatrix0));
      assertNotSame(openMapRealMatrix0, openMapRealMatrix1);
      assertNotSame(openMapRealMatrix1, openMapRealMatrix0);
      assertNotNull(openMapRealMatrix1);
      assertEquals(1695, openMapRealMatrix0.getRowDimension());
      assertEquals(true, openMapRealMatrix0.isSquare());
      assertEquals(1695, openMapRealMatrix0.getColumnDimension());
      assertEquals(1695, openMapRealMatrix1.getRowDimension());
      assertEquals(true, openMapRealMatrix1.isSquare());
      assertEquals(1695, openMapRealMatrix1.getColumnDimension());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int int0 = 1695;
      OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(int0, int0);
      assertNotNull(openMapRealMatrix0);
      assertEquals(true, openMapRealMatrix0.isSquare());
      assertEquals(1695, openMapRealMatrix0.getRowDimension());
      assertEquals(1695, openMapRealMatrix0.getColumnDimension());
      
      OpenMapRealMatrix openMapRealMatrix1 = openMapRealMatrix0.add(openMapRealMatrix0);
      assertTrue(openMapRealMatrix1.equals((Object)openMapRealMatrix0));
      assertTrue(openMapRealMatrix0.equals((Object)openMapRealMatrix1));
      assertNotSame(openMapRealMatrix1, openMapRealMatrix0);
      assertNotSame(openMapRealMatrix0, openMapRealMatrix1);
      assertNotNull(openMapRealMatrix1);
      assertEquals(1695, openMapRealMatrix1.getColumnDimension());
      assertEquals(1695, openMapRealMatrix1.getRowDimension());
      assertEquals(true, openMapRealMatrix1.isSquare());
      assertEquals(true, openMapRealMatrix0.isSquare());
      assertEquals(1695, openMapRealMatrix0.getRowDimension());
      assertEquals(1695, openMapRealMatrix0.getColumnDimension());
  }

  //@Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int int0 = 1881;
      OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(int0, int0);
      assertNotNull(openMapRealMatrix0);
      assertEquals(true, openMapRealMatrix0.isSquare());
      assertEquals(1881, openMapRealMatrix0.getRowDimension());
      assertEquals(1881, openMapRealMatrix0.getColumnDimension());
      
      int int1 = Integer.MAX_VALUE;
      // Undeclared exception!
      try {
        OpenMapRealMatrix openMapRealMatrix1 = openMapRealMatrix0.createMatrix(int1, int1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 4,611,686,014,132,420,609 is larger than, or equal to, the maximum (2,147,483,647)
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int int0 = 2376;
      OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(int0, int0);
      assertNotNull(openMapRealMatrix0);
      assertEquals(true, openMapRealMatrix0.isSquare());
      assertEquals(2376, openMapRealMatrix0.getColumnDimension());
      assertEquals(2376, openMapRealMatrix0.getRowDimension());
      
      OpenMapRealMatrix openMapRealMatrix1 = openMapRealMatrix0.subtract((RealMatrix) openMapRealMatrix0);
      assertTrue(openMapRealMatrix1.equals((Object)openMapRealMatrix0));
      assertTrue(openMapRealMatrix0.equals((Object)openMapRealMatrix1));
      assertNotSame(openMapRealMatrix1, openMapRealMatrix0);
      assertNotSame(openMapRealMatrix0, openMapRealMatrix1);
      assertNotNull(openMapRealMatrix1);
      assertEquals(true, openMapRealMatrix1.isSquare());
      assertEquals(2376, openMapRealMatrix1.getColumnDimension());
      assertEquals(2376, openMapRealMatrix1.getRowDimension());
      assertEquals(true, openMapRealMatrix0.isSquare());
      assertEquals(2376, openMapRealMatrix0.getColumnDimension());
      assertEquals(2376, openMapRealMatrix0.getRowDimension());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      int int0 = 1695;
      OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(int0, int0);
      assertNotNull(openMapRealMatrix0);
      assertEquals(1695, openMapRealMatrix0.getColumnDimension());
      assertEquals(true, openMapRealMatrix0.isSquare());
      assertEquals(1695, openMapRealMatrix0.getRowDimension());
      
      int int1 = 66;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(int0, int1);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertNotNull(arrayRealVector0);
      assertEquals(false, arrayRealVector0.isNaN());
      assertEquals(111870.0, arrayRealVector0.getL1Norm(), 0.01D);
      assertEquals(false, arrayRealVector0.isInfinite());
      assertEquals(1695, arrayRealVector0.getDimension());
      assertEquals(2717.244928231535, arrayRealVector0.getNorm(), 0.01D);
      assertEquals(66.0, arrayRealVector0.getLInfNorm(), 0.01D);
      
      openMapRealMatrix0.setRowVector(int1, (RealVector) arrayRealVector0);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertEquals(false, arrayRealVector0.isNaN());
      assertEquals(111870.0, arrayRealVector0.getL1Norm(), 0.01D);
      assertEquals(false, arrayRealVector0.isInfinite());
      assertEquals(1695, arrayRealVector0.getDimension());
      assertEquals(2717.244928231535, arrayRealVector0.getNorm(), 0.01D);
      assertEquals(66.0, arrayRealVector0.getLInfNorm(), 0.01D);
      assertEquals(1695, openMapRealMatrix0.getColumnDimension());
      assertEquals(true, openMapRealMatrix0.isSquare());
      assertEquals(1695, openMapRealMatrix0.getRowDimension());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      int int0 = 1881;
      OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(int0, int0);
      assertNotNull(openMapRealMatrix0);
      assertEquals(1881, openMapRealMatrix0.getColumnDimension());
      assertEquals(true, openMapRealMatrix0.isSquare());
      assertEquals(1881, openMapRealMatrix0.getRowDimension());
      
      OpenMapRealMatrix openMapRealMatrix1 = openMapRealMatrix0.copy();
      assertTrue(openMapRealMatrix0.equals((Object)openMapRealMatrix1));
      assertTrue(openMapRealMatrix1.equals((Object)openMapRealMatrix0));
      assertNotSame(openMapRealMatrix0, openMapRealMatrix1);
      assertNotSame(openMapRealMatrix1, openMapRealMatrix0);
      assertNotNull(openMapRealMatrix1);
      assertEquals(1881, openMapRealMatrix0.getColumnDimension());
      assertEquals(true, openMapRealMatrix0.isSquare());
      assertEquals(1881, openMapRealMatrix0.getRowDimension());
      assertEquals(1881, openMapRealMatrix1.getColumnDimension());
      assertEquals(1881, openMapRealMatrix1.getRowDimension());
      assertEquals(true, openMapRealMatrix1.isSquare());
  }
}
