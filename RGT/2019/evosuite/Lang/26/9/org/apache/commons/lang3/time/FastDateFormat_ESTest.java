/*
 * This file was automatically generated by EvoSuite
 * Sun Jun 02 19:38:51 GMT 2019
 */

package org.apache.commons.lang3.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.ChoiceFormat;
import java.text.FieldPosition;
import java.text.Format;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.TemporalField;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.apache.commons.lang3.time.FastDateFormat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.text.MockSimpleDateFormat;
import org.evosuite.runtime.mock.java.time.MockLocalDate;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.junit.runner.RunWith;

 
public class FastDateFormat_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(1);
      MockDate mockDate0 = new MockDate(1, 0, 0);
      mockDate0.clone();
      fastDateFormat0.format((Object) mockDate0);
      System.setCurrentTimeMillis((-1249L));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Locale locale0 = Locale.CANADA_FRENCH;
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance(" `|`2&>~aZ?0", locale0);
      fastDateFormat0.equals(locale0);
      fastDateFormat0.equals(" `|`2&>~aZ?0");
      assertEquals(17, fastDateFormat0.getMaxLengthEstimate());
      
      FastDateFormat fastDateFormat1 = FastDateFormat.getInstance("", locale0);
      assertFalse(fastDateFormat1.getTimeZoneOverridesCalendar());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Locale locale0 = Locale.ENGLISH;
      String string0 = "k,";
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("k,");
      FastDateFormat.getInstance("k,", (TimeZone) null);
      int[] intArray0 = new int[3];
      intArray0[0] = (-270);
      try { 
        fastDateFormat0.parseObject(string0);
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Format.parseObject(String) failed
         //
         verifyException("java.text.Format", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Locale locale0 = Locale.JAPANESE;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(1, 1, locale0);
      int int0 = 856;
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "f", 856, 0, (-1), 0, 2, 3, 1, 2353, 56);
      FastDateFormat.getInstance("", locale0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(simpleTimeZone0);
      fastDateFormat0.format((Calendar) mockGregorianCalendar0);
      SimpleTimeZone simpleTimeZone1 = null;
      try {
        simpleTimeZone1 = new SimpleTimeZone(1, "", 1, 1, 2, 856, 0, 2, (-2782), 0, 2, 2551, 93);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal end day -2782
         //
         verifyException("java.util.SimpleTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      fastDateFormat0.getLocale();
      assertEquals(21, fastDateFormat0.getMaxLengthEstimate());
      assertFalse(fastDateFormat0.getTimeZoneOverridesCalendar());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(0);
      assertFalse(fastDateFormat0.getTimeZoneOverridesCalendar());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Locale locale0 = Locale.JAPAN;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(0, locale0);
      assertEquals(13, fastDateFormat0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(0, 0);
      String string0 = fastDateFormat0.toString();
      assertEquals("FastDateFormat[EEEE, MMMM d, yyyy h:mm:ss a z]", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(1, 1);
      int int0 = fastDateFormat0.getMaxLengthEstimate();
      assertEquals(39, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("");
      boolean boolean0 = fastDateFormat0.getTimeZoneOverridesCalendar();
      assertFalse(boolean0);
  }

////  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(1, 1);
      String string0 = fastDateFormat0.format(1L);
      assertEquals("January 1, 1970 12:00:00 AM GMT", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      MockDate mockDate0 = new MockDate(0, 0, 3);
      StringBuffer stringBuffer0 = new StringBuffer("-_Zi*6*?pu%UKEAg!8+");
      fastDateFormat0.format((Date) mockDate0, stringBuffer0);
      assertEquals(34, stringBuffer0.length());
      assertEquals("-_Zi*6*?pu%UKEAg!8+1/3/00 12:00 AM", stringBuffer0.toString());
  }

////  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      FastDateFormat fastDateFormat1 = FastDateFormat.getInstance();
      assertEquals(21, fastDateFormat1.getMaxLengthEstimate());
      assertNotNull(fastDateFormat1);
      assertNotSame(fastDateFormat1, fastDateFormat0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Locale locale0 = new Locale("");
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance((String) null, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The pattern must not be null
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("6As90$");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: A
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Locale locale0 = Locale.UK;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("{{Bt40(jeA}cq]", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: B
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("F8h&C;?+0hFU/l~%I26");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: C
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(3, "0(DJgf3Y`{>@WF.X");
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("0(DJgf3Y`{>@WF.X", (TimeZone) simpleTimeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: J
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Locale locale0 = Locale.ITALY;
      Locale.getISOLanguages();
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("G", locale0);
      assertFalse(fastDateFormat0.getTimeZoneOverridesCalendar());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Locale locale0 = Locale.CANADA_FRENCH;
      int int0 = 856;
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "f", 856, 0, (-1), 0, 2, 3, 1, 0, 65);
      FastDateFormat.getInstance("K", locale0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(simpleTimeZone0);
      int int1 = 93;
      SimpleTimeZone simpleTimeZone1 = null;
      try {
        simpleTimeZone1 = new SimpleTimeZone(1, "", 1, 1, 2, 856, 1, 2, (-2782), 0, 2, 2551, 93);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal end day -2782
         //
         verifyException("java.util.SimpleTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Locale locale0 = new Locale("L{:=i){Zo`N&", "L{:=i){Zo`N&", "L{:=i){Zo`N&");
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("L{:=i){Zo`N&", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: L
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Locale locale0 = Locale.forLanguageTag("Negative values should not be possible");
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("Negative values should not be possible", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: N
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(15, "O[J|Y|Na27C;C");
      Locale locale0 = Locale.forLanguageTag("O[J|Y|Na27C;C");
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("O[J|Y|Na27C;C", (TimeZone) simpleTimeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: O
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "", 1, 0, 0, 0, 0, 0, 1627, 1);
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("!W}P", (TimeZone) simpleTimeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: P
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Locale locale0 = Locale.FRENCH;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("(:wQ'O+xo7hj[:o", (TimeZone) null, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: Q
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Locale locale0 = Locale.CANADA_FRENCH;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("mRxV_", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: R
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("_S2HJV%VU");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: J
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Locale locale0 = Locale.FRENCH;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("The validated array index is invalid: %d", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: T
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Locale locale0 = Locale.PRC;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("UlxXfrLLS?V", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: U
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("_S2H-V%VU");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: V
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("<X_Fj->qW(y&G!1");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: X
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("F=!.Y?^Vvyp8)>");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: Y
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("[b?MB0%8E&flqZ5", timeZone0, (Locale) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: b
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Locale locale0 = Locale.FRANCE;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("c ", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: c
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "", 968, 0, 0, 0, 0, 0, 968, 0, 968);
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("eb/t}Y%BqH7=a", (TimeZone) simpleTimeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: e
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("f");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: f
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(787, "The validated array index is invalid: %d");
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("gYIJtx?5wF@fQJ1Cz", (TimeZone) simpleTimeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: g
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ZoneId zoneId0 = ZoneId.systemDefault();
      TimeZone timeZone0 = TimeZone.getTimeZone(zoneId0);
      Locale locale0 = Locale.GERMANY;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("{8iA", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: i
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Locale locale0 = Locale.ROOT;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("jU*jWU2v.:]!A", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: j
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("^_lGLNdus:wkC<@%");
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("^_lGLNdus:wkC<@%", timeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: l
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Locale locale0 = Locale.GERMAN;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("#+nt_pmP>IX#+1ra^}", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: n
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("org.apache.commons.lang3.time.FastDateFormat$TextField");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: o
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Locale locale0 = Locale.TAIWAN;
      ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds(1);
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("p(iQ", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: p
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("q0OQn|vIKvC7<})");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: q
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(122, "*vde|BMh");
      Locale locale0 = Locale.ITALY;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("Friday, February 14, 2014 8:21:21 PM GMT+00:00", (TimeZone) simpleTimeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: r
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Locale locale0 = Locale.US;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("txE K<#<p*G", (TimeZone) null, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: t
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("u},iSoL}5h0A/", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: u
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Locale locale0 = Locale.JAPANESE;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("vN/>n", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: v
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat();
      TimeZone timeZone0 = mockSimpleDateFormat0.getTimeZone();
      Locale locale0 = Locale.ROOT;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("5x", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: x
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(2, 1);
      assertEquals(33, fastDateFormat0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      timeZone0.getOffset((long) 0);
      Locale locale0 = Locale.UK;
      locale0.getDisplayName();
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(0, timeZone0, locale0);
      fastDateFormat0.getPattern();
      FastDateFormat.getTimeInstance(0, timeZone0, locale0);
      Locale locale1 = null;
      FastDateFormat.getTimeInstance(3, (Locale) null);
      Date date0 = null;
      DateTimeFormatter dateTimeFormatter0 = DateTimeFormatter.ISO_TIME;
      LinkedHashSet<TemporalField> linkedHashSet0 = new LinkedHashSet<TemporalField>();
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withResolverFields((Set<TemporalField>) linkedHashSet0);
      // Undeclared exception!
      try { 
        MockLocalDate.parse((CharSequence) "EEEE, d MMMM yyyy", dateTimeFormatter1);
        fail("Expecting exception: DateTimeParseException");
      
      } catch(DateTimeParseException e) {
         //
         // Text 'EEEE, d MMMM yyyy' could not be parsed at index 0
         //
         verifyException("java.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      StringBuffer stringBuffer0 = new StringBuffer("-_Zi*6*?pu%UKEAg!8+");
      FieldPosition fieldPosition0 = new FieldPosition((-1));
      // Undeclared exception!
      try { 
        fastDateFormat0.format((Object) null, stringBuffer0, fieldPosition0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown class: <null>
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(0, 0, timeZone0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(2627, 1, 0, 0, 1, 0);
      FieldPosition fieldPosition0 = new FieldPosition(1);
      // Undeclared exception!
      try { 
        fastDateFormat0.format((Object) mockGregorianCalendar0, (StringBuffer) null, fieldPosition0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

////  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("MMMM d, yyyy", (TimeZone) null, locale0);
      Long long0 = Long.getLong("W} +NpFMzTVd4(fD", (long) 1);
      StringBuffer stringBuffer0 = new StringBuffer(3);
      FieldPosition fieldPosition0 = new FieldPosition(6);
      fastDateFormat0.format((Object) long0, stringBuffer0, fieldPosition0);
      assertEquals("\u4E00\u6708 1, 1970", stringBuffer0.toString());
      assertEquals(10, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat();
      StringBuffer stringBuffer0 = new StringBuffer("-_Zi*6*?pu%UKEAg!8+");
      // Undeclared exception!
      try { 
        fastDateFormat0.format((Object) mockSimpleDateFormat0, stringBuffer0, (FieldPosition) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown class: org.evosuite.runtime.mock.java.text.MockSimpleDateFormat
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(1, 1);
      Locale locale0 = Locale.FRENCH;
      FastDateFormat fastDateFormat1 = FastDateFormat.getDateTimeInstance(1, 2, locale0);
      fastDateFormat0.equals(fastDateFormat1);
      assertEquals(28, fastDateFormat1.getMaxLengthEstimate());
      assertEquals("d MMMM yyyy HH:mm:ss", fastDateFormat1.getPattern());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      int int0 = (-702);
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-702), "");
      simpleTimeZone0.setDSTSavings(1);
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(0, (TimeZone) simpleTimeZone0);
      fastDateFormat0.clone();
      fastDateFormat0.getTimeZone();
      Locale locale0 = Locale.KOREAN;
      FastDateFormat.getTimeInstance(0, locale0);
      FastDateFormat.getDateInstance(1, (TimeZone) simpleTimeZone0, locale0);
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("@!I`{ZR!a", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: I
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds((-1727));
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(0, timeZone0);
      Locale locale0 = new Locale("L{:=i){Zo`N&", "L{:=i){Zo`N&", "L{:=i){Zo`N&");
      FastDateFormat fastDateFormat1 = FastDateFormat.getTimeInstance(0, timeZone0, locale0);
      boolean boolean0 = fastDateFormat1.equals(fastDateFormat0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds((-1727));
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      FastDateFormat.getTimeInstance(0, timeZone0);
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("h:mm:ss a z");
      assertFalse(fastDateFormat0.getTimeZoneOverridesCalendar());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      MockDate mockDate0 = new MockDate(3, 0, 0, 0, 2, 0);
      StringBuffer stringBuffer0 = new StringBuffer("-_Zi*6*?pu%UKEAg!8+");
      fastDateFormat0.format((Date) mockDate0, stringBuffer0);
      assertEquals("-_Zi*6*?pu%UKEAg!8+12/31/02 12:02 AM", stringBuffer0.toString());
      assertEquals(21, fastDateFormat0.getMaxLengthEstimate());
  }

////  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(1, 1);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 1, 780);
      StringBuffer stringBuffer0 = new StringBuffer(1);
      fastDateFormat0.format((Calendar) mockGregorianCalendar0, stringBuffer0);
      assertEquals(30, stringBuffer0.length());
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-62065785600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=3,MONTH=2,WEEK_OF_YEAR=12,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=81,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

////  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("MMMM d, yyyy h:mm:ss a z");
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-253), 0, 100, 10, 364);
      StringBuffer stringBuffer0 = new StringBuffer(288);
      fastDateFormat0.applyRules(mockGregorianCalendar0, stringBuffer0);
      assertEquals(29, stringBuffer0.length());
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-70142831760000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=254,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=100,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=4,HOUR_OF_DAY=16,MINUTE=4,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

////  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(122, "*vde|BMh");
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(0, 0, (TimeZone) simpleTimeZone0);
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat();
      Calendar calendar0 = mockSimpleDateFormat0.getCalendar();
      String string0 = fastDateFormat0.format(calendar0);
      assertEquals("Friday, February 14, 2014 8:21:21 PM GMT+00:00", string0);
  }

////  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Locale locale0 = Locale.CANADA_FRENCH;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(1, 1, locale0);
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "f", 2, 1, (-1), 1, 2, 3, 1, 0, 65);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(simpleTimeZone0);
      String string0 = fastDateFormat0.format((Calendar) mockGregorianCalendar0);
      assertEquals("14 f\u00E9vrier 2014 20:21:21 GMT+00:00", string0);
  }

////  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Locale locale0 = Locale.CANADA_FRENCH;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(1, 1, locale0);
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "f", 2, 27, (-1), 27, 2, 3, 1, 0, 65);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(simpleTimeZone0);
      String string0 = fastDateFormat0.format((Calendar) mockGregorianCalendar0);
      assertEquals("14 f\u00E9vrier 2014 20:21:21 GMT+00:00", string0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("8A8E&+7p'l<dp7Q$f");
      timeZone0.getDisplayName();
      timeZone0.toZoneId();
      timeZone0.observesDaylightTime();
      FastDateFormat.getTimeInstance(1, timeZone0);
      timeZone0.observesDaylightTime();
      FastDateFormat.getDateTimeInstance(0, 1);
      Locale locale0 = Locale.JAPAN;
      Locale locale1 = Locale.PRC;
      String string0 = locale0.getDisplayVariant(locale1);
      assertEquals("", string0);
  }
}
