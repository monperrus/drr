/*
 * This file was automatically generated by EvoSuite
 * Sun Jun 02 18:31:15 GMT 2019
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
      float float0 = NumberUtils.max(3776.573F, 3776.573F, (-2393.4797F));
      assertEquals(3776.573F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      float float0 = NumberUtils.min((-804.4F), 0.0F, 0.0F);
      assertEquals((-804.4F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      double double0 = NumberUtils.toDouble((String) null);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      double double0 = NumberUtils.min((double) Float.NaN, (double) (-1569), 52.3);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      NumberUtils numberUtils0 = new NumberUtils();
      float[] floatArray0 = new float[3];
      floatArray0[1] = (float) (short)numberUtils0.SHORT_MINUS_ONE;
      float float0 = NumberUtils.min(floatArray0);
      assertEquals((-1.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      byte byte0 = NumberUtils.toByte("&cBeFx^[s}MDSZ.");
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      double double0 = NumberUtils.max((-962.99409), 1249.92227, 0.0);
      assertEquals(1249.92227, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      long long0 = NumberUtils.toLong("5Hm:!b*N");
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      int int0 = NumberUtils.toInt("ZM.-\"@:(Yd9>-K8)h%");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      float float0 = NumberUtils.toFloat("}APth${");
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      short short0 = NumberUtils.toShort("->[oip~");
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      int int0 = NumberUtils.toInt((String) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      long long0 = NumberUtils.toLong((String) null, 1588L);
      assertEquals(1588L, long0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      float float0 = NumberUtils.toFloat((String) null);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      double double0 = NumberUtils.toDouble("", 3155.957323);
      assertEquals(3155.957323, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      byte byte0 = NumberUtils.toByte((String) null, (byte)109);
      assertEquals((byte)109, byte0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      short short0 = NumberUtils.toShort((String) null);
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      try { 
        NumberUtils.createNumber(")B5(wK/G1/5");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \")B\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      Number number0 = NumberUtils.createNumber((String) null);
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
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
  public void test020()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("--");
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      try { 
        NumberUtils.createNumber("0x-0xArray cannot be empty.");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Sign character in wrong position
         //
         verifyException("java.lang.Integer", e);
      }
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      try { 
        NumberUtils.createNumber("-0x9G]'hgO.");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"-9G]'hgO.\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      try { 
        NumberUtils.createNumber("[O65LP!gf1}.,.nNf");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // [O65LP!gf1}.,.nNf is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      try { 
        NumberUtils.createNumber(".FEJ.uGAe6");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // .FEJ.uGAe6 is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      try { 
        NumberUtils.createNumber("Array cannot be empty.");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Array cannot be empty. is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      try { 
        NumberUtils.createNumber("c[MeHDE");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // c[MeHDE is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      try { 
        NumberUtils.createNumber("9G]'hgO.");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      try { 
        NumberUtils.createNumber("0E");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // 0E is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      try { 
        NumberUtils.createNumber("0eJx#,z8:VkC78^rLz");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // 0eJx#,z8:VkC78^rLz is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      try { 
        NumberUtils.createNumber("v=vQN4@]a9)D");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // v=vQN4@]a9)D is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("202F");
      assertEquals(202.0F, number0);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("-9L");
      assertEquals((-9L), number0);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("15d");
      assertEquals(15.0, number0);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
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
  public void test035()  throws Throwable  {
      try { 
        NumberUtils.createNumber("]`|u4a7TJ5$1[xhr.%gL");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // ]`|u4a7TJ5$1[xhr.%gL is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("9L");
      assertEquals(9L, number0);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      try { 
        NumberUtils.createNumber("-L");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // -L is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      try { 
        NumberUtils.createNumber("Bae|Q.YA^8Ew4");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      try { 
        NumberUtils.createNumber("0Ev*$|&|<_;2");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      Number number0 = NumberUtils.createNumber(".9");
      assertEquals(0.9F, number0);
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
        NumberUtils.createNumber("d");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // d is not a valid number.
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
      long[] longArray0 = new long[9];
      longArray0[2] = (-958L);
      long long0 = NumberUtils.min(longArray0);
      assertEquals((-958L), long0);
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
      int[] intArray0 = new int[8];
      intArray0[0] = 48;
      int int0 = NumberUtils.min(intArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
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
  public void test055()  throws Throwable  {
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
  public void test056()  throws Throwable  {
      short[] shortArray0 = new short[4];
      shortArray0[2] = (short) (-105);
      short short0 = NumberUtils.min(shortArray0);
      assertEquals((short) (-105), short0);
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
      byte[] byteArray0 = new byte[3];
      byteArray0[1] = (byte) (-28);
      byte byte0 = NumberUtils.min(byteArray0);
      assertEquals((byte) (-28), byte0);
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
      double[] doubleArray0 = new double[9];
      doubleArray0[3] = Double.NaN;
      double double0 = NumberUtils.min(doubleArray0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 910.227;
      double double0 = NumberUtils.min(doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      float[] floatArray0 = new float[3];
      float float0 = NumberUtils.min(floatArray0);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
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
  public void test066()  throws Throwable  {
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
  public void test067()  throws Throwable  {
      float[] floatArray0 = new float[5];
      floatArray0[4] = Float.NaN;
      float float0 = NumberUtils.min(floatArray0);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      long[] longArray0 = new long[2];
      long long0 = NumberUtils.max(longArray0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
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
  public void test070()  throws Throwable  {
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
  public void test071()  throws Throwable  {
      long[] longArray0 = new long[2];
      longArray0[1] = (long) (byte)48;
      long long0 = NumberUtils.max(longArray0);
      assertEquals(48L, long0);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
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
  public void test073()  throws Throwable  {
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
  public void test074()  throws Throwable  {
      int[] intArray0 = new int[9];
      intArray0[1] = 979;
      int int0 = NumberUtils.max(intArray0);
      assertEquals(979, int0);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
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
  public void test076()  throws Throwable  {
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
  public void test077()  throws Throwable  {
      short[] shortArray0 = new short[3];
      shortArray0[1] = (short)1;
      short short0 = NumberUtils.max(shortArray0);
      assertEquals((short)1, short0);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
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
  public void test079()  throws Throwable  {
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
  public void test080()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[2] = (byte)45;
      byte byte0 = NumberUtils.max(byteArray0);
      assertEquals((byte)45, byte0);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
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
  public void test082()  throws Throwable  {
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
  public void test083()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[1] = Double.NaN;
      double double0 = NumberUtils.max(doubleArray0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[1] = 4239.837383826304;
      double double0 = NumberUtils.max(doubleArray0);
      assertEquals(4239.837383826304, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
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
  public void test086()  throws Throwable  {
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
  public void test087()  throws Throwable  {
      float[] floatArray0 = new float[4];
      floatArray0[2] = Float.NaN;
      float float0 = NumberUtils.max(floatArray0);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      float[] floatArray0 = new float[7];
      floatArray0[0] = (float) (-114L);
      float float0 = NumberUtils.max(floatArray0);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      long long0 = NumberUtils.min(1L, (long) (byte) (-114), 1L);
      assertEquals((-114L), long0);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      long long0 = NumberUtils.min((long) 0, 1264L, (-562L));
      assertEquals((-562L), long0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      int int0 = NumberUtils.min((int) (byte)79, (-1569), (int) (byte)79);
      assertEquals((-1569), int0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      int int0 = NumberUtils.min(202, 1689, 43);
      assertEquals(43, int0);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      short short0 = NumberUtils.min((short)0, (short)0, (short)0);
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      short short0 = NumberUtils.min((short)0, (short) (-640), (short)0);
      assertEquals((short) (-640), short0);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      short short0 = NumberUtils.min((short)1834, (short) (-1), (short) (-1216));
      assertEquals((short) (-1216), short0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      byte byte0 = NumberUtils.min((byte)108, (byte) (-1), (byte)91);
      assertEquals((byte) (-1), byte0);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      byte byte0 = NumberUtils.min((byte)0, (byte)78, (byte) (-110));
      assertEquals((byte) (-110), byte0);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      long long0 = NumberUtils.max((-114L), (long) (byte) (-114), 1L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      long long0 = NumberUtils.max(1L, 1355L, 0L);
      assertEquals(1355L, long0);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      int int0 = NumberUtils.max(0, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      int int0 = NumberUtils.max((-893), (int) (short)0, 852);
      assertEquals(852, int0);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      short short0 = NumberUtils.max((short) (-270), (short)68, (short) (-270));
      assertEquals((short)68, short0);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      short short0 = NumberUtils.max((short)0, (short)0, (short)120);
      assertEquals((short)120, short0);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      byte byte0 = NumberUtils.max((byte) (-26), (byte) (-1), (byte) (-1));
      assertEquals((byte) (-1), byte0);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      byte byte0 = NumberUtils.max((byte) (-9), (byte) (-61), (byte) (-1));
      assertEquals((byte) (-1), byte0);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-9L");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber(".");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0Ev*$|&|<_;2");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-0x");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0x16");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0xe,}'<i(2:O#33@");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-0xA}J9xfQm");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("7eK");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("#^%");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("..");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("...");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("7eeK");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("E9=hBe}P+&VB");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("+`CzfXTT8I:faMQ2");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test122()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("--v=vQkN4@]a9)D");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test123()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-0");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test124()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("e");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test125()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("E");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test126()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("15d");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test127()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber(".D");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test128()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("f");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test129()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("F");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test130()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("l");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test131()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-.9L");
      assertFalse(boolean0);
  }
}
