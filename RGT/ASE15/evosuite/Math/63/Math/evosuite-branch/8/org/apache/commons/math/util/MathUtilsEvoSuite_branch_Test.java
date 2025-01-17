/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 20:45:41 GMT 2014
 */

package org.apache.commons.math.util;

import static org.junit.Assert.*;
import org.junit.Test;
import java.math.BigInteger;
import org.apache.commons.math.MathRuntimeException;
import org.apache.commons.math.exception.NonMonotonousSequenceException;
import org.apache.commons.math.util.MathUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.mock.java.lang.MockArithmeticException;
import org.junit.runner.RunWith;

 
public class MathUtilsEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[10];
      double double0 = Double.POSITIVE_INFINITY;
      doubleArray0[5] = double0;
      double double1 = MathUtils.safeNorm(doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, Double.POSITIVE_INFINITY, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(Double.POSITIVE_INFINITY, double1, 0.01D);
      assertTrue(double1 == double0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte byte0 = (byte)122;
      byteArray0[0] = byte0;
      byteArray0[2] = byteArray0[0];
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (double) byteArray0[2];
      double double0 = MathUtils.safeNorm(doubleArray0);
      assertArrayEquals(new double[] {122.0}, doubleArray0, 0.01);
      assertEquals(122.0, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double double0 = MathUtils.safeNorm(doubleArray0);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      assertEquals(0.0, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int int0 = 3110;
      double[] doubleArray0 = new double[7];
      doubleArray0[5] = (double) int0;
      MathUtils.OrderDirection mathUtils_OrderDirection0 = MathUtils.OrderDirection.DECREASING;
      boolean boolean0 = false;
      // Undeclared exception!
      try {
        MathUtils.checkOrder(doubleArray0, mathUtils_OrderDirection0, boolean0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // points 4 and 5 are not decreasing (0 < 3,110)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      MathUtils.OrderDirection mathUtils_OrderDirection0 = MathUtils.OrderDirection.DECREASING;
      boolean boolean0 = false;
      MathUtils.checkOrder(doubleArray0, mathUtils_OrderDirection0, boolean0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double double0 = (-1065.41686863491);
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = double0;
      // Undeclared exception!
      try {
        MathUtils.checkOrder(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // points 1 and 2 are not strictly increasing (0 >= 0)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      MathUtils.OrderDirection mathUtils_OrderDirection0 = MathUtils.OrderDirection.DECREASING;
      boolean boolean0 = true;
      // Undeclared exception!
      try {
        MathUtils.checkOrder(doubleArray0, mathUtils_OrderDirection0, boolean0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // points 0 and 1 are not strictly decreasing (0 <= 0)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int[] intArray0 = new int[8];
      int int0 = MathUtils.distanceInf(intArray0, intArray0);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0, 0}, intArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      double double0 = MathUtils.distanceInf(doubleArray0, doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0.0, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int[] intArray0 = new int[6];
      double double0 = MathUtils.distance(intArray0, intArray0);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0}, intArray0);
      assertEquals(0.0, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      double double0 = MathUtils.distance(doubleArray0, doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0.0, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int[] intArray0 = new int[7];
      int int0 = MathUtils.distance1(intArray0, intArray0);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0}, intArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      double double0 = MathUtils.distance1(doubleArray0, doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0.0, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.TEN;
      assertEquals(10, bigInteger0.shortValue());
      assertEquals(10, bigInteger0.byteValue());
      assertNotNull(bigInteger0);
      
      BigInteger bigInteger1 = MathUtils.pow(bigInteger0, bigInteger0);
      assertEquals(10, bigInteger0.shortValue());
      assertEquals(10, bigInteger0.byteValue());
      assertEquals(-7168, bigInteger1.shortValue());
      assertEquals(0, bigInteger1.byteValue());
      assertFalse(bigInteger0.equals((Object)bigInteger1));
      assertFalse(bigInteger1.equals((Object)bigInteger0));
      assertNotNull(bigInteger1);
      assertNotSame(bigInteger0, bigInteger1);
      assertNotSame(bigInteger1, bigInteger0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int int0 = 1334;
      BigInteger bigInteger0 = BigInteger.ZERO;
      assertEquals(0, bigInteger0.shortValue());
      assertEquals(0, bigInteger0.byteValue());
      assertNotNull(bigInteger0);
      
      long long0 = MathUtils.lcm((long) int0, (long) int0);
      assertEquals(1334L, long0);
      
      BigInteger bigInteger1 = MathUtils.pow(bigInteger0, long0);
      assertEquals(0, bigInteger0.shortValue());
      assertEquals(0, bigInteger0.byteValue());
      assertEquals(0, bigInteger1.byteValue());
      assertEquals(0, bigInteger1.shortValue());
      assertNotNull(bigInteger1);
      assertSame(bigInteger0, bigInteger1);
      assertSame(bigInteger1, bigInteger0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int int0 = 1334;
      int int1 = MathUtils.sign(int0);
      assertEquals(1, int1);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      
      BigInteger bigInteger0 = BigInteger.ZERO;
      assertEquals(0, bigInteger0.shortValue());
      assertEquals(0, bigInteger0.byteValue());
      assertNotNull(bigInteger0);
      
      BigInteger bigInteger1 = MathUtils.pow(bigInteger0, (long) int1);
      assertEquals(0, bigInteger1.byteValue());
      assertEquals(0, bigInteger1.shortValue());
      assertEquals(0, bigInteger0.shortValue());
      assertEquals(0, bigInteger0.byteValue());
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertNotNull(bigInteger1);
      assertSame(bigInteger1, bigInteger0);
      assertSame(bigInteger0, bigInteger1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BigInteger bigInteger0 = null;
      int int0 = (-3090);
      try {
        BigInteger bigInteger1 = MathUtils.pow(bigInteger0, int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot raise an integral value to a negative power (null^-3,090)
         //
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte byte0 = (byte)122;
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(0, bigInteger0.byteValue());
      assertEquals(0, bigInteger0.shortValue());
      assertNotNull(bigInteger0);
      
      BigInteger bigInteger1 = MathUtils.pow(bigInteger0, (int) byte0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(0, bigInteger0.byteValue());
      assertEquals(0, bigInteger0.shortValue());
      assertEquals(0, bigInteger1.shortValue());
      assertEquals(0, bigInteger1.byteValue());
      assertNotNull(bigInteger1);
      assertSame(bigInteger0, bigInteger1);
      assertSame(bigInteger1, bigInteger0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte byte0 = (byte)12;
      byte byte1 = MathUtils.indicator(byte0);
      assertEquals((byte)1, byte1);
      assertFalse(byte0 == byte1);
      assertFalse(byte1 == byte0);
      
      long long0 = MathUtils.pow((long) byte1, (long) byte1);
      assertEquals(1L, long0);
      assertFalse(byte0 == byte1);
      assertFalse(byte1 == byte0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      long long0 = 6227020800L;
      int int0 = 4612;
      long long1 = MathUtils.pow(long0, int0);
      assertEquals(0L, long1);
      assertFalse(long1 == long0);
      assertFalse(long0 == long1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      int int0 = 697;
      int int1 = MathUtils.sign(int0);
      assertEquals(1, int1);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      
      int int2 = MathUtils.pow(int1, int1);
      assertEquals(1, int2);
      assertTrue(int1 == int2);
      assertFalse(int1 == int0);
      assertTrue(int2 == int1);
      assertFalse(int2 == int0);
      assertFalse(int0 == int1);
      assertFalse(int0 == int2);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      int int0 = 0;
      int int1 = MathUtils.subAndCheck(int0, int0);
      assertEquals(0, int1);
      assertTrue(int0 == int1);
      assertTrue(int1 == int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte byte0 = (byte)1;
      short short0 = MathUtils.sign((short) byte0);
      assertEquals((short)1, short0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      short short0 = (short)0;
      long long0 = MathUtils.sign((long) short0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      byte byte0 = (byte)31;
      long long0 = MathUtils.sign((long) byte0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      byte byte0 = (byte) (-49);
      float float0 = MathUtils.sign((float) byte0);
      assertEquals((-1.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      int int0 = 0;
      float float0 = MathUtils.sign((float) int0);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte byte0 = (byte)122;
      byteArray0[0] = byte0;
      byteArray0[2] = byteArray0[0];
      double double0 = MathUtils.sign((double) byteArray0[2]);
      assertArrayEquals(new byte[] {(byte)122, (byte)0, (byte)122, (byte)0}, byteArray0);
      assertEquals(1.0, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      double double0 = MathUtils.sign((double) byteArray0[2]);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(0.0, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      byte byte0 = (byte)31;
      byte byte1 = MathUtils.sign(byte0);
      assertEquals((byte)1, byte1);
      assertFalse(byte1 == byte0);
      assertFalse(byte0 == byte1);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      int int0 = 4612;
      // Undeclared exception!
      try {
        float float0 = MathUtils.round((float) int0, int0, int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid rounding method 4,612, valid methods: ROUND_CEILING (2), ROUND_DOWN (1), ROUND_FLOOR (3), ROUND_HALF_DOWN (5), ROUND_HALF_EVEN (6), ROUND_HALF_UP (4), ROUND_UNNECESSARY (7), ROUND_UP (0)
         //
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte byte0 = (byte)122;
      byteArray0[0] = byte0;
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (double) byteArray0[0];
      double[] doubleArray1 = MathUtils.normalizeArray(doubleArray0, (double) byte0);
      assertArrayEquals(new double[] {122.0}, doubleArray1, 0.01);
      assertArrayEquals(new double[] {122.0}, doubleArray0, 0.01);
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      assertFalse(doubleArray0.equals((Object)doubleArray1));
      assertNotNull(doubleArray1);
      assertNotSame(doubleArray1, doubleArray0);
      assertNotSame(doubleArray0, doubleArray1);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      double[] doubleArray0 = new double[1];
      try {
        double[] doubleArray1 = MathUtils.normalizeArray(doubleArray0, (double) byteArray0[0]);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // array sums to zero
         //
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      long long0 = (-393L);
      int int0 = 0;
      double double0 = MathUtils.scalb((double) long0, int0);
      assertEquals((-393.0), double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      int int0 = 0;
      double double0 = MathUtils.scalb((double) int0, int0);
      assertEquals(0.0, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      int int0 = (-1566);
      long long0 = (-3183605296591799669L);
      // Undeclared exception!
      try {
        long long1 = MathUtils.mulAndCheck((long) int0, long0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: multiply
         //
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      int[] intArray0 = new int[7];
      int int0 = (-146);
      intArray0[5] = int0;
      long long0 = MathUtils.lcm((long) intArray0[5], (long) intArray0[5]);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, (-146), 0}, intArray0);
      assertEquals(146L, long0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      int int0 = 1334;
      int int1 = MathUtils.sign(int0);
      assertEquals(1, int1);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      
      long long0 = MathUtils.lcm((long) int0, (long) int1);
      assertEquals(1334L, long0);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      long long0 = (-393L);
      long long1 = 0L;
      long long2 = MathUtils.lcm(long1, long0);
      assertEquals(0L, long2);
      assertTrue(long2 == long1);
      assertFalse(long2 == long0);
      assertFalse(long1 == long0);
      assertTrue(long1 == long2);
      assertFalse(long0 == long2);
      assertFalse(long0 == long1);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      int int0 = 0;
      int int1 = (-720);
      int int2 = MathUtils.lcm(int1, int0);
      assertEquals(0, int2);
      assertTrue(int0 == int2);
      assertFalse(int0 == int1);
      assertFalse(int1 == int2);
      assertFalse(int1 == int0);
      assertFalse(int2 == int1);
      assertTrue(int2 == int0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      byte byte0 = (byte) (-125);
      short short0 = MathUtils.indicator((short) byte0);
      assertEquals((short) (-1), short0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      long long0 = 0L;
      long long1 = MathUtils.indicator(long0);
      assertEquals(1L, long1);
      assertFalse(long0 == long1);
      assertFalse(long1 == long0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      byte byte0 = (byte) (-127);
      int int0 = MathUtils.indicator((int) byte0);
      //  // Unstable assertion: assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      int int0 = 697;
      int int1 = MathUtils.sign(int0);
      //  // Unstable assertion: assertEquals(1, int1);
      //  // Unstable assertion: assertFalse(int1 == int0);
      //  // Unstable assertion: assertFalse(int0 == int1);
      
      float float0 = Float.NaN;
      float float1 = MathUtils.round(float0, int1);
      //  // Unstable assertion: assertEquals(Float.NaN, float1, 0.01F);
      //  // Unstable assertion: assertFalse(int1 == int0);
      //  // Unstable assertion: assertFalse(int0 == int1);
      //  // Unstable assertion: assertTrue(float1 == float0);
      //  // Unstable assertion: assertTrue(float0 == float1);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      float float0 = (-431.441F);
      double double0 = MathUtils.indicator((double) float0);
      assertEquals((-1.0), double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      int int0 = 0;
      double double0 = MathUtils.indicator((double) int0);
      assertEquals(1.0, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      byte byte0 = (byte) (-28);
      byte byte1 = MathUtils.indicator(byte0);
      assertEquals((byte) (-1), byte1);
      assertFalse(byte1 == byte0);
      assertFalse(byte0 == byte1);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      byte byte0 = (byte) (-49);
      byte byte1 = MathUtils.sign(byte0);
      assertEquals((byte) (-1), byte1);
      assertFalse(byte0 == byte1);
      assertFalse(byte1 == byte0);
      
      int int0 = 63;
      long long0 = MathUtils.gcd((long) int0, (long) byte1);
      assertEquals(1L, long0);
      assertFalse(byte0 == byte1);
      assertFalse(byte1 == byte0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      int int0 = 0;
      long long0 = MathUtils.gcd((long) int0, (long) int0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      int int0 = (-1566);
      int int1 = MathUtils.lcm(int0, int0);
      assertEquals(1566, int1);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      int int0 = 2395;
      double double0 = MathUtils.factorialDouble(int0);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      int int0 = 0;
      double double0 = MathUtils.factorialDouble(int0);
      assertEquals(1.0, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      int int0 = 0;
      double double0 = MathUtils.factorialLog(int0);
      assertEquals(0.0, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      boolean boolean0 = MathUtils.equalsIncludingNaN(doubleArray0, doubleArray0);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte byte0 = (byte)122;
      boolean boolean0 = MathUtils.equalsIncludingNaN((double) byte0, (double) byteArray0[0], (int) byte0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      short short0 = (short)5;
      short short1 = MathUtils.indicator(short0);
      //  // Unstable assertion: assertEquals((short)1, short1);
      //  // Unstable assertion: assertFalse(short0 == short1);
      //  // Unstable assertion: assertFalse(short1 == short0);
      
      int int0 = MathUtils.hash((double) short1);
      //  // Unstable assertion: assertEquals(1072693248, int0);
      //  // Unstable assertion: assertFalse(short0 == short1);
      //  // Unstable assertion: assertFalse(short1 == short0);
      
      // Undeclared exception!
      try {
        boolean boolean0 = MathUtils.equals((double) short1, (double) short1, int0);
       //  fail("Expecting exception: AssertionError");
       // Unstable assertion
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      double double0 = (-1924.6373193);
      double double1 = 0.0;
      double double2 = Double.NaN;
      boolean boolean0 = MathUtils.equalsIncludingNaN(double1, double0, double2);
      //  // Unstable assertion: assertTrue(boolean0);
      //  // Unstable assertion: assertFalse(double0 == double1);
      //  // Unstable assertion: assertFalse(double0 == double2);
      //  // Unstable assertion: assertFalse(double1 == double0);
      //  // Unstable assertion: assertFalse(double1 == double2);
      //  // Unstable assertion: assertFalse(double2 == double0);
      //  // Unstable assertion: assertFalse(double2 == double1);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      double double0 = (-1924.6373193);
      double double1 = (-350.2494);
      boolean boolean0 = MathUtils.equalsIncludingNaN(double0, double1, double0);
      assertFalse(boolean0);
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      double double0 = (-194.639202);
      int int0 = (-1577);
      long long0 = 870L;
      int int1 = MathUtils.pow(int0, long0);
      assertEquals(244721073, int1);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      
      boolean boolean0 = MathUtils.equalsIncludingNaN(double0, double0, (double) int1);
      assertTrue(boolean0);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      double double0 = 1024.0;
      boolean boolean0 = MathUtils.equals(double0, double0, double0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      int int0 = 697;
      int int1 = MathUtils.sign(int0);
      assertEquals(1, int1);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      
      double double0 = 5335.65869913166;
      int int2 = MathUtils.compareTo((double) int0, double0, (double) int1);
      assertEquals((-1), int2);
      assertFalse(int2 == int1);
      assertFalse(int2 == int0);
      assertFalse(int0 == int2);
      assertFalse(int0 == int1);
      assertFalse(int1 == int2);
      assertFalse(int1 == int0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      int int0 = 697;
      int int1 = MathUtils.sign(int0);
      assertEquals(1, int1);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      
      int int2 = MathUtils.compareTo((double) int0, (double) int1, (double) int1);
      assertEquals(1, int2);
      assertFalse(int0 == int2);
      assertFalse(int0 == int1);
      assertTrue(int1 == int2);
      assertFalse(int1 == int0);
      assertFalse(int2 == int0);
      assertTrue(int2 == int1);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte byte0 = (byte)122;
      byteArray0[0] = byte0;
      byte byte1 = (byte)0;
      // Undeclared exception!
      try {
        double double0 = MathUtils.binomialCoefficientLog((int) byte1, (int) byteArray0[0]);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n >= k for binomial coefficient (n,k), got n = 0, k = 122
         //
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      int int0 = 0;
      double double0 = MathUtils.binomialCoefficientLog(int0, int0);
      assertEquals(0.0, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      int int0 = 2307;
      int int1 = 776;
      double double0 = MathUtils.binomialCoefficientDouble(int0, int1);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01D);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      int int0 = 0;
      int int1 = 2307;
      double double0 = MathUtils.binomialCoefficientDouble(int1, int0);
      assertEquals(1.0, double0, 0.01D);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      int int0 = 0;
      double double0 = MathUtils.binomialCoefficientDouble(int0, int0);
      assertEquals(1.0, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      int int0 = 63;
      int int1 = 8;
      double double0 = MathUtils.binomialCoefficientLog(int0, int1);
      assertEquals(22.077268048108625, double0, 0.01D);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      int int0 = (-1577);
      int int1 = 0;
      double double0 = MathUtils.binomialCoefficientLog(int1, int0);
      assertEquals(0.0, double0, 0.01D);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      int int0 = 0;
      int int1 = MathUtils.indicator(int0);
      assertEquals(1, int1);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      
      long long0 = MathUtils.binomialCoefficient(int1, int1);
      assertEquals(1L, long0);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      int int0 = 697;
      long long0 = MathUtils.subAndCheck((long) int0, (long) int0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      byte byte0 = (byte) (-49);
      byte byte1 = MathUtils.sign(byte0);
      assertEquals((byte) (-1), byte1);
      assertFalse(byte0 == byte1);
      assertFalse(byte1 == byte0);
      
      int int0 = MathUtils.addAndCheck((int) byte0, (int) byte1);
      assertEquals((-50), int0);
      assertFalse(byte0 == byte1);
      assertFalse(byte1 == byte0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      int int0 = MathUtils.hash(doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals((-1807454463), int0);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      int int0 = 1334;
      int int1 = MathUtils.sign(int0);
      assertEquals(1, int1);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      
      byte[] byteArray0 = new byte[2];
      float float0 = MathUtils.round((float) int1, (int) byteArray0[1]);
      assertArrayEquals(new byte[] {(byte)0, (byte)0}, byteArray0);
      assertEquals(1.0F, float0, 0.01F);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      boolean boolean0 = MathUtils.equals(doubleArray0, doubleArray0);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      int int0 = 697;
      int int1 = MathUtils.sign(int0);
      assertEquals(1, int1);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      
      double double0 = MathUtils.round((double) int1, int1);
      assertEquals(1.0, double0, 0.01D);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      double double0 = (-1924.6373193);
      double double1 = MathUtils.log(double0, double0);
      assertEquals(Double.NaN, double1, 0.01D);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      double double0 = (-1065.41686863491);
      double double1 = MathUtils.sinh(double0);
      assertEquals(Double.NEGATIVE_INFINITY, double1, 0.01D);
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      double double0 = 0.0;
      double double1 = MathUtils.cosh(double0);
      assertEquals(1.0, double1, 0.01D);
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
      
      int int0 = 1334;
      double double2 = MathUtils.normalizeAngle((double) int0, double1);
      assertEquals(1.9647148779276904, double2, 0.01D);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertFalse(double2 == double1);
      assertFalse(double2 == double0);
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      long long0 = 6L;
      long long1 = MathUtils.addAndCheck(long0, long0);
      assertEquals(12L, long1);
      assertFalse(long0 == long1);
      assertFalse(long1 == long0);
      
      int int0 = 0;
      float float0 = MathUtils.round((float) long1, int0, int0);
      assertEquals(13.0F, float0, 0.01F);
      assertFalse(long0 == long1);
      assertFalse(long1 == long0);
  }
}
