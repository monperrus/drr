/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 03 11:39:05 GMT 2019
 */

package org.apache.commons.lang.math;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.apache.commons.lang.math.NumberUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

 
public class NumberUtils_ESTest {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      NumberUtils numberUtils0 = new NumberUtils();
      float float0 = NumberUtils.max((float) numberUtils0.SHORT_ONE, (-2390.87F), (float) 0L);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      int int0 = NumberUtils.stringToInt("jEo<|QFxuE6jYN^Y]", 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      double double0 = NumberUtils.toDouble("");
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      float float0 = NumberUtils.toFloat("GCllxRX='QF");
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      float float0 = NumberUtils.min(0.0F, 780.6427F, 0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      double double0 = NumberUtils.min(1.0, 1.0, 2344.342);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      double double0 = NumberUtils.max((-999.082), (-20.027892217809597), 1942.29115);
      assertEquals(1942.29115, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      long long0 = NumberUtils.toLong("GCllxRX='QF");
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      int int0 = NumberUtils.stringToInt((String) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      long long0 = NumberUtils.toLong((String) null);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      float float0 = NumberUtils.toFloat((String) null, 0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      double double0 = NumberUtils.toDouble((String) null, (-1980.68623099145));
      assertEquals((-1980.68623099145), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      Number number0 = NumberUtils.createNumber((String) null);
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      try { 
        NumberUtils.createNumber(" ");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // A blank string is not a valid number
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("--S9:");
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      try { 
        NumberUtils.createNumber("0x(2x3FDYC76o:DCyD");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"(2x3FDYC76o:DCyD\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("-0xc0");
      assertEquals((-192), number0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("0.0");
      assertEquals(0.0F, number0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      try { 
        NumberUtils.createNumber("0.!z'c^2|f7g8$Se.");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // 0.!z'c^2|f7g8$Se. is not a valid number.
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      try { 
        NumberUtils.createNumber(" is not a valid number.");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         //  is not a valid number. is not a valid number.
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      try { 
        NumberUtils.createNumber("0VhwGPVVPyHG*,zRwNE");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // 0VhwGPVVPyHG*,zRwNE is not a valid number.
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      try { 
        NumberUtils.createNumber("0.!z'c^2|f7g8$ST.");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // 0.!z'c^2|f7g8$ST. is not a valid number.
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("8D");
      assertEquals(8.0, number0);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      try { 
        NumberUtils.createNumber("g<.t:UZ*@LoF");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // g<.t:UZ*@LoF is not a valid number.
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      try { 
        NumberUtils.createNumber("d");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // d is not a valid number.
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("-4f");
      assertEquals((-4.0F), number0);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      try { 
        NumberUtils.createNumber("eH%|G}^!H&on.E1l");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // eH%|G}^!H&on.E1l is not a valid number.
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      try { 
        NumberUtils.createNumber("The Array must not be null");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // The Array must not be null is not a valid number.
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("6l");
      assertEquals(6L, number0);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      try { 
        NumberUtils.createNumber("-!prM;9hL\"p'g/@`YL");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // -!prM;9hL\"p'g/@`YL is not a valid number.
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      try { 
        NumberUtils.createNumber(">2|1(d)'.2eY2&#5(1");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      try { 
        NumberUtils.createNumber("/zd{5YaWth6?c{e7");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      Number number0 = NumberUtils.createNumber(".3");
      assertEquals(0.3F, number0);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      Number number0 = NumberUtils.createNumber(".0");
      assertEquals((short)0, number0.shortValue());
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      Float float0 = NumberUtils.createFloat((String) null);
      assertNull(float0);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      Double double0 = NumberUtils.createDouble((String) null);
      assertNull(double0);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      Integer integer0 = NumberUtils.createInteger((String) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      Long long0 = NumberUtils.createLong((String) null);
      assertNull(long0);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      try { 
        NumberUtils.createNumber("_:+,xM/m6");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Illegal embedded sign character
         //
         verifyException("java.math.BigInteger", e);
      }
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      BigInteger bigInteger0 = NumberUtils.createBigInteger((String) null);
      assertNull(bigInteger0);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      BigDecimal bigDecimal0 = NumberUtils.createBigDecimal((String) null);
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = new byte[8];
      boolean boolean0 = NumberUtils.equals(byteArray0, byteArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      boolean boolean0 = NumberUtils.equals(byteArray0, byteArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      boolean boolean0 = NumberUtils.equals((byte[]) null, byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      boolean boolean0 = NumberUtils.equals(byteArray0, (byte[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = new byte[1];
      boolean boolean0 = NumberUtils.equals(byteArray0, byteArray1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)65;
      byte[] byteArray1 = new byte[8];
      boolean boolean0 = NumberUtils.equals(byteArray0, byteArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      short[] shortArray0 = new short[1];
      short[] shortArray1 = new short[1];
      boolean boolean0 = NumberUtils.equals(shortArray1, shortArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      short[] shortArray0 = new short[1];
      boolean boolean0 = NumberUtils.equals(shortArray0, shortArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      short[] shortArray0 = new short[8];
      boolean boolean0 = NumberUtils.equals((short[]) null, shortArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      short[] shortArray0 = new short[9];
      boolean boolean0 = NumberUtils.equals(shortArray0, (short[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      short[] shortArray0 = new short[8];
      short[] shortArray1 = new short[4];
      boolean boolean0 = NumberUtils.equals(shortArray0, shortArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      short[] shortArray0 = new short[7];
      shortArray0[0] = (short)48;
      short[] shortArray1 = new short[7];
      boolean boolean0 = NumberUtils.equals(shortArray0, shortArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      int[] intArray0 = new int[8];
      boolean boolean0 = NumberUtils.equals(intArray0, (int[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      int[] intArray0 = new int[3];
      boolean boolean0 = NumberUtils.equals(intArray0, intArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      int[] intArray0 = new int[7];
      boolean boolean0 = NumberUtils.equals((int[]) null, intArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      int[] intArray0 = new int[2];
      int[] intArray1 = new int[6];
      boolean boolean0 = NumberUtils.equals(intArray0, intArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      int[] intArray0 = new int[2];
      int[] intArray1 = new int[2];
      boolean boolean0 = NumberUtils.equals(intArray1, intArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      int[] intArray0 = new int[2];
      intArray0[1] = (int) (byte)126;
      int[] intArray1 = new int[2];
      boolean boolean0 = NumberUtils.equals(intArray1, intArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      long[] longArray0 = new long[7];
      boolean boolean0 = NumberUtils.equals(longArray0, longArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      long[] longArray0 = new long[1];
      boolean boolean0 = NumberUtils.equals((long[]) null, longArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      long[] longArray0 = new long[5];
      boolean boolean0 = NumberUtils.equals(longArray0, (long[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      long[] longArray0 = new long[9];
      long[] longArray1 = new long[1];
      boolean boolean0 = NumberUtils.equals(longArray0, longArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      long[] longArray0 = new long[4];
      long[] longArray1 = new long[4];
      boolean boolean0 = NumberUtils.equals(longArray0, longArray1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      long[] longArray0 = new long[4];
      longArray0[0] = (-2833L);
      long[] longArray1 = new long[4];
      boolean boolean0 = NumberUtils.equals(longArray0, longArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      float[] floatArray0 = new float[8];
      boolean boolean0 = NumberUtils.equals((float[]) null, floatArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      float[] floatArray0 = new float[9];
      boolean boolean0 = NumberUtils.equals(floatArray0, floatArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      float[] floatArray0 = new float[6];
      boolean boolean0 = NumberUtils.equals(floatArray0, (float[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      float[] floatArray0 = new float[2];
      float[] floatArray1 = new float[0];
      boolean boolean0 = NumberUtils.equals(floatArray0, floatArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      float[] floatArray0 = new float[9];
      float[] floatArray1 = new float[9];
      boolean boolean0 = NumberUtils.equals(floatArray0, floatArray1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      float[] floatArray0 = new float[9];
      floatArray0[7] = (-491.7F);
      float[] floatArray1 = new float[9];
      boolean boolean0 = NumberUtils.equals(floatArray0, floatArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = new double[2];
      boolean boolean0 = NumberUtils.equals(doubleArray0, doubleArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      boolean boolean0 = NumberUtils.equals((double[]) null, (double[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      boolean boolean0 = NumberUtils.equals((double[]) null, doubleArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      boolean boolean0 = NumberUtils.equals(doubleArray0, (double[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      double[] doubleArray1 = new double[3];
      boolean boolean0 = NumberUtils.equals(doubleArray0, doubleArray1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-1997.828);
      double[] doubleArray1 = new double[3];
      boolean boolean0 = NumberUtils.equals(doubleArray0, doubleArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.min((long[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      long[] longArray0 = new long[0];
      // Undeclared exception!
      try { 
        NumberUtils.min(longArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      long[] longArray0 = new long[9];
      longArray0[8] = (-1L);
      long long0 = NumberUtils.min(longArray0);
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.min((int[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        NumberUtils.min(intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      int[] intArray0 = new int[7];
      intArray0[1] = (int) (short) (-2581);
      int int0 = NumberUtils.min(intArray0);
      assertEquals((-2581), int0);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.min((short[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      short[] shortArray0 = new short[0];
      // Undeclared exception!
      try { 
        NumberUtils.min(shortArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      short[] shortArray0 = new short[3];
      shortArray0[0] = (short)65;
      short short0 = NumberUtils.min(shortArray0);
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.min((byte[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        NumberUtils.min(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[1] = (byte) (-1);
      byte byte0 = NumberUtils.min(byteArray0);
      assertEquals((byte) (-1), byte0);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.min((double[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        NumberUtils.min(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 503.5458294285;
      double double0 = NumberUtils.min(doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.min((float[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      float[] floatArray0 = new float[0];
      // Undeclared exception!
      try { 
        NumberUtils.min(floatArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      float[] floatArray0 = new float[6];
      floatArray0[1] = (float) (-1);
      float float0 = NumberUtils.min(floatArray0);
      assertEquals((-1.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.max((long[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      long[] longArray0 = new long[0];
      // Undeclared exception!
      try { 
        NumberUtils.max(longArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      long[] longArray0 = new long[8];
      longArray0[2] = 3728L;
      long long0 = NumberUtils.max(longArray0);
      assertEquals(3728L, long0);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.max((int[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        NumberUtils.max(intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[0] = (-1665);
      int int0 = NumberUtils.max(intArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      short[] shortArray0 = new short[8];
      short short0 = NumberUtils.max(shortArray0);
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.max((short[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      short[] shortArray0 = new short[0];
      // Undeclared exception!
      try { 
        NumberUtils.max(shortArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      short[] shortArray0 = new short[2];
      shortArray0[0] = (short) (-113);
      short short0 = NumberUtils.max(shortArray0);
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.max((byte[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        NumberUtils.max(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[2] = (byte)119;
      byte byte0 = NumberUtils.max(byteArray0);
      assertEquals((byte)119, byte0);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.max((double[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        NumberUtils.max(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (-462.9173524833);
      double double0 = NumberUtils.max(doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.max((float[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      float[] floatArray0 = new float[0];
      // Undeclared exception!
      try { 
        NumberUtils.max(floatArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      NumberUtils numberUtils0 = new NumberUtils();
      float[] floatArray0 = new float[3];
      floatArray0[1] = (float) numberUtils0.FLOAT_ONE;
      float float0 = NumberUtils.max(floatArray0);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      long long0 = NumberUtils.min((long) 0, (-1020L), (long) 0);
      assertEquals((-1020L), long0);
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      long long0 = NumberUtils.min((-2444L), (-2444L), (-2656L));
      assertEquals((-2656L), long0);
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      int int0 = NumberUtils.min((int) (byte)1, 0, (int) (byte)1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      int int0 = NumberUtils.min(336, 336, (-41));
      assertEquals((-41), int0);
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      short short0 = NumberUtils.min((short)51, (short) (-2581), (short)51);
      assertEquals((short) (-2581), short0);
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      short short0 = NumberUtils.min((short)101, (short)101, (short) (-54));
      assertEquals((short) (-54), short0);
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      byte byte0 = NumberUtils.min((byte)57, (byte) (-1), (byte) (-1));
      assertEquals((byte) (-1), byte0);
  }

  @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      byte byte0 = NumberUtils.min((byte)91, (byte)91, (byte)1);
      assertEquals((byte)1, byte0);
  }

  @Test(timeout = 4000)
  public void test122()  throws Throwable  {
      long long0 = NumberUtils.max((long) (short)666, (long) (short)1731, (long) (short)1);
      assertEquals(1731L, long0);
  }

  @Test(timeout = 4000)
  public void test123()  throws Throwable  {
      long long0 = NumberUtils.max((long) 0, 0L, 1L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test124()  throws Throwable  {
      int int0 = NumberUtils.max(46, 1434, 70);
      assertEquals(1434, int0);
  }

  @Test(timeout = 4000)
  public void test125()  throws Throwable  {
      int int0 = NumberUtils.max((int) (byte)0, (-84), 2376);
      assertEquals(2376, int0);
  }

  @Test(timeout = 4000)
  public void test126()  throws Throwable  {
      short short0 = NumberUtils.max((short) (-280), (short)0, (short)0);
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test127()  throws Throwable  {
      short short0 = NumberUtils.max((short) (-1489), (short) (-1489), (short) (-332));
      assertEquals((short) (-332), short0);
  }

  @Test(timeout = 4000)
  public void test128()  throws Throwable  {
      byte byte0 = NumberUtils.max((byte) (-111), (byte)1, (byte) (-111));
      assertEquals((byte)1, byte0);
  }

  @Test(timeout = 4000)
  public void test129()  throws Throwable  {
      byte byte0 = NumberUtils.max((byte)0, (byte)0, (byte)2);
      assertEquals((byte)2, byte0);
  }

  @Test(timeout = 4000)
  public void test130()  throws Throwable  {
      int int0 = NumberUtils.compare(1.0, 0.0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test131()  throws Throwable  {
      int int0 = NumberUtils.compare(232.9F, (-2178.587F));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test132()  throws Throwable  {
      boolean boolean0 = NumberUtils.isDigits((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test133()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("--");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test134()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test135()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("E,R=sk}',");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test136()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0b");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test137()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-0xc0");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test138()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-0x");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test139()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-0xp");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test140()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0xE,R=sk}',");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test141()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test142()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("...");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test143()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("4eN6Q4r'C/&?L%xj");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test144()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0+[");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test145()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("--.t:UZ*@LoFW");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test146()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("2");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test147()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("81e");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test148()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("E");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test149()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-d");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test150()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("D");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test151()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-4f");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test152()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("F");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test153()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("6l");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test154()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("L");
      assertFalse(boolean0);
  }
}
