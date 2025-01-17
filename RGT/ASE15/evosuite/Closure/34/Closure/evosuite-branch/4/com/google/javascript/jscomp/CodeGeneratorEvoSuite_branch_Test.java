/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 22:14:58 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.CodeGenerator;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class CodeGeneratorEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = "\u000B";
      String string1 = CodeGenerator.identifierEscape(string0);
      assertEquals("\u000B", string1);
      assertNotNull(string1);
      assertSame(string0, string1);
      assertSame(string1, string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = "b<!--,\u000B\f\r$0\u1680E\u2028;\u205F\u3000";
      String string1 = CodeGenerator.identifierEscape(string0);
      assertEquals("b<!--,\\u000b\\u000c\\u000d$0\\u1680E\\u2028;\\u205f\\u3000", string1);
      assertNotNull(string1);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = "UE";
      Charset charset0 = Charset.defaultCharset();
      assertEquals(true, charset0.isRegistered());
      assertEquals("UTF-8", charset0.displayName());
      assertEquals("UTF-8", charset0.name());
      assertEquals(true, charset0.canEncode());
      assertEquals("UTF-8", charset0.toString());
      assertNotNull(charset0);
      
      CharsetEncoder charsetEncoder0 = charset0.newEncoder();
      assertEquals(true, charset0.isRegistered());
      assertEquals("UTF-8", charset0.displayName());
      assertEquals("UTF-8", charset0.name());
      assertEquals(true, charset0.canEncode());
      assertEquals("UTF-8", charset0.toString());
      assertEquals(1.1F, charsetEncoder0.averageBytesPerChar(), 0.01F);
      assertEquals(3.0F, charsetEncoder0.maxBytesPerChar(), 0.01F);
      assertNotNull(charsetEncoder0);
      
      String string1 = CodeGenerator.regexpEscape(string0, charsetEncoder0);
      assertEquals(true, charset0.isRegistered());
      assertEquals("UTF-8", charset0.displayName());
      assertEquals("UTF-8", charset0.name());
      assertEquals(true, charset0.canEncode());
      assertEquals("UTF-8", charset0.toString());
      assertEquals(1.1F, charsetEncoder0.averageBytesPerChar(), 0.01F);
      assertEquals(3.0F, charsetEncoder0.maxBytesPerChar(), 0.01F);
      assertEquals("/UE/", string1);
      assertNotNull(string1);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = "hzl~>5</script";
      String string1 = CodeGenerator.regexpEscape(string0);
      assertEquals("/hzl~>5<\\/script/", string1);
      assertNotNull(string1);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = "MXOzW_X*s-->";
      String string1 = CodeGenerator.regexpEscape(string0);
      assertEquals("/MXOzW_X*s--\\>/", string1);
      assertNotNull(string1);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = "_q'q)tP*p<P->";
      String string1 = CodeGenerator.regexpEscape(string0);
      assertEquals("/_q'q)tP*p<P->/", string1);
      assertNotNull(string1);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = ">z6=Kel-0~.my<!--v";
      String string1 = CodeGenerator.escapeToDoubleQuotedJsString(string0);
      assertEquals("\">z6=Kel-0~.my<\\!--v\"", string1);
      assertNotNull(string1);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      
      String string2 = CodeGenerator.escapeToDoubleQuotedJsString(string1);
      assertEquals("\"\\\">z6=Kel-0~.my<\\\\!--v\\\"\"", string2);
      assertNotNull(string2);
      assertNotSame(string1, string0);
      assertNotSame(string1, string2);
      assertNotSame(string0, string2);
      assertNotSame(string0, string1);
      assertNotSame(string2, string0);
      assertNotSame(string2, string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string1.equals((Object)string2));
      assertFalse(string0.equals((Object)string2));
      assertFalse(string0.equals((Object)string1));
      assertFalse(string2.equals((Object)string0));
      assertFalse(string2.equals((Object)string1));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = "\t\n\u000B\f\r1y\u0085\u1680\u2028\u2029\u205F9\u3000";
      String string1 = CodeGenerator.escapeToDoubleQuotedJsString(string0);
      assertEquals("\"\\t\\n\\x0B\\u000c\\r1y\\u0085\\u1680\\u2028\\u2029\\u205f9\\u3000\"", string1);
      assertNotNull(string1);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = "0";
      boolean boolean0 = CodeGenerator.isSimpleNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = "";
      boolean boolean0 = CodeGenerator.isSimpleNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = "hzl~>5</script";
      double double0 = CodeGenerator.getSimpleNumber(string0);
      assertEquals(Double.NaN, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = "\u000B";
      boolean boolean0 = CodeGenerator.isSimpleNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = "1";
      double double0 = CodeGenerator.getSimpleNumber(string0);
      assertEquals(1.0, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = ")HPh5_\\]>-_";
      String string1 = CodeGenerator.regexpEscape(string0);
      assertEquals("/)HPh5_\\]>\\u007f-_/", string1);
      assertNotNull(string1);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
  }
}
