/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 17:52:46 GMT 2014
 */

package org.apache.commons.lang.time;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.TimeZone;
import org.apache.commons.lang.time.DurationFormatUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;
import sun.util.calendar.ZoneInfo;

 
public class DurationFormatUtilsEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = "";
      String string1 = (String)DurationFormatUtils.H;
      assertNotSame(string1, string0);
      assertEquals("H", string1);
      assertNotNull(string1);
      assertFalse(string1.equals((Object)string0));
      
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(string1);
      assertNotSame(string1, string0);
      assertNotNull(durationFormatUtils_Token0);
      assertFalse(string1.equals((Object)string0));
      
      DurationFormatUtils.Token durationFormatUtils_Token1 = new DurationFormatUtils.Token(string0);
      assertNotSame(durationFormatUtils_Token1, durationFormatUtils_Token0);
      assertNotSame(string0, string1);
      assertNotNull(durationFormatUtils_Token1);
      assertFalse(durationFormatUtils_Token1.equals((Object)durationFormatUtils_Token0));
      assertFalse(string0.equals((Object)string1));
      
      boolean boolean0 = durationFormatUtils_Token0.equals((Object) durationFormatUtils_Token1);
      assertNotSame(durationFormatUtils_Token1, durationFormatUtils_Token0);
      assertNotSame(string1, string0);
      assertNotSame(durationFormatUtils_Token0, durationFormatUtils_Token1);
      assertNotSame(string0, string1);
      assertFalse(boolean0);
      assertFalse(durationFormatUtils_Token1.equals((Object)durationFormatUtils_Token0));
      assertFalse(string1.equals((Object)string0));
      assertFalse(durationFormatUtils_Token0.equals((Object)durationFormatUtils_Token1));
      assertFalse(string0.equals((Object)string1));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = "YgPf*pk&LfKw";
      StringBuffer stringBuffer0 = new StringBuffer(string0);
      assertEquals(28, stringBuffer0.capacity());
      assertEquals(12, stringBuffer0.length());
      assertEquals("YgPf*pk&LfKw", stringBuffer0.toString());
      assertNotNull(stringBuffer0);
      
      int int0 = (-33);
      Integer integer0 = new Integer(int0);
      assertEquals((-33), (int)integer0);
      assertTrue(integer0.equals((Object)int0));
      
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(stringBuffer0, (int) integer0);
      assertEquals(28, stringBuffer0.capacity());
      assertEquals(12, stringBuffer0.length());
      assertEquals("YgPf*pk&LfKw", stringBuffer0.toString());
      assertNotNull(durationFormatUtils_Token0);
      assertTrue(integer0.equals((Object)int0));
      
      boolean boolean0 = durationFormatUtils_Token0.equals((Object) durationFormatUtils_Token0);
      assertTrue(boolean0);
      assertEquals(28, stringBuffer0.capacity());
      assertEquals(12, stringBuffer0.length());
      assertEquals("YgPf*pk&LfKw", stringBuffer0.toString());
      assertTrue(integer0.equals((Object)int0));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int int0 = (-1);
      Integer integer0 = new Integer(int0);
      assertEquals((-1), (int)integer0);
      assertTrue(integer0.equals((Object)int0));
      
      String string0 = "t%U`V1X";
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(string0);
      assertNotNull(durationFormatUtils_Token0);
      
      String string1 = (String)DurationFormatUtils.s;
      assertNotSame(string1, string0);
      assertEquals("s", string1);
      assertNotNull(string1);
      assertFalse(string1.equals((Object)string0));
      
      DurationFormatUtils.Token durationFormatUtils_Token1 = new DurationFormatUtils.Token(string1, (int) integer0);
      assertNotSame(string1, string0);
      assertNotSame(durationFormatUtils_Token1, durationFormatUtils_Token0);
      assertNotNull(durationFormatUtils_Token1);
      assertFalse(string1.equals((Object)string0));
      assertTrue(integer0.equals((Object)int0));
      assertFalse(durationFormatUtils_Token1.equals((Object)durationFormatUtils_Token0));
      
      boolean boolean0 = durationFormatUtils_Token0.equals((Object) durationFormatUtils_Token1);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertNotSame(durationFormatUtils_Token1, durationFormatUtils_Token0);
      assertNotSame(durationFormatUtils_Token0, durationFormatUtils_Token1);
      assertFalse(boolean0);
      assertFalse(string1.equals((Object)string0));
      assertTrue(integer0.equals((Object)int0));
      assertFalse(string0.equals((Object)string1));
      assertFalse(durationFormatUtils_Token1.equals((Object)durationFormatUtils_Token0));
      assertFalse(durationFormatUtils_Token0.equals((Object)durationFormatUtils_Token1));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int int0 = (-1);
      Integer integer0 = new Integer(int0);
      assertEquals((-1), (int)integer0);
      assertTrue(integer0.equals((Object)int0));
      
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(integer0, int0);
      assertNotNull(durationFormatUtils_Token0);
      assertTrue(integer0.equals((Object)int0));
      
      boolean boolean0 = durationFormatUtils_Token0.equals((Object) durationFormatUtils_Token0);
      assertTrue(boolean0);
      assertTrue(integer0.equals((Object)int0));
      
      boolean boolean1 = durationFormatUtils_Token0.equals((Object) boolean0);
      assertFalse(boolean1);
      assertFalse(boolean1 == boolean0);
      assertTrue(integer0.equals((Object)int0));
      assertFalse(boolean0 == boolean1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int int0 = 524;
      String string0 = "CzS'Ew";
      boolean boolean0 = false;
      String string1 = DurationFormatUtils.formatDuration((long) int0, string0, boolean0);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertEquals("Cz524Ew", string1);
      assertNotNull(string1);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = new DurationFormatUtils.Token[4];
      int int0 = 524;
      Integer integer0 = new Integer(int0);
      assertEquals(524, (int)integer0);
      assertTrue(integer0.equals((Object)int0));
      
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(integer0, (int) integer0);
      assertNotNull(durationFormatUtils_Token0);
      assertTrue(integer0.equals((Object)int0));
      
      durationFormatUtils_TokenArray0[0] = durationFormatUtils_Token0;
      assertNotNull(durationFormatUtils_TokenArray0[0]);
      
      boolean boolean0 = DurationFormatUtils.Token.containsTokenWithValue(durationFormatUtils_TokenArray0, integer0);
      assertTrue(boolean0);
      assertTrue(integer0.equals((Object)int0));
      
      // Undeclared exception!
      try {
        String string0 = DurationFormatUtils.format(durationFormatUtils_TokenArray0, int0, (int) integer0, (int) integer0, int0, (int) integer0, int0, (int) integer0, boolean0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      long long0 = (-3555L);
      long long1 = 2419200006L;
      String string0 = "tjSoq>I/M7HS4";
      boolean boolean0 = true;
      ZoneInfo zoneInfo0 = (ZoneInfo)TimeZone.getTimeZone(string0);
      assertEquals("GMT", zoneInfo0.getID());
      assertNotNull(zoneInfo0);
      
      String string1 = DurationFormatUtils.formatPeriod(long0, long1, string0, boolean0, (TimeZone) zoneInfo0);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertEquals("tj3561oq>I/0767235614", string1);
      assertEquals("GMT", zoneInfo0.getID());
      assertNotNull(string1);
      assertFalse(long1 == long0);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertFalse(long0 == long1);
  }

  //@Test(timeout = 4000)
  public void test07()  throws Throwable  {
      long long0 = (-14L);
      String string0 = "";
      long long1 = 2419200000L;
      String string1 = (String)DurationFormatUtils.H;
      assertNotSame(string1, string0);
      assertEquals("H", string1);
      assertNotNull(string1);
      assertFalse(string1.equals((Object)string0));
      
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(string1);
      assertNotSame(string1, string0);
      assertNotNull(durationFormatUtils_Token0);
      assertFalse(string1.equals((Object)string0));
      
      boolean boolean0 = durationFormatUtils_Token0.equals((Object) durationFormatUtils_Token0);
      assertNotSame(string1, string0);
      assertTrue(boolean0);
      assertFalse(string1.equals((Object)string0));
      
      ZoneInfo zoneInfo0 = (ZoneInfo)TimeZone.getDefault();
      assertEquals("GMT", zoneInfo0.getID());
      assertNotNull(zoneInfo0);
      
      String string2 = DurationFormatUtils.formatPeriod(long0, long1, string0, boolean0, (TimeZone) zoneInfo0);
      assertNotSame(string0, string1);
      assertNotSame(string0, string2);
      assertNotSame(string2, string0);
      assertNotSame(string2, string1);
      assertNotSame(string1, string2);
      assertNotSame(string1, string0);
      assertEquals("", string2);
      assertEquals("GMT", zoneInfo0.getID());
      assertNotNull(string2);
      assertTrue(string0.equals((Object)string2));
      assertFalse(string0.equals((Object)string1));
      assertFalse(long0 == long1);
      assertTrue(string2.equals((Object)string0));
      assertFalse(string2.equals((Object)string1));
      assertFalse(string1.equals((Object)string2));
      assertFalse(string1.equals((Object)string0));
      assertFalse(long1 == long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      long long0 = (-15L);
      long long1 = 2419200102L;
      String string0 = DurationFormatUtils.formatPeriodISO(long0, long1);
      assertEquals("P0Y0M28DT0H0M0.117S", string0);
      assertNotNull(string0);
      assertFalse(long0 == long1);
      assertFalse(long1 == long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = new DurationFormatUtils.Token[4];
      int int0 = 524;
      Integer integer0 = new Integer(int0);
      assertEquals(524, (int)integer0);
      assertTrue(integer0.equals((Object)int0));
      
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(integer0, (int) integer0);
      assertNotNull(durationFormatUtils_Token0);
      assertTrue(integer0.equals((Object)int0));
      
      durationFormatUtils_TokenArray0[0] = durationFormatUtils_Token0;
      assertNotNull(durationFormatUtils_TokenArray0[0]);
      
      boolean boolean0 = DurationFormatUtils.Token.containsTokenWithValue(durationFormatUtils_TokenArray0, integer0);
      assertTrue(boolean0);
      assertTrue(integer0.equals((Object)int0));
      
      String string0 = DurationFormatUtils.formatDurationWords((long) integer0, boolean0, boolean0);
      assertEquals("0 seconds", string0);
      assertNotNull(string0);
      assertTrue(integer0.equals((Object)int0));
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      long long0 = 3600002L;
      boolean boolean0 = true;
      String string0 = DurationFormatUtils.formatDurationWords(long0, boolean0, boolean0);
      assertEquals("1 hour", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      long long0 = 86400000L;
      boolean boolean0 = true;
      String string0 = DurationFormatUtils.formatDurationWords(long0, boolean0, boolean0);
      assertEquals("1 day", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int int0 = (-1);
      Integer integer0 = new Integer(int0);
      assertEquals((-1), (int)integer0);
      assertTrue(integer0.equals((Object)int0));
      
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(integer0, int0);
      assertNotNull(durationFormatUtils_Token0);
      assertTrue(integer0.equals((Object)int0));
      
      String string0 = "t%U`V1X";
      DurationFormatUtils.Token durationFormatUtils_Token1 = new DurationFormatUtils.Token(string0);
      assertNotSame(durationFormatUtils_Token1, durationFormatUtils_Token0);
      assertNotNull(durationFormatUtils_Token1);
      assertFalse(durationFormatUtils_Token1.equals((Object)durationFormatUtils_Token0));
      
      boolean boolean0 = durationFormatUtils_Token1.equals((Object) durationFormatUtils_Token0);
      assertNotSame(durationFormatUtils_Token1, durationFormatUtils_Token0);
      assertNotSame(durationFormatUtils_Token0, durationFormatUtils_Token1);
      assertFalse(boolean0);
      assertFalse(durationFormatUtils_Token1.equals((Object)durationFormatUtils_Token0));
      assertFalse(durationFormatUtils_Token0.equals((Object)durationFormatUtils_Token1));
      assertTrue(integer0.equals((Object)int0));
      
      String string1 = DurationFormatUtils.formatDurationWords((long) integer0, boolean0, boolean0);
      assertNotSame(durationFormatUtils_Token1, durationFormatUtils_Token0);
      assertNotSame(string1, string0);
      assertNotSame(durationFormatUtils_Token0, durationFormatUtils_Token1);
      assertNotSame(string0, string1);
      assertEquals("0 days 0 hours 0 minutes 0 seconds", string1);
      assertNotNull(string1);
      assertFalse(durationFormatUtils_Token1.equals((Object)durationFormatUtils_Token0));
      assertFalse(string1.equals((Object)string0));
      assertFalse(durationFormatUtils_Token0.equals((Object)durationFormatUtils_Token1));
      assertFalse(string0.equals((Object)string1));
      assertTrue(integer0.equals((Object)int0));
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      boolean boolean0 = true;
      long long0 = 60000L;
      String string0 = DurationFormatUtils.formatDurationWords(long0, boolean0, boolean0);
      assertEquals("1 minute", string0);
      assertNotNull(string0);
      
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(string0);
      assertNotNull(durationFormatUtils_Token0);
      
      String string1 = durationFormatUtils_Token0.toString();
      assertSame(string1, string0);
      assertSame(string0, string1);
      assertEquals("1 minute", string1);
      assertNotNull(string1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DurationFormatUtils durationFormatUtils0 = new DurationFormatUtils();
      assertNotNull(durationFormatUtils0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      long long0 = 3600002L;
      String string0 = DurationFormatUtils.formatDurationHMS(long0);
      assertEquals("1:00:00.002", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      long long0 = 3600002L;
      String string0 = DurationFormatUtils.formatDurationISO(long0);
      assertEquals("P0Y0M0DT1H0M0.002S", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      int int0 = 524;
      String string0 = "W^V>Wr*;qBy9e";
      String string1 = DurationFormatUtils.formatPeriod((long) int0, (long) int0, string0);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertEquals("W^V>Wr*;qB09e", string1);
      assertNotNull(string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
  }
}
