/*
 * This file was automatically generated by EvoSuite
 * Sat Jun 22 12:05:57 GMT 2019
 */

package org.jfree.data.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import java.util.Stack;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.text.MockSimpleDateFormat;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.jfree.data.time.Day;
import org.jfree.data.time.FixedMillisecond;
import org.jfree.data.time.Hour;
import org.jfree.data.time.Millisecond;
import org.jfree.data.time.Minute;
import org.jfree.data.time.Month;
import org.jfree.data.time.RegularTimePeriod;
import org.jfree.data.time.Second;
import org.jfree.data.time.SpreadsheetDate;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesDataItem;
import org.jfree.data.time.Week;
import org.jfree.data.time.Year;
import org.junit.runner.RunWith;


public class TimeSeries_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<Month> class0 = Month.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, class0);
      timeSeries0.setDomainDescription(")^%");
      assertEquals(")^%", timeSeries0.getDomainDescription());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1, 0, 0, 2, 1900, 6);
      Day day0 = new Day(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(day0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) day0, (double) 1);
      // Undeclared exception!
      try { 
        timeSeries0.add(timeSeriesDataItem0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'item' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      TimeSeries timeSeries0 = new TimeSeries(millisecond0);
      // Undeclared exception!
      try { 
        timeSeries0.update(0, (Number) 0);
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
      Day day0 = new Day();
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, class0);
      timeSeries0.getItems();
      assertEquals("Value", timeSeries0.getRangeDescription());
      assertEquals("Time", timeSeries0.getDomainDescription());
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Day day0 = new Day();
      TimeSeries timeSeries0 = new TimeSeries(day0);
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
      Second second0 = new Second();
      Class<Year> class0 = Year.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, class0);
      timeSeries0.addOrUpdate((RegularTimePeriod) second0, (Number) 0);
      timeSeries0.getValue((RegularTimePeriod) second0);
      assertEquals(1, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(1885);
      Date date0 = spreadsheetDate0.toDate();
      Day day0 = new Day(date0);
      TimeSeries timeSeries0 = new TimeSeries(day0);
      timeSeries0.add((RegularTimePeriod) day0, 14.5003278);
      assertEquals(1, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(1885);
      Date date0 = spreadsheetDate0.toDate();
      Day day0 = new Day(date0);
      TimeSeries timeSeries0 = new TimeSeries(day0);
      timeSeries0.add((RegularTimePeriod) day0, (Number) 6, false);
      timeSeries0.getTimePeriodsUniqueToOtherSeries(timeSeries0);
      assertEquals(1, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Minute minute0 = new Minute(mockDate0);
      Day day0 = minute0.getDay();
      TimeSeries timeSeries0 = new TimeSeries(day0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) minute0, (Number) 0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Minute, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      TimeSeries timeSeries1 = new TimeSeries(fixedMillisecond0);
      assertEquals(Integer.MAX_VALUE, timeSeries1.getMaximumItemCount());
      assertEquals("Time", timeSeries1.getDomainDescription());
      assertEquals("Value", timeSeries1.getRangeDescription());
      assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
      
      timeSeries0.setMaximumItemCount(0);
      MockDate mockDate0 = new MockDate(1);
      Day day0 = new Day(mockDate0, fixedMillisecond0.DEFAULT_TIME_ZONE);
      timeSeries0.addOrUpdate((RegularTimePeriod) day0, (Number) 0);
      assertEquals(0, timeSeries0.getMaximumItemCount());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      // Undeclared exception!
      try { 
        timeSeries0.setMaximumItemCount((-22));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Negative 'maximum' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Minute minute0 = new Minute();
      TimeSeries timeSeries0 = new TimeSeries(minute0);
      timeSeries0.addOrUpdate((RegularTimePeriod) minute0, 2316.47646);
      assertEquals(1, timeSeries0.getItemCount());
      
      timeSeries0.setMaximumItemCount(0);
      assertEquals(0, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Day day0 = new Day();
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.setMaximumItemAge((-2217));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Negative 'periods' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Month month0 = new Month();
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, class0);
      timeSeries0.getDataItem((RegularTimePeriod) month0);
      assertEquals("Time", timeSeries0.getDomainDescription());
      assertEquals("Value", timeSeries0.getRangeDescription());
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Month month0 = new Month();
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, class0);
      timeSeries0.addOrUpdate((RegularTimePeriod) month0, (-1442.777130719068));
      timeSeries0.getDataItem((RegularTimePeriod) month0);
      assertEquals(1, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(1261);
      TimeSeries timeSeries0 = new TimeSeries(spreadsheetDate0);
      Hour hour0 = new Hour();
      timeSeries0.addOrUpdate((RegularTimePeriod) hour0, (Number) 7);
      timeSeries0.getTimePeriods();
      assertEquals(1, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(1885);
      Date date0 = spreadsheetDate0.toDate();
      Day day0 = new Day(date0);
      TimeSeries timeSeries0 = new TimeSeries(day0);
      TimeSeries timeSeries1 = (TimeSeries)timeSeries0.clone();
      timeSeries0.add((RegularTimePeriod) day0, (Number) 6, false);
      TimeSeries timeSeries2 = timeSeries1.addAndOrUpdate(timeSeries0);
      timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries1);
      assertEquals(1, timeSeries0.getItemCount());
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries("", class0);
      // Undeclared exception!
      try { 
        timeSeries0.getDataItem((RegularTimePeriod) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'period' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MockDate mockDate0 = new MockDate(257, 1831, 257);
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(mockDate0);
      Class<RegularTimePeriod> class0 = RegularTimePeriod.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, (String) null, (String) null, class0);
      timeSeries0.getValue((RegularTimePeriod) fixedMillisecond0);
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Week week0 = new Week();
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, class0);
      timeSeries0.add((RegularTimePeriod) week0, (-1.0), true);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) week0, (Number) 1);
      // Undeclared exception!
      try { 
        timeSeries0.add(timeSeriesDataItem0, false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // You are attempting to add an observation for the time period Week 7, 2014 but the series already contains an observation for that time period. Duplicates are not permitted.  Try using the addOrUpdate() method.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Week week0 = new Week();
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, class0);
      timeSeries0.setMaximumItemCount(1);
      MockDate mockDate0 = new MockDate(53);
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat();
      TimeZone timeZone0 = mockSimpleDateFormat0.getTimeZone();
      Week week1 = new Week(mockDate0, timeZone0);
      timeSeries0.add((RegularTimePeriod) week1, (-1.0), true);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) week0, (Number) 1);
      timeSeries0.add(timeSeriesDataItem0, false);
      assertEquals(1, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1160), 10, (-3405));
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("24*Wm}<95");
      TimeZone timeZone0 = mockSimpleDateFormat0.getTimeZone();
      Year year0 = new Year(mockDate0, timeZone0);
      TimeSeries timeSeries0 = new TimeSeries(year0);
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      // Undeclared exception!
      try { 
        timeSeries0.update((RegularTimePeriod) fixedMillisecond0, (Number) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TimeSeries.update(TimePeriod, Number):  period does not exist.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      TimeSeries timeSeries0 = new TimeSeries(millisecond0);
      timeSeries0.addOrUpdate((RegularTimePeriod) millisecond0, 669.49770519505);
      assertEquals(1, timeSeries0.getItemCount());
      
      timeSeries0.update((RegularTimePeriod) millisecond0, (Number) 0);
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Second second0 = new Second();
      Class<Year> class0 = Year.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, class0);
      timeSeries0.addOrUpdate((RegularTimePeriod) second0, (Number) 0);
      // Undeclared exception!
      try { 
        timeSeries0.addAndOrUpdate(timeSeries0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Second, but the TimeSeries is expecting an instance of org.jfree.data.time.Year.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(1885);
      Date date0 = spreadsheetDate0.toDate();
      Day day0 = new Day(date0);
      TimeSeries timeSeries0 = new TimeSeries(day0);
      BigInteger bigInteger0 = BigInteger.TEN;
      // Undeclared exception!
      try { 
        timeSeries0.addOrUpdate((RegularTimePeriod) null, (Number) bigInteger0);
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
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(1261);
      TimeSeries timeSeries0 = new TimeSeries(spreadsheetDate0);
      Hour hour0 = new Hour();
      RegularTimePeriod regularTimePeriod0 = hour0.next();
      timeSeries0.addOrUpdate(regularTimePeriod0, (Number) 7);
      timeSeries0.addOrUpdate((RegularTimePeriod) hour0, (Number) 4);
      timeSeries0.setMaximumItemAge(0);
      assertEquals(1, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(1261);
      TimeSeries timeSeries0 = new TimeSeries(spreadsheetDate0);
      Hour hour0 = new Hour();
      RegularTimePeriod regularTimePeriod0 = hour0.next();
      timeSeries0.setMaximumItemAge(0L);
      timeSeries0.addOrUpdate(regularTimePeriod0, (Number) 7);
      timeSeries0.addOrUpdate((RegularTimePeriod) hour0, (Number) 4);
      assertEquals(1, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      timeSeries0.removeAgedItems(1854L, false);
      timeSeries0.removeAgedItems((-290L), false);
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
      assertEquals("Value", timeSeries0.getRangeDescription());
      assertEquals("Time", timeSeries0.getDomainDescription());
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Second second0 = new Second();
      Class<Year> class0 = Year.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) second0, (Number) 0);
      assertNull(timeSeriesDataItem0);
      
      timeSeries0.removeAgedItems((long) 59, true);
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
      assertEquals("Time", timeSeries0.getDomainDescription());
      assertEquals("Value", timeSeries0.getRangeDescription());
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Day day0 = new Day();
      TimeSeries timeSeries0 = new TimeSeries(day0);
      timeSeries0.clear();
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
      assertEquals("Time", timeSeries0.getDomainDescription());
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
      assertEquals("Value", timeSeries0.getRangeDescription());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(1885);
      Date date0 = spreadsheetDate0.toDate();
      Day day0 = new Day(date0);
      TimeSeries timeSeries0 = new TimeSeries(day0);
      timeSeries0.add((RegularTimePeriod) day0, (Number) 6, false);
      timeSeries0.clear();
      assertEquals(0, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Second second0 = new Second();
      Class<Year> class0 = Year.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, class0);
      timeSeries0.delete((RegularTimePeriod) second0);
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
      assertEquals("Time", timeSeries0.getDomainDescription());
      assertEquals("Value", timeSeries0.getRangeDescription());
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      TimeSeries timeSeries0 = new TimeSeries(millisecond0);
      timeSeries0.addOrUpdate((RegularTimePeriod) millisecond0, 669.49770519505);
      timeSeries0.delete((RegularTimePeriod) millisecond0);
      assertEquals(0, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Day day0 = new Day();
      Hour hour0 = new Hour(2, day0);
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      // Undeclared exception!
      try { 
        timeSeries0.delete(4332, 23);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires start <= end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Second second0 = new Second();
      Class<Year> class0 = Year.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, class0);
      timeSeries0.addOrUpdate((RegularTimePeriod) second0, (Number) 0);
      timeSeries0.createCopy((RegularTimePeriod) second0, (RegularTimePeriod) second0);
      assertEquals(1, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Month month0 = new Month();
      TimeSeries timeSeries0 = new TimeSeries(month0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy((-139), (-139));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires start >= 0.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy(32, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires start <= end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Week week0 = new Week();
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) week0, (double) 53);
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries(timeSeriesDataItem0, "H+>Ur<F3x>-G", "KW?D&a67no0Uv!", class0);
      TimeSeries timeSeries1 = timeSeries0.createCopy(53, 53);
      assertEquals(Integer.MAX_VALUE, timeSeries1.getMaximumItemCount());
      assertEquals("H+>Ur<F3x>-G", timeSeries1.getDomainDescription());
      assertNotSame(timeSeries1, timeSeries0);
      assertEquals("KW?D&a67no0Uv!", timeSeries1.getRangeDescription());
      assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(9223372036854775807L);
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "", "{_5lUR1*'l3NXt", class0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy((RegularTimePeriod) null, (RegularTimePeriod) fixedMillisecond0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'start' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy((RegularTimePeriod) hour0, (RegularTimePeriod) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'end' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(9223372036854775807L);
      RegularTimePeriod regularTimePeriod0 = fixedMillisecond0.previous();
      TimeSeries timeSeries0 = new TimeSeries(regularTimePeriod0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy((RegularTimePeriod) fixedMillisecond0, regularTimePeriod0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires start on or before end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Second second0 = new Second();
      Class<Year> class0 = Year.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, class0);
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) second0, (RegularTimePeriod) second0);
      assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
      assertEquals(Integer.MAX_VALUE, timeSeries1.getMaximumItemCount());
      assertEquals("Time", timeSeries1.getDomainDescription());
      assertEquals("Value", timeSeries1.getRangeDescription());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Day day0 = new Day();
      Class<TimeSeries> class0 = TimeSeries.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, "", "R16`HThDS!S-KkX8q", class0);
      Stack<Month> stack0 = new Stack<Month>();
      timeSeries0.data = (List) stack0;
      MockDate mockDate0 = new MockDate((-5), (-5), (-5));
      Month month0 = new Month(mockDate0);
      stack0.addElement(month0);
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) month0, (RegularTimePeriod) month0);
      assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
      assertEquals("", timeSeries1.getDomainDescription());
      assertEquals("R16`HThDS!S-KkX8q", timeSeries1.getRangeDescription());
      assertEquals(Integer.MAX_VALUE, timeSeries1.getMaximumItemCount());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(1261);
      TimeSeries timeSeries0 = new TimeSeries(spreadsheetDate0);
      Hour hour0 = new Hour();
      boolean boolean0 = timeSeries0.equals(hour0);
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
      assertEquals("Time", timeSeries0.getDomainDescription());
      assertEquals("Value", timeSeries0.getRangeDescription());
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(1885);
      Date date0 = spreadsheetDate0.toDate();
      Day day0 = new Day(date0);
      TimeSeries timeSeries0 = new TimeSeries(day0);
      TimeSeries timeSeries1 = timeSeries0.addAndOrUpdate(timeSeries0);
      boolean boolean0 = timeSeries1.equals(timeSeries0);
      assertEquals(Integer.MAX_VALUE, timeSeries1.getMaximumItemCount());
      assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
      assertEquals("Value", timeSeries1.getRangeDescription());
      assertEquals("Time", timeSeries1.getDomainDescription());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      TimeSeries timeSeries0 = new TimeSeries(millisecond0);
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries1 = new TimeSeries(millisecond0, "Null 'task' argument.", "Null 'task' argument.", class0);
      boolean boolean0 = timeSeries0.equals(timeSeries1);
      assertEquals("Null 'task' argument.", timeSeries1.getRangeDescription());
      assertEquals("Null 'task' argument.", timeSeries1.getDomainDescription());
      assertEquals("Time", timeSeries0.getDomainDescription());
      assertEquals("Value", timeSeries0.getRangeDescription());
      assertFalse(boolean0);
      assertEquals(Integer.MAX_VALUE, timeSeries1.getMaximumItemCount());
      assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(1885);
      Date date0 = spreadsheetDate0.toDate();
      Day day0 = new Day(date0);
      TimeSeries timeSeries0 = new TimeSeries(day0);
      Object object0 = timeSeries0.clone();
      timeSeries0.setRangeDescription("``*+0?Qsk");
      boolean boolean0 = object0.equals(timeSeries0);
      assertEquals("``*+0?Qsk", timeSeries0.getRangeDescription());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(1261);
      TimeSeries timeSeries0 = new TimeSeries(spreadsheetDate0);
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
      
      timeSeries0.setMaximumItemAge(0);
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries1 = new TimeSeries(spreadsheetDate0, class0);
      boolean boolean0 = timeSeries0.equals(timeSeries1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      timeSeries0.setMaximumItemCount(0);
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries1 = new TimeSeries(fixedMillisecond0, class0);
      boolean boolean0 = timeSeries0.equals(timeSeries1);
      assertEquals(0, timeSeries0.getMaximumItemCount());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(1885);
      Date date0 = spreadsheetDate0.toDate();
      Day day0 = new Day(date0);
      TimeSeries timeSeries0 = new TimeSeries(day0);
      Object object0 = timeSeries0.clone();
      assertTrue(object0.equals((Object)timeSeries0));
      
      timeSeries0.add((RegularTimePeriod) day0, (Number) 6, false);
      boolean boolean0 = object0.equals(timeSeries0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1, 0, 0, 2, 1900, 6);
      Day day0 = new Day(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(day0);
      TimeSeries timeSeries1 = (TimeSeries)timeSeries0.clone();
      timeSeries0.add((RegularTimePeriod) day0, (Number) 6, false);
      timeSeries1.addAndOrUpdate(timeSeries0);
      boolean boolean0 = timeSeries1.equals(timeSeries0);
      assertEquals(1, timeSeries1.getItemCount());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1, 0, 0, 2, 1900, 6);
      Day day0 = new Day(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(day0);
      TimeSeries timeSeries1 = (TimeSeries)timeSeries0.clone();
      timeSeries0.add((RegularTimePeriod) day0, (Number) 6, false);
      timeSeries1.addAndOrUpdate(timeSeries0);
      timeSeries0.addOrUpdate((RegularTimePeriod) day0, (double) 1);
      boolean boolean0 = timeSeries1.equals(timeSeries0);
      assertEquals(1, timeSeries0.getItemCount());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      MockDate mockDate0 = new MockDate(257, 1831, 257);
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(mockDate0);
      Class<RegularTimePeriod> class0 = RegularTimePeriod.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, (String) null, (String) null, class0);
      timeSeries0.hashCode();
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Second second0 = new Second();
      Class<Year> class0 = Year.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, class0);
      timeSeries0.hashCode();
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
      assertEquals("Time", timeSeries0.getDomainDescription());
      assertEquals("Value", timeSeries0.getRangeDescription());
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Second second0 = new Second();
      Class<Year> class0 = Year.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) second0, (Number) 0);
      assertNull(timeSeriesDataItem0);
      
      timeSeries0.hashCode();
      assertEquals("Value", timeSeries0.getRangeDescription());
      assertEquals("Time", timeSeries0.getDomainDescription());
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(1261);
      TimeSeries timeSeries0 = new TimeSeries(spreadsheetDate0);
      Hour hour0 = new Hour();
      RegularTimePeriod regularTimePeriod0 = hour0.next();
      timeSeries0.addOrUpdate(regularTimePeriod0, (Number) 7);
      timeSeries0.addOrUpdate((RegularTimePeriod) hour0, (Number) 4);
      timeSeries0.hashCode();
      assertEquals(2, timeSeries0.getItemCount());
  }
}
