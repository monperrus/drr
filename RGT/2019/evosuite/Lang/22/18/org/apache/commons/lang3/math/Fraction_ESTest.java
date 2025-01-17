/*
 * This file was automatically generated by EvoSuite
 * Sun Jun 02 17:24:21 GMT 2019
 */

package org.apache.commons.lang3.math;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang3.math.Fraction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

 
public class Fraction_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Fraction fraction0 = Fraction.TWO_QUARTERS;
      int int0 = fraction0.intValue();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE_THIRD;
      Fraction fraction1 = fraction0.invert();
      String string0 = fraction1.toProperString();
      assertEquals("3", string0);
      assertEquals(1, fraction1.getDenominator());
      assertEquals(1, fraction0.getProperNumerator());
      assertNotNull(string0);
      assertEquals(0, fraction0.getProperWhole());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Fraction fraction0 = Fraction.getReducedFraction(31, (-1));
      float float0 = fraction0.floatValue();
      assertEquals((-31.0F), float0, 0.01F);
      assertEquals((-31), fraction0.getNumerator());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE_FIFTH;
      long long0 = fraction0.longValue();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE_FIFTH;
      double double0 = fraction0.doubleValue();
      assertEquals(0.2, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Fraction fraction0 = Fraction.TWO_QUARTERS;
      Fraction fraction1 = fraction0.subtract(fraction0);
      assertEquals(0, fraction1.getProperWhole());
      assertEquals(1, fraction1.getDenominator());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getFraction((-388), 0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The denominator must not be zero
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getFraction(Integer.MIN_VALUE, Integer.MIN_VALUE);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: can't negate
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getFraction((-317), Integer.MIN_VALUE);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: can't negate
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getFraction(535, 535, 0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The denominator must not be zero
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getFraction((-1603), (-1603), (-1));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The denominator must not be negative
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getFraction(2, (-711), 2);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The numerator must not be negative
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getFraction((-12207), Integer.MAX_VALUE, 1576);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Numerator too large to represent as an Integer.
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getFraction(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Numerator too large to represent as an Integer.
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getReducedFraction(0, 0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The denominator must not be zero
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getReducedFraction((-1), Integer.MIN_VALUE);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: can't negate
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Fraction fraction0 = Fraction.getReducedFraction(Integer.MIN_VALUE, Integer.MIN_VALUE);
      assertEquals(1, fraction0.getNumerator());
      assertEquals(1.0F, fraction0.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getReducedFraction(Integer.MIN_VALUE, (-12));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: can't negate
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getFraction(1.7976931348623157E308);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The value must not be greater than Integer.MAX_VALUE or NaN
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction("3");
      assertEquals(3.0, fraction0.doubleValue(), 0.01);
      assertEquals(3, fraction0.getNumerator());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getFraction((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The string must not be null
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getFraction("V&.hU:QFc%");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getFraction("6 N [mYa+J/0Mx&N*");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"N [mYa+J\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getFraction("6 N [cYa+J0Mx&N\"*");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // The fraction could not be parsed as the format X Y/Z
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction(2.147483647E9);
      Fraction fraction1 = fraction0.TWO_THIRDS.reduce();
      assertEquals(1, fraction0.getDenominator());
      assertEquals(2, fraction1.getNumerator());
      assertEquals(2.147483647E9, fraction0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE_FIFTH;
      Fraction fraction1 = fraction0.ZERO.reduce();
      assertFalse(fraction1.equals((Object)fraction0));
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction(0, 0, 6004);
      Fraction fraction1 = fraction0.reduce();
      assertEquals(6004, fraction0.getDenominator());
      assertFalse(fraction1.equals((Object)fraction0));
      assertEquals(1, fraction1.getDenominator());
      assertEquals(0, fraction1.getNumerator());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE_THIRD;
      Fraction fraction1 = fraction0.TWO_QUARTERS.reduce();
      assertEquals(2, fraction1.getDenominator());
      assertEquals(1, fraction1.getNumerator());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction((-1479.01200869));
      // Undeclared exception!
      try { 
        fraction0.ZERO.invert();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Unable to invert zero.
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Fraction fraction0 = Fraction.getReducedFraction(Integer.MIN_VALUE, 29);
      // Undeclared exception!
      try { 
        fraction0.invert();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: can't negate numerator
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE_QUARTER;
      Fraction fraction1 = Fraction.getReducedFraction((-1800), (-1800));
      Fraction fraction2 = fraction0.subtract(fraction1);
      Fraction fraction3 = fraction2.divideBy(fraction2);
      assertTrue(fraction3.equals((Object)fraction1));
      assertEquals((-0.75F), fraction2.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Fraction fraction0 = Fraction.getReducedFraction(Integer.MIN_VALUE, 603);
      // Undeclared exception!
      try { 
        fraction0.negate();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: too large to negate
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Fraction fraction0 = Fraction.TWO_QUARTERS;
      Fraction fraction1 = fraction0.negate();
      Fraction fraction2 = fraction1.abs();
      assertEquals(2, fraction2.getNumerator());
      assertEquals((-0.5F), fraction1.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE_FIFTH;
      Fraction fraction1 = fraction0.ONE_HALF.pow(0);
      int int0 = fraction1.compareTo(fraction0);
      assertEquals(1, fraction1.getProperWhole());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE;
      // Undeclared exception!
      try { 
        fraction0.ONE_FIFTH.pow((-4094));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: mul
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Fraction fraction0 = Fraction.getReducedFraction((-514), (-514));
      // Undeclared exception!
      try { 
        fraction0.THREE_FIFTHS.pow(Integer.MIN_VALUE);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: mul
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction((-1787), (-1787));
      Fraction fraction1 = Fraction.getFraction((-1479.3000678033002));
      // Undeclared exception!
      try { 
        fraction0.add(fraction1);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: mul
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE_THIRD;
      // Undeclared exception!
      try { 
        fraction0.ONE_THIRD.pow(1623);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: mulPos
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction(2.147483647E9);
      Fraction fraction1 = fraction0.negate();
      Fraction fraction2 = fraction0.ONE.add(fraction1);
      // Undeclared exception!
      try { 
        fraction2.add(fraction1);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: add
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction(2.147483647E9);
      // Undeclared exception!
      try { 
        fraction0.ONE.add(fraction0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: add
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction(2.147483647E9);
      Fraction fraction1 = fraction0.negate();
      // Undeclared exception!
      try { 
        fraction1.subtract(fraction0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: add
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction(2.147483647E9);
      Fraction fraction1 = fraction0.negate();
      Fraction fraction2 = fraction1.invert();
      // Undeclared exception!
      try { 
        fraction1.ONE_HALF.subtract(fraction2);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: add
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Fraction fraction0 = Fraction.THREE_QUARTERS;
      // Undeclared exception!
      try { 
        fraction0.add((Fraction) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The fraction must not be null
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE_FIFTH;
      Fraction fraction1 = fraction0.ZERO.add(fraction0);
      assertSame(fraction1, fraction0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE_THIRD;
      Fraction fraction1 = Fraction.ZERO;
      Fraction fraction2 = fraction0.add(fraction1);
      assertSame(fraction2, fraction0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE_QUARTER;
      Fraction fraction1 = fraction0.add(fraction0);
      assertEquals(0.5F, fraction1.floatValue(), 0.01F);
      assertEquals(2, fraction1.getDenominator());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE_QUARTER;
      Fraction fraction1 = Fraction.getFraction((-1479.3000678033002));
      Fraction fraction2 = fraction0.divideBy(fraction1);
      Fraction fraction3 = fraction0.add(fraction1);
      // Undeclared exception!
      try { 
        fraction3.subtract(fraction2);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: numerator too large after multiply
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Fraction fraction0 = Fraction.TWO_QUARTERS;
      // Undeclared exception!
      try { 
        fraction0.ONE.multiplyBy((Fraction) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The fraction must not be null
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Fraction fraction0 = Fraction.getReducedFraction(31, (-1));
      Fraction fraction1 = fraction0.ZERO.divideBy(fraction0);
      assertEquals(0, fraction1.getNumerator());
      assertEquals((-31.0), fraction0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Fraction fraction0 = Fraction.getReducedFraction(0, 598);
      Fraction fraction1 = fraction0.THREE_QUARTERS.abs();
      Fraction fraction2 = fraction1.multiplyBy(fraction0);
      assertSame(fraction2, fraction0);
      assertEquals(0.75F, fraction1.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Fraction fraction0 = Fraction.THREE_FIFTHS;
      // Undeclared exception!
      try { 
        fraction0.ZERO.divideBy((Fraction) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The fraction must not be null
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction(0, 0, 6004);
      // Undeclared exception!
      try { 
        fraction0.divideBy(fraction0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The fraction to divide by must not be zero
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE_HALF;
      boolean boolean0 = fraction0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Fraction fraction0 = Fraction.TWO_QUARTERS;
      Fraction fraction1 = Fraction.THREE_QUARTERS;
      boolean boolean0 = fraction1.equals(fraction0);
      assertEquals(3, fraction1.getNumerator());
      assertFalse(fraction0.equals((Object)fraction1));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE_THIRD;
      Fraction fraction1 = Fraction.getFraction("1/3");
      boolean boolean0 = fraction1.equals(fraction0);
      assertTrue(boolean0);
      assertEquals(1, fraction1.getNumerator());
      assertEquals(3, fraction1.getDenominator());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE_THIRD;
      fraction0.TWO_THIRDS.hashCode();
      assertEquals(1, fraction0.getNumerator());
      assertEquals(3, fraction0.getDenominator());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE_THIRD;
      Fraction fraction1 = Fraction.THREE_FIFTHS;
      int int0 = fraction0.compareTo(fraction1);
      assertEquals((-1), int0);
      
      Fraction fraction2 = Fraction.getFraction(0.0);
      assertEquals(0, fraction2.getNumerator());
      
      fraction0.TWO_FIFTHS.hashCode();
      assertEquals(3, fraction0.getDenominator());
      assertEquals(1, fraction0.getNumerator());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Fraction fraction0 = Fraction.ZERO;
      Fraction fraction1 = fraction0.negate();
      int int0 = fraction1.compareTo(fraction0);
      assertEquals(0, int0);
      assertTrue(fraction1.equals((Object)fraction0));
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Fraction fraction0 = Fraction.TWO_QUARTERS;
      Fraction fraction1 = fraction0.negate();
      Fraction fraction2 = fraction1.ONE_HALF.negate();
      int int0 = fraction2.compareTo(fraction1);
      assertEquals(0, int0);
      assertEquals((-0.5), fraction2.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction((-1479.01200869));
      fraction0.toString();
      String string0 = fraction0.toString();
      assertEquals("-1354775/916", string0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE_QUARTER;
      String string0 = fraction0.ZERO.toProperString();
      assertEquals("0", string0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction((double) 1);
      String string0 = fraction0.toProperString();
      assertEquals("1", string0);
      assertNotNull(string0);
      assertEquals(1, fraction0.getDenominator());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction((-1.0));
      String string0 = fraction0.toProperString();
      assertEquals("-1", string0);
      assertEquals(1, fraction0.getDenominator());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE_FIFTH;
      Fraction fraction1 = fraction0.ONE_THIRD.negate();
      String string0 = fraction1.toProperString();
      assertNotNull(string0);
      assertEquals("-1/3", string0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Fraction fraction0 = Fraction.getReducedFraction(2889, 1714);
      String string0 = fraction0.toProperString();
      assertNotNull(string0);
      assertEquals("1 1175/1714", string0);
      assertEquals(1.6855309F, fraction0.floatValue(), 0.01F);
  }
}
