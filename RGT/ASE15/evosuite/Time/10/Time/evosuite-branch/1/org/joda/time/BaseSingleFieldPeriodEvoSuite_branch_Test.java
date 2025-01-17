/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 15:47:16 GMT 2014
 */

package org.joda.time;

import static org.junit.Assert.*;
import org.junit.Test;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.Minutes;
import org.joda.time.Months;
import org.joda.time.MutableDateTime;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.Seconds;
import org.joda.time.TimeOfDay;
import org.joda.time.Weeks;
import org.joda.time.YearMonthDay;
import org.joda.time.Years;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

 
public class BaseSingleFieldPeriodEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int int0 = 20;
      Minutes minutes0 = Minutes.ONE;
      assertEquals(1, minutes0.size());
      assertNotNull(minutes0);
      
      Minutes minutes1 = minutes0.dividedBy(int0);
      assertEquals(1, minutes0.size());
      assertEquals(1, minutes1.size());
      assertNotSame(minutes0, minutes1);
      assertNotSame(minutes1, minutes0);
      assertNotNull(minutes1);
      assertFalse(minutes0.equals((Object)minutes1));
      assertFalse(minutes1.equals((Object)minutes0));
      
      int int1 = minutes1.compareTo((BaseSingleFieldPeriod) minutes0);
      assertEquals(1, minutes0.size());
      assertEquals(1, minutes1.size());
      assertNotSame(minutes0, minutes1);
      assertNotSame(minutes1, minutes0);
      assertEquals((-1), int1);
      assertFalse(minutes0.equals((Object)minutes1));
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertFalse(minutes1.equals((Object)minutes0));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Months months0 = Months.ELEVEN;
      assertEquals(1, months0.size());
      assertNotNull(months0);
      
      Months months1 = Months.ONE;
      assertEquals(1, months1.size());
      assertNotSame(months1, months0);
      assertNotNull(months1);
      assertFalse(months1.equals((Object)months0));
      
      int int0 = months0.compareTo((BaseSingleFieldPeriod) months1);
      assertEquals(1, months1.size());
      assertEquals(1, months0.size());
      assertNotSame(months1, months0);
      assertNotSame(months0, months1);
      assertEquals(1, int0);
      assertFalse(months1.equals((Object)months0));
      assertFalse(months0.equals((Object)months1));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Seconds seconds0 = Seconds.MIN_VALUE;
      assertEquals(1, seconds0.size());
      assertNotNull(seconds0);
      
      Weeks weeks0 = seconds0.toStandardWeeks();
      assertEquals(1, seconds0.size());
      assertEquals(1, weeks0.size());
      assertNotNull(weeks0);
      
      Hours hours0 = Hours.SIX;
      assertEquals(1, hours0.size());
      assertNotNull(hours0);
      
      // Undeclared exception!
      try {
        int int0 = weeks0.compareTo((BaseSingleFieldPeriod) hours0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class org.joda.time.Weeks cannot be compared to class org.joda.time.Hours
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Months months0 = Months.ELEVEN;
      assertEquals(1, months0.size());
      assertNotNull(months0);
      
      int int0 = months0.compareTo((BaseSingleFieldPeriod) months0);
      assertEquals(1, months0.size());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int int0 = (-1552);
      Minutes minutes0 = Minutes.ONE;
      assertEquals(1, minutes0.size());
      assertNotNull(minutes0);
      
      Period period0 = Period.millis(int0);
      assertNotNull(period0);
      
      Minutes minutes1 = Minutes.standardMinutesIn((ReadablePeriod) period0);
      assertEquals(1, minutes1.size());
      assertNotSame(minutes1, minutes0);
      assertNotNull(minutes1);
      assertFalse(minutes1.equals((Object)minutes0));
      
      boolean boolean0 = minutes0.equals((Object) minutes1);
      assertEquals(1, minutes0.size());
      assertEquals(1, minutes1.size());
      assertNotSame(minutes0, minutes1);
      assertNotSame(minutes1, minutes0);
      assertFalse(boolean0);
      assertFalse(minutes0.equals((Object)minutes1));
      assertFalse(minutes1.equals((Object)minutes0));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Weeks weeks0 = Weeks.ZERO;
      assertEquals(1, weeks0.size());
      assertNotNull(weeks0);
      
      int int0 = 1901;
      Weeks weeks1 = weeks0.plus(int0);
      assertEquals(1, weeks1.size());
      assertEquals(1, weeks0.size());
      assertNotSame(weeks1, weeks0);
      assertNotSame(weeks0, weeks1);
      assertNotNull(weeks1);
      assertFalse(weeks1.equals((Object)weeks0));
      assertFalse(weeks0.equals((Object)weeks1));
      
      Weeks weeks2 = weeks0.plus(weeks1);
      assertEquals(1, weeks1.size());
      assertEquals(1, weeks0.size());
      assertEquals(1, weeks2.size());
      assertNotSame(weeks1, weeks2);
      assertNotSame(weeks1, weeks0);
      assertNotSame(weeks0, weeks1);
      assertNotSame(weeks0, weeks2);
      assertNotSame(weeks2, weeks0);
      assertNotSame(weeks2, weeks1);
      assertNotNull(weeks2);
      assertFalse(weeks1.equals((Object)weeks0));
      assertTrue(weeks1.equals((Object)weeks2));
      assertFalse(weeks0.equals((Object)weeks1));
      assertFalse(weeks0.equals((Object)weeks2));
      assertTrue(weeks2.equals((Object)weeks1));
      assertFalse(weeks2.equals((Object)weeks0));
      
      boolean boolean0 = weeks2.equals((Object) weeks1);
      assertEquals(1, weeks1.size());
      assertEquals(1, weeks0.size());
      assertEquals(1, weeks2.size());
      assertNotSame(weeks1, weeks2);
      assertNotSame(weeks1, weeks0);
      assertNotSame(weeks0, weeks1);
      assertNotSame(weeks0, weeks2);
      assertNotSame(weeks2, weeks0);
      assertNotSame(weeks2, weeks1);
      assertTrue(boolean0);
      assertFalse(weeks1.equals((Object)weeks0));
      assertTrue(weeks1.equals((Object)weeks2));
      assertFalse(weeks0.equals((Object)weeks1));
      assertFalse(weeks0.equals((Object)weeks2));
      assertTrue(weeks2.equals((Object)weeks1));
      assertFalse(weeks2.equals((Object)weeks0));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Hours hours0 = Hours.ONE;
      assertEquals(1, hours0.size());
      assertNotNull(hours0);
      
      int int0 = (-1272);
      Years years0 = Years.years(int0);
      assertEquals(1, years0.size());
      assertNotNull(years0);
      
      boolean boolean0 = years0.equals((Object) hours0);
      assertEquals(1, years0.size());
      assertEquals(1, hours0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Days days0 = Days.SEVEN;
      assertEquals(1, days0.size());
      assertNotNull(days0);
      
      int int0 = 39;
      Minutes minutes0 = days0.toStandardMinutes();
      assertEquals(1, minutes0.size());
      assertEquals(1, days0.size());
      assertNotNull(minutes0);
      
      Integer integer0 = Integer.valueOf(int0);
      assertEquals(39, (int)integer0);
      
      boolean boolean0 = minutes0.equals((Object) integer0);
      assertEquals(1, minutes0.size());
      assertEquals(1, days0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Minutes minutes0 = Minutes.TWO;
      assertEquals(1, minutes0.size());
      assertNotNull(minutes0);
      
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
      assertEquals("minuteOfHour", dateTimeFieldType0.getName());
      assertEquals("minuteOfHour", dateTimeFieldType0.toString());
      assertNotNull(dateTimeFieldType0);
      
      DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
      assertEquals("minutes", durationFieldType0.getName());
      assertEquals("minutes", durationFieldType0.toString());
      assertEquals("minuteOfHour", dateTimeFieldType0.getName());
      assertEquals("minuteOfHour", dateTimeFieldType0.toString());
      assertNotNull(durationFieldType0);
      
      boolean boolean0 = minutes0.isSupported(durationFieldType0);
      assertEquals(1, minutes0.size());
      assertEquals("minutes", durationFieldType0.getName());
      assertEquals("minutes", durationFieldType0.toString());
      assertEquals("minuteOfHour", dateTimeFieldType0.getName());
      assertEquals("minuteOfHour", dateTimeFieldType0.toString());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Weeks weeks0 = Weeks.MIN_VALUE;
      assertEquals(1, weeks0.size());
      assertNotNull(weeks0);
      
      DurationFieldType durationFieldType0 = DurationFieldType.seconds();
      assertEquals("seconds", durationFieldType0.toString());
      assertEquals("seconds", durationFieldType0.getName());
      assertNotNull(durationFieldType0);
      
      boolean boolean0 = weeks0.isSupported(durationFieldType0);
      assertEquals("seconds", durationFieldType0.toString());
      assertEquals("seconds", durationFieldType0.getName());
      assertEquals(1, weeks0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Seconds seconds0 = Seconds.MIN_VALUE;
      assertEquals(1, seconds0.size());
      assertNotNull(seconds0);
      
      PeriodType periodType0 = seconds0.getPeriodType();
      assertEquals(1, periodType0.size());
      assertEquals("Seconds", periodType0.getName());
      assertEquals(1, seconds0.size());
      assertNotNull(periodType0);
      
      int int0 = 0;
      DurationFieldType durationFieldType0 = periodType0.getFieldType(int0);
      assertEquals(1, periodType0.size());
      assertEquals("Seconds", periodType0.getName());
      assertEquals(1, seconds0.size());
      assertEquals("seconds", durationFieldType0.toString());
      assertEquals("seconds", durationFieldType0.getName());
      assertNotNull(durationFieldType0);
      
      int int1 = seconds0.get(durationFieldType0);
      assertEquals(1, periodType0.size());
      assertEquals("Seconds", periodType0.getName());
      assertEquals(1, seconds0.size());
      assertEquals("seconds", durationFieldType0.toString());
      assertEquals("seconds", durationFieldType0.getName());
      assertEquals(Integer.MIN_VALUE, int1);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Period period0 = Period.ZERO;
      assertNotNull(period0);
      
      Days days0 = period0.toStandardDays();
      assertEquals(1, days0.size());
      assertNotNull(days0);
      
      int int0 = 6;
      DurationFieldType durationFieldType0 = period0.getFieldType(int0);
      assertEquals("seconds", durationFieldType0.getName());
      assertEquals("seconds", durationFieldType0.toString());
      assertNotNull(durationFieldType0);
      
      int int1 = days0.get(durationFieldType0);
      assertEquals("seconds", durationFieldType0.getName());
      assertEquals("seconds", durationFieldType0.toString());
      assertEquals(1, days0.size());
      assertEquals(0, int1);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int int0 = 6;
      Months months0 = Months.TEN;
      assertEquals(1, months0.size());
      assertNotNull(months0);
      
      // Undeclared exception!
      try {
        int int1 = months0.getValue(int0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // 6
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Days days0 = Days.SEVEN;
      assertEquals(1, days0.size());
      assertNotNull(days0);
      
      int int0 = 39;
      // Undeclared exception!
      try {
        DurationFieldType durationFieldType0 = days0.getFieldType(int0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // 39
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ReadablePeriod readablePeriod0 = null;
      Weeks weeks0 = Weeks.standardWeeksIn(readablePeriod0);
      assertEquals(1, weeks0.size());
      assertNotNull(weeks0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Years years0 = Years.MAX_VALUE;
      assertEquals(1, years0.size());
      assertNotNull(years0);
      
      // Undeclared exception!
      try {
        Minutes minutes0 = Minutes.standardMinutesIn((ReadablePeriod) years0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot convert period to duration as years is not precise in the period P2147483647Y
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      long long0 = 7L;
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      assertNotNull(iSOChronology0);
      
      LenientChronology lenientChronology0 = LenientChronology.getInstance((Chronology) iSOChronology0);
      assertNotNull(lenientChronology0);
      
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)lenientChronology0.getZone();
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertNotNull(fixedDateTimeZone0);
      
      TimeOfDay timeOfDay0 = new TimeOfDay(long0, (Chronology) lenientChronology0);
      assertEquals(4, timeOfDay0.size());
      assertNotNull(timeOfDay0);
      
      LocalDateTime localDateTime0 = LocalDateTime.now((DateTimeZone) fixedDateTimeZone0);
      assertEquals(4, localDateTime0.size());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertNotNull(localDateTime0);
      
      // Undeclared exception!
      try {
        Months months0 = Months.monthsBetween((ReadablePartial) timeOfDay0, (ReadablePartial) localDateTime0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      assertEquals(4, localDateTime0.size());
      assertNotNull(localDateTime0);
      
      LocalDate localDate0 = localDateTime0.toLocalDate();
      assertEquals(3, localDate0.size());
      assertEquals(4, localDateTime0.size());
      assertNotNull(localDate0);
      
      // Undeclared exception!
      try {
        Hours hours0 = Hours.hoursBetween((ReadablePartial) localDate0, (ReadablePartial) localDateTime0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      long long0 = 16L;
      YearMonthDay yearMonthDay0 = new YearMonthDay(long0);
      assertEquals(3, yearMonthDay0.size());
      assertNotNull(yearMonthDay0);
      
      ReadablePartial readablePartial0 = null;
      // Undeclared exception!
      try {
        Weeks weeks0 = Weeks.weeksBetween((ReadablePartial) yearMonthDay0, readablePartial0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Chronology chronology0 = null;
      YearMonthDay yearMonthDay0 = new YearMonthDay(chronology0);
      assertEquals(3, yearMonthDay0.size());
      assertNotNull(yearMonthDay0);
      
      Minutes minutes0 = Minutes.minutesBetween((ReadablePartial) yearMonthDay0, (ReadablePartial) yearMonthDay0);
      assertEquals(3, yearMonthDay0.size());
      assertEquals(1, minutes0.size());
      assertNotNull(minutes0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ReadablePartial readablePartial0 = null;
      // Undeclared exception!
      try {
        Minutes minutes0 = Minutes.minutesBetween(readablePartial0, readablePartial0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
      }
  }

  //@Test(timeout = 4000)
  public void test21()  throws Throwable  {
      int int0 = 2230;
      TimeOfDay timeOfDay0 = new TimeOfDay((long) int0);
      assertEquals(4, timeOfDay0.size());
      assertNotNull(timeOfDay0);
      
      ReadableInstant readableInstant0 = null;
      DateTime dateTime0 = timeOfDay0.toDateTime(readableInstant0);
      assertEquals(4, timeOfDay0.size());
      assertEquals(1392339602230L, dateTime0.getMillis());
      assertNotNull(dateTime0);
      
      // Undeclared exception!
      try {
        Days days0 = Days.daysBetween((ReadableInstant) dateTime0, readableInstant0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadableInstant objects must not be null
         //
      }
  }

  //@Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      assertNotNull(copticChronology0);
      
      MutableDateTime mutableDateTime0 = MutableDateTime.now((Chronology) copticChronology0);
      assertEquals(0, mutableDateTime0.getRoundingMode());
      assertEquals(1392409281320L, mutableDateTime0.getMillis());
      assertNotNull(mutableDateTime0);
      
      Months months0 = Months.monthsBetween((ReadableInstant) mutableDateTime0, (ReadableInstant) mutableDateTime0);
      assertEquals(0, mutableDateTime0.getRoundingMode());
      assertEquals(1392409281320L, mutableDateTime0.getMillis());
      assertEquals(1, months0.size());
      assertNotNull(months0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ReadableInstant readableInstant0 = null;
      // Undeclared exception!
      try {
        Seconds seconds0 = Seconds.secondsBetween(readableInstant0, readableInstant0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadableInstant objects must not be null
         //
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Years years0 = Years.MIN_VALUE;
      assertEquals(1, years0.size());
      assertNotNull(years0);
      
      MutablePeriod mutablePeriod0 = years0.toMutablePeriod();
      assertEquals(1, years0.size());
      assertNotNull(mutablePeriod0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Period period0 = Period.ZERO;
      assertNotNull(period0);
      
      Days days0 = period0.toStandardDays();
      assertEquals(1, days0.size());
      assertNotNull(days0);
      
      Period period1 = days0.toPeriod();
      assertEquals(1, days0.size());
      assertNotSame(period0, period1);
      assertNotSame(period1, period0);
      assertNotNull(period1);
      assertTrue(period0.equals((Object)period1));
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test26() {}
//   @Test(timeout = 4000)
//   public void test26()  throws Throwable  {
//       Months months0 = Months.ELEVEN;
//       assertEquals(1, months0.size());
//       assertNotNull(months0);
//       
//       int int0 = months0.hashCode();
//       assertEquals(1, months0.size());
//       assertEquals(12691, int0);
//   }
}
