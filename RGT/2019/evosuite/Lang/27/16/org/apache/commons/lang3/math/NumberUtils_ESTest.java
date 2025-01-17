/*
 * This file was automatically generated by EvoSuite
 * Sun Jun 02 21:45:58 GMT 2019
 */

package org.apache.commons.lang3.math;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.apache.commons.lang3.math.NumberUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

 
public class NumberUtils_ESTest {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      float float0 = NumberUtils.max((-637.9139F), (float) (byte)0, 0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      float float0 = NumberUtils.min(913.6F, 0.0F, 1614.8204F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      double double0 = NumberUtils.toDouble((String) null);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      double double0 = NumberUtils.min(0.0, 0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      NumberUtils numberUtils0 = new NumberUtils();
      double double0 = NumberUtils.max((double) numberUtils0.INTEGER_ZERO, (double) numberUtils0.FLOAT_ONE, 0.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      byte byte0 = NumberUtils.toByte("4");
      assertEquals((byte)4, byte0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      long long0 = NumberUtils.toLong((String) null);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      int int0 = NumberUtils.toInt("k5G");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      float float0 = NumberUtils.toFloat("0x");
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      short short0 = NumberUtils.toShort("");
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      int int0 = NumberUtils.toInt((String) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      long long0 = NumberUtils.toLong("UH88.ca@o,");
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      float float0 = NumberUtils.toFloat((String) null, 2484.2F);
      assertEquals(2484.2F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      double double0 = NumberUtils.toDouble("k5G");
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      byte byte0 = NumberUtils.toByte((String) null);
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      short short0 = NumberUtils.toShort((String) null);
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      Number number0 = NumberUtils.createNumber((String) null);
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      try { 
        NumberUtils.createNumber("");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // A blank string is not a valid number
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("--");
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      try { 
        NumberUtils.createNumber("0x,u$-jS'Mf");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \",u$-jS'Mf\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      try { 
        NumberUtils.createNumber("-0x");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"-\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      try { 
        NumberUtils.createNumber(" is not a valid number.");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         //  is not a valid number. is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      try { 
        NumberUtils.createNumber("java.tex9.Normalizer");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // java.tex9.Normalizer is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      try { 
        NumberUtils.createNumber("I-3=/.E3Ra})*e");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // I-3=/.E3Ra})*e is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      try { 
        NumberUtils.createNumber("B%(nuS>ugME%eD");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // B%(nuS>ugME%eD is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("0e1");
      assertEquals((byte)0, number0.byteValue());
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      try { 
        NumberUtils.createNumber("..");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      try { 
        NumberUtils.createNumber("0e");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // 0e is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      try { 
        NumberUtils.createNumber("0eI");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // 0eI is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      try { 
        NumberUtils.createNumber("ALmQD");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // ALmQD is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("-0L");
      assertEquals(0L, number0);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      try { 
        NumberUtils.createNumber("k4) (Fv `57d");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // k4) (Fv `57d is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      try { 
        NumberUtils.createNumber("h{mW.V,?>.rl");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // h{mW.V,?>.rl is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      try { 
        NumberUtils.createNumber("The Array must not be null");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // The Array must not be null is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("1l");
      assertEquals(1L, number0);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      try { 
        NumberUtils.createNumber("-0L=Al");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // -0L=Al is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("0F");
      assertEquals((byte)0, number0.byteValue());
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("8f");
      assertEquals(8.0F, number0);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      try { 
        NumberUtils.createNumber("me}Z=1'FH^7E1");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"me}Z\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("0e0");
      assertEquals(0.0F, number0);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("90e1");
      assertEquals(900.0F, number0);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      Float float0 = NumberUtils.createFloat((String) null);
      assertNull(float0);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      Double double0 = NumberUtils.createDouble((String) null);
      assertNull(double0);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      Integer integer0 = NumberUtils.createInteger((String) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      Long long0 = NumberUtils.createLong((String) null);
      assertNull(long0);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      BigInteger bigInteger0 = NumberUtils.createBigInteger((String) null);
      assertNull(bigInteger0);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      BigDecimal bigDecimal0 = NumberUtils.createBigDecimal((String) null);
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      try { 
        NumberUtils.createNumber("F");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // F is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.min((long[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      long[] longArray0 = new long[0];
      // Undeclared exception!
      try { 
        NumberUtils.min(longArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      long[] longArray0 = new long[8];
      longArray0[0] = (long) 1475;
      long long0 = NumberUtils.min(longArray0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.min((int[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        NumberUtils.min(intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      int[] intArray0 = new int[3];
      intArray0[2] = (-370);
      int int0 = NumberUtils.min(intArray0);
      assertEquals((-370), int0);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.min((short[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      short[] shortArray0 = new short[0];
      // Undeclared exception!
      try { 
        NumberUtils.min(shortArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      short[] shortArray0 = new short[6];
      shortArray0[0] = (short)45;
      short short0 = NumberUtils.min(shortArray0);
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.min((byte[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        NumberUtils.min(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)1;
      byte byte0 = NumberUtils.min(byteArray0);
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.min((double[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        NumberUtils.min(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = Double.NaN;
      double double0 = NumberUtils.min(doubleArray0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      NumberUtils numberUtils0 = new NumberUtils();
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (double) (float)numberUtils0.FLOAT_ONE;
      double double0 = NumberUtils.min(doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.min((float[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      float[] floatArray0 = new float[0];
      // Undeclared exception!
      try { 
        NumberUtils.min(floatArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      float[] floatArray0 = new float[5];
      floatArray0[4] = Float.NaN;
      float float0 = NumberUtils.min(floatArray0);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      float[] floatArray0 = new float[7];
      floatArray0[1] = (-3065.9F);
      float float0 = NumberUtils.min(floatArray0);
      assertEquals((-3065.9F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.max((long[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      long[] longArray0 = new long[0];
      // Undeclared exception!
      try { 
        NumberUtils.max(longArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      long[] longArray0 = new long[8];
      longArray0[1] = (long) 76;
      long long0 = NumberUtils.max(longArray0);
      assertEquals(76L, long0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.max((int[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        NumberUtils.max(intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      int[] intArray0 = new int[3];
      intArray0[0] = (-954);
      int int0 = NumberUtils.max(intArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.max((short[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      short[] shortArray0 = new short[0];
      // Undeclared exception!
      try { 
        NumberUtils.max(shortArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      short[] shortArray0 = new short[9];
      shortArray0[3] = (short)1542;
      short short0 = NumberUtils.max(shortArray0);
      assertEquals((short)1542, short0);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.max((byte[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        NumberUtils.max(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[1] = (byte)1;
      byte byte0 = NumberUtils.max(byteArray0);
      assertEquals((byte)1, byte0);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.max((double[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        NumberUtils.max(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = Double.NaN;
      double double0 = NumberUtils.max(doubleArray0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      NumberUtils numberUtils0 = new NumberUtils();
      double[] doubleArray0 = new double[7];
      doubleArray0[4] = (double) (long)numberUtils0.LONG_ONE;
      double double0 = NumberUtils.max(doubleArray0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.max((float[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      float[] floatArray0 = new float[0];
      // Undeclared exception!
      try { 
        NumberUtils.max(floatArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      float[] floatArray0 = new float[7];
      floatArray0[4] = Float.NaN;
      float float0 = NumberUtils.max(floatArray0);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      float[] floatArray0 = new float[3];
      floatArray0[1] = 4192.809F;
      float float0 = NumberUtils.max(floatArray0);
      assertEquals(4192.809F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      long long0 = NumberUtils.min((-1677L), 1234L, 0L);
      assertEquals((-1677L), long0);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      long long0 = NumberUtils.min(318L, 0L, (-959L));
      assertEquals((-959L), long0);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      int int0 = NumberUtils.min(0, 0, (-4302));
      assertEquals((-4302), int0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      int int0 = NumberUtils.min(733, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      NumberUtils numberUtils0 = new NumberUtils();
      short short0 = NumberUtils.min((short)0, (short)0, (short) numberUtils0.SHORT_MINUS_ONE);
      assertEquals((short) (-1), short0);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      short short0 = NumberUtils.min((short)1580, (short) (-2591), (short) (-1));
      assertEquals((short) (-2591), short0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      byte byte0 = NumberUtils.min((byte)45, (byte)45, (byte)45);
      assertEquals((byte)45, byte0);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      byte byte0 = NumberUtils.min((byte)90, (byte)0, (byte) (-43));
      assertEquals((byte) (-43), byte0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      long long0 = NumberUtils.max(1831L, 0L, 0L);
      assertEquals(1831L, long0);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      long long0 = NumberUtils.max((-33L), 0L, 1234L);
      assertEquals(1234L, long0);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      int int0 = NumberUtils.max((-993), (-993), 1844);
      assertEquals(1844, int0);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      int int0 = NumberUtils.max(0, 76, 0);
      assertEquals(76, int0);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      short short0 = NumberUtils.max((short)69, (short)2152, (short) (-2095));
      assertEquals((short)2152, short0);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      short short0 = NumberUtils.max((short)57, (short)57, (short)432);
      assertEquals((short)432, short0);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      byte byte0 = NumberUtils.max((byte)11, (byte)68, (byte)68);
      assertEquals((byte)68, byte0);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      byte byte0 = NumberUtils.max((byte)0, (byte)0, (byte)57);
      assertEquals((byte)57, byte0);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      boolean boolean0 = NumberUtils.isDigits((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0x0xd?A%qPH");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0e1");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-0x");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-0xc");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0x-0x");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-0xCannot pad a negative amount: ");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("(NWC uu+-,U#/_");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("..");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("...");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0e.I");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("Ee'6i{Je");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0eeI");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("+'6{Je");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("--7nGe/O~EU]z0vHXl$");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0e-I");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test122()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("e");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test123()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("E");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test124()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber(".");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test125()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0eI");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test126()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("d");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test127()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("D");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test128()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("8f");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test129()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("F");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test130()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("1l");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test131()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-0L");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test132()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-L");
      assertFalse(boolean0);
  }
}
