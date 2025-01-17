/*
 * This file was automatically generated by EvoSuite
 * Sun Jun 02 03:10:52 GMT 2019
 */

package org.jfree.data.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigInteger;
import java.util.Date;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.jfree.data.time.Day;
import org.jfree.data.time.FixedMillisecond;
import org.jfree.data.time.Hour;
import org.jfree.data.time.Millisecond;
import org.jfree.data.time.Minute;
import org.jfree.data.time.Month;
import org.jfree.data.time.Quarter;
import org.jfree.data.time.RegularTimePeriod;
import org.jfree.data.time.SpreadsheetDate;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesDataItem;
import org.jfree.data.time.Week;
import org.jfree.data.time.Year;
import org.junit.runner.RunWith;
import sun.util.calendar.ZoneInfo;


public class TimeSeries_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockDate mockDate0 = new MockDate(29, 29, 29);
      Quarter quarter0 = new Quarter(mockDate0);
      Class<Quarter> class0 = Quarter.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, class0);
      timeSeries0.add((RegularTimePeriod) quarter0, 0.0);
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) quarter0, (RegularTimePeriod) quarter0);
      timeSeries1.delete((RegularTimePeriod) quarter0);
      timeSeries1.addAndOrUpdate(timeSeries0);
      assertEquals(1, timeSeries0.getItemCount());
      assertTrue(timeSeries0.equals((Object)timeSeries1));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(193);
      TimeSeries timeSeries0 = new TimeSeries(spreadsheetDate0);
      // Undeclared exception!
      try { 
        timeSeries0.update((-391), (Number) 4);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Week week0 = new Week();
      TimeSeries timeSeries0 = new TimeSeries(week0);
      timeSeries0.addOrUpdate((RegularTimePeriod) week0, (-4083.402434));
      timeSeries0.createCopy((RegularTimePeriod) week0, (RegularTimePeriod) week0);
      assertEquals(1, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries("org.jfree.data.jdbc.JDBCCatvgoryDataset", "org.jfree.data.jdbc.JDBCCatvgoryDataset", "org.jfree.data.jdbc.JDBCCatvgoryDataset", class0);
      timeSeries0.getItems();
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
      assertEquals("org.jfree.data.jdbc.JDBCCatvgoryDataset", timeSeries0.getRangeDescription());
      assertEquals("org.jfree.data.jdbc.JDBCCatvgoryDataset", timeSeries0.getDomainDescription());
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<TimeSeries> class0 = TimeSeries.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, class0);
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
      MockDate mockDate0 = new MockDate(29, 29, 29);
      Quarter quarter0 = new Quarter(mockDate0);
      Class<Quarter> class0 = Quarter.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, class0);
      timeSeries0.add((RegularTimePeriod) quarter0, 0.0);
      timeSeries0.getValue((RegularTimePeriod) quarter0);
      assertEquals(1, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockDate mockDate0 = new MockDate(29, 29, 29);
      Quarter quarter0 = new Quarter(mockDate0);
      Class<Quarter> class0 = Quarter.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, class0);
      BigInteger bigInteger0 = BigInteger.ZERO;
      timeSeries0.add((RegularTimePeriod) quarter0, (Number) bigInteger0, false);
      assertEquals(1, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries("org.jfree.data.jdbc.JDBCCatvgoryDataset", "org.jfree.data.jdbc.JDBCCatvgoryDataset", "org.jfree.data.jdbc.JDBCCatvgoryDataset", class0);
      Minute minute0 = new Minute();
      timeSeries0.add((RegularTimePeriod) minute0, (Number) 59);
      assertEquals(1, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Week week0 = new Week();
      TimeSeries timeSeries0 = new TimeSeries(week0);
      TimeSeries timeSeries1 = new TimeSeries(week0.LAST_WEEK_IN_YEAR);
      boolean boolean0 = timeSeries0.equals(timeSeries1);
      assertFalse(boolean0);
      assertEquals("Value", timeSeries1.getRangeDescription());
      assertEquals("Time", timeSeries1.getDomainDescription());
      assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
      assertEquals(Integer.MAX_VALUE, timeSeries1.getMaximumItemCount());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<Year> class0 = Year.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, "?R|(9^nUf})$$", "?R|(9^nUf})$$", class0);
      // Undeclared exception!
      try { 
        timeSeries0.setMaximumItemCount((-1));
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
      Week week0 = new Week();
      TimeSeries timeSeries0 = new TimeSeries(week0);
      timeSeries0.addOrUpdate((RegularTimePeriod) week0, (double) 53);
      timeSeries0.setMaximumItemCount(0);
      assertEquals(0, timeSeries0.getMaximumItemCount());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, "", "", class0);
      // Undeclared exception!
      try { 
        timeSeries0.setMaximumItemAge((-1L));
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
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      timeSeries0.getDataItem((RegularTimePeriod) fixedMillisecond0);
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
      assertEquals("Time", timeSeries0.getDomainDescription());
      assertEquals("Value", timeSeries0.getRangeDescription());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockDate mockDate0 = new MockDate(29, 29, 29);
      Quarter quarter0 = new Quarter(mockDate0);
      Class<Quarter> class0 = Quarter.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, class0);
      timeSeries0.add((RegularTimePeriod) quarter0, 0.0);
      timeSeries0.getDataItem((RegularTimePeriod) quarter0);
      assertEquals(1, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<TimeSeries> class0 = TimeSeries.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, class0);
      timeSeries0.addOrUpdate((RegularTimePeriod) quarter0, (Number) 1);
      timeSeries0.getTimePeriods();
      assertEquals(1, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MockDate mockDate0 = new MockDate(29, 29, 29);
      Quarter quarter0 = new Quarter(mockDate0);
      Class<Quarter> class0 = Quarter.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, class0);
      timeSeries0.add((RegularTimePeriod) quarter0, 0.0);
      timeSeries0.getTimePeriodsUniqueToOtherSeries(timeSeries0);
      assertEquals(1, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Week week0 = new Week();
      TimeSeries timeSeries0 = new TimeSeries(week0);
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) week0, (RegularTimePeriod) week0);
      timeSeries0.addOrUpdate((RegularTimePeriod) week0, (-4083.402434));
      timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries0);
      assertEquals(1, timeSeries0.getItemCount());
      assertFalse(timeSeries0.equals((Object)timeSeries1));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-2941));
      Class<Millisecond> class0 = Millisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(mockDate0, class0);
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
      MockDate mockDate0 = new MockDate(29, 29, 29);
      Quarter quarter0 = new Quarter(mockDate0);
      Class<Quarter> class0 = Quarter.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, class0);
      timeSeries0.getValue((RegularTimePeriod) quarter0);
      assertEquals("Value", timeSeries0.getRangeDescription());
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
      assertEquals("Time", timeSeries0.getDomainDescription());
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      // Undeclared exception!
      try { 
        timeSeries0.add((TimeSeriesDataItem) null);
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
      MockDate mockDate0 = new MockDate(29, 29, 29);
      Quarter quarter0 = new Quarter(mockDate0);
      Class<Quarter> class0 = Quarter.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, class0);
      timeSeries0.add((RegularTimePeriod) quarter0, 0.0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) quarter0, (Number) 4);
      // Undeclared exception!
      try { 
        timeSeries0.add(timeSeriesDataItem0, false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // You are attempting to add an observation for the time period Q2/1931 but the series already contains an observation for that time period. Duplicates are not permitted.  Try using the addOrUpdate() method.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MockDate mockDate0 = new MockDate(10, 10, 10);
      Quarter quarter0 = new Quarter(mockDate0);
      Class<Quarter> class0 = Quarter.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, class0);
      RegularTimePeriod regularTimePeriod0 = quarter0.next();
      timeSeries0.add((RegularTimePeriod) quarter0, (double) 10);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) quarter0, (Number) 4);
      timeSeries0.setMaximumItemCount(1);
      timeSeries0.add(regularTimePeriod0, (double) 10, true);
      timeSeries0.add(timeSeriesDataItem0, true);
      assertEquals(1, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MockDate mockDate0 = new MockDate(29, 29, 29);
      Quarter quarter0 = new Quarter(mockDate0);
      Class<Quarter> class0 = Quarter.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.update((RegularTimePeriod) quarter0, (Number) 4);
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
      MockDate mockDate0 = new MockDate(29, 29, 29);
      Quarter quarter0 = new Quarter(mockDate0);
      Class<Quarter> class0 = Quarter.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, class0);
      timeSeries0.add((RegularTimePeriod) quarter0, 0.0);
      timeSeries0.update((RegularTimePeriod) quarter0, (Number) 4);
      assertEquals("Time", timeSeries0.getDomainDescription());
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
      assertEquals("Value", timeSeries0.getRangeDescription());
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MockDate mockDate0 = new MockDate(29, 29, 29);
      Quarter quarter0 = new Quarter(mockDate0);
      Class<Quarter> class0 = Quarter.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, class0);
      timeSeries0.add((RegularTimePeriod) quarter0, 0.0);
      TimeSeries timeSeries1 = timeSeries0.addAndOrUpdate(timeSeries0);
      assertEquals("Time", timeSeries1.getDomainDescription());
      assertEquals("Value", timeSeries1.getRangeDescription());
      assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
      assertNotSame(timeSeries1, timeSeries0);
      assertEquals(1, timeSeries1.getItemCount());
      assertEquals(Integer.MAX_VALUE, timeSeries1.getMaximumItemCount());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(193);
      TimeSeries timeSeries0 = new TimeSeries(spreadsheetDate0);
      // Undeclared exception!
      try { 
        timeSeries0.addOrUpdate((RegularTimePeriod) null, (Number) 2);
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
      Hour hour0 = new Hour();
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, "A_5tf$pRB}goSfO!", "org.jfree.data.general.DefaultKeyedValues2DDataset", class0);
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
      
      timeSeries0.setMaximumItemCount(0);
      timeSeries0.addOrUpdate((RegularTimePeriod) hour0, (Number) 23);
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Week week0 = new Week();
      TimeSeries timeSeries0 = new TimeSeries(week0);
      timeSeries0.setMaximumItemAge(1);
      RegularTimePeriod regularTimePeriod0 = week0.next();
      timeSeries0.addOrUpdate(regularTimePeriod0, (double) 1);
      RegularTimePeriod regularTimePeriod1 = week0.previous();
      timeSeries0.addOrUpdate(regularTimePeriod1, (double) 1);
      assertEquals(1, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Week week0 = new Week();
      TimeSeries timeSeries0 = new TimeSeries(week0);
      RegularTimePeriod regularTimePeriod0 = week0.next();
      timeSeries0.addOrUpdate(regularTimePeriod0, (double) 1);
      timeSeries0.addOrUpdate((RegularTimePeriod) week0, (double) 53);
      timeSeries0.setMaximumItemAge(0L);
      assertEquals(1, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Month month0 = new Month();
      TimeSeries timeSeries0 = new TimeSeries(month0);
      timeSeries0.removeAgedItems(24L, true);
      timeSeries0.removeAgedItems((-1740L), false);
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
      assertEquals("Time", timeSeries0.getDomainDescription());
      assertEquals("Value", timeSeries0.getRangeDescription());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      MockDate mockDate0 = new MockDate(29, 29, 29);
      Quarter quarter0 = new Quarter(mockDate0);
      Class<Quarter> class0 = Quarter.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, class0);
      timeSeries0.add((RegularTimePeriod) quarter0, 0.0);
      timeSeries0.removeAgedItems(12L, true);
      assertEquals(1, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MockDate mockDate0 = new MockDate(10, 10, 10);
      Quarter quarter0 = new Quarter(mockDate0);
      Class<Quarter> class0 = Quarter.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, class0);
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
      
      timeSeries0.setMaximumItemAge(10);
      timeSeries0.add((RegularTimePeriod) quarter0, (double) 10);
      timeSeries0.removeAgedItems(332L, false);
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Week week0 = new Week();
      TimeSeries timeSeries0 = new TimeSeries(week0);
      timeSeries0.setMaximumItemAge(1);
      Week week1 = new Week(53, 1);
      timeSeries0.addOrUpdate((RegularTimePeriod) week1, (double) 1);
      assertEquals(1, timeSeries0.getItemCount());
      
      timeSeries0.removeAgedItems((long) 53, true);
      assertEquals("Time", timeSeries0.getDomainDescription());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      MockDate mockDate0 = new MockDate(999, 1523, 1523, 1523, 509, 509);
      Millisecond millisecond0 = new Millisecond(mockDate0);
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, class0);
      timeSeries0.clear();
      assertEquals("Time", timeSeries0.getDomainDescription());
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
      assertEquals("Value", timeSeries0.getRangeDescription());
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      MockDate mockDate0 = new MockDate(29, 29, 29);
      Quarter quarter0 = new Quarter(mockDate0);
      Class<Quarter> class0 = Quarter.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, class0);
      timeSeries0.add((RegularTimePeriod) quarter0, 0.0);
      timeSeries0.clear();
      assertEquals(0, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      ZoneInfo zoneInfo0 = (ZoneInfo)RegularTimePeriod.DEFAULT_TIME_ZONE;
      Minute minute0 = new Minute(mockDate0, zoneInfo0);
      Day day0 = minute0.getDay();
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, class0);
      timeSeries0.delete((RegularTimePeriod) day0);
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
      assertEquals("Value", timeSeries0.getRangeDescription());
      assertEquals("Time", timeSeries0.getDomainDescription());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Month month0 = new Month();
      TimeSeries timeSeries0 = new TimeSeries(month0);
      // Undeclared exception!
      try { 
        timeSeries0.delete(411, (-155));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires start <= end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Day day0 = new Day();
      TimeSeries timeSeries0 = new TimeSeries(day0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy((-1163), (-1163));
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
      MockDate mockDate0 = new MockDate(29, 29, 29);
      Quarter quarter0 = new Quarter(mockDate0);
      Class<Quarter> class0 = Quarter.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy(211, 4);
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
      TimeSeries timeSeries0 = new TimeSeries("TQ]t-g6qF(");
      TimeSeries timeSeries1 = timeSeries0.createCopy(2391, 2391);
      assertEquals(Integer.MAX_VALUE, timeSeries1.getMaximumItemCount());
      assertEquals("Value", timeSeries1.getRangeDescription());
      assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
      assertNotSame(timeSeries1, timeSeries0);
      assertEquals("Time", timeSeries1.getDomainDescription());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      TimeSeries timeSeries0 = new TimeSeries(mockDate0);
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
      MockDate mockDate0 = new MockDate(29, 29, 29);
      Quarter quarter0 = new Quarter(mockDate0);
      Class<Quarter> class0 = Quarter.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy((RegularTimePeriod) quarter0, (RegularTimePeriod) null);
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
      Month month0 = new Month();
      RegularTimePeriod regularTimePeriod0 = month0.next();
      TimeSeries timeSeries0 = new TimeSeries(regularTimePeriod0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy(regularTimePeriod0, (RegularTimePeriod) month0);
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
      Week week0 = new Week();
      TimeSeries timeSeries0 = new TimeSeries(week0);
      timeSeries0.addOrUpdate((RegularTimePeriod) week0, (-4083.402434));
      RegularTimePeriod regularTimePeriod0 = week0.previous();
      timeSeries0.createCopy(regularTimePeriod0, regularTimePeriod0);
      assertEquals(1, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Week week0 = new Week();
      TimeSeries timeSeries0 = new TimeSeries(week0);
      RegularTimePeriod regularTimePeriod0 = week0.next();
      timeSeries0.addOrUpdate((RegularTimePeriod) week0, (double) 53);
      timeSeries0.createCopy(regularTimePeriod0, regularTimePeriod0);
      assertEquals(1, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      MockDate mockDate0 = new MockDate(29, 29, 29);
      Quarter quarter0 = new Quarter(mockDate0);
      Class<Quarter> class0 = Quarter.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, class0);
      boolean boolean0 = timeSeries0.equals((Object) null);
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
      assertFalse(boolean0);
      assertEquals("Time", timeSeries0.getDomainDescription());
      assertEquals("Value", timeSeries0.getRangeDescription());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Week week0 = new Week();
      TimeSeries timeSeries0 = new TimeSeries(week0);
      TimeSeries timeSeries1 = (TimeSeries)timeSeries0.clone();
      timeSeries1.setDomainDescription("");
      boolean boolean0 = timeSeries0.equals(timeSeries1);
      assertEquals("", timeSeries1.getDomainDescription());
      assertFalse(boolean0);
  }

////  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Week week0 = new Week();
      TimeSeries timeSeries0 = new TimeSeries(week0);
      Object object0 = timeSeries0.clone();
      timeSeries0.setRangeDescription("org.jfree.data.general.CombinedDataset");
      boolean boolean0 = timeSeries0.equals(object0);
      assertEquals("org.jfree.data.general.CombinedDataset", timeSeries0.getRangeDescription());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Week week0 = new Week();
      TimeSeries timeSeries0 = new TimeSeries(week0);
      TimeSeries timeSeries1 = (TimeSeries)timeSeries0.clone();
      timeSeries1.setMaximumItemAge(1342L);
      boolean boolean0 = timeSeries0.equals(timeSeries1);
      assertEquals(1342L, timeSeries1.getMaximumItemAge());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      MockDate mockDate0 = new MockDate(29, 29, 29);
      Quarter quarter0 = new Quarter(mockDate0);
      Class<Quarter> class0 = Quarter.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, class0);
      Object object0 = timeSeries0.clone();
      timeSeries0.setMaximumItemCount(2238);
      boolean boolean0 = timeSeries0.equals(object0);
      assertEquals(2238, timeSeries0.getMaximumItemCount());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Week week0 = new Week();
      TimeSeries timeSeries0 = new TimeSeries(week0);
      timeSeries0.addOrUpdate((RegularTimePeriod) week0, (-4083.402434));
      TimeSeries timeSeries1 = (TimeSeries)timeSeries0.clone();
      timeSeries1.delete((RegularTimePeriod) week0);
      boolean boolean0 = timeSeries0.equals(timeSeries1);
      assertEquals(1, timeSeries0.getItemCount());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Week week0 = new Week();
      TimeSeries timeSeries0 = new TimeSeries(week0);
      timeSeries0.addOrUpdate((RegularTimePeriod) week0, (double) 53);
      Object object0 = timeSeries0.clone();
      boolean boolean0 = timeSeries0.equals(object0);
      assertEquals(1, timeSeries0.getItemCount());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Week week0 = new Week();
      TimeSeries timeSeries0 = new TimeSeries(week0);
      timeSeries0.addOrUpdate((RegularTimePeriod) week0, (-4083.402434));
      TimeSeries timeSeries1 = (TimeSeries)timeSeries0.clone();
      timeSeries1.addOrUpdate((RegularTimePeriod) week0, (Number) week0.FIRST_WEEK_IN_YEAR);
      boolean boolean0 = timeSeries0.equals(timeSeries1);
      assertEquals(1, timeSeries0.getItemCount());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Week week0 = new Week();
      TimeSeries timeSeries0 = new TimeSeries(week0);
      assertEquals("Time", timeSeries0.getDomainDescription());
      
      timeSeries0.setDomainDescription((String) null);
      timeSeries0.hashCode();
      assertEquals("Value", timeSeries0.getRangeDescription());
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(3);
      Date date0 = spreadsheetDate0.toDate();
      Week week0 = new Week(date0);
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "{+Aq+Z@X", (String) null, class0);
      timeSeries0.hashCode();
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
      assertEquals("{+Aq+Z@X", timeSeries0.getDomainDescription());
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Week week0 = new Week();
      TimeSeries timeSeries0 = new TimeSeries(week0);
      timeSeries0.addOrUpdate((RegularTimePeriod) week0, (double) 53);
      timeSeries0.hashCode();
      assertEquals(1, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Week week0 = new Week();
      TimeSeries timeSeries0 = new TimeSeries(week0);
      timeSeries0.addOrUpdate((RegularTimePeriod) week0, (double) 53);
      RegularTimePeriod regularTimePeriod0 = week0.previous();
      timeSeries0.addOrUpdate(regularTimePeriod0, (double) 1392409281320L);
      timeSeries0.hashCode();
      assertEquals(2, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Week week0 = new Week();
      TimeSeries timeSeries0 = new TimeSeries(week0);
      RegularTimePeriod regularTimePeriod0 = week0.next();
      timeSeries0.addOrUpdate(regularTimePeriod0, (double) 1);
      timeSeries0.addOrUpdate((RegularTimePeriod) week0, (double) 53);
      RegularTimePeriod regularTimePeriod1 = week0.previous();
      timeSeries0.addOrUpdate(regularTimePeriod1, (double) 1);
      timeSeries0.hashCode();
      assertEquals(3, timeSeries0.getItemCount());
  }
}
