/*
 * This file was automatically generated by EvoSuite
 * Sun Jun 02 13:00:49 GMT 2019
 */

package org.apache.commons.lang3.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.ParseException;
import java.text.ParsePosition;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Date;
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
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      Locale locale0 = FastDateParser.JAPANESE_IMPERIAL;
      FastDateParser fastDateParser0 = new FastDateParser("Fzf9[vl>", timeZone0, locale0);
      try { 
        fastDateParser0.parse("org.apache.commons.lang3.time.FastDateParser$1");
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // (The ja_JP_JP_#u-ca-japanese locale does not support dates before 1868 AD)
         // Unparseable date: \"org.apache.commons.lang3.time.FastDateParser$1\" does not match (\\p{IsNd}++)(GMT[+\\-]\\d{0,1}\\d{2}|[+\\-]\\d{2}:?\\d{2}|ACDT|ACST|ACT|ACWST|ADT|AEDT|AEST|AFT|AKDT|AKST|ALMT|AMST|AMT|ANAT|AQTT|ART|AST|AWST|AZOST|AZOT|AZT|BDT|BNT|BOT|Bougainville Standard Time|BRST|BRT|BST|BTT|CAT|CCT|CDT|CEST|CET|CHADT|CHAST|CHOT|ChST|CHUT|CKT|CLST|CLT|COT|CST|CVT|CXT|DAVT|DDUT|EASST|EAST|EAT|ECT|EDT|EEST|EET|EGST|EGT|EST|FJST|FJT|FKT|FNT|GALT|GAMT|GET|GFT|GILT|GMT|GMT\\+01:00|GMT\\+02:00|GMT\\+03:00|GMT\\+04:00|GMT\\+05:00|GMT\\+06:00|GMT\\+07:00|GMT\\+08:00|GMT\\+09:00|GMT\\+10:00|GMT\\+11:00|GMT\\+12:00|GMT\\+13:00|GMT\\+14:00|GMT-01:00|GMT-02:00|GMT-03:00|GMT-04:00|GMT-05:00|GMT-06:00|GMT-07:00|GMT-08:00|GMT-09:00|GMT-10:00|GMT-11:00|GMT-12:00|GST|GYT|HDT|HKT|HOVT|HST|ICT|IDT|IOT|IRDT|IRKT|IRST|IST|JST|KGT|KOST|KRAT|KST|LHDT|LHST|LINT|MAGT|MART|MAWT|MDT|MEST|MET|MHT|MIST|MMT|MSK|MST|MUT|MVT|MYT|NCT|NDT|NFT|NOVT|NPT|NRT|NST|NUT|NZDT|NZST|OMST|ORAT|PDT|PET|PETT|PGT|PHOT|PHT|PKT|PMDT|PMST|PONT|PST|PWT|PYST|PYT|QYZT|RET|ROTT|SAKT|SAMT|SAST|SBT|SCT|SGT|Srednekolymsk Time|SRET|SRT|SST|SYOT|TAHT|TFT|TJT|TKT|TLT|TMT|TOST|TOT|TVT|ULAT|UTC|UYT|UZT|VET|VLAT|VOST|VUT|WAKT|WAST|WAT|WEST|WET|WFT|WGST|WGT|WIB|WIT|WITA|WSDT|WSST|XJT|YAKT|YEKT|\u30A2\u30A4\u30EB\u30E9\u30F3\u30C9\u590F\u6642\u9593|\u30A2\u30AF\u30BF\u30A6\u6642\u9593|\u30A2\u30AF\u30C8\u30D9\u6642\u9593|\u30A2\u30AF\u30EC\u6642\u9593|\u30A2\u30BC\u30EB\u30D0\u30A4\u30B8\u30E3\u30F3\u6642\u9593|\u30A2\u30BE\u30EC\u30B9\u590F\u6642\u9593|\u30A2\u30BE\u30EC\u30B9\u6642\u9593|\u30A2\u30CA\u30C9\u30A5\u30A4\u30EA\u6642\u9593|\u30A2\u30D5\u30AC\u30CB\u30B9\u30BF\u30F3\u6642\u9593|\u30A2\u30DE\u30BE\u30F3\u590F\u6642\u9593|\u30A2\u30DE\u30BE\u30F3\u6642\u9593|\u30A2\u30E9\u30B9\u30AB\u590F\u6642\u9593|\u30A2\u30E9\u30B9\u30AB\u6A19\u6E96\u6642|\u30A2\u30E9\u30D3\u30A2\u6A19\u6E96\u6642|\u30A2\u30EB\u30BC\u30F3\u30C1\u30F3\u6642\u9593|\u30A2\u30EB\u30DE\u30A2\u30BF\u6642\u9593|\u30A2\u30EB\u30E1\u30CB\u30A2\u6642\u9593|\u30A4\u30B9\u30E9\u30A8\u30EB\u590F\u6642\u9593|\u30A4\u30B9\u30E9\u30A8\u30EB\u6A19\u6E96\u6642|\u30A4\u30E9\u30F3\u590F\u6642\u9593|\u30A4\u30E9\u30F3\u6A19\u6E96\u6642|\u30A4\u30EB\u30AF\u30FC\u30C4\u30AF\u6642\u9593|\u30A4\u30F3\u30C9\u30B7\u30CA\u6642\u9593|\u30A4\u30F3\u30C9\u6A19\u6E96\u6642|\u30A4\u30F3\u30C9\u6D0B\u5730\u57DF\u6642\u9593|\u30A4\u30FC\u30B9\u30BF\u30FC\u5CF6\u590F\u6642\u9593|\u30A4\u30FC\u30B9\u30BF\u30FC\u5CF6\u6642\u9593|\u30A6\u30A7\u30FC\u30AF\u6642\u9593|\u30A6\u30B9\u30C1\u30CD\u30E9\u6642\u9593|\u30A6\u30BA\u30D9\u30AD\u30B9\u30BF\u30F3\u6642\u9593|\u30A6\u30E9\u30B8\u30AA\u30B9\u30C8\u30AF\u6642\u9593|\u30A6\u30E9\u30FC\u30F3\u30D0\u30FC\u30C8\u30EB\u6642\u9593|\u30A6\u30EB\u30B0\u30A2\u30A4\u6642\u9593|\u30A8\u30AB\u30C6\u30EA\u30F3\u30D6\u30EB\u30B0\u6642\u9593|\u30A8\u30AF\u30A2\u30C9\u30EB\u6642\u9593|\u30AA\u30E0\u30B9\u30AF\u6642\u9593|\u30AA\u30E9\u30EB\u6642\u9593|\u30AB\u30FC\u30DC\u30D9\u30EB\u30C7\u6642\u9593|\u30AC\u30A4\u30A2\u30CA\u6642\u9593|\u30AC\u30E9\u30D1\u30B4\u30B9\u6642\u9593|\u30AC\u30F3\u30D3\u30A2\u6642\u9593|\u30AC\u30FC\u30CA\u6A19\u6E96\u6642|\u30AD\u30B8\u30EB\u30AA\u30EB\u30C0\u6642\u9593|\u30AD\u30E5\u30FC\u30D0\u590F\u6642\u9593|\u30AD\u30E5\u30FC\u30D0\u6A19\u6E96\u6642|\u30AD\u30EB\u30AE\u30B9\u30BF\u30F3\u6642\u9593|\u30AE\u30EB\u30D0\u30FC\u30C8\u8AF8\u5CF6\u6642\u9593|\u30AF\u30C3\u30AF\u8AF8\u5CF6\u6642\u9593|\u30AF\u30E9\u30B9\u30CE\u30E4\u30EB\u30B9\u30AF\u6642\u9593|\u30AF\u30EA\u30B9\u30DE\u30B9\u8AF8\u5CF6\u6642\u9593|\u30B0\u30A2\u30E0\u6A19\u6E96\u6642|\u30B0\u30EA\u30CB\u30C3\u30B8\u6A19\u6E96\u6642|\u30B0\u30EB\u30B8\u30A2\u6642\u9593|\u30B3\u30B3\u30B9\u8AF8\u5CF6\u6642\u9593|\u30B3\u30B9\u30E9\u30A8\u6642\u9593|\u30B3\u30ED\u30F3\u30D3\u30A2\u6642\u9593|\u30B5\u30DE\u30E9\u6642\u9593|\u30B5\u30E2\u30A2\u6A19\u6E96\u6642|\u30B5\u30F3\u30D4\u30A8\u30FC\u30EB\u30FB\u30DF\u30AF\u30ED\u30F3\u8AF8\u5CF6\u590F\u6642\u9593|\u30B5\u30F3\u30D4\u30A8\u30FC\u30EB\u30FB\u30DF\u30AF\u30ED\u30F3\u8AF8\u5CF6\u6A19\u6E96\u6642|\u30B7\u30F3\u30AC\u30DD\u30FC\u30EB\u6642\u9593|\u30B9\u30EA\u30CA\u30E0\u6642\u9593|\u30BB\u30A4\u30B7\u30A7\u30EB\u6642\u9593|\u30BD\u30ED\u30E2\u30F3\u8AF8\u5CF6\u6642\u9593|\u30BF\u30B8\u30AD\u30B9\u30BF\u30F3\u6642\u9593|\u30BF\u30D2\u30C1\u6642\u9593|\u30C1\u30E3\u30BF\u30E0\u590F\u6642\u9593|\u30C1\u30E3\u30BF\u30E0\u6A19\u6E96\u6642|\u30C1\u30E5\u30FC\u30AF\u6642\u9593|\u30C1\u30E7\u30A4\u30D0\u30EB\u30B5\u30F3\u6642\u9593|\u30C1\u30EA\u590F\u6642\u9593|\u30C1\u30EA\u6642\u9593|\u30C4\u30D0\u30EB\u6642\u9593|\u30C7\u30A4\u30D3\u30B9\u6642\u9593|\u30C7\u30E5\u30E2\u30F3\u30C7\u30E5\u30EB\u30F4\u30A3\u30EB\u6642\u9593|\u30C8\u30B1\u30E9\u30A6\u8AF8\u5CF6\u6642\u9593|\u30C8\u30EB\u30AF\u30E1\u30CB\u30B9\u30BF\u30F3\u6642\u9593|\u30C8\u30F3\u30AC\u590F\u6642\u9593|\u30C8\u30F3\u30AC\u6642\u9593|\u30CA\u30A6\u30EB\u6642\u9593|\u30CB\u30A6\u30A8\u5CF6\u6642\u9593|\u30CB\u30E5\u30FC\u30AB\u30EC\u30C9\u30CB\u30A2\u6642\u9593|\u30CB\u30E5\u30FC\u30B8\u30FC\u30E9\u30F3\u30C9\u590F\u6642\u9593|\u30CB\u30E5\u30FC\u30B8\u30FC\u30E9\u30F3\u30C9\u6A19\u6E96\u6642|\u30CB\u30E5\u30FC\u30D5\u30A1\u30F3\u30C9\u30E9\u30F3\u30C9\u590F\u6642\u9593|\u30CB\u30E5\u30FC\u30D5\u30A1\u30F3\u30C9\u30E9\u30F3\u30C9\u6A19\u6E96\u6642|\u30CD\u30D1\u30FC\u30EB\u6642\u9593|\u30CE\u30DC\u30B7\u30D3\u30EB\u30B9\u30AF\u6642\u9593|\u30CE\u30FC\u30D5\u30A9\u30FC\u30AF\u6642\u9593|\u30CF\u30EF\u30A4\u590F\u6642\u9593|\u30CF\u30EF\u30A4\u6A19\u6E96\u6642|\u30D0\u30CC\u30A2\u30C4\u6642\u9593|\u30D0\u30F3\u30B0\u30E9\u30C7\u30B7\u30E5\u6642\u9593|\u30D1\u30AD\u30B9\u30BF\u30F3\u6642\u9593|\u30D1\u30D7\u30A2\u30CB\u30E5\u30FC\u30AE\u30CB\u30A2\u6642\u9593|\u30D1\u30E9\u30AA\u6642\u9593|\u30D1\u30E9\u30B0\u30A2\u30A4\u590F\u6642\u9593|\u30D1\u30E9\u30B0\u30A2\u30A4\u6642\u9593|\u30D4\u30C8\u30B1\u30EB\u30F3\u5CF6\u6A19\u6E96\u6642|\u30D5\u30A3\u30B8\u30FC\u590F\u6642\u9593|\u30D5\u30A3\u30B8\u30FC\u6642\u9593|\u30D5\u30A3\u30EA\u30D4\u30F3\u6642\u9593|\u30D5\u30A7\u30CB\u30C3\u30AF\u30B9\u8AF8\u5CF6\u6642\u9593|\u30D5\u30A7\u30EB\u30CA\u30F3\u30C9\u30FB\u30C7\u30FB\u30CE\u30ED\u30FC\u30CB\u30E3\u6642\u9593|\u30D5\u30A9\u30FC\u30AF\u30E9\u30F3\u30C9\u8AF8\u5CF6\u6642\u9593|\u30D6\u30E9\u30B8\u30EB\u590F\u6642\u9593|\u30D6\u30E9\u30B8\u30EB\u6642\u9593|\u30D6\u30EB\u30CD\u30A4\u6642\u9593|\u30D6\u30FC\u30BF\u30F3\u6642\u9593|\u30D9\u30CD\u30BA\u30A8\u30E9\u6642\u9593|\u30DA\u30C8\u30ED\u30D1\u30D6\u30ED\u30D5\u30B9\u30AF\u30AB\u30E0\u30C1\u30E3\u30C4\u30AD\u30FC\u6642\u9593|\u30DA\u30EB\u30FC\u6642\u9593|\u30DB\u30D6\u30C9\u6642\u9593|\u30DC\u30B9\u30C8\u30FC\u30AF\u57FA\u5730\u6642\u9593|\u30DC\u30EA\u30D3\u30A2\u6642\u9593|\u30DD\u30F3\u30DA\u30A4\u6642\u9593|\u30DE\u30AC\u30C0\u30F3\u6642\u9593|\u30DE\u30C3\u30B3\u30FC\u30EA\u30FC\u5CF6\u6642\u9593|\u30DE\u30EB\u30B1\u30B5\u30B9\u6642\u9593|\u30DE\u30EC\u30FC\u30B7\u30A2\u6642\u9593|\u30DE\u30FC\u30B7\u30E3\u30EB\u5CF6\u6642\u9593|\u30DF\u30E3\u30F3\u30DE\u30FC\u6642\u9593|\u30E2\u30B9\u30AF\u30EF\u6A19\u6E96\u6642|\u30E2\u30EB\u30B8\u30D6\u6642\u9593|\u30E2\u30FC\u30BD\u30F3\u6642\u9593|\u30E2\u30FC\u30EA\u30B7\u30E3\u30B9\u6642\u9593|\u30E4\u30AF\u30FC\u30C4\u30AF\u6642\u9593|\u30E9\u30A4\u30F3\u8AF8\u5CF6\u6642\u9593|\u30EC\u30E6\u30CB\u30AA\u30F3\u6642\u9593|\u30ED\u30BC\u30E9\u6642\u9593|\u30ED\u30FC\u30C9\u30CF\u30A6\u5CF6\u590F\u6642\u9593|\u30ED\u30FC\u30C9\u30CF\u30A6\u5CF6\u6A19\u6E96\u6642|\u30EF\u30EA\u30B9\u53CA\u3073\u30D5\u30C4\u30CA\u6642\u9593|\u4E2D\u56FD\u6A19\u6E96\u6642|\u4E2D\u592E\u30A4\u30F3\u30C9\u30CD\u30B7\u30A2\u6642\u9593|\u4E2D\u897F\u90E8\u6A19\u6E96\u6642\\(\u30AA\u30FC\u30B9\u30C8\u30E9\u30EA\u30A2\\)|\u4E2D\u90E8\u30A2\u30D5\u30EA\u30AB\u6642\u9593|\u4E2D\u90E8\u30E8\u30FC\u30ED\u30C3\u30D1\u590F\u6642\u9593|\u4E2D\u90E8\u30E8\u30FC\u30ED\u30C3\u30D1\u6642\u9593|\u4E2D\u90E8\u590F\u6642\u9593|\u4E2D\u90E8\u590F\u6642\u9593\\(\u5357\u30AA\u30FC\u30B9\u30C8\u30E9\u30EA\u30A2\\)|\u4E2D\u90E8\u590F\u6642\u9593\\(\u5357\u30AA\u30FC\u30B9\u30C8\u30E9\u30EA\u30A2/\u30CB\u30E5\u30FC\u30B5\u30A6\u30B9\u30A6\u30A7\u30FC\u30EB\u30BA\\)|\u4E2D\u90E8\u6A19\u6E96\u6642|\u4E2D\u90E8\u6A19\u6E96\u6642\\(\u30CE\u30FC\u30B6\u30F3\u30C6\u30EA\u30C8\u30EA\u30FC\\)|\u4E2D\u90E8\u6A19\u6E96\u6642\\(\u5357\u30AA\u30FC\u30B9\u30C8\u30E9\u30EA\u30A2\\)|\u4E2D\u90E8\u6A19\u6E96\u6642\\(\u5357\u30AA\u30FC\u30B9\u30C8\u30E9\u30EA\u30A2/\u30CB\u30E5\u30FC\u30B5\u30A6\u30B9\u30A6\u30A7\u30FC\u30EB\u30BA\\)|\u4ECF\u5357\u65B9\u9818\u304A\u3088\u3073\u5357\u6975\u6642\u9593|\u4ECF\u9818\u30AE\u30A2\u30CA\u6642\u9593|\u5354\u5B9A\u4E16\u754C\u6642|\u5357\u30A2\u30D5\u30EA\u30AB\u6A19\u6E96\u6642|\u5357\u30B8\u30E7\u30FC\u30B8\u30A2\u5CF6\u6A19\u6E96\u6642|\u5927\u897F\u6D0B\u590F\u6642\u9593|\u5927\u897F\u6D0B\u6A19\u6E96\u6642|\u592A\u5E73\u6D0B\u590F\u6642\u9593|\u592A\u5E73\u6D0B\u6A19\u6E96\u6642|\u5C71\u5730\u590F\u6642\u9593|\u5C71\u5730\u6A19\u6E96\u6642|\u65E5\u672C\u6A19\u6E96\u6642|\u662D\u548C\u57FA\u5730\u6642\u9593|\u6771\u30A2\u30D5\u30EA\u30AB\u6642\u9593|\u6771\u30A4\u30F3\u30C9\u30CD\u30B7\u30A2\u6642\u9593|\u6771\u30B0\u30EA\u30FC\u30F3\u30E9\u30F3\u30C9\u590F\u6642\u9593|\u6771\u30B0\u30EA\u30FC\u30F3\u30E9\u30F3\u30C9\u6642\u9593|\u6771\u30C6\u30A3\u30E2\u30FC\u30EB\u6642\u9593|\u6771\u30E8\u30FC\u30ED\u30C3\u30D1\u590F\u6642\u9593|\u6771\u30E8\u30FC\u30ED\u30C3\u30D1\u6642\u9593|\u6771\u90E8\u590F\u6642\u9593|\u6771\u90E8\u590F\u6642\u9593\\(\u30BF\u30B9\u30DE\u30CB\u30A2\\)|\u6771\u90E8\u590F\u6642\u9593\\(\u30CB\u30E5\u30FC\u30B5\u30A6\u30B9\u30A6\u30A7\u30FC\u30EB\u30BA\\)|\u6771\u90E8\u590F\u6642\u9593\\(\u30D3\u30AF\u30C8\u30EA\u30A2\\)|\u6771\u90E8\u6A19\u6E96\u6642|\u6771\u90E8\u6A19\u6E96\u6642\\(\u30AF\u30A4\u30FC\u30F3\u30BA\u30E9\u30F3\u30C9\\)|\u6771\u90E8\u6A19\u6E96\u6642\\(\u30BF\u30B9\u30DE\u30CB\u30A2\\)|\u6771\u90E8\u6A19\u6E96\u6642\\(\u30CB\u30E5\u30FC\u30B5\u30A6\u30B9\u30A6\u30A7\u30FC\u30EB\u30BA\\)|\u6771\u90E8\u6A19\u6E96\u6642\\(\u30D3\u30AF\u30C8\u30EA\u30A2\\)|\u6A3A\u592A\u6642\u9593|\u6E7E\u5CB8\u6A19\u6E96\u6642|\u82F1\u56FD\u590F\u6642\u9593|\u897F\u30A2\u30D5\u30EA\u30AB\u590F\u6642\u9593|\u897F\u30A2\u30D5\u30EA\u30AB\u6642\u9593|\u897F\u30A4\u30F3\u30C9\u30CD\u30B7\u30A2\u6642\u9593|\u897F\u30B0\u30EA\u30FC\u30F3\u30E9\u30F3\u30C9\u590F\u6642\u9593|\u897F\u30B0\u30EA\u30FC\u30F3\u30E9\u30F3\u30C9\u6642\u9593|\u897F\u30B5\u30E2\u30A2\u590F\u6642\u9593|\u897F\u30B5\u30E2\u30A2\u6642\u9593|\u897F\u30E8\u30FC\u30ED\u30C3\u30D1\u590F\u6642\u9593|\u897F\u30E8\u30FC\u30ED\u30C3\u30D1\u6642\u9593|\u897F\u90E8\u6A19\u6E96\u6642\\(\u30AA\u30FC\u30B9\u30C8\u30E9\u30EA\u30A2\\)|\u97D3\u56FD\u6A19\u6E96\u6642|\u9999\u6E2F\u6642\u9593)
         //
         verifyException("org.apache.commons.lang3.time.FastDateParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-3054), "V0XF");
      Locale locale0 = FastDateParser.JAPANESE_IMPERIAL;
      FastDateParser fastDateParser0 = new FastDateParser("FastDateParser[", simpleTimeZone0, locale0);
      assertEquals("FastDateParser[", fastDateParser0.getPattern());
  }

////  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("SST");
      Locale locale0 = Locale.forLanguageTag("85<ba>tJ>\"[9:");
      FastDateParser fastDateParser0 = new FastDateParser("SST", timeZone0, locale0);
      Date date0 = fastDateParser0.parse("85<ba>tJ>\"[9:");
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(1, "1h]x#ExBxA");
      Locale locale0 = new Locale("");
      FastDateParser fastDateParser0 = new FastDateParser("1h]x#ExBxA", simpleTimeZone0, locale0);
      fastDateParser0.hashCode();
  }

