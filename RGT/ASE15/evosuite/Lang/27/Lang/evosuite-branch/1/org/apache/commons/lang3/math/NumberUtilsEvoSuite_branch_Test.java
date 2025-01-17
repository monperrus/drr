/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 15:48:05 GMT 2014
 */

package org.apache.commons.lang3.math;

import static org.junit.Assert.*;
import org.junit.Test;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.apache.commons.lang3.math.NumberUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;

import org.junit.runner.RunWith;

 
public class NumberUtilsEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      String string0 = "L";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      String string0 = "--";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      String string0 = "0F";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      String string0 = "3..";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      String string0 = "1d";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      String string0 = "0";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      String string0 = "9.";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      String string0 = "---0X-0X";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      String string0 = "E0xc`L";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      String string0 = "1eg1(%rb";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      String string0 = "...";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      String string0 = "+KHD}Ijf<A";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      String string0 = "0xc`L";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      String string0 = "-0x/?";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      String string0 = "-0x0E";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      String string0 = "0x";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      String string0 = "0E";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      String string0 = "-";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      String string0 = "-0x1heEArray must not be null";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      String string0 = null;
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      String string0 = "9";
      boolean boolean0 = NumberUtils.isDigits(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      String string0 = null;
      boolean boolean0 = NumberUtils.isDigits(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      byte byte0 = (byte) (-112);
      byte byte1 = (byte)34;
      byte byte2 = NumberUtils.max(byte0, byte0, byte1);
      assertEquals((byte)34, byte2);
      assertFalse(byte0 == byte1);
      assertFalse(byte0 == byte2);
      assertTrue(byte2 == byte1);
      assertFalse(byte2 == byte0);
      assertFalse(byte1 == byte0);
      assertTrue(byte1 == byte2);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      byte byte0 = (byte) (-112);
      byte byte1 = (byte)0;
      byte byte2 = NumberUtils.max(byte0, byte1, byte1);
      assertEquals((byte)0, byte2);
      assertFalse(byte2 == byte0);
      assertTrue(byte2 == byte1);
      assertFalse(byte0 == byte1);
      assertFalse(byte0 == byte2);
      assertTrue(byte1 == byte2);
      assertFalse(byte1 == byte0);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      String string0 = "Kta{GV|T|7.jC5j=2.w";
      byte byte0 = (byte)1;
      byte byte1 = NumberUtils.toByte(string0);
      assertEquals((byte)0, byte1);
      assertFalse(byte1 == byte0);
      
      byte byte2 = NumberUtils.max(byte0, byte1, byte0);
      assertEquals((byte)1, byte2);
      assertFalse(byte2 == byte1);
      assertTrue(byte2 == byte0);
      assertTrue(byte0 == byte2);
      assertFalse(byte0 == byte1);
      assertFalse(byte1 == byte0);
      assertFalse(byte1 == byte2);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      short short0 = (short)0;
      short short1 = (short)713;
      short short2 = NumberUtils.max(short0, short0, short1);
      assertEquals((short)713, short2);
      assertFalse(short0 == short1);
      assertFalse(short0 == short2);
      assertTrue(short2 == short1);
      assertFalse(short2 == short0);
      assertFalse(short1 == short0);
      assertTrue(short1 == short2);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      short short0 = (short)0;
      short short1 = (short)61;
      short short2 = NumberUtils.max(short0, short1, short1);
      assertEquals((short)61, short2);
      assertTrue(short1 == short2);
      assertFalse(short1 == short0);
      assertFalse(short0 == short2);
      assertFalse(short0 == short1);
      assertFalse(short2 == short0);
      assertTrue(short2 == short1);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      byte byte0 = (byte)69;
      byte byte1 = NumberUtils.min(byte0, byte0, byte0);
      assertEquals((byte)69, byte1);
      assertTrue(byte0 == byte1);
      assertTrue(byte1 == byte0);
      
      short short0 = NumberUtils.max((short) byte0, (short) byte0, (short) byte1);
      assertEquals((short)69, short0);
      assertTrue(byte0 == byte1);
      assertTrue(byte1 == byte0);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      short short0 = (short) (-3800);
      short short1 = (short)118;
      int int0 = NumberUtils.max((int) short0, (int) short0, (int) short1);
      assertEquals(118, int0);
      assertFalse(short1 == short0);
      assertFalse(short0 == short1);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      short short0 = (short) (-3800);
      short short1 = (short)118;
      int int0 = NumberUtils.max((int) short0, (int) short1, (int) short1);
      assertEquals(118, int0);
      assertFalse(short1 == short0);
      assertFalse(short0 == short1);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      long long0 = 0L;
      long long1 = 16L;
      long long2 = NumberUtils.max(long0, long0, long1);
      assertEquals(16L, long2);
      assertFalse(long1 == long0);
      assertTrue(long1 == long2);
      assertFalse(long2 == long0);
      assertTrue(long2 == long1);
      assertFalse(long0 == long1);
      assertFalse(long0 == long2);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      short[] shortArray0 = new short[9];
      short short0 = (short) (-2573);
      shortArray0[1] = short0;
      long long0 = NumberUtils.max((long) shortArray0[1], (long) shortArray0[7], (long) shortArray0[4]);
      assertArrayEquals(new short[] {(short)0, (short) (-2573), (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0}, shortArray0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      String string0 = "";
      int int0 = NumberUtils.toInt(string0);
      assertEquals(0, int0);
      
      long long0 = NumberUtils.max((long) int0, (long) int0, (long) int0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      byte byte0 = (byte)69;
      byte byte1 = (byte) (-48);
      byte byte2 = NumberUtils.min(byte0, byte0, byte1);
      assertEquals((byte) (-48), byte2);
      assertFalse(byte0 == byte1);
      assertFalse(byte0 == byte2);
      assertFalse(byte2 == byte0);
      assertTrue(byte2 == byte1);
      assertFalse(byte1 == byte0);
      assertTrue(byte1 == byte2);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      byte byte0 = (byte)102;
      byte byte1 = (byte)3;
      byte byte2 = NumberUtils.min(byte0, byte1, byte0);
      assertEquals((byte)3, byte2);
      assertFalse(byte2 == byte0);
      assertTrue(byte2 == byte1);
      assertFalse(byte1 == byte0);
      assertTrue(byte1 == byte2);
      assertFalse(byte0 == byte1);
      assertFalse(byte0 == byte2);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      String string0 = "Kta{GV|T|7.jC5j=2.w";
      byte byte0 = (byte)1;
      byte byte1 = NumberUtils.toByte(string0);
      assertEquals((byte)0, byte1);
      assertFalse(byte1 == byte0);
      
      short short0 = NumberUtils.min((short) byte0, (short) byte0, (short) byte1);
      assertEquals((short)0, short0);
      assertFalse(byte1 == byte0);
      assertFalse(byte0 == byte1);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      short short0 = (short)2471;
      short short1 = (short) (-1);
      short short2 = NumberUtils.min(short0, short1, short0);
      assertEquals((short) (-1), short2);
      assertTrue(short2 == short1);
      assertFalse(short2 == short0);
      assertFalse(short0 == short1);
      assertFalse(short0 == short2);
      assertFalse(short1 == short0);
      assertTrue(short1 == short2);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      short short0 = (short)1117;
      short short1 = (short) (-3345);
      short[] shortArray0 = new short[6];
      int int0 = NumberUtils.min((int) short0, (int) shortArray0[0], (int) short1);
      assertArrayEquals(new short[] {(short)0, (short)0, (short)0, (short)0, (short)0, (short)0}, shortArray0);
      assertEquals((-3345), int0);
      assertFalse(short0 == short1);
      assertFalse(short1 == short0);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      int int0 = 0;
      byte[] byteArray0 = new byte[4];
      byte byte0 = (byte) (-127);
      byteArray0[1] = byte0;
      int int1 = NumberUtils.min(int0, (int) byteArray0[1], int0);
      assertArrayEquals(new byte[] {(byte)0, (byte) (-127), (byte)0, (byte)0}, byteArray0);
      assertEquals((-127), int1);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      int int0 = (-3314);
      int int1 = NumberUtils.min(int0, int0, int0);
      assertEquals((-3314), int1);
      assertTrue(int0 == int1);
      assertTrue(int1 == int0);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      int int0 = 1590;
      long long0 = (-1L);
      long long1 = NumberUtils.min((long) int0, (long) int0, long0);
      assertEquals((-1L), long1);
      assertTrue(long1 == long0);
      assertTrue(long0 == long1);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      short short0 = (short) (-3800);
      long long0 = 1784L;
      long long1 = NumberUtils.min(long0, (long) short0, long0);
      assertEquals((-3800L), long1);
      assertFalse(long1 == long0);
      assertFalse(long0 == long1);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      String string0 = "-0x0F";
      int int0 = (-1339);
      int int1 = NumberUtils.toInt(string0, int0);
      assertEquals((-1339), int1);
      assertTrue(int1 == int0);
      assertTrue(int0 == int1);
      
      float[] floatArray0 = new float[3];
      floatArray0[0] = (float) int1;
      float float0 = NumberUtils.max(floatArray0);
      assertArrayEquals(new float[] {(-1339.0F), 0.0F, 0.0F}, floatArray0, 0.01F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      float[] floatArray0 = new float[4];
      float float0 = Float.NaN;
      floatArray0[2] = float0;
      float float1 = NumberUtils.max(floatArray0);
      //  // Unstable assertion: assertArrayEquals(new float[] {0.0F, 0.0F, Float.NaN, 0.0F}, floatArray0, 0.01F);
      //  // Unstable assertion: assertEquals(Float.NaN, float1, 0.01F);
      //  // Unstable assertion: assertTrue(float1 == float0);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      float[] floatArray0 = null;
      // Undeclared exception!
      try {
        float float0 = NumberUtils.max(floatArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
      }
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      double double0 = (-863.5574);
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = double0;
      double double1 = NumberUtils.max(doubleArray0);
      assertArrayEquals(new double[] {(-863.5574), 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0.0, double1, 0.01D);
      assertFalse(double1 == double0);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      float[] floatArray0 = new float[4];
      float float0 = Float.NaN;
      floatArray0[0] = float0;
      double[] doubleArray0 = new double[8];
      doubleArray0[6] = (double) floatArray0[0];
      double double0 = NumberUtils.max(doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.NaN, 0.0}, doubleArray0, 0.01);
      assertEquals(Double.NaN, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byte byte0 = (byte) (-1);
      byteArray0[0] = byte0;
      byte byte1 = NumberUtils.max(byteArray0);
      assertArrayEquals(new byte[] {(byte) (-1), (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals((byte)0, byte1);
      assertFalse(byte1 == byte0);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      short short0 = (short)1117;
      short[] shortArray0 = new short[6];
      shortArray0[2] = short0;
      short short1 = NumberUtils.max(shortArray0);
      assertArrayEquals(new short[] {(short)0, (short)0, (short)1117, (short)0, (short)0, (short)0}, shortArray0);
      assertEquals((short)1117, short1);
      assertTrue(short1 == short0);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      short[] shortArray0 = null;
      // Undeclared exception!
      try {
        short short0 = NumberUtils.max(shortArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
      }
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      int[] intArray0 = new int[9];
      int int0 = 4191;
      intArray0[1] = int0;
      int int1 = NumberUtils.max(intArray0);
      assertArrayEquals(new int[] {0, 4191, 0, 0, 0, 0, 0, 0, 0}, intArray0);
      assertEquals(4191, int1);
      assertTrue(int1 == int0);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      long[] longArray0 = new long[5];
      long long0 = 1620L;
      longArray0[1] = long0;
      long long1 = NumberUtils.max(longArray0);
      assertArrayEquals(new long[] {0L, 1620L, 0L, 0L, 0L}, longArray0);
      assertEquals(1620L, long1);
      assertTrue(long1 == long0);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      short short0 = (short)61;
      float[] floatArray0 = new float[4];
      floatArray0[0] = (float) short0;
      float float0 = NumberUtils.min(floatArray0);
      assertArrayEquals(new float[] {61.0F, 0.0F, 0.0F, 0.0F}, floatArray0, 0.01F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      float[] floatArray0 = new float[23];
      float float0 = Float.NaN;
      floatArray0[7] = float0;
      float float1 = NumberUtils.min(floatArray0);
      //  // Unstable assertion: assertArrayEquals(new float[] {0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, Float.NaN, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F}, floatArray0, 0.01F);
      //  // Unstable assertion: assertEquals(Float.NaN, float1, 0.01F);
      //  // Unstable assertion: assertTrue(float1 == float0);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      float[] floatArray0 = null;
      // Undeclared exception!
      try {
        float float0 = NumberUtils.min(floatArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
      }
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      double double0 = (-4200.692204801559);
      double[] doubleArray0 = new double[4];
      doubleArray0[3] = double0;
      double double1 = NumberUtils.min(doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, (-4200.692204801559)}, doubleArray0, 0.01);
      assertEquals((-4200.692204801559), double1, 0.01D);
      assertTrue(double1 == double0);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      float float0 = Float.NaN;
      doubleArray0[1] = (double) float0;
      double double0 = NumberUtils.min(doubleArray0);
      assertArrayEquals(new double[] {0.0, Double.NaN, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(Double.NaN, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte byte0 = (byte) (-127);
      byteArray0[1] = byte0;
      byte byte1 = NumberUtils.min(byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte) (-127), (byte)0, (byte)0}, byteArray0);
      assertEquals((byte) (-127), byte1);
      assertTrue(byte1 == byte0);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      byte[] byteArray0 = null;
      // Undeclared exception!
      try {
        byte byte0 = NumberUtils.min(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
      }
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      short[] shortArray0 = new short[9];
      short short0 = (short) (-2573);
      shortArray0[1] = short0;
      short short1 = NumberUtils.min(shortArray0);
      assertArrayEquals(new short[] {(short)0, (short) (-2573), (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0}, shortArray0);
      assertEquals((short) (-2573), short1);
      assertTrue(short1 == short0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      int[] intArray0 = new int[4];
      int int0 = (-3246);
      intArray0[1] = int0;
      int int1 = NumberUtils.min(intArray0);
      assertArrayEquals(new int[] {0, (-3246), 0, 0}, intArray0);
      assertEquals((-3246), int1);
      assertTrue(int1 == int0);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      long[] longArray0 = new long[9];
      long long0 = (-1L);
      longArray0[7] = long0;
      long long1 = NumberUtils.min(longArray0);
      assertArrayEquals(new long[] {0L, 0L, 0L, 0L, 0L, 0L, 0L, (-1L), 0L}, longArray0);
      assertEquals((-1L), long1);
      assertTrue(long1 == long0);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      String string0 = "";
      // Undeclared exception!
      try {
        BigDecimal bigDecimal0 = NumberUtils.createBigDecimal(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // A blank string is not a valid number
         //
      }
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      String string0 = null;
      BigDecimal bigDecimal0 = NumberUtils.createBigDecimal(string0);
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      String string0 = null;
      BigInteger bigInteger0 = NumberUtils.createBigInteger(string0);
      assertNull(bigInteger0);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      String string0 = null;
      Long long0 = NumberUtils.createLong(string0);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      String string0 = null;
      Integer integer0 = NumberUtils.createInteger(string0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      String string0 = null;
      Double double0 = NumberUtils.createDouble(string0);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      String string0 = null;
      Float float0 = NumberUtils.createFloat(string0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      String string0 = "M_Za` QP(m{4isOQ1";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"M_Za` QP\"
         //
      }
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      String string0 = "The Array must not be null";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // The Array must not be null is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      String string0 = "2njyWLk4l";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // 2njyWLk4l is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      String string0 = "1d";
      Double double0 = (Double)NumberUtils.createNumber(string0);
      assertEquals(1.0, (double)double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      String string0 = "c`L";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // c`L is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      String string0 = "0F";
      BigDecimal bigDecimal0 = (BigDecimal)NumberUtils.createNumber(string0);
      assertNotNull(bigDecimal0);
      assertEquals(0, bigDecimal0.shortValue());
      assertEquals(0, bigDecimal0.byteValue());
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      String string0 = "{F;!KZiGsD!2A#MsTD";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // {F;!KZiGsD!2A#MsTD is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      String string0 = "Minimum abbreviation width with offset is 7";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      String string0 = "0yfKX]E[rC}Le8f:Rm";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // 0yfKX]E[rC}Le8f:Rm is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      String string0 = "0E";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // 0E is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      String string0 = ".K~`*^(wE2If";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // .K~`*^(wE2If is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      String string0 = "...";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      String string0 = " is not a valid number.";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         //  is not a valid number. is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      String string0 = "-0X-0X";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Sign character in wrong position
         //
      }
  }

  @Test(timeout = 4000)
  public void test083() {}
//   @Test(timeout = 4000)
//   public void test083()  throws Throwable  {
//       String string0 = "0X0E";
//       Integer integer0 = (Integer)NumberUtils.createNumber(string0);
//       assertEquals(14, (int)integer0);
//   }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      String string0 = "-0xorg.apache.commons.lang3.StringUtils";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"-org.apache.commons.lang3.StringUtils\"
         //
      }
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      String string0 = "0xIllegalArgumentException occurred";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"IllegalArgumentException occurred\"
         //
      }
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      String string0 = "--";
      Number number0 = NumberUtils.createNumber(string0);
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      String string0 = null;
      Number number0 = NumberUtils.createNumber(string0);
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      String string0 = " ";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // A blank string is not a valid number
         //
      }
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      short[] shortArray0 = new short[1];
      short short0 = NumberUtils.max(shortArray0);
      assertArrayEquals(new short[] {(short)0}, shortArray0);
      assertEquals((short)0, short0);
      
      String string0 = null;
      short short1 = NumberUtils.toShort(string0, short0);
      assertArrayEquals(new short[] {(short)0}, shortArray0);
      assertEquals((short)0, short1);
      assertTrue(short0 == short1);
      assertTrue(short1 == short0);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      String string0 = null;
      byte byte0 = (byte) (-81);
      byte byte1 = NumberUtils.toByte(string0, byte0);
      assertEquals((byte) (-81), byte1);
      assertTrue(byte0 == byte1);
      assertTrue(byte1 == byte0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      String string0 = null;
      double double0 = NumberUtils.toDouble(string0);
      assertEquals(0.0, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      String string0 = null;
      float float0 = NumberUtils.toFloat(string0);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      String string0 = null;
      long long0 = NumberUtils.toLong(string0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      int int0 = (-3314);
      String string0 = null;
      int int1 = NumberUtils.toInt(string0, int0);
      assertEquals((-3314), int1);
      assertTrue(int0 == int1);
      assertTrue(int1 == int0);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      String string0 = "java.text.Normalizer is not available";
      double double0 = NumberUtils.toDouble(string0);
      assertEquals(0.0, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      float float0 = (-45.646F);
      float float1 = NumberUtils.max(float0, float0, float0);
      assertEquals((-45.646F), float1, 0.01F);
      assertTrue(float0 == float1);
      assertTrue(float1 == float0);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      String string0 = "java.text.Normalizer is not available";
      long long0 = NumberUtils.toLong(string0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      float float0 = 582.7F;
      float float1 = NumberUtils.min(float0, float0, float0);
      assertEquals(582.7F, float1, 0.01F);
      assertTrue(float1 == float0);
      assertTrue(float0 == float1);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      double double0 = NumberUtils.min((double) byteArray0[0], (double) byteArray0[0], (double) byteArray0[0]);
      assertArrayEquals(new byte[] {(byte)0}, byteArray0);
      assertEquals(0.0, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      NumberUtils numberUtils0 = new NumberUtils();
      assertNotNull(numberUtils0);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      String string0 = "java.text.Normalizer is not available";
      short short0 = NumberUtils.toShort(string0);
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      float float0 = (-45.646F);
      double double0 = NumberUtils.max((double) float0, (double) float0, (double) float0);
      assertEquals((-45.645999908447266), double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      String string0 = "-";
      float float0 = NumberUtils.toFloat(string0);
      assertEquals(0.0F, float0, 0.01F);
  }
}
