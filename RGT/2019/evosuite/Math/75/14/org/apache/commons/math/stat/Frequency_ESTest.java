/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 24 12:16:30 GMT 2019
 */

package org.apache.commons.math.stat;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Comparator;
import org.apache.commons.math.stat.Frequency;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;


public class Frequency_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Frequency frequency0 = new Frequency((Comparator<?>) null);
      frequency0.addValue(1071L);
      long long0 = frequency0.getCumFreq(1289L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      double double0 = frequency0.getCumPct((Object) "2Is3Y");
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.clear();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      double double0 = frequency0.getPct((Object) "");
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      double double0 = frequency0.getPct((-1L));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount('2');
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      long long0 = frequency0.getCumFreq('i');
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      double double0 = frequency0.getPct((-1193));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      double double0 = frequency0.getCumPct('A');
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Long long0 = new Long(1387L);
      frequency0.addValue((Object) long0);
      frequency0.addValue(0);
      Long long1 = new Long(0L);
      long long2 = frequency0.getCumFreq((Object) long1);
      assertEquals(1L, long2);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount((Object) "2Is3Y");
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount((-785));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      double double0 = frequency0.getCumPct(0L);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      double double0 = frequency0.getPct('z');
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      double double0 = frequency0.getCumPct((-1));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(0);
      frequency0.addValue(integer0);
      String string0 = frequency0.toString();
      assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      String string0 = frequency0.toString();
      assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \n", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        frequency0.addValue(object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // class (java.lang.Object) does not implement Comparable
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-2078));
      frequency0.addValue((Object) integer0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((Object) "jfd6o*afR");
      frequency0.addValue((Object) "jfd6o*afR");
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(2815);
      long long0 = frequency0.getCount((Comparable<?>) integer0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('V');
      Integer integer0 = new Integer(0);
      long long0 = frequency0.getCumFreq((Comparable<?>) integer0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(356, 356, 356, (-1746), 1052).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.addValue('}');
      long long0 = frequency0.getCumFreq((-1L));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(1);
      frequency0.addValue(integer0);
      long long0 = frequency0.getCumFreq((-134));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.hashCode();
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      boolean boolean0 = frequency0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      Frequency frequency1 = new Frequency();
      boolean boolean0 = frequency0.equals(frequency1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      boolean boolean0 = frequency0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-1657));
      frequency0.addValue(integer0);
      Frequency frequency1 = new Frequency();
      boolean boolean0 = frequency0.equals(frequency1);
      assertFalse(boolean0);
  }
}
