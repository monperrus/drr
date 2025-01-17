/*
 * This file was automatically generated by EvoSuite
 * Sat Jun 22 11:49:43 GMT 2019
 */

package org.jfree.data.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.ParsePosition;
import java.time.Instant;
import java.time.format.FormatStyle;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.text.MockSimpleDateFormat;
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.jfree.data.time.Day;
import org.jfree.data.time.FixedMillisecond;
import org.jfree.data.time.Hour;
import org.jfree.data.time.Millisecond;
import org.jfree.data.time.Minute;
import org.jfree.data.time.Month;
import org.jfree.data.time.Quarter;
import org.jfree.data.time.RegularTimePeriod;
import org.jfree.data.time.Second;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesDataItem;
import org.jfree.data.time.Week;
import org.jfree.data.time.Year;
import org.jfree.data.xy.XYDataItem;
import org.junit.runner.RunWith;


public class TimeSeries_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, class0);
      timeSeries0.setDomainDescription("Time");
      assertEquals("Time", timeSeries0.getDomainDescription());
      assertEquals("Value", timeSeries0.getRangeDescription());
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "");
      Locale locale0 = Locale.PRC;
      Week week0 = new Week(mockDate0, simpleTimeZone0, locale0);
      TimeSeries timeSeries0 = new TimeSeries(week0);
      Day day0 = new Day(mockDate0, simpleTimeZone0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) day0, (-2527.71901999855));
      timeSeries0.add(timeSeriesDataItem0);
      // Undeclared exception!
      try { 
        timeSeries0.add(timeSeriesDataItem0, true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // You are attempting to add an observation for the time period 14-February-2014 but the series already contains an observation for that time period. Duplicates are not permitted.  Try using the addOrUpdate() method.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Year year0 = new Year();
      Class<RegularTimePeriod> class0 = RegularTimePeriod.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, (String) null, (String) null, class0);
      // Undeclared exception!
      try { 
        timeSeries0.update(0, (Number) null);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, class0);
      timeSeries0.getItems();
      assertEquals("Time", timeSeries0.getDomainDescription());
      assertEquals("Value", timeSeries0.getRangeDescription());
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FormatStyle formatStyle0 = FormatStyle.MEDIUM;
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries(formatStyle0, "(v,JWp-jn:M.", "(v,JWp-jn:M.", class0);
      // Undeclared exception!
      try { 
        timeSeries0.getNextTimePeriod();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Day day0 = new Day();
      Hour hour0 = new Hour((-1), day0);
      Class<TimeSeriesDataItem> class0 = TimeSeriesDataItem.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, (String) null, (String) null, class0);
      timeSeries0.addOrUpdate((RegularTimePeriod) day0, (Number) 23);
      timeSeries0.getValue((RegularTimePeriod) hour0);
      assertEquals(1, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1576L);
      Quarter quarter0 = new Quarter(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(quarter0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) quarter0, (Number) 1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Quarter, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Integer integer0 = new Integer(2);
      Class<Year> class0 = Year.class;
      TimeSeries timeSeries0 = new TimeSeries(integer0, class0);
      Instant instant0 = MockInstant.ofEpochSecond(0L);
      Date date0 = Date.from(instant0);
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(2, "JDBCPieDataset: swallowing exception.");
      Year year0 = new Year(date0, simpleTimeZone0);
      Month month0 = new Month(2, year0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) month0, (-1.0));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Month, but the TimeSeries is expecting an instance of org.jfree.data.time.Year.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      TimeSeries timeSeries1 = new TimeSeries(fixedMillisecond0);
      assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
      assertEquals("Time", timeSeries1.getDomainDescription());
      assertEquals("Value", timeSeries1.getRangeDescription());
      assertEquals(Integer.MAX_VALUE, timeSeries1.getMaximumItemCount());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Month month0 = new Month();
      TimeSeries timeSeries0 = new TimeSeries(month0);
      // Undeclared exception!
      try { 
        timeSeries0.setMaximumItemCount((-2044));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Negative 'maximum' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat();
      Date date0 = mockSimpleDateFormat0.get2DigitYearStart();
      Second second0 = new Second(date0);
      TimeSeries timeSeries0 = new TimeSeries(second0);
      timeSeries0.addOrUpdate((RegularTimePeriod) second0, (double) 59);
      assertEquals(1, timeSeries0.getItemCount());
      
      timeSeries0.setMaximumItemCount(0);
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-166L));
      Year year0 = new Year(mockDate0);
      Class<Quarter> class0 = Quarter.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, "}DN", "", class0);
      // Undeclared exception!
      try { 
        timeSeries0.setMaximumItemAge((-166L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Negative 'periods' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<TimeSeriesDataItem> class0 = TimeSeriesDataItem.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
      timeSeries0.getDataItem((RegularTimePeriod) fixedMillisecond0);
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
      assertEquals("Time", timeSeries0.getDomainDescription());
      assertEquals("Value", timeSeries0.getRangeDescription());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("");
      ParsePosition parsePosition0 = new ParsePosition(2);
      Date date0 = mockSimpleDateFormat0.parse("=PL#=E}sJSW1vC[Ji", parsePosition0);
      Quarter quarter0 = new Quarter(date0);
      TimeSeries timeSeries0 = new TimeSeries(quarter0);
      timeSeries0.addOrUpdate((RegularTimePeriod) quarter0, (Number) 4);
      timeSeries0.getDataItem((RegularTimePeriod) quarter0);
      assertEquals(1, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      TimeSeries timeSeries0 = new TimeSeries(quarter0);
      timeSeries0.addOrUpdate((RegularTimePeriod) quarter0, (Number) 1);
      timeSeries0.getTimePeriods();
      assertEquals(1, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<Month> class0 = Month.class;
      Hour hour0 = minute0.getHour();
      TimeSeries timeSeries0 = new TimeSeries(minute0, "YA", "YA", class0);
      timeSeries0.addOrUpdate((RegularTimePeriod) hour0, (Number) 0);
      timeSeries0.getTimePeriodsUniqueToOtherSeries(timeSeries0);
      assertEquals(1, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<Month> class0 = Month.class;
      Hour hour0 = minute0.getHour();
      TimeSeries timeSeries0 = new TimeSeries(minute0, "YA", "YA", class0);
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) minute0, (RegularTimePeriod) hour0);
      timeSeries1.addOrUpdate((RegularTimePeriod) hour0, (Number) 0);
      timeSeries0.getTimePeriodsUniqueToOtherSeries(timeSeries1);
      assertEquals(1, timeSeries1.getItemCount());
      assertFalse(timeSeries0.equals((Object)timeSeries1));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Day day0 = new Day();
      TimeSeries timeSeries0 = new TimeSeries(day0);
      // Undeclared exception!
      try { 
        timeSeries0.getValue((RegularTimePeriod) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'period' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      TimeSeries timeSeries0 = new TimeSeries(quarter0);
      timeSeries0.getValue((RegularTimePeriod) quarter0);
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
      assertEquals("Time", timeSeries0.getDomainDescription());
      assertEquals("Value", timeSeries0.getRangeDescription());
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat();
      Date date0 = mockSimpleDateFormat0.get2DigitYearStart();
      Second second0 = new Second(date0);
      TimeSeries timeSeries0 = new TimeSeries(second0);
      // Undeclared exception!
      try { 
        timeSeries0.add((TimeSeriesDataItem) null, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'item' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(17, "");
      Locale locale0 = Locale.PRC;
      Week week0 = new Week(mockDate0, simpleTimeZone0, locale0);
      TimeSeries timeSeries0 = new TimeSeries(week0);
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
      
      Day day0 = new Day(mockDate0, simpleTimeZone0);
      timeSeries0.setMaximumItemCount(0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) day0, (double) 0);
      timeSeries0.add(timeSeriesDataItem0);
      assertEquals(0, timeSeries0.getMaximumItemCount());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Hour hour0 = new Hour();
      Minute minute0 = new Minute((-1383), hour0);
      TimeSeries timeSeries0 = new TimeSeries(minute0);
      // Undeclared exception!
      try { 
        timeSeries0.update((RegularTimePeriod) minute0, (Number) 0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TimeSeries.update(TimePeriod, Number):  period does not exist.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Week week0 = new Week();
      TimeSeries timeSeries0 = new TimeSeries(week0);
      Day day0 = new Day();
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) day0, (double) 1);
      timeSeries0.add(timeSeriesDataItem0);
      assertEquals(1, timeSeries0.getItemCount());
      
      timeSeries0.update((RegularTimePeriod) week0, (Number) 1);
      assertEquals("Value", timeSeries0.getRangeDescription());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "");
      Locale locale0 = Locale.PRC;
      Week week0 = new Week(mockDate0, simpleTimeZone0, locale0);
      TimeSeries timeSeries0 = new TimeSeries(week0);
      Day day0 = new Day(mockDate0, simpleTimeZone0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) day0, (-2527.71901999855));
      timeSeries0.add(timeSeriesDataItem0);
      TimeSeries timeSeries1 = timeSeries0.addAndOrUpdate(timeSeries0);
      assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
      assertNotSame(timeSeries1, timeSeries0);
      assertEquals(Integer.MAX_VALUE, timeSeries1.getMaximumItemCount());
      assertEquals(1, timeSeries1.getItemCount());
      assertEquals("Time", timeSeries1.getDomainDescription());
      assertEquals("Value", timeSeries1.getRangeDescription());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<Month> class0 = Month.class;
      Hour hour0 = minute0.getHour();
      TimeSeries timeSeries0 = new TimeSeries(minute0, "YA", "YA", class0);
      TimeSeries timeSeries1 = (TimeSeries)timeSeries0.clone();
      timeSeries0.addOrUpdate((RegularTimePeriod) hour0, (Number) 0);
      timeSeries1.addAndOrUpdate(timeSeries0);
      assertEquals(1, timeSeries1.getItemCount());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      XYDataItem xYDataItem0 = new XYDataItem((-279.330099354), (-279.330099354));
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(xYDataItem0, "hL", "Requires start on or before end.", class0);
      // Undeclared exception!
      try { 
        timeSeries0.addOrUpdate((RegularTimePeriod) null, (Number) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'period' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, class0);
      Second second0 = millisecond0.getSecond();
      timeSeries0.setMaximumItemCount(0);
      timeSeries0.addOrUpdate((RegularTimePeriod) second0, 0.0);
      assertEquals(0, timeSeries0.getMaximumItemCount());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Year year0 = new Year();
      TimeSeries timeSeries0 = new TimeSeries(year0);
      timeSeries0.removeAgedItems((long) 47, true);
      timeSeries0.removeAgedItems((long) 47, true);
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
      assertEquals("Value", timeSeries0.getRangeDescription());
      assertEquals("Time", timeSeries0.getDomainDescription());
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "");
      Locale locale0 = Locale.PRC;
      Week week0 = new Week(mockDate0, simpleTimeZone0, locale0);
      TimeSeries timeSeries0 = new TimeSeries(week0);
      Day day0 = new Day(mockDate0, simpleTimeZone0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) day0, (-2527.71901999855));
      timeSeries0.add(timeSeriesDataItem0);
      timeSeries0.removeAgedItems((-641L), false);
      assertEquals(1, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      mockDate0.setTime((-2147483647));
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-2147483647), "O'");
      Locale locale0 = Locale.CANADA_FRENCH;
      Week week0 = new Week(mockDate0, simpleTimeZone0, locale0);
      TimeSeries timeSeries0 = new TimeSeries(week0);
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
      
      timeSeries0.setMaximumItemAge(1);
      Day day0 = new Day(mockDate0, simpleTimeZone0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) day0, (double) 1);
      timeSeries0.add(timeSeriesDataItem0);
      timeSeries0.removeAgedItems((long) (-2147483647), false);
      assertEquals(1L, timeSeries0.getMaximumItemAge());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      mockDate0.setTime((-2147483647));
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-2147483647), "");
      Locale locale0 = Locale.PRC;
      Week week0 = new Week(mockDate0, simpleTimeZone0, locale0);
      TimeSeries timeSeries0 = new TimeSeries(week0);
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
      
      timeSeries0.setMaximumItemAge(1);
      Day day0 = new Day(mockDate0, simpleTimeZone0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) day0, (double) 1);
      timeSeries0.add(timeSeriesDataItem0);
      timeSeries0.removeAgedItems((long) (-2147483647), true);
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Second second0 = new Second();
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, "_!vAx?hXNl", (String) null, class0);
      timeSeries0.clear();
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
      assertEquals("_!vAx?hXNl", timeSeries0.getDomainDescription());
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Day day0 = new Day();
      Hour hour0 = new Hour();
      Class<TimeSeriesDataItem> class0 = TimeSeriesDataItem.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, (String) null, (String) null, class0);
      timeSeries0.addOrUpdate((RegularTimePeriod) day0, (Number) 23);
      assertEquals(1, timeSeries0.getItemCount());
      
      timeSeries0.clear();
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "");
      Locale locale0 = Locale.PRC;
      Week week0 = new Week(mockDate0, simpleTimeZone0, locale0);
      TimeSeries timeSeries0 = new TimeSeries(week0);
      timeSeries0.delete((RegularTimePeriod) week0);
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
      assertEquals("Value", timeSeries0.getRangeDescription());
      assertEquals("Time", timeSeries0.getDomainDescription());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "");
      Locale locale0 = Locale.PRC;
      Week week0 = new Week(mockDate0, simpleTimeZone0, locale0);
      TimeSeries timeSeries0 = new TimeSeries(week0);
      Day day0 = new Day(mockDate0, simpleTimeZone0);
      timeSeries0.addOrUpdate((RegularTimePeriod) day0, (Number) 1);
      assertEquals(1, timeSeries0.getItemCount());
      
      timeSeries0.delete((RegularTimePeriod) week0);
      assertEquals("Value", timeSeries0.getRangeDescription());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      TimeSeries timeSeries0 = new TimeSeries(quarter0);
      // Undeclared exception!
      try { 
        timeSeries0.delete(529, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires start <= end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "");
      Locale locale0 = Locale.PRC;
      Week week0 = new Week(mockDate0, simpleTimeZone0, locale0);
      TimeSeries timeSeries0 = new TimeSeries(week0);
      Day day0 = new Day(mockDate0, simpleTimeZone0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) day0, (-2527.71901999855));
      timeSeries0.add(timeSeriesDataItem0);
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) day0, (RegularTimePeriod) week0);
      assertEquals(1, timeSeries1.getItemCount());
      assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
      assertEquals("Time", timeSeries1.getDomainDescription());
      assertEquals("Value", timeSeries1.getRangeDescription());
      assertNotSame(timeSeries1, timeSeries0);
      assertEquals(Integer.MAX_VALUE, timeSeries1.getMaximumItemCount());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, "", "k=@o]Vs<", class0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy((-5), (-5));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires start >= 0.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Month month0 = new Month();
      TimeSeries timeSeries0 = new TimeSeries(month0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy(1, (-704));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires start <= end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<Month> class0 = Month.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, "YA", "YA", class0);
      TimeSeries timeSeries1 = timeSeries0.createCopy(0, 0);
      assertEquals(Integer.MAX_VALUE, timeSeries1.getMaximumItemCount());
      assertEquals("YA", timeSeries1.getDomainDescription());
      assertNotSame(timeSeries1, timeSeries0);
      assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
      assertEquals("YA", timeSeries1.getRangeDescription());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Class<TimeSeries> class0 = TimeSeries.class;
      TimeSeries timeSeries0 = new TimeSeries(">K8", class0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy((RegularTimePeriod) null, (RegularTimePeriod) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'start' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<Month> class0 = Month.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, "YA", "YA", class0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy((RegularTimePeriod) minute0, (RegularTimePeriod) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'end' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      RegularTimePeriod regularTimePeriod0 = quarter0.previous();
      TimeSeries timeSeries0 = new TimeSeries(quarter0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy((RegularTimePeriod) quarter0, regularTimePeriod0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires start on or before end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Day day0 = new Day();
      Hour hour0 = new Hour((-1), day0);
      RegularTimePeriod regularTimePeriod0 = hour0.previous();
      Class<TimeSeriesDataItem> class0 = TimeSeriesDataItem.class;
      TimeSeries timeSeries0 = new TimeSeries(regularTimePeriod0, (String) null, (String) null, class0);
      timeSeries0.addOrUpdate((RegularTimePeriod) hour0, (Number) 23);
      timeSeries0.createCopy(regularTimePeriod0, regularTimePeriod0);
      assertEquals(1, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      TimeSeries timeSeries0 = new TimeSeries(quarter0);
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) quarter0, (RegularTimePeriod) quarter0);
      timeSeries0.addOrUpdate((RegularTimePeriod) quarter0, (Number) 1);
      boolean boolean0 = timeSeries0.equals(timeSeries1);
      assertEquals(1, timeSeries0.getItemCount());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Minute minute0 = new Minute();
      TimeSeries timeSeries0 = new TimeSeries(minute0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) minute0, (double) 0);
      boolean boolean0 = timeSeries0.equals(timeSeriesDataItem0);
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
      assertEquals("Time", timeSeries0.getDomainDescription());
      assertEquals("Value", timeSeries0.getRangeDescription());
      assertFalse(boolean0);
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Year year0 = new Year();
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, class0);
      Class<Object> class1 = Object.class;
      TimeSeries timeSeries1 = new TimeSeries("v2M;O'&}SyV", class1);
      boolean boolean0 = timeSeries0.equals(timeSeries1);
      assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
      assertEquals("Value", timeSeries1.getRangeDescription());
      assertEquals("Time", timeSeries1.getDomainDescription());
      assertFalse(boolean0);
      assertEquals(Integer.MAX_VALUE, timeSeries1.getMaximumItemCount());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<Month> class0 = Month.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
      TimeSeries timeSeries1 = new TimeSeries(fixedMillisecond0, "Negative 'periods' argument.", "", class0);
      boolean boolean0 = timeSeries0.equals(timeSeries1);
      assertEquals(Integer.MAX_VALUE, timeSeries1.getMaximumItemCount());
      assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
      assertFalse(boolean0);
      assertEquals("", timeSeries1.getRangeDescription());
      assertEquals("Negative 'periods' argument.", timeSeries1.getDomainDescription());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      TimeSeries timeSeries0 = new TimeSeries(quarter0);
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) quarter0, (RegularTimePeriod) quarter0);
      timeSeries0.setRangeDescription("X<CVS0ix^s1,a");
      boolean boolean0 = timeSeries0.equals(timeSeries1);
      assertEquals("X<CVS0ix^s1,a", timeSeries0.getRangeDescription());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<Month> class0 = Month.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, "YA", "YA", class0);
      Object object0 = timeSeries0.clone();
      timeSeries0.setMaximumItemAge(1000L);
      boolean boolean0 = timeSeries0.equals(object0);
      assertEquals(1000L, timeSeries0.getMaximumItemAge());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Day day0 = new Day();
      TimeSeries timeSeries0 = new TimeSeries(day0);
      TimeSeries timeSeries1 = (TimeSeries)timeSeries0.clone();
      timeSeries1.setMaximumItemCount(1481);
      boolean boolean0 = timeSeries0.equals(timeSeries1);
      assertEquals(1481, timeSeries1.getMaximumItemCount());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      TimeSeries timeSeries0 = new TimeSeries(quarter0);
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) quarter0, (RegularTimePeriod) quarter0);
      timeSeries0.addOrUpdate((RegularTimePeriod) quarter0, (Number) 1);
      timeSeries1.addOrUpdate((RegularTimePeriod) quarter0, (Number) 4);
      boolean boolean0 = timeSeries0.equals(timeSeries1);
      assertEquals(1, timeSeries1.getItemCount());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Minute minute0 = new Minute();
      TimeSeries timeSeries0 = new TimeSeries(minute0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) minute0, (double) 0);
      Class<Minute> class0 = Minute.class;
      timeSeries0.timePeriodClass = class0;
      timeSeries0.add(timeSeriesDataItem0, false);
      TimeSeries timeSeries1 = (TimeSeries)timeSeries0.clone();
      boolean boolean0 = timeSeries0.equals(timeSeries1);
      assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
      assertEquals(Integer.MAX_VALUE, timeSeries1.getMaximumItemCount());
      assertTrue(boolean0);
      assertEquals("Time", timeSeries1.getDomainDescription());
      assertEquals("Value", timeSeries1.getRangeDescription());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<TimeSeries> class0 = TimeSeries.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, (String) null, "", class0);
      timeSeries0.hashCode();
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
      assertEquals("", timeSeries0.getRangeDescription());
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Second second0 = new Second();
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, "_!vAx?hXNl", (String) null, class0);
      timeSeries0.hashCode();
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
      assertEquals("_!vAx?hXNl", timeSeries0.getDomainDescription());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      TimeSeries timeSeries0 = new TimeSeries("v2M;O'&}SyV", (Class) null);
      timeSeries0.hashCode();
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
      assertEquals("Time", timeSeries0.getDomainDescription());
      assertEquals("Value", timeSeries0.getRangeDescription());
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "");
      Locale locale0 = Locale.PRC;
      Week week0 = new Week(mockDate0, simpleTimeZone0, locale0);
      TimeSeries timeSeries0 = new TimeSeries(week0);
      Day day0 = new Day(mockDate0, simpleTimeZone0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) day0, (-2527.71901999855));
      timeSeries0.add(timeSeriesDataItem0);
      timeSeries0.hashCode();
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
      assertEquals("Time", timeSeries0.getDomainDescription());
      assertEquals("Value", timeSeries0.getRangeDescription());
  }
}
