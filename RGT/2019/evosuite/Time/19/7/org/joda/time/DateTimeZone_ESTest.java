/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 24 22:56:28 GMT 2019
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import java.util.Set;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.tz.CachedDateTimeZone;
import org.joda.time.tz.FixedDateTimeZone;
import org.joda.time.tz.NameProvider;
import org.joda.time.tz.Provider;
import org.joda.time.tz.UTCProvider;
import org.junit.runner.RunWith;


public class DateTimeZone_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      assertNotNull(dateTimeZone0);
      
      String string0 = dateTimeZone0.UTC.getShortName((long) 628);
      assertNotNull(string0);
      assertEquals("+00:00", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      Object object0 = ((DateTimeZone)cachedDateTimeZone0).writeReplace();
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-144));
      assertEquals("-144:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("-08:00");
      assertEquals("-08:00", dateTimeZone0.toString());
      assertNotNull(dateTimeZone0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      String string0 = dateTimeZone0.getName((-844L));
      assertNotNull(string0);
      assertEquals("-08:00", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      String string0 = fixedDateTimeZone0.toString();
      assertEquals("UTC", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Set<String> set0 = DateTimeZone.getAvailableIDs();
      assertEquals(572, set0.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NameProvider nameProvider0 = DateTimeZone.getNameProvider();
      DateTimeZone.setNameProvider(nameProvider0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Provider provider0 = DateTimeZone.getProvider();
      assertNotNull(provider0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("WET");
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      assertEquals("WET", timeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimeZone.getDefault();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      assertEquals("America/Los_Angeles", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      DateTimeZone.setDefault(dateTimeZone0);
      assertEquals("America/Los_Angeles", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeZone.setDefault((DateTimeZone) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone must not be null
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      assertEquals("America/Los_Angeles", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("UTC");
      assertEquals("UTC", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("+00:00");
      assertEquals("UTC", dateTimeZone0.getID());
      assertNotNull(dateTimeZone0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(0);
      assertEquals("UTC", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      try { 
        DateTimeZone.forOffsetHoursMinutes(0, 354);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 354
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      try { 
        DateTimeZone.forOffsetHoursMinutes((-4108), (-4108));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -4108
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertNotNull(dateTimeZone1);
      assertEquals("+01:00", dateTimeZone1.getID());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      TimeZone timeZone0 = fixedDateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      assertTrue(dateTimeZone0.isFixed());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(59, "PLT");
      UTCProvider uTCProvider0 = new UTCProvider();
      DateTimeZone.setProvider(uTCProvider0);
      // Undeclared exception!
      try { 
        DateTimeZone.forTimeZone(simpleTimeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id 'PLT' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(Integer.MIN_VALUE);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      // Undeclared exception!
      try { 
        DateTimeZone.forTimeZone(timeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"-k6:31\" is malformed at \"k6:31\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(0);
      assertEquals("UTC", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DateTimeZone.setProvider((Provider) null);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DateTimeZone.setNameProvider((NameProvider) null);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      UTCProvider uTCProvider0 = new UTCProvider();
      DateTimeZone.setProvider(uTCProvider0);
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) null);
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(4, "Australia/Sydney");
      // Undeclared exception!
      try { 
        DateTimeZone.forTimeZone(simpleTimeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id 'Australia/Sydney' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-28378000));
      assertEquals("-07:52:58", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(572, "I6NA");
      DateTimeZone.forTimeZone(simpleTimeZone0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(simpleTimeZone0);
      assertNotNull(dateTimeZone0);
      assertEquals("UTC", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      Locale locale0 = new Locale(")~O#gh*C");
      String string0 = dateTimeZone0.UTC.getShortName((long) 1, locale0);
      assertEquals("+00:00", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(3);
      Locale locale0 = Locale.CHINA;
      String string0 = dateTimeZone0.getShortName((long) 3, locale0);
      assertEquals("+00:00:00.003", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      Locale locale0 = Locale.UK;
      String string0 = fixedDateTimeZone0.getName(0L, locale0);
      assertNotNull(string0);
      assertEquals("+00:00", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(68);
      Locale locale0 = Locale.JAPANESE;
      String string0 = dateTimeZone0.getName(0L, locale0);
      assertEquals("+68:00", string0);
  }

//  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      DateMidnight dateMidnight0 = DateMidnight.now();
      fixedDateTimeZone0.getOffset((ReadableInstant) dateMidnight0);
      assertEquals(1392364800000L, dateMidnight0.getMillis());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      int int0 = fixedDateTimeZone0.getOffset((ReadableInstant) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      boolean boolean0 = dateTimeZone0.isStandardOffset(9972000000L);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      boolean boolean0 = dateTimeZone0.UTC.isStandardOffset((-1879L));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      int int0 = dateTimeZone0.getOffsetFromLocal(4L);
      assertEquals((-28800000), int0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      int int0 = dateTimeZone0.getOffsetFromLocal(9223372036854775807L);
      assertEquals((-28378000), int0);
  }

//  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("WET");
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      LocalDateTime localDateTime0 = LocalDateTime.fromCalendarFields(mockGregorianCalendar0);
      boolean boolean0 = dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertFalse(boolean0);
  }

//  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(59, "PLT");
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(simpleTimeZone0);
      int int0 = dateTimeZone0.getOffsetFromLocal((-9223372036826397876L));
      assertEquals(16092000, int0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      long long0 = dateTimeZone0.convertUTCToLocal((-1479L));
      assertEquals(3598521L, long0);
      assertEquals("+01:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      // Undeclared exception!
      try { 
        dateTimeZone0.convertUTCToLocal((-9223372036826397809L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Adding time zone offset caused overflow
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.convertLocalToUTC((-1L), false, 9223372036854775807L);
      assertEquals(28799999L, long0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      // Undeclared exception!
      try { 
        dateTimeZone0.convertLocalToUTC(9223372036854775807L, true);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Subtracting time zone offset caused overflow
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      // Undeclared exception!
      try { 
        dateTimeZone0.convertLocalToUTC(9223372036854775807L, false);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Subtracting time zone offset caused overflow
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, false);
      assertEquals(28800001L, long0);
  }

//  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("WET");
      long long0 = dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 0);
      assertEquals(28800000L, long0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-4108));
      LocalDateTime localDateTime0 = LocalDateTime.now();
      boolean boolean0 = dateTimeZone0.UTC.isLocalDateTimeGap(localDateTime0);
      assertEquals("-00:00:04.108", dateTimeZone0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.adjustOffset(1, true);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.adjustOffset(1, false);
      assertEquals(1L, long0);
  }
}
