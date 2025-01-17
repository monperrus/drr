/*
 * This file was automatically generated by EvoSuite
 * Sun Jun 02 13:13:48 GMT 2019
 */

package org.apache.commons.lang3.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.ParseException;
import java.text.ParsePosition;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import java.util.regex.Pattern;
import org.apache.commons.lang3.time.FastDateParser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

 
public class FastDateParser_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone(" kzpr-=[D*");
      Locale locale0 = new Locale(" kzpr-=[D*", " kzpr-=[D*");
      FastDateParser fastDateParser0 = new FastDateParser(" kzpr-=[D*", timeZone0, locale0);
      assertEquals(" kzpr-=[D*", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone(" kGpr-=[D*");
      Locale locale0 = Locale.FRANCE;
      FastDateParser fastDateParser0 = new FastDateParser(" kGpr-=[D*", timeZone0, locale0);
      String string0 = fastDateParser0.toString();
      assertEquals("FastDateParser[ kGpr-=[D*,fr_FR,GMT]", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "");
      Locale locale0 = Locale.JAPAN;
      FastDateParser fastDateParser0 = new FastDateParser(".4SF", simpleTimeZone0, locale0);
      fastDateParser0.hashCode();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(10, "73(ilp9E~@8T*lyyU");
      Locale locale0 = Locale.GERMANY;
      FastDateParser fastDateParser0 = new FastDateParser("73(ilp9E~@8T*lyyU", simpleTimeZone0, locale0);
      ParsePosition parsePosition0 = new ParsePosition((-2375));
      // Undeclared exception!
      try { 
        fastDateParser0.parseObject("", parsePosition0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("}<jy[kFhcxCcBFvJ");
      Locale locale0 = Locale.FRENCH;
      FastDateParser fastDateParser0 = new FastDateParser("k!qN[&r", timeZone0, locale0);
      String string0 = fastDateParser0.getPattern();
      assertEquals("k!qN[&r", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ZoneId zoneId0 = ZoneId.systemDefault();
      TimeZone timeZone0 = TimeZone.getTimeZone(zoneId0);
      Locale locale0 = Locale.GERMAN;
      FastDateParser fastDateParser0 = new FastDateParser("#7;.*Zqhu&o", timeZone0, locale0);
      Locale locale1 = fastDateParser0.getLocale();
      assertEquals("", locale1.getISO3Country());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("8,EcWHq>)D1");
      Locale locale0 = Locale.CANADA_FRENCH;
      FastDateParser fastDateParser0 = new FastDateParser("2", timeZone0, locale0);
      try { 
        fastDateParser0.parseObject("kj+:g+m}QR=(");
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Unparseable date: \"kj+:g+m}QR=(\" does not match 2
         //
         verifyException("org.apache.commons.lang3.time.FastDateParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("|J=ARDL6W9Uw9RR");
      Locale locale0 = Locale.JAPAN;
      FastDateParser fastDateParser0 = new FastDateParser("|J=ARDL6W9Uw9RR", timeZone0, locale0);
      TimeZone timeZone1 = fastDateParser0.getTimeZone();
      assertEquals("GMT", timeZone1.getID());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ZoneId zoneId0 = ZoneId.systemDefault();
      TimeZone timeZone0 = TimeZone.getTimeZone(zoneId0);
      Locale locale0 = Locale.GERMAN;
      FastDateParser fastDateParser0 = new FastDateParser("#7;.*Zqhu&o", timeZone0, locale0);
      Pattern pattern0 = fastDateParser0.getParsePattern();
      assertEquals(0, pattern0.flags());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.KOREA;
      FastDateParser fastDateParser0 = null;
      try {
        fastDateParser0 = new FastDateParser("org.apache.commons.lang3.time.FastDateParser$TimeZoneStrategy", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid pattern
         //
         verifyException("org.apache.commons.lang3.time.FastDateParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone(" kGpr-=[D*");
      Locale locale0 = Locale.FRANCE;
      FastDateParser fastDateParser0 = new FastDateParser(" kGpr-=[D*", timeZone0, locale0);
      boolean boolean0 = fastDateParser0.equals(fastDateParser0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ZoneId zoneId0 = ZoneId.systemDefault();
      TimeZone timeZone0 = TimeZone.getTimeZone(zoneId0);
      Locale locale0 = Locale.GERMAN;
      FastDateParser fastDateParser0 = new FastDateParser("#7;.*Zqhu&o", timeZone0, locale0);
      Integer integer0 = new Integer(5268);
      boolean boolean0 = fastDateParser0.equals(integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "3=S]9p^lG^ItI-\"@");
      Locale locale0 = new Locale("3=S]9p^lG^ItI-\"@", "3=S]9p^lG^ItI-\"@", "3=S]9p^lG^ItI-\"@");
      FastDateParser fastDateParser0 = new FastDateParser("3=S]9p^lG^ItI-\"@", simpleTimeZone0, locale0);
      FastDateParser fastDateParser1 = new FastDateParser("z%ZW`Ro(baY[H.Ok ", simpleTimeZone0, locale0);
      boolean boolean0 = fastDateParser0.equals(fastDateParser1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone(".+?w@4q");
      Locale locale0 = Locale.FRANCE;
      FastDateParser fastDateParser0 = new FastDateParser(".+?w@4q", timeZone0, locale0);
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone1 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      FastDateParser fastDateParser1 = new FastDateParser(".+?w@4q", timeZone1, locale0);
      boolean boolean0 = fastDateParser0.equals(fastDateParser1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone(" kGpr-=[D*");
      Locale locale0 = Locale.FRANCE;
      FastDateParser fastDateParser0 = new FastDateParser(" kGpr-=[D*", timeZone0, locale0);
      Locale locale1 = Locale.TRADITIONAL_CHINESE;
      FastDateParser fastDateParser1 = new FastDateParser(" kGpr-=[D*", timeZone0, locale1);
      boolean boolean0 = fastDateParser0.equals(fastDateParser1);
      assertFalse(boolean0);
  }

////  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("Ln4#ZyRRD9*F>6%");
      Locale locale0 = Locale.GERMAN;
      FastDateParser fastDateParser0 = new FastDateParser("4tV4qa/(;F", timeZone0, locale0);
      Object object0 = fastDateParser0.parseObject("4tV4qa/(;F");
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", object0.toString());
  }

////  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = FastDateParser.JAPANESE_IMPERIAL;
      FastDateParser fastDateParser0 = new FastDateParser("GMT", timeZone0, locale0);
      try { 
        fastDateParser0.parseObject("GMT");
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // (The ja_JP_JP_#u-ca-japanese locale does not support dates before 1868 AD)
         // Unparseable date: \"GMT\" does not match (\u7D00\u5143\u524D|\u7D00\u5143\u524D|\u897F\u66A6|\u897F\u66A6)(\\p{IsNd}++)
         //
         verifyException("org.apache.commons.lang3.time.FastDateParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.PRC;
      FastDateParser fastDateParser0 = new FastDateParser("/$aty4g:}JH#3", timeZone0, locale0);
      assertEquals("/$aty4g:}JH#3", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      Locale locale0 = Locale.PRC;
      FastDateParser fastDateParser0 = new FastDateParser("D+|E+|F+|-+|H+|K+|M+|S+|W+|Z+|a+|d+|h+|k+|m+|s+|w+|y+|z+a''|'[^']++('7[^']*+)*+'|[^'A-Za-z]++", timeZone0, locale0);
      assertEquals("D+|E+|F+|-+|H+|K+|M+|S+|W+|Z+|a+|d+|h+|k+|m+|s+|w+|y+|z+a''|'[^']++('7[^']*+)*+'|[^'A-Za-z]++", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("(p{IsNd}{");
      Locale locale0 = Locale.CANADA_FRENCH;
      FastDateParser fastDateParser0 = new FastDateParser("(p{IsNd}{", timeZone0, locale0);
      assertEquals("(p{IsNd}{", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds(0);
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      Locale locale0 = Locale.KOREAN;
      FastDateParser fastDateParser0 = new FastDateParser("\"{Knm^", timeZone0, locale0);
      assertEquals("\"{Knm^", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ZoneId zoneId0 = ZoneId.systemDefault();
      TimeZone timeZone0 = TimeZone.getTimeZone(zoneId0);
      Locale locale0 = Locale.CHINESE;
      FastDateParser fastDateParser0 = new FastDateParser("!SH}XQ^6J,=)'", timeZone0, locale0);
      assertEquals("!SH}XQ^6J,=)'", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.ITALIAN;
      FastDateParser fastDateParser0 = new FastDateParser(";=uU19p/uHu;#M}^", timeZone0, locale0);
      int int0 = fastDateParser0.adjustYear(785);
      assertEquals(2685, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("(");
      Locale locale0 = Locale.ITALIAN;
      FastDateParser fastDateParser0 = new FastDateParser("[", timeZone0, locale0);
      int int0 = fastDateParser0.adjustYear(11);
      assertEquals(2011, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.ITALY;
      FastDateParser fastDateParser0 = new FastDateParser(")xty:./6J]`\"", timeZone0, locale0);
      assertEquals(")xty:./6J]`\"", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.FRANCE;
      FastDateParser fastDateParser0 = new FastDateParser("*lY}D", timeZone0, locale0);
      assertEquals("*lY}D", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ZoneId zoneId0 = ZoneId.systemDefault();
      TimeZone timeZone0 = TimeZone.getTimeZone(zoneId0);
      Locale locale0 = Locale.GERMAN;
      FastDateParser fastDateParser0 = new FastDateParser(",N\"Yr8$", timeZone0, locale0);
      assertEquals(",N\"Yr8$", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.US;
      FastDateParser fastDateParser0 = new FastDateParser("-Uu 9h8wi|3Qv3", timeZone0, locale0);
      assertEquals("-Uu 9h8wi|3Qv3", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone(" k0Gpr-=[D*");
      Locale locale0 = Locale.GERMAN;
      FastDateParser fastDateParser0 = new FastDateParser(" k0Gpr-=[D*", timeZone0, locale0);
      assertEquals(" k0Gpr-=[D*", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.GERMAN;
      FastDateParser fastDateParser0 = new FastDateParser("19Ry5(Ae", timeZone0, locale0);
      assertEquals("19Ry5(Ae", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.FRENCH;
      FastDateParser fastDateParser0 = new FastDateParser("5s@@", timeZone0, locale0);
      assertEquals("5s@@", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("7");
      Locale locale0 = Locale.UK;
      FastDateParser fastDateParser0 = new FastDateParser("6rx-^DR?W'0f2aNBlz", timeZone0, locale0);
      assertEquals("6rx-^DR?W'0f2aNBlz", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "!pd.8U5BHY}q5;ak");
      Locale locale0 = Locale.CANADA;
      FastDateParser fastDateParser0 = new FastDateParser("8Xj4 p8_Yr4MID2$h", simpleTimeZone0, locale0);
      assertEquals("8Xj4 p8_Yr4MID2$h", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Locale locale0 = FastDateParser.JAPANESE_IMPERIAL;
      TimeZone timeZone0 = TimeZone.getDefault();
      FastDateParser fastDateParser0 = new FastDateParser("9", timeZone0, locale0);
      assertEquals("9", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(1072, "D:DHb22ZgqWYiJtsSh");
      Locale locale0 = Locale.ITALIAN;
      FastDateParser fastDateParser0 = new FastDateParser("D:DHb22ZgqWYiJtsSh", simpleTimeZone0, locale0);
      assertEquals("D:DHb22ZgqWYiJtsSh", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.ITALIAN;
      FastDateParser fastDateParser0 = new FastDateParser("<j.LSM&[B", timeZone0, locale0);
      assertEquals("<j.LSM&[B", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(46, "~z;8utYOFn\":K");
      Locale locale0 = Locale.UK;
      FastDateParser fastDateParser0 = new FastDateParser("H=B%I0c+z\"", simpleTimeZone0, locale0);
      assertEquals("H=B%I0c+z\"", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ZoneId zoneId0 = ZoneId.systemDefault();
      TimeZone timeZone0 = TimeZone.getTimeZone(zoneId0);
      Locale locale0 = Locale.JAPANESE;
      FastDateParser fastDateParser0 = new FastDateParser(">", timeZone0, locale0);
      assertEquals(">", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.CHINA;
      FastDateParser fastDateParser0 = new FastDateParser("~*4_:;F?v*!)'6ui$", timeZone0, locale0);
      assertEquals("~*4_:;F?v*!)'6ui$", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "^x~hL");
      Locale locale0 = new Locale("^x~hL", "^x~hL", "^x~hL");
      FastDateParser fastDateParser0 = new FastDateParser("^x~hL", simpleTimeZone0, locale0);
      assertEquals("^x~hL", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ZoneId zoneId0 = ZoneId.systemDefault();
      TimeZone timeZone0 = TimeZone.getTimeZone(zoneId0);
      Locale locale0 = Locale.JAPANESE;
      FastDateParser fastDateParser0 = new FastDateParser("_", timeZone0, locale0);
      assertEquals("_", fastDateParser0.getPattern());
  }
}