////  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ZoneId zoneId0 = ZoneId.systemDefault();
      TimeZone timeZone0 = TimeZone.getTimeZone(zoneId0);
      Locale locale0 = Locale.TAIWAN;
      FastDateParser fastDateParser0 = new FastDateParser("W,q~zi#~`[]uoi>s", timeZone0, locale0);
      String string0 = fastDateParser0.toString();
      assertEquals("FastDateParser[W,q~zi#~`[]uoi>s,zh_TW,GMT]", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ZoneId zoneId0 = ZoneId.systemDefault();
      TimeZone timeZone0 = TimeZone.getTimeZone(zoneId0);
      Locale locale0 = Locale.TAIWAN;
      FastDateParser fastDateParser0 = new FastDateParser("W,q~zi#~`[]uoi>s", timeZone0, locale0);
      // Undeclared exception!
      try { 
        fastDateParser0.parseObject("zh-TW", (ParsePosition) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.time.FastDateParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      FastDateParser fastDateParser0 = new FastDateParser("\"|DXD", timeZone0, locale0);
      String string0 = fastDateParser0.getPattern();
      assertEquals("\"|DXD", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ZoneId zoneId0 = ZoneId.systemDefault();
      TimeZone timeZone0 = TimeZone.getTimeZone(zoneId0);
      Locale locale0 = Locale.TAIWAN;
      FastDateParser fastDateParser0 = new FastDateParser("W,q~zi#~`[]uoi>s", timeZone0, locale0);
      Locale locale1 = fastDateParser0.getLocale();
      assertEquals("", locale1.getVariant());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.ITALY;
      FastDateParser fastDateParser0 = new FastDateParser("6E.aBW\">lMo mOu;d4i", timeZone0, locale0);
      TimeZone timeZone1 = fastDateParser0.getTimeZone();
      assertSame(timeZone1, timeZone0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ZoneId zoneId0 = ZoneId.systemDefault();
      TimeZone timeZone0 = TimeZone.getTimeZone(zoneId0);
      Locale locale0 = Locale.TAIWAN;
      FastDateParser fastDateParser0 = new FastDateParser("W,q~zi#~`[]uoi>s", timeZone0, locale0);
      Pattern pattern0 = fastDateParser0.getParsePattern();
      boolean boolean0 = fastDateParser0.equals(pattern0);
      assertFalse(boolean0);
      assertEquals("(\\p{IsNd}++),", pattern0.toString());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.CANADA_FRENCH;
      FastDateParser fastDateParser0 = null;
      try {
        fastDateParser0 = new FastDateParser("", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid pattern
         //
         verifyException("org.apache.commons.lang3.time.FastDateParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = new Locale("D+|E+|F+|G+|H+|K+|M+|S+|W+|Z+|a+|d+|h+|k+|m+|s+|w+|y+|z+|''|'[^']++(''[^']*+)*+'|[^'A-Za-z]++", "D+|E+|F+|G+|H+|K+|M+|S+|W+|Z+|a+|d+|h+|k+|m+|s+|w+|y+|z+|''|'[^']++(''[^']*+)*+'|[^'A-Za-z]++");
      FastDateParser fastDateParser0 = new FastDateParser("D+|E+|F+|G+|H+|K+|M+|S+|W+|Z+|a+|d+|h+|k+|m+|s+|w+|y+|z+|''|'[^']++(''[^']*+)*+'|[^'A-Za-z]++", timeZone0, locale0);
      boolean boolean0 = fastDateParser0.equals(fastDateParser0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("w_C0]ygl-C^");
      Locale locale0 = Locale.TAIWAN;
      FastDateParser fastDateParser0 = new FastDateParser("/<q\"8ojX{", timeZone0, locale0);
      FastDateParser fastDateParser1 = new FastDateParser("w_C0]ygl-C^", timeZone0, locale0);
      boolean boolean0 = fastDateParser0.equals(fastDateParser1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = new Locale("@W={Fc*bM$3y", "@W={Fc*bM$3y");
      FastDateParser fastDateParser0 = new FastDateParser("@W={Fc*bM$3y", timeZone0, locale0);
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone1 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      FastDateParser fastDateParser1 = new FastDateParser("@W={Fc*bM$3y", timeZone1, locale0);
      boolean boolean0 = fastDateParser0.equals(fastDateParser1);
      assertFalse(boolean0);
  }

////  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = new Locale("D+|E+|F+|G+|H+|K+|M+|S+|W+|Z+|a+|d+|h+|k+|m+|s+|w+|y+|z+|''|'[^']++(''[^']*+)*+'|[^'A-Za-z]++", "D+|E+|F+|G+|H+|K+|M+|S+|W+|Z+|a+|d+|h+|k+|m+|s+|w+|y+|z+|''|'[^']++(''[^']*+)*+'|[^'A-Za-z]++");
      FastDateParser fastDateParser0 = new FastDateParser("D+|E+|F+|G+|H+|K+|M+|S+|W+|Z+|a+|d+|h+|k+|m+|s+|w+|y+|z+|''|'[^']++(''[^']*+)*+'|[^'A-Za-z]++", timeZone0, locale0);
      Locale locale1 = FastDateParser.JAPANESE_IMPERIAL;
      FastDateParser fastDateParser1 = new FastDateParser("D+|E+|F+|G+|H+|K+|M+|S+|W+|Z+|a+|d+|h+|k+|m+|s+|w+|y+|z+|''|'[^']++(''[^']*+)*+'|[^'A-Za-z]++", timeZone0, locale1);
      boolean boolean0 = fastDateParser0.equals(fastDateParser1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      Locale locale0 = Locale.UK;
      FastDateParser fastDateParser0 = new FastDateParser("k$Jo#z;Ml~3'", timeZone0, locale0);
      assertEquals("k$Jo#z;Ml~3'", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "G>?*JYmhHb028");
      Locale locale0 = Locale.FRENCH;
      FastDateParser fastDateParser0 = new FastDateParser("G>?*JYmhHb028", simpleTimeZone0, locale0);
      assertEquals("G>?*JYmhHb028", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "");
      Locale locale0 = Locale.KOREAN;
      FastDateParser fastDateParser0 = new FastDateParser("}5o'_e@Wmsa_9E^+", simpleTimeZone0, locale0);
      assertEquals("}5o'_e@Wmsa_9E^+", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.PRC;
      FastDateParser fastDateParser0 = new FastDateParser("HF7hz6", timeZone0, locale0);
      locale0.toLanguageTag();
      Locale locale1 = Locale.UK;
      locale0.getDisplayVariant(locale1);
      try { 
        fastDateParser0.parseObject("org.apache.commons.lang3.time.FastDateParser$3");
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Unparseable date: \"org.apache.commons.lang3.time.FastDateParser$3\" does not match (\\p{IsNd}{1}+)(\\p{IsNd}{1}+)7(\\p{IsNd}++)(GMT[+\\-]\\d{0,1}\\d{2}|[+\\-]\\d{2}:?\\d{2}|ACDT|Acre \u65F6\u95F4|ACST|ACT|ACWST|ADT|AEDT|AEST|AFT|AKDT|AKST|Alma-Ata \u65F6\u95F4|ALMT|AMST|AMT|ANAT|Aqtau \u65F6\u95F4|Aqtobe \u65F6\u95F4|AQTT|ART|AST|AWST|AZOST|AZOT|AZT|BDT|BNT|BOT|Bougainville Standard Time|BRST|BRT|BST|BTT|CAT|CCT|CDT|CEST|CET|CHADT|Chamorro \u6807\u51C6\u65F6\u95F4|CHAST|Choibalsan \u65F6\u95F4|CHOT|ChST|CHUT|CKT|CLST|CLT|COT|CST|CVT|CXT|DAVT|DDUT|Dumont-d'Urville \u65F6\u95F4|EASST|EAST|EAT|ECT|EDT|EEST|EET|EGST|EGT|EST|FJST|FJT|FKT|FNT|GALT|GAMT|GET|GFT|GILT|GMT|GMT\\+01:00|GMT\\+02:00|GMT\\+03:00|GMT\\+04:00|GMT\\+05:00|GMT\\+06:00|GMT\\+07:00|GMT\\+08:00|GMT\\+09:00|GMT\\+10:00|GMT\\+11:00|GMT\\+12:00|GMT\\+13:00|GMT\\+14:00|GMT-01:00|GMT-02:00|GMT-03:00|GMT-04:00|GMT-05:00|GMT-06:00|GMT-07:00|GMT-08:00|GMT-09:00|GMT-10:00|GMT-11:00|GMT-12:00|GST|GYT|HDT|HKT|HOVT|HST|ICT|IDT|IOT|IRDT|IRKT|IRST|IST|JST|KGT|Kosrae \u65F6\u95F4|KOST|KRAT|KST|LHDT|LHST|Line \u5C9B\u65F6\u95F4|LINT|Magadan \u65F6\u95F4|MAGT|MART|MAWT|MDT|MEST|MET|MHT|MIST|MMT|Mountain \u590F\u4EE4\u65F6|Mountain \u6807\u51C6\u65F6\u95F4|MSK|MST|MUT|MVT|MYT|NCT|NDT|NFT|Novosibirsk \u65F6\u95F4|NOVT|NPT|NRT|NST|NUT|NZDT|NZST|OMST|Oral \u65F6\u95F4|ORAT|PDT|PET|PETT|PGT|PHOT|PHT|PKT|PMDT|PMST|PONT|PST|PWT|PYST|PYT|QYZT|Qyzylorda \u65F6\u95F4|RET|ROTT|SAKT|SAMT|SAST|SBT|SCT|SGT|Srednekolymsk Time|SRET|SRT|SST|SYOT|Syowa \u65F6\u95F4|TAHT|TFT|TJT|TKT|TLT|TMT|TOST|TOT|TVT|ULAT|UTC|UYT|UZT|VET|VLAT|VOST|VUT|WAKT|WAST|WAT|WEST|WET|WFT|WGST|WGT|WIB|WIT|WITA|WSDT|WSST|XJT|YAKT|Yekaterinburg \u65F6\u95F4|YEKT|\u4E0D\u4E39\u65F6\u95F4|\u4E18\u514B\u65F6\u95F4|\u4E1C\u52A0\u590F\u4EE4\u65F6|\u4E1C\u52A0\u65F6\u95F4|\u4E1C\u5370\u5EA6\u5C3C\u897F\u4E9A\u65F6\u95F4|\u4E1C\u5E1D\u6C76\u65F6\u95F4|\u4E1C\u683C\u6797\u5C9B\u590F\u4EE4\u65F6|\u4E1C\u683C\u6797\u5C9B\u65F6\u95F4|\u4E1C\u6B27\u590F\u4EE4\u65F6|\u4E1C\u6B27\u65F6\u95F4|\u4E1C\u90E8\u590F\u4EE4\u65F6|\u4E1C\u90E8\u590F\u4EE4\u65F6 \\(\u5854\u65AF\u9A6C\u5C3C\u4E9A\\)|\u4E1C\u90E8\u590F\u4EE4\u65F6 \\(\u65B0\u5357\u5A01\u5C14\u65AF\\)|\u4E1C\u90E8\u590F\u4EE4\u65F6 \\(\u7EF4\u591A\u5229\u4E9A\\)|\u4E1C\u90E8\u6807\u51C6\u65F6\u95F4|\u4E1C\u90E8\u6807\u51C6\u65F6\u95F4 \\(\u5854\u65AF\u9A6C\u5C3C\u4E9A\\)|\u4E1C\u90E8\u6807\u51C6\u65F6\u95F4 \\(\u65B0\u5357\u5A01\u5C14\u65AF\\)|\u4E1C\u90E8\u6807\u51C6\u65F6\u95F4 \\(\u6606\u58EB\u5170\\)|\u4E1C\u90E8\u6807\u51C6\u65F6\u95F4 \\(\u7EF4\u591A\u5229\u4E9A\\)|\u4E1C\u975E\u65F6\u95F4|\u4E2D\u56FD\u6807\u51C6\u65F6\u95F4|\u4E2D\u592E\u590F\u4EE4\u65F6|\u4E2D\u592E\u590F\u4EE4\u65F6 \\(\u5357\u6FB3\u5927\u5229\u4E9A\\)|\u4E2D\u592E\u590F\u4EE4\u65F6 \\(\u5357\u6FB3\u5927\u5229\u4E9A/\u65B0\u5357\u5A01\u5C14\u65AF\\)|\u4E2D\u592E\u6807\u51C6\u65F6\u95F4|\u4E2D\u592E\u6807\u51C6\u65F6\u95F4 \\(\u5317\u9886\u5730\\)|\u4E2D\u592E\u6807\u51C6\u65F6\u95F4 \\(\u5357\u6FB3\u5927\u5229\u4E9A\\)|\u4E2D\u592E\u6807\u51C6\u65F6\u95F4 \\(\u5357\u6FB3\u5927\u5229\u4E9A/\u65B0\u5357\u5A01\u5C14\u65AF\\)|\u4E2D\u6B27\u590F\u4EE4\u65F6|\u4E2D\u6B27\u65F6\u95F4|\u4E2D\u897F\u90E8\u6807\u51C6\u65F6\u95F4 \\(\u6FB3\u5927\u5229\u4E9A\\)|\u4E2D\u90E8\u5370\u5EA6\u5C3C\u897F\u4E9A\u65F6\u95F4|\u4E2D\u975E\u65F6\u95F4|\u4E4C\u5179\u522B\u514B\u65AF\u5766\u65F6\u95F4|\u4E4C\u62C9\u572D\u65F6\u95F4|\u4E4C\u65AF\u5B63\u6D85\u62C9\u65F6\u95F4|\u4E54\u6CBB\u4E9A\u65F6\u95F4|\u4E9A\u585E\u62DC\u7136\u65F6\u95F4|\u4E9A\u5E93\u6B21\u514B\u65F6\u95F4|\u4E9A\u7F8E\u5C3C\u4E9A\u65F6\u95F4|\u4E9A\u901F\u5C14\u7FA4\u5C9B\u590F\u4EE4\u65F6|\u4E9A\u901F\u5C14\u7FA4\u5C9B\u65F6\u95F4|\u4E9A\u9A6C\u900A\u590F\u4EE4\u65F6|\u4E9A\u9A6C\u900A\u65F6\u95F4|\u4EE5\u8272\u5217\u590F\u4EE4\u65F6|\u4EE5\u8272\u5217\u6807\u51C6\u65F6\u95F4|\u4F0A\u5C14\u5E93\u6B21\u514B\u65F6\u95F4|\u4F0A\u6717\u590F\u4EE4\u65F6|\u4F0A\u6717\u6807\u51C6\u65F6\u95F4|\u4F5B\u5FB7\u89D2\u65F6\u95F4|\u514B\u62C9\u65AF\u8BFA\u4E9A\u5C14\u65AF\u514B\u65F6\u95F4|\u5188\u6BD4\u4E9A\u65F6\u95F4|\u52A0\u62C9\u5DF4\u54E5\u65F6\u95F4|\u52A0\u7EB3\u65F6\u95F4|\u534F\u8C03\u4E16\u754C\u65F6\u95F4|\u5357\u4E54\u6CBB\u4E9A\u6807\u51C6\u65F6\u95F4|\u5357\u975E\u6807\u51C6\u65F6\u95F4|\u5370\u5EA6\u652F\u90A3\u65F6\u95F4|\u5370\u5EA6\u6807\u51C6\u65F6\u95F4|\u5370\u5EA6\u6D0B\u5730\u5E26\u65F6\u95F4|\u5384\u74DC\u591A\u5C14\u65F6\u95F4|\u53E4\u5DF4\u590F\u4EE4\u65F6|\u53E4\u5DF4\u6807\u51C6\u65F6\u95F4|\u53EF\u53EF\u65AF\u7FA4\u5C9B\u65F6\u95F4|\u5409\u4F2F\u7279\u7FA4\u5C9B\u65F6\u95F4|\u5409\u5C14\u5409\u65AF\u65AF\u5766\u65F6\u95F4|\u5410\u9C81\u74E6\u65F6\u95F4|\u54E5\u4F26\u6BD4\u4E9A\u65F6\u95F4|\u571F\u5E93\u66FC\u65F6\u95F4|\u5723\u8BDE\u5C9B\u65F6\u95F4|\u572D\u4E9A\u90A3\u65F6\u95F4|\u5854\u5409\u514B\u65AF\u5766\u65F6\u95F4|\u585E\u5E2D\u5C14\u7FA4\u5C9B\u65F6\u95F4|\u590D\u6D3B\u5C9B\u590F\u4EE4\u65F6|\u590D\u6D3B\u5C9B\u65F6\u95F4|\u590F\u5A01\u5937\u590F\u4EE4\u65F6|\u590F\u5A01\u5937\u6807\u51C6\u65F6\u95F4|\u5927\u6EAA\u5730\u5C9B\u65F6\u95F4|\u5927\u897F\u6D0B\u590F\u4EE4\u65F6|\u5927\u897F\u6D0B\u6807\u51C6\u65F6\u95F4|\u592A\u5E73\u6D0B\u590F\u4EE4\u65F6|\u592A\u5E73\u6D0B\u6807\u51C6\u65F6\u95F4|\u59D4\u5185\u745E\u62C9\u65F6\u95F4|\u5A01\u514B\u65F6\u95F4|\u5B5F\u52A0\u62C9\u65F6\u95F4|\u5C3C\u6CCA\u5C14\u65F6\u95F4|\u5DF4\u57FA\u65AF\u5766\u65F6\u95F4|\u5DF4\u5E03\u4E9A\u65B0\u51E0\u5185\u4E9A\u65F6\u95F4|\u5DF4\u62C9\u572D\u590F\u4EE4\u65F6|\u5DF4\u62C9\u572D\u65F6\u95F4|\u5DF4\u897F\u5229\u4E9A\u590F\u4EE4\u65F6|\u5DF4\u897F\u5229\u4E9A\u65F6\u95F4|\u5E1B\u7409\u65F6\u95F4|\u5E93\u4F26\u65F6\u95F4|\u5E93\u514B\u7FA4\u5C9B\u65F6\u95F4|\u5E93\u9875\u5C9B\u65F6\u95F4|\u5F7C\u5F97\u7F57\u5DF4\u752B\u6D1B\u592B\u65AF\u514B\u65F6\u95F4|\u6234\u7EF4\u65AF\u65F6\u95F4|\u6240\u7F57\u95E8\u7FA4\u5C9B\u65F6\u95F4|\u6258\u514B\u52B3\u7FA4\u5C9B\u65F6\u95F4|\u6469\u91CC\u897F\u65AF\u65F6\u95F4|\u6587\u83B1\u65F6\u95F4|\u6590\u6D4E\u590F\u4EE4\u65F6|\u6590\u6D4E\u65F6\u95F4|\u65B0\u52A0\u52D2\u591A\u5C3C\u4E9A\u65F6\u95F4|\u65B0\u52A0\u5761\u65F6\u95F4|\u65B0\u897F\u5170\u590F\u4EE4\u65F6|\u65B0\u897F\u5170\u6807\u51C6\u65F6\u95F4|\u65E5\u672C\u6807\u51C6\u65F6\u95F4|\u667A\u5229\u590F\u4EE4\u65F6|\u667A\u5229\u65F6\u95F4|\u67E5\u8428\u59C6\u590F\u4EE4\u65F6|\u67E5\u8428\u59C6\u6807\u51C6\u65F6\u95F4|\u683C\u6797\u5A01\u6CBB\u65F6\u95F4|\u6C99\u9A6C\u62C9\u65F6\u95F4|\u6CD5\u5C5E\u5357\u6781\u65F6\u95F4|\u6CD5\u5C5E\u572D\u4E9A\u90A3\u65F6\u95F4|\u6CE2\u65AF\u6E7E\u6807\u51C6\u65F6\u95F4|\u6CE2\u7EB3\u4F69\u65F6\u95F4|\u6D77\u53C2\u5D34\u65F6\u95F4|\u7231\u5C14\u5170\u590F\u4EE4\u65F6|\u73BB\u5229\u7EF4\u4E9A\u65F6\u95F4|\u74E6\u5229\u65AF\u53CA\u798F\u675C\u7EB3\u7FA4\u5C9B\u65F6\u95F4|\u74E6\u5974\u963F\u56FE\u65F6\u95F4|\u7559\u5C3C\u65FA\u5C9B\u65F6\u95F4|\u76AE\u57C3\u5C14\u5C9B\u53CA\u5BC6\u514B\u9686\u5C9B\u590F\u4EE4\u65F6|\u76AE\u57C3\u5C14\u5C9B\u53CA\u5BC6\u514B\u9686\u5C9B\u6807\u51C6\u65F6\u95F4|\u76AE\u7279\u5EB7\u5C9B\u6807\u51C6\u65F6\u95F4|\u798F\u514B\u5170\u7FA4\u5C9B\u65F6\u95F4|\u79D1\u5E03\u591A\u65F6\u95F4|\u79D8\u9C81\u65F6\u95F4|\u7EBD\u5A01\u5C9B\u65F6\u95F4|\u7EBD\u82AC\u5170\u590F\u4EE4\u65F6|\u7EBD\u82AC\u5170\u6807\u51C6\u65F6\u95F4|\u7F05\u7538\u65F6\u95F4|\u7F57\u745F\u62C9\u65F6\u95F4|\u82CF\u5229\u5357\u65F6\u95F4|\u82F1\u56FD\u590F\u4EE4\u65F6|\u83AB\u65AF\u6258\u514B\u65F6\u95F4|\u83AB\u65AF\u79D1\u6807\u51C6\u65F6\u95F4|\u83AB\u68EE\u65F6\u95F4|\u83F2\u5C3C\u514B\u65AF\u7FA4\u5C9B\u65F6\u95F4|\u83F2\u5F8B\u5BBE\u65F6\u95F4|\u8428\u6469\u4E9A\u7FA4\u5C9B\u6807\u51C6\u65F6\u95F4|\u897F\u5370\u5EA6\u5C3C\u897F\u4E9A\u65F6\u95F4|\u897F\u683C\u6797\u5170\u5C9B\u590F\u4EE4\u65F6|\u897F\u683C\u6797\u5170\u5C9B\u65F6\u95F4|\u897F\u6B27\u590F\u4EE4\u65F6|\u897F\u6B27\u65F6\u95F4|\u897F\u8428\u6469\u4E9A\u590F\u4EE4\u65F6|\u897F\u8428\u6469\u4E9A\u65F6\u95F4|\u897F\u90E8\u6807\u51C6\u65F6\u95F4 \\(\u6FB3\u5927\u5229\u4E9A\\)|\u897F\u975E\u590F\u4EE4\u65F6|\u897F\u975E\u65F6\u95F4|\u8BFA\u798F\u514B\u65F6\u95F4|\u8BFA\u9C81\u65F6\u95F4|\u8C6A\u516C\u590F\u4EE4\u65F6|\u8C6A\u516C\u6807\u51C6\u65F6\u95F4|\u8D39\u5C14\u5357\u591A\u5FB7\u8BFA\u7F57\u5C3C\u4E9A\u65F6\u95F4|\u9102\u6728\u65AF\u514B\u65F6\u95F4|\u963F\u5BCC\u6C57\u65F6\u95F4|\u963F\u62C9\u4F2F\u6807\u51C6\u65F6\u95F4|\u963F\u62C9\u65AF\u52A0\u590F\u4EE4\u65F6|\u963F\u62C9\u65AF\u52A0\u6807\u51C6\u65F6\u95F4|\u963F\u6839\u5EF7\u65F6\u95F4|\u963F\u90A3\u5E95\u6CB3\u65F6\u95F4|\u97E9\u56FD\u6807\u51C6\u65F6\u95F4|\u9999\u6E2F\u65F6\u95F4|\u9A6C\u514B\u8428\u65AF\u65F6\u95F4|\u9A6C\u5C14\u4EE3\u592B\u65F6\u95F4|\u9A6C\u6765\u897F\u4E9A\u65F6\u95F4|\u9A6C\u7ECD\u5C14\u7FA4\u5C9B\u65F6\u95F4|\u9EA6\u5938\u91CC\u5C9B\u65F6\u95F4)6
         //
         verifyException("org.apache.commons.lang3.time.FastDateParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("{@/GG+G8P");
      Locale locale0 = Locale.JAPANESE;
      FastDateParser fastDateParser0 = new FastDateParser("{@/GG+G8P", timeZone0, locale0);
      int int0 = fastDateParser0.adjustYear(0);
      assertEquals(2000, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(1, "1h]x#ExBxA");
      Locale locale0 = new Locale("");
      FastDateParser fastDateParser0 = new FastDateParser("1h]x#ExBxA", simpleTimeZone0, locale0);
      int int0 = fastDateParser0.adjustYear(1158);
      assertEquals(3058, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.PRC;
      FastDateParser fastDateParser0 = new FastDateParser("{*[a-EWK(^E8T8F8xe", timeZone0, locale0);
      assertEquals("{*[a-EWK(^E8T8F8xe", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = FastDateParser.JAPANESE_IMPERIAL;
      FastDateParser fastDateParser0 = new FastDateParser(")t{Q]mm", timeZone0, locale0);
      assertEquals(")t{Q]mm", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "*>=B6SJAy!^a']");
      Locale locale0 = Locale.JAPANESE;
      FastDateParser fastDateParser0 = new FastDateParser("*>=B6SJAy!^a']", simpleTimeZone0, locale0);
      assertEquals("*>=B6SJAy!^a']", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("0^mOB`\"PP/f1");
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      FastDateParser fastDateParser0 = new FastDateParser("0^mOB`\"PP/f1", timeZone0, locale0);
      assertEquals("0^mOB`\"PP/f1", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = new Locale("");
      FastDateParser fastDateParser0 = new FastDateParser("Z2M_rE8wPgvw[%*R!]h", timeZone0, locale0);
      assertEquals("Z2M_rE8wPgvw[%*R!]h", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "org.apache.commons.lang3.time.FastDateParser$TimeZoneStrategy", 125, 0, 0, 125, 0, 0, 1761, 1491);
      Locale locale0 = new Locale("", "GwVPvG2'$", "org.apache.commons.lang3.time.FastDateParser$TimeZoneStrategy");
      FastDateParser fastDateParser0 = new FastDateParser("3Ms\"e:4", simpleTimeZone0, locale0);
      assertEquals("3Ms\"e:4", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = new Locale("4k UR9b", "4k UR9b");
      FastDateParser fastDateParser0 = new FastDateParser("4k UR9b", timeZone0, locale0);
      assertEquals("4k UR9b", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "s5ry");
      Locale locale0 = Locale.forLanguageTag("u|Qj?@/!");
      FastDateParser fastDateParser0 = new FastDateParser("s5ry", simpleTimeZone0, locale0);
      assertEquals("s5ry", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Locale locale0 = Locale.ITALY;
      TimeZone timeZone0 = TimeZone.getDefault();
      FastDateParser fastDateParser0 = new FastDateParser("9+RUS}Nk7x<", timeZone0, locale0);
      assertEquals("9+RUS}Nk7x<", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      FastDateParser fastDateParser0 = new FastDateParser(":WrQq", timeZone0, locale0);
      assertEquals(":WrQq", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(1231, ";2=(l{H,L#P{QT'!',#", 0, 0, 1231, 1231, 0, 0, 0, 0);
      Locale locale0 = Locale.FRANCE;
      FastDateParser fastDateParser0 = new FastDateParser(";2=(l{H,L#P{QT'!',#", simpleTimeZone0, locale0);
      assertEquals(";2=(l{H,L#P{QT'!',#", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-106), "G3:4$Jq:6qI");
      Locale locale0 = Locale.CANADA;
      FastDateParser fastDateParser0 = new FastDateParser("<5odT!Mv9&C", simpleTimeZone0, locale0);
      assertEquals("<5odT!Mv9&C", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone(",V xQ~_9i#*k;jTp/");
      Locale locale0 = Locale.KOREAN;
      FastDateParser fastDateParser0 = new FastDateParser("?2aEHXY0", timeZone0, locale0);
      assertEquals("?2aEHXY0", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("y^CTGI");
      Locale locale0 = Locale.JAPANESE;
      FastDateParser fastDateParser0 = new FastDateParser("y^CTGI", timeZone0, locale0);
      assertEquals("y^CTGI", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(110, "GMTPNT");
      Locale locale0 = Locale.CHINA;
      FastDateParser fastDateParser0 = new FastDateParser("`O\u000490SXSL[", simpleTimeZone0, locale0);
      assertEquals("`O\u000490SXSL[", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = new Locale("");
      FastDateParser fastDateParser0 = new FastDateParser("D+|E+|F+|G+|H+|K+|M+|S+|W+|Z+|a+|d+|h+|k+|m+|s+|w+|y+|z+W''|'[^']++(''[^']*+)*+'|[^'A-Za-z]++", timeZone0, locale0);
      assertEquals("D+|E+|F+|G+|H+|K+|M+|S+|W+|Z+|a+|d+|h+|k+|m+|s+|w+|y+|z+W''|'[^']++(''[^']*+)*+'|[^'A-Za-z]++", fastDateParser0.getPattern());
  }
}
