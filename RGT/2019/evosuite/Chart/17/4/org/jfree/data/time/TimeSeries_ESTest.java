/*
 * This file was automatically generated by EvoSuite
 * Sat Jun 22 11:17:14 GMT 2019
 */

package org.jfree.data.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigInteger;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Date;
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
import org.jfree.data.time.Quarter;
import org.jfree.data.time.RegularTimePeriod;
import org.jfree.data.time.Second;
import org.jfree.data.time.SimpleTimePeriod;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesDataItem;
import org.junit.runner.RunWith;
import sun.util.calendar.ZoneInfo;


public class TimeSeries_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Day day0 = new Day();
      Class<TimeSeries> class0 = TimeSeries.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, "@q/QU1&2WeqOlX", "@q/QU1&2WeqOlX", class0);
      TimeSeries timeSeries1 = new TimeSeries(day0);
      boolean boolean0 = timeSeries0.equals(timeSeries1);
      assertEquals(Integer.MAX_VALUE, timeSeries1.getMaximumItemCount());
      assertFalse(boolean0);
      assertEquals("@q/QU1&2WeqOlX", timeSeries0.getRangeDescription());
      assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
      assertEquals("Time", timeSeries1.getDomainDescription());
      assertEquals("Value", timeSeries1.getRangeDescription());
      assertEquals("@q/QU1&2WeqOlX", timeSeries0.getDomainDescription());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<Quarter> class0 = Quarter.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
      timeSeries0.setDomainDescription("");
      assertEquals("", timeSeries0.getDomainDescription());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      timeSeries0.addOrUpdate((RegularTimePeriod) hour0, (-615.2156851222));
      timeSeries0.createCopy((RegularTimePeriod) hour0, (RegularTimePeriod) hour0);
      assertEquals(1, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 0, 0);
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(mockDate0);
      Class<TimeSeriesDataItem> class0 = TimeSeriesDataItem.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "yKfEN", (String) null, class0);
      BigInteger bigInteger0 = BigInteger.TEN;
      // Undeclared exception!
      try { 
        timeSeries0.update(0, (Number) bigInteger0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      timeSeries0.getItems();
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
      assertEquals("Time", timeSeries0.getDomainDescription());
      assertEquals("Value", timeSeries0.getRangeDescription());
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, "@B.6JiF%g-#VzJNG(", "TimeSeriesDataset.addValue(): series #", class0);
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
  public void test06()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) hour0, (double) 23);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Hour, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Day day0 = new Day();
      TimeSeries timeSeries0 = new TimeSeries("@q/QU1&2WeqOlX");
      byte[] byteArray0 = new byte[9];
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      timeSeries0.add((RegularTimePeriod) day0, (Number) bigInteger0);
      assertEquals(1, timeSeries0.getItemCount());
      
      timeSeries0.setMaximumItemCount((byte)0);
      assertEquals(0, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      TimeSeries timeSeries0 = new TimeSeries(millisecond0);
      TimeSeries timeSeries1 = new TimeSeries(millisecond0);
      assertEquals("Time", timeSeries1.getDomainDescription());
      assertEquals("Value", timeSeries1.getRangeDescription());
      assertEquals(Integer.MAX_VALUE, timeSeries1.getMaximumItemCount());
      assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries("xv", class0);
      // Undeclared exception!
      try { 
        timeSeries0.setMaximumItemCount((-31));
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
      Month month0 = new Month();
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, class0);
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
  public void test11()  throws Throwable  {
      Day day0 = new Day();
      TimeSeries timeSeries0 = new TimeSeries("v.HLmG()$");
      timeSeries0.getDataItem((RegularTimePeriod) day0);
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
      assertEquals("Value", timeSeries0.getRangeDescription());
      assertEquals("Time", timeSeries0.getDomainDescription());
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Day day0 = new Day();
      TimeSeries timeSeries0 = new TimeSeries("v.HLmG()$");
      BigInteger bigInteger0 = BigInteger.ZERO;
      timeSeries0.add((RegularTimePeriod) day0, (Number) bigInteger0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.getDataItem((RegularTimePeriod) day0);
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
  public void test13()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      timeSeries0.addOrUpdate((RegularTimePeriod) hour0, (-615.2156851222));
      timeSeries0.getTimePeriods();
      assertEquals(1, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<FixedMillisecond> class0 = FixedMillisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, class0);
      MockDate mockDate0 = new MockDate(1475, 0, 1475);
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      Month month0 = new Month(mockDate0, timeZone0);
      timeSeries0.addOrUpdate((RegularTimePeriod) month0, (Number) quarter0.LAST_QUARTER);
      timeSeries0.getTimePeriodsUniqueToOtherSeries(timeSeries0);
      assertEquals(1, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<FixedMillisecond> class0 = FixedMillisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, class0);
      TimeSeries timeSeries1 = (TimeSeries)timeSeries0.clone();
      MockDate mockDate0 = new MockDate(1475, 0, 1475);
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      ZoneInfo zoneInfo0 = (ZoneInfo)TimeZone.getTimeZone((ZoneId) zoneOffset0);
      Month month0 = new Month(mockDate0, zoneInfo0);
      timeSeries0.addOrUpdate((RegularTimePeriod) month0, (Number) quarter0.LAST_QUARTER);
      timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries0);
      assertEquals(1, timeSeries0.getItemCount());
      assertFalse(timeSeries0.equals((Object)timeSeries1));
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<FixedMillisecond> class0 = FixedMillisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.getIndex((RegularTimePeriod) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'period' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<FixedMillisecond> class0 = FixedMillisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, class0);
      timeSeries0.getValue((RegularTimePeriod) quarter0);
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
      assertEquals("Time", timeSeries0.getDomainDescription());
      assertEquals("Value", timeSeries0.getRangeDescription());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat();
      Date date0 = mockSimpleDateFormat0.get2DigitYearStart();
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      Minute minute0 = new Minute(date0, timeZone0);
      Class<Millisecond> class0 = Millisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, class0);
      timeSeries0.addOrUpdate((RegularTimePeriod) minute0, (double) 59);
      timeSeries0.getValue((RegularTimePeriod) minute0);
      assertEquals(1, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TimeSeries timeSeries0 = new TimeSeries("v.HLmG()$");
      // Undeclared exception!
      try { 
        timeSeries0.add((TimeSeriesDataItem) null, false);
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
      Day day0 = new Day();
      TimeSeries timeSeries0 = new TimeSeries("v.HLmG()$");
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
      
      BigInteger bigInteger0 = BigInteger.ZERO;
      timeSeries0.setMaximumItemCount(0);
      timeSeries0.add((RegularTimePeriod) day0, (Number) bigInteger0);
      assertEquals(0, timeSeries0.getMaximumItemCount());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Day day0 = new Day();
      TimeSeries timeSeries0 = new TimeSeries(day0);
      timeSeries0.add((RegularTimePeriod) day0, 0.0, false);
      assertEquals(1, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      // Undeclared exception!
      try { 
        timeSeries0.update((RegularTimePeriod) hour0, (Number) 23);
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
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      timeSeries0.addOrUpdate((RegularTimePeriod) hour0, (double) 23);
      assertEquals(1, timeSeries0.getItemCount());
      
      timeSeries0.update((RegularTimePeriod) hour0, (Number) 23);
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      timeSeries0.addOrUpdate((RegularTimePeriod) hour0, (-615.2156851222));
      // Undeclared exception!
      try { 
        timeSeries0.addAndOrUpdate(timeSeries0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Hour, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<FixedMillisecond> class0 = FixedMillisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, class0);
      TimeSeries timeSeries1 = (TimeSeries)timeSeries0.clone();
      MockDate mockDate0 = new MockDate(1, 0, 1);
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      ZoneInfo zoneInfo0 = (ZoneInfo)TimeZone.getTimeZone((ZoneId) zoneOffset0);
      Month month0 = new Month(mockDate0, zoneInfo0);
      timeSeries0.addOrUpdate((RegularTimePeriod) month0, (Number) 1);
      timeSeries1.addAndOrUpdate(timeSeries0);
      timeSeries1.hashCode();
      assertEquals(1, timeSeries1.getItemCount());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<FixedMillisecond> class0 = FixedMillisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.addOrUpdate((RegularTimePeriod) null, (Number) quarter0.LAST_QUARTER);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'period' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Day day0 = new Day();
      TimeSeries timeSeries0 = new TimeSeries("@q/QU1&2WeqOlX");
      timeSeries0.setMaximumItemCount((byte)0);
      timeSeries0.addOrUpdate((RegularTimePeriod) day0, (Number) (byte) (-56));
      assertEquals(0, timeSeries0.getMaximumItemCount());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      timeSeries0.removeAgedItems((long) 0, false);
      timeSeries0.removeAgedItems(1L, false);
      assertEquals("Time", timeSeries0.getDomainDescription());
      assertEquals("Value", timeSeries0.getRangeDescription());
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1206, 1206, 2813, 2813, 4, 52);
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod(mockDate0, mockDate0);
      Class<Millisecond> class0 = Millisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(simpleTimePeriod0, class0);
      Month month0 = new Month();
      timeSeries0.addOrUpdate((RegularTimePeriod) month0, (Number) 4);
      timeSeries0.removeAgedItems((long) 6, false);
      assertEquals(1, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<FixedMillisecond> class0 = FixedMillisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, class0);
      timeSeries0.clear();
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
      assertEquals("Value", timeSeries0.getRangeDescription());
      assertEquals("Time", timeSeries0.getDomainDescription());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat();
      Date date0 = mockSimpleDateFormat0.get2DigitYearStart();
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      Minute minute0 = new Minute(date0, timeZone0);
      Class<Millisecond> class0 = Millisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, class0);
      timeSeries0.addOrUpdate((RegularTimePeriod) minute0, (double) 59);
      timeSeries0.clear();
      assertEquals(0, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<FixedMillisecond> class0 = FixedMillisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, class0);
      timeSeries0.delete((RegularTimePeriod) quarter0);
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
      assertEquals("Value", timeSeries0.getRangeDescription());
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
      assertEquals("Time", timeSeries0.getDomainDescription());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat();
      Date date0 = mockSimpleDateFormat0.get2DigitYearStart();
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      Minute minute0 = new Minute(date0, timeZone0);
      Class<Millisecond> class0 = Millisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, class0);
      timeSeries0.addOrUpdate((RegularTimePeriod) minute0, (double) 59);
      timeSeries0.delete((RegularTimePeriod) minute0);
      assertEquals(0, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      // Undeclared exception!
      try { 
        timeSeries0.delete(2014, 0);
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
      MockDate mockDate0 = new MockDate(0, (-1426), (-2258), 0, 0, 0);
      Month month0 = new Month(mockDate0);
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy((-2258), (-2258));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires start >= 0.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy(2240, (-1));
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
      Quarter quarter0 = new Quarter();
      Class<FixedMillisecond> class0 = FixedMillisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, class0);
      TimeSeries timeSeries1 = timeSeries0.createCopy(0, 2240);
      assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
      assertEquals(Integer.MAX_VALUE, timeSeries1.getMaximumItemCount());
      assertNotSame(timeSeries1, timeSeries0);
      assertEquals("Value", timeSeries1.getRangeDescription());
      assertEquals("Time", timeSeries1.getDomainDescription());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Second second0 = new Second();
      Class<FixedMillisecond> class0 = FixedMillisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy((RegularTimePeriod) null, (RegularTimePeriod) second0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'start' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Day day0 = new Day();
      Class<FixedMillisecond> class0 = FixedMillisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, "v.HG(E$", "@q/QU1&2WeqOlX", class0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy((RegularTimePeriod) day0, (RegularTimePeriod) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'end' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Month month0 = new Month();
      TimeSeries timeSeries0 = new TimeSeries(month0);
      RegularTimePeriod regularTimePeriod0 = month0.previous();
      // Undeclared exception!
      try { 
        timeSeries0.createCopy((RegularTimePeriod) month0, regularTimePeriod0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires start on or before end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) hour0, (RegularTimePeriod) hour0);
      assertEquals("Time", timeSeries1.getDomainDescription());
      assertEquals("Value", timeSeries1.getRangeDescription());
      assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
      assertEquals(Integer.MAX_VALUE, timeSeries1.getMaximumItemCount());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      timeSeries0.addOrUpdate((RegularTimePeriod) hour0, (Number) 23);
      RegularTimePeriod regularTimePeriod0 = hour0.previous();
      TimeSeries timeSeries1 = timeSeries0.createCopy(regularTimePeriod0, (RegularTimePeriod) hour0);
      assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
      assertEquals("Time", timeSeries1.getDomainDescription());
      assertEquals("Value", timeSeries1.getRangeDescription());
      assertEquals(Integer.MAX_VALUE, timeSeries1.getMaximumItemCount());
      assertEquals(0, timeSeries1.getItemCount());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      TimeSeries timeSeries0 = new TimeSeries("v.HLmG()$");
      boolean boolean0 = timeSeries0.equals("v.HLmG()$");
      assertFalse(boolean0);
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
      assertEquals("Value", timeSeries0.getRangeDescription());
      assertEquals("Time", timeSeries0.getDomainDescription());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<FixedMillisecond> class0 = FixedMillisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, class0);
      TimeSeries timeSeries1 = timeSeries0.addAndOrUpdate(timeSeries0);
      boolean boolean0 = timeSeries1.equals(timeSeries0);
      assertEquals("Time", timeSeries1.getDomainDescription());
      assertEquals("Value", timeSeries1.getRangeDescription());
      assertEquals(Integer.MAX_VALUE, timeSeries1.getMaximumItemCount());
      assertFalse(boolean0);
      assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      TimeSeries timeSeries1 = (TimeSeries)timeSeries0.clone();
      assertTrue(timeSeries1.equals((Object)timeSeries0));
      
      timeSeries1.setRangeDescription((String) null);
      boolean boolean0 = timeSeries0.equals(timeSeries1);
      assertFalse(boolean0);
      assertFalse(timeSeries1.equals((Object)timeSeries0));
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      TimeSeries timeSeries1 = (TimeSeries)timeSeries0.clone();
      assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
      
      timeSeries1.setMaximumItemAge(0);
      boolean boolean0 = timeSeries0.equals(timeSeries1);
      assertFalse(timeSeries1.equals((Object)timeSeries0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      TimeSeries timeSeries1 = (TimeSeries)timeSeries0.clone();
      timeSeries1.setMaximumItemCount(1932);
      boolean boolean0 = timeSeries0.equals(timeSeries1);
      assertEquals(1932, timeSeries1.getMaximumItemCount());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      TimeSeries timeSeries1 = (TimeSeries)timeSeries0.clone();
      assertTrue(timeSeries1.equals((Object)timeSeries0));
      
      timeSeries1.addOrUpdate((RegularTimePeriod) hour0, (double) 0);
      boolean boolean0 = timeSeries1.equals(timeSeries0);
      assertFalse(timeSeries1.equals((Object)timeSeries0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) hour0, (-615.2156851222));
      assertNull(timeSeriesDataItem0);
      
      TimeSeries timeSeries1 = (TimeSeries)timeSeries0.clone();
      boolean boolean0 = timeSeries0.equals(timeSeries1);
      assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
      assertEquals("Time", timeSeries1.getDomainDescription());
      assertEquals("Value", timeSeries1.getRangeDescription());
      assertEquals(Integer.MAX_VALUE, timeSeries1.getMaximumItemCount());
      assertNotSame(timeSeries1, timeSeries0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      timeSeries0.addOrUpdate((RegularTimePeriod) hour0, (-614.8900010336965));
      Object object0 = timeSeries0.clone();
      timeSeries0.addOrUpdate((RegularTimePeriod) hour0, (Number) 23);
      boolean boolean0 = timeSeries0.equals(object0);
      assertEquals(1, timeSeries0.getItemCount());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1358L));
      Hour hour0 = new Hour(mockDate0);
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, (String) null, (String) null, class0);
      timeSeries0.hashCode();
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      timeSeries0.hashCode();
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
      assertEquals("Time", timeSeries0.getDomainDescription());
      assertEquals("Value", timeSeries0.getRangeDescription());
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Second second0 = new Second();
      TimeSeries timeSeries0 = new TimeSeries(second0, (Class) null);
      timeSeries0.hashCode();
      assertEquals("Value", timeSeries0.getRangeDescription());
      assertEquals("Time", timeSeries0.getDomainDescription());
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
  }
}
