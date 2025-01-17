/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 17:13:21 GMT 2014
 */

package org.apache.commons.lang3.text.translate;

import static org.junit.Assert.*;
import org.junit.Test;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.util.Locale;
import org.apache.commons.lang3.text.translate.CharSequenceTranslator;
import org.apache.commons.lang3.text.translate.LookupTranslator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class LookupTranslatorEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = (-11);
      String string0 = CharSequenceTranslator.hex(int0);
      assertEquals("FFFFFFF5", string0);
      assertNotNull(string0);
      
      CharSequence[][] charSequenceArray0 = new CharSequence[2][5];
      CharSequence[] charSequenceArray1 = new CharSequence[17];
      charSequenceArray1[0] = (CharSequence) string0;
      assertEquals("FFFFFFF5", charSequenceArray1[0].toString());
      assertEquals(8, charSequenceArray1[0].length());
      assertNotNull(charSequenceArray1[0]);
      
      charSequenceArray1[1] = (CharSequence) string0;
      assertEquals("FFFFFFF5", charSequenceArray1[1].toString());
      assertEquals(8, charSequenceArray1[1].length());
      assertNotNull(charSequenceArray1[1]);
      
      charSequenceArray0[0] = charSequenceArray1;
      assertNotNull(charSequenceArray0[0]);
      
      charSequenceArray0[1] = charSequenceArray0[0];
      assertNotNull(charSequenceArray0[1]);
      
      LookupTranslator lookupTranslator0 = new LookupTranslator(charSequenceArray0);
      assertNotNull(lookupTranslator0);
      
      String string1 = lookupTranslator0.translate(charSequenceArray1[1]);
      assertEquals("FFFFFFF5", string1);
      assertTrue(string1.equals((Object)string0));
      assertNotSame(string1, string0);
      assertNotNull(string1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int int0 = 234;
      CharSequence[][] charSequenceArray0 = new CharSequence[3][5];
      CharSequence[] charSequenceArray1 = new CharSequence[9];
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(int0);
      assertEquals(false, byteBuffer0.isDirect());
      assertEquals(234, byteBuffer0.limit());
      assertEquals(234, byteBuffer0.capacity());
      assertEquals(0, byteBuffer0.arrayOffset());
      assertEquals(0, byteBuffer0.position());
      assertEquals(false, byteBuffer0.isReadOnly());
      assertEquals(true, byteBuffer0.hasArray());
      assertEquals("java.nio.HeapByteBuffer[pos=0 lim=234 cap=234]", byteBuffer0.toString());
      assertEquals(234, byteBuffer0.remaining());
      assertEquals(true, byteBuffer0.hasRemaining());
      assertNotNull(byteBuffer0);
      
      CharBuffer charBuffer0 = byteBuffer0.asCharBuffer();
      assertEquals(117, charBuffer0.limit());
      assertEquals(true, charBuffer0.hasRemaining());
      assertEquals(false, charBuffer0.isReadOnly());
      assertEquals(117, charBuffer0.remaining());
      assertEquals(false, charBuffer0.isDirect());
      assertEquals("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", charBuffer0.toString());
      assertEquals(0, charBuffer0.position());
      assertEquals(false, charBuffer0.hasArray());
      assertEquals(117, charBuffer0.capacity());
      assertEquals(117, charBuffer0.length());
      assertEquals(false, byteBuffer0.isDirect());
      assertEquals(234, byteBuffer0.limit());
      assertEquals(234, byteBuffer0.capacity());
      assertEquals(0, byteBuffer0.arrayOffset());
      assertEquals(0, byteBuffer0.position());
      assertEquals(false, byteBuffer0.isReadOnly());
      assertEquals(true, byteBuffer0.hasArray());
      assertEquals("java.nio.HeapByteBuffer[pos=0 lim=234 cap=234]", byteBuffer0.toString());
      assertEquals(234, byteBuffer0.remaining());
      assertEquals(true, byteBuffer0.hasRemaining());
      assertNotNull(charBuffer0);
      
      charSequenceArray0[0] = charSequenceArray1;
      assertNotNull(charSequenceArray0[0]);
      
      charSequenceArray0[2] = charSequenceArray1;
      assertNotNull(charSequenceArray0[2]);
      
      charSequenceArray1[0] = (CharSequence) charBuffer0;
      assertEquals("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", charSequenceArray1[0].toString());
      assertEquals(117, charSequenceArray1[0].length());
      assertEquals(117, charBuffer0.limit());
      assertEquals(true, charBuffer0.hasRemaining());
      assertEquals(false, charBuffer0.isReadOnly());
      assertEquals(117, charBuffer0.remaining());
      assertEquals(false, charBuffer0.isDirect());
      assertEquals("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", charBuffer0.toString());
      assertEquals(0, charBuffer0.position());
      assertEquals(false, charBuffer0.hasArray());
      assertEquals(117, charBuffer0.capacity());
      assertEquals(117, charBuffer0.length());
      assertEquals(false, byteBuffer0.isDirect());
      assertEquals(234, byteBuffer0.limit());
      assertEquals(234, byteBuffer0.capacity());
      assertEquals(0, byteBuffer0.arrayOffset());
      assertEquals(0, byteBuffer0.position());
      assertEquals(false, byteBuffer0.isReadOnly());
      assertEquals(true, byteBuffer0.hasArray());
      assertEquals("java.nio.HeapByteBuffer[pos=0 lim=234 cap=234]", byteBuffer0.toString());
      assertEquals(234, byteBuffer0.remaining());
      assertEquals(true, byteBuffer0.hasRemaining());
      assertNotNull(charSequenceArray1[0]);
      
      charSequenceArray0[1] = charSequenceArray1;
      assertNotNull(charSequenceArray0[1]);
      
      LookupTranslator lookupTranslator0 = new LookupTranslator(charSequenceArray0);
      assertNotNull(lookupTranslator0);
      
      String string0 = lookupTranslator0.translate((CharSequence) charBuffer0);
      assertEquals("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", string0);
      assertEquals(117, charBuffer0.limit());
      assertEquals(true, charBuffer0.hasRemaining());
      assertEquals(false, charBuffer0.isReadOnly());
      assertEquals(117, charBuffer0.remaining());
      assertEquals(false, charBuffer0.isDirect());
      assertEquals("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", charBuffer0.toString());
      assertEquals(0, charBuffer0.position());
      assertEquals(false, charBuffer0.hasArray());
      assertEquals(117, charBuffer0.capacity());
      assertEquals(117, charBuffer0.length());
      assertEquals(false, byteBuffer0.isDirect());
      assertEquals(234, byteBuffer0.limit());
      assertEquals(234, byteBuffer0.capacity());
      assertEquals(0, byteBuffer0.arrayOffset());
      assertEquals(0, byteBuffer0.position());
      assertEquals(false, byteBuffer0.isReadOnly());
      assertEquals(true, byteBuffer0.hasArray());
      assertEquals("java.nio.HeapByteBuffer[pos=0 lim=234 cap=234]", byteBuffer0.toString());
      assertEquals(234, byteBuffer0.remaining());
      assertEquals(true, byteBuffer0.hasRemaining());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CharSequence[] charSequenceArray0 = new CharSequence[1];
      Locale locale0 = Locale.JAPAN;
      assertEquals("jpn", locale0.getISO3Language());
      assertEquals("JP", locale0.getCountry());
      assertEquals("ja_JP", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("ja", locale0.getLanguage());
      assertEquals("JPN", locale0.getISO3Country());
      assertNotNull(locale0);
      
      String string0 = locale0.getDisplayLanguage();
      assertEquals("Japanese", string0);
      assertEquals("jpn", locale0.getISO3Language());
      assertEquals("JP", locale0.getCountry());
      assertEquals("ja_JP", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("ja", locale0.getLanguage());
      assertEquals("JPN", locale0.getISO3Country());
      assertNotNull(string0);
      
      charSequenceArray0[0] = (CharSequence) string0;
      assertEquals("Japanese", charSequenceArray0[0].toString());
      assertEquals(8, charSequenceArray0[0].length());
      assertEquals("jpn", locale0.getISO3Language());
      assertEquals("JP", locale0.getCountry());
      assertEquals("ja_JP", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("ja", locale0.getLanguage());
      assertEquals("JPN", locale0.getISO3Country());
      assertNotNull(charSequenceArray0[0]);
      
      CharSequence[][] charSequenceArrayArray0 = null;
      LookupTranslator lookupTranslator0 = new LookupTranslator(charSequenceArrayArray0);
      assertNotNull(lookupTranslator0);
      
      String string1 = lookupTranslator0.translate(charSequenceArray0[0]);
      assertEquals("Japanese", string1);
      assertTrue(string1.equals((Object)string0));
      assertNotSame(string1, string0);
      assertNotNull(string1);
  }
}
