/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 17:01:28 GMT 2014
 */

package org.jfree.data;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;

import org.jfree.chart.util.SortOrder;
import org.jfree.data.DefaultKeyedValues;
import org.jfree.data.UnknownKeyException;
import org.junit.runner.RunWith;

 
public class DefaultKeyedValuesEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      assertNotNull(defaultKeyedValues0);
      assertEquals(0, defaultKeyedValues0.getItemCount());
      
      int int0 = 1;
      defaultKeyedValues0.setValue((Comparable) int0, (Number) int0);
      assertEquals(1, defaultKeyedValues0.getItemCount());
      
      DefaultKeyedValues defaultKeyedValues1 = new DefaultKeyedValues();
      assertNotSame(defaultKeyedValues1, defaultKeyedValues0);
      assertFalse(defaultKeyedValues1.equals((Object)defaultKeyedValues0));
      assertNotNull(defaultKeyedValues1);
      assertEquals(0, defaultKeyedValues1.getItemCount());
      
      defaultKeyedValues1.addValue((Comparable) int0, (Number) int0);
      assertNotSame(defaultKeyedValues1, defaultKeyedValues0);
      assertTrue(defaultKeyedValues1.equals((Object)defaultKeyedValues0));
      assertEquals(1, defaultKeyedValues1.getItemCount());
      
      boolean boolean0 = defaultKeyedValues0.equals((Object) defaultKeyedValues1);
      assertNotSame(defaultKeyedValues0, defaultKeyedValues1);
      assertNotSame(defaultKeyedValues1, defaultKeyedValues0);
      assertTrue(boolean0);
      assertTrue(defaultKeyedValues0.equals((Object)defaultKeyedValues1));
      assertTrue(defaultKeyedValues1.equals((Object)defaultKeyedValues0));
      assertEquals(1, defaultKeyedValues0.getItemCount());
      assertEquals(1, defaultKeyedValues1.getItemCount());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      assertNotNull(defaultKeyedValues0);
      assertEquals(0, defaultKeyedValues0.getItemCount());
      
      int int0 = 0;
      double double0 = (-570.3);
      defaultKeyedValues0.insertValue(int0, (Comparable) int0, double0);
      assertEquals(1, defaultKeyedValues0.getItemCount());
      
      DefaultKeyedValues defaultKeyedValues1 = new DefaultKeyedValues();
      assertNotSame(defaultKeyedValues1, defaultKeyedValues0);
      assertFalse(defaultKeyedValues1.equals((Object)defaultKeyedValues0));
      assertNotNull(defaultKeyedValues1);
      assertEquals(0, defaultKeyedValues1.getItemCount());
      
      defaultKeyedValues1.addValue((Comparable) double0, (Number) int0);
      assertNotSame(defaultKeyedValues1, defaultKeyedValues0);
      assertFalse(defaultKeyedValues1.equals((Object)defaultKeyedValues0));
      assertEquals(1, defaultKeyedValues1.getItemCount());
      
      boolean boolean0 = defaultKeyedValues1.equals((Object) defaultKeyedValues0);
      assertNotSame(defaultKeyedValues0, defaultKeyedValues1);
      assertNotSame(defaultKeyedValues1, defaultKeyedValues0);
      assertFalse(boolean0);
      assertFalse(defaultKeyedValues0.equals((Object)defaultKeyedValues1));
      assertFalse(defaultKeyedValues1.equals((Object)defaultKeyedValues0));
      assertEquals(1, defaultKeyedValues0.getItemCount());
      assertEquals(1, defaultKeyedValues1.getItemCount());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      assertNotNull(defaultKeyedValues0);
      assertEquals(0, defaultKeyedValues0.getItemCount());
      
      byte byte0 = (byte) (-17);
      Byte byte1 = Byte.valueOf(byte0);
      assertEquals((byte) (-17), (byte)byte1);
      
      defaultKeyedValues0.addValue((Comparable) byte0, (Number) byte1);
      assertEquals(1, defaultKeyedValues0.getItemCount());
      
      DefaultKeyedValues defaultKeyedValues1 = new DefaultKeyedValues();
      assertNotSame(defaultKeyedValues1, defaultKeyedValues0);
      assertFalse(defaultKeyedValues1.equals((Object)defaultKeyedValues0));
      assertNotNull(defaultKeyedValues1);
      assertEquals(0, defaultKeyedValues1.getItemCount());
      
      boolean boolean0 = defaultKeyedValues0.equals((Object) defaultKeyedValues1);
      assertNotSame(defaultKeyedValues1, defaultKeyedValues0);
      assertNotSame(defaultKeyedValues0, defaultKeyedValues1);
      assertFalse(boolean0);
      assertFalse(defaultKeyedValues1.equals((Object)defaultKeyedValues0));
      assertFalse(defaultKeyedValues0.equals((Object)defaultKeyedValues1));
      assertEquals(0, defaultKeyedValues1.getItemCount());
      assertEquals(1, defaultKeyedValues0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      assertNotNull(defaultKeyedValues0);
      assertEquals(0, defaultKeyedValues0.getItemCount());
      
      LinkedList<Byte> linkedList0 = new LinkedList<Byte>();
      assertNotNull(linkedList0);
      assertEquals(0, linkedList0.size());
      assertEquals("[]", linkedList0.toString());
      
      boolean boolean0 = defaultKeyedValues0.equals((Object) linkedList0);
      assertFalse(boolean0);
      assertEquals(0, linkedList0.size());
      assertEquals("[]", linkedList0.toString());
      assertEquals(0, defaultKeyedValues0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      assertNotNull(defaultKeyedValues0);
      assertEquals(0, defaultKeyedValues0.getItemCount());
      
      int int0 = 0;
      defaultKeyedValues0.insertValue(int0, (Comparable) int0, (double) int0);
      assertEquals(1, defaultKeyedValues0.getItemCount());
      
      SortOrder sortOrder0 = SortOrder.DESCENDING;
      assertNotNull(sortOrder0);
      assertEquals("SortOrder.DESCENDING", sortOrder0.toString());
      
      defaultKeyedValues0.sortByValues(sortOrder0);
      assertEquals("SortOrder.DESCENDING", sortOrder0.toString());
      assertEquals(1, defaultKeyedValues0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      assertNotNull(defaultKeyedValues0);
      assertEquals(0, defaultKeyedValues0.getItemCount());
      
      byte byte0 = (byte) (-17);
      Byte byte1 = Byte.valueOf(byte0);
      assertEquals((byte) (-17), (byte)byte1);
      
      defaultKeyedValues0.addValue((Comparable) byte0, (Number) byte1);
      assertEquals(1, defaultKeyedValues0.getItemCount());
      
      SortOrder sortOrder0 = SortOrder.DESCENDING;
      assertNotNull(sortOrder0);
      assertEquals("SortOrder.DESCENDING", sortOrder0.toString());
      
      defaultKeyedValues0.sortByKeys(sortOrder0);
      assertEquals(1, defaultKeyedValues0.getItemCount());
      assertEquals("SortOrder.DESCENDING", sortOrder0.toString());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      assertNotNull(defaultKeyedValues0);
      assertEquals(0, defaultKeyedValues0.getItemCount());
      
      long long0 = Long.MAX_VALUE;
      assertEquals(9223372036854775807L, long0);
      
      // Undeclared exception!
      try {
        defaultKeyedValues0.removeValue((Comparable) long0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The key (9223372036854775807) is not recognised.
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      assertNotNull(defaultKeyedValues0);
      assertEquals(0, defaultKeyedValues0.getItemCount());
      
      int int0 = 1;
      defaultKeyedValues0.setValue((Comparable) int0, (Number) int0);
      assertEquals(1, defaultKeyedValues0.getItemCount());
      
      // Undeclared exception!
      try {
        defaultKeyedValues0.insertValue(int0, (Comparable) int0, (double) int0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 0
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      assertNotNull(defaultKeyedValues0);
      assertEquals(0, defaultKeyedValues0.getItemCount());
      
      int int0 = defaultKeyedValues0.hashCode();
      assertEquals(1, int0);
      assertEquals(0, defaultKeyedValues0.getItemCount());
      
      double double0 = 0.0;
      defaultKeyedValues0.setValue((Comparable) double0, (Number) double0);
      assertEquals(1, defaultKeyedValues0.getItemCount());
      
      DefaultKeyedValues defaultKeyedValues1 = new DefaultKeyedValues();
      assertNotSame(defaultKeyedValues1, defaultKeyedValues0);
      assertFalse(defaultKeyedValues1.equals((Object)defaultKeyedValues0));
      assertNotNull(defaultKeyedValues1);
      assertEquals(0, defaultKeyedValues1.getItemCount());
      
      long long0 = 0L;
      String string0 = Long.toString(long0, int0);
      assertNotSame(defaultKeyedValues0, defaultKeyedValues1);
      assertEquals("0", string0);
      assertFalse(defaultKeyedValues0.equals((Object)defaultKeyedValues1));
      assertNotNull(string0);
      assertEquals(1, defaultKeyedValues0.getItemCount());
      
      defaultKeyedValues1.addValue((Comparable) string0, (Number) int0);
      assertNotSame(defaultKeyedValues1, defaultKeyedValues0);
      assertNotSame(defaultKeyedValues0, defaultKeyedValues1);
      assertFalse(defaultKeyedValues1.equals((Object)defaultKeyedValues0));
      assertFalse(defaultKeyedValues0.equals((Object)defaultKeyedValues1));
      assertEquals(1, defaultKeyedValues1.getItemCount());
      assertEquals(1, defaultKeyedValues0.getItemCount());
      
      defaultKeyedValues1.removeValue((Comparable) string0);
      assertNotSame(defaultKeyedValues1, defaultKeyedValues0);
      assertNotSame(defaultKeyedValues0, defaultKeyedValues1);
      assertFalse(defaultKeyedValues1.equals((Object)defaultKeyedValues0));
      assertFalse(defaultKeyedValues0.equals((Object)defaultKeyedValues1));
      assertEquals(0, defaultKeyedValues1.getItemCount());
      assertEquals(1, defaultKeyedValues0.getItemCount());
      
      int int1 = defaultKeyedValues1.getItemCount();
      assertNotSame(defaultKeyedValues1, defaultKeyedValues0);
      assertEquals(0, int1);
      assertFalse(defaultKeyedValues1.equals((Object)defaultKeyedValues0));
      assertFalse(int1 == int0);
      assertEquals(0, defaultKeyedValues1.getItemCount());
      
      Double double1 = Double.valueOf(string0);
      assertNotSame(defaultKeyedValues0, defaultKeyedValues1);
      assertEquals(0.0, (double)double1, 0.01D);
      assertFalse(int0 == int1);
      assertTrue(double1.equals((Object)double0));
      assertFalse(defaultKeyedValues0.equals((Object)defaultKeyedValues1));
      assertEquals(1, defaultKeyedValues0.getItemCount());
      
      defaultKeyedValues0.insertValue(int1, (Comparable) double1, (Number) double0);
      assertNotSame(defaultKeyedValues1, defaultKeyedValues0);
      assertNotSame(defaultKeyedValues0, defaultKeyedValues1);
      assertFalse(int0 == int1);
      assertTrue(double1.equals((Object)double0));
      assertFalse(defaultKeyedValues1.equals((Object)defaultKeyedValues0));
      assertFalse(defaultKeyedValues0.equals((Object)defaultKeyedValues1));
      assertFalse(int1 == int0);
      assertEquals(0, defaultKeyedValues1.getItemCount());
      assertEquals(1, defaultKeyedValues0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      assertNotNull(defaultKeyedValues0);
      assertEquals(0, defaultKeyedValues0.getItemCount());
      
      String string0 = null;
      int int0 = 0;
      // Undeclared exception!
      try {
        defaultKeyedValues0.insertValue(int0, (Comparable) string0, (Number) int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      assertNotNull(defaultKeyedValues0);
      assertEquals(0, defaultKeyedValues0.getItemCount());
      
      int int0 = defaultKeyedValues0.hashCode();
      assertEquals(1, int0);
      assertEquals(0, defaultKeyedValues0.getItemCount());
      
      // Undeclared exception!
      try {
        defaultKeyedValues0.insertValue(int0, (Comparable) int0, (double) int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 'position' out of bounds.
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      assertNotNull(defaultKeyedValues0);
      assertEquals(0, defaultKeyedValues0.getItemCount());
      
      int int0 = (-1);
      // Undeclared exception!
      try {
        defaultKeyedValues0.insertValue(int0, (Comparable) int0, (Number) int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 'position' out of bounds.
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      assertNotNull(defaultKeyedValues0);
      assertEquals(0, defaultKeyedValues0.getItemCount());
      
      byte byte0 = (byte) (-17);
      Byte byte1 = Byte.valueOf(byte0);
      assertEquals((byte) (-17), (byte)byte1);
      
      defaultKeyedValues0.addValue((Comparable) byte0, (Number) byte1);
      assertEquals(1, defaultKeyedValues0.getItemCount());
      
      defaultKeyedValues0.setValue((Comparable) byte1, (double) byte1);
      assertEquals(1, defaultKeyedValues0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      assertNotNull(defaultKeyedValues0);
      assertEquals(0, defaultKeyedValues0.getItemCount());
      
      int int0 = defaultKeyedValues0.hashCode();
      assertEquals(1, int0);
      assertEquals(0, defaultKeyedValues0.getItemCount());
      
      // Undeclared exception!
      try {
        Number number0 = defaultKeyedValues0.getValue((Comparable) int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Key not found: 1
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      assertNotNull(defaultKeyedValues0);
      assertEquals(0, defaultKeyedValues0.getItemCount());
      
      byte byte0 = (byte) (-17);
      Byte byte1 = Byte.valueOf(byte0);
      assertEquals((byte) (-17), (byte)byte1);
      
      defaultKeyedValues0.addValue((Comparable) byte0, (Number) byte1);
      assertEquals(1, defaultKeyedValues0.getItemCount());
      
      Byte byte2 = (Byte)defaultKeyedValues0.getValue((Comparable) byte1);
      assertSame(byte2, byte1);
      assertSame(byte1, byte2);
      assertEquals((byte) (-17), (byte)byte2);
      assertEquals(1, defaultKeyedValues0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      assertNotNull(defaultKeyedValues0);
      assertEquals(0, defaultKeyedValues0.getItemCount());
      
      Comparable<String> comparable0 = null;
      // Undeclared exception!
      try {
        Number number0 = defaultKeyedValues0.getValue(comparable0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      assertNotNull(defaultKeyedValues0);
      assertEquals(0, defaultKeyedValues0.getItemCount());
      
      DefaultKeyedValues defaultKeyedValues1 = (DefaultKeyedValues)defaultKeyedValues0.clone();
      assertNotSame(defaultKeyedValues0, defaultKeyedValues1);
      assertNotSame(defaultKeyedValues1, defaultKeyedValues0);
      assertTrue(defaultKeyedValues0.equals((Object)defaultKeyedValues1));
      assertTrue(defaultKeyedValues1.equals((Object)defaultKeyedValues0));
      assertNotNull(defaultKeyedValues1);
      assertEquals(0, defaultKeyedValues0.getItemCount());
      assertEquals(0, defaultKeyedValues1.getItemCount());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      assertNotNull(defaultKeyedValues0);
      assertEquals(0, defaultKeyedValues0.getItemCount());
      
      List list0 = defaultKeyedValues0.getKeys();
      assertNotNull(list0);
      assertEquals(0, list0.size());
      assertEquals(true, list0.isEmpty());
      assertEquals(0, defaultKeyedValues0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      assertNotNull(defaultKeyedValues0);
      assertEquals(0, defaultKeyedValues0.getItemCount());
      
      Comparable<Short> comparable0 = null;
      double double0 = (-1130.0);
      // Undeclared exception!
      try {
        defaultKeyedValues0.addValue(comparable0, double0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      assertNotNull(defaultKeyedValues0);
      assertEquals(0, defaultKeyedValues0.getItemCount());
      
      int int0 = 0;
      defaultKeyedValues0.insertValue(int0, (Comparable) int0, (double) int0);
      assertEquals(1, defaultKeyedValues0.getItemCount());
      
      DefaultKeyedValues defaultKeyedValues1 = new DefaultKeyedValues();
      assertNotSame(defaultKeyedValues1, defaultKeyedValues0);
      assertFalse(defaultKeyedValues1.equals((Object)defaultKeyedValues0));
      assertNotNull(defaultKeyedValues1);
      assertEquals(0, defaultKeyedValues1.getItemCount());
      
      defaultKeyedValues1.addValue((Comparable) int0, (Number) int0);
      assertNotSame(defaultKeyedValues1, defaultKeyedValues0);
      assertFalse(defaultKeyedValues1.equals((Object)defaultKeyedValues0));
      assertEquals(1, defaultKeyedValues1.getItemCount());
      
      boolean boolean0 = defaultKeyedValues1.equals((Object) defaultKeyedValues0);
      assertNotSame(defaultKeyedValues1, defaultKeyedValues0);
      assertNotSame(defaultKeyedValues0, defaultKeyedValues1);
      assertFalse(boolean0);
      assertFalse(defaultKeyedValues1.equals((Object)defaultKeyedValues0));
      assertFalse(defaultKeyedValues0.equals((Object)defaultKeyedValues1));
      assertEquals(1, defaultKeyedValues1.getItemCount());
      assertEquals(1, defaultKeyedValues0.getItemCount());
  }
}
