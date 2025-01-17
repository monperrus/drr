/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 03 05:25:12 GMT 2019
 */

package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.lang.ClassUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

 
public class ClassUtils_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Class<Boolean> class0 = Boolean.TYPE;
      String string0 = ClassUtils.getShortCanonicalName(class0);
      assertEquals("boolean", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      try { 
        ClassUtils.getClass((ClassLoader) null, "LINUX");
        fail("Expecting exception: ClassNotFoundException");
      
      } catch(ClassNotFoundException e) {
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = ClassUtils.getPackageCanonicalName((Object) "", "");
      assertEquals("java.lang", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      try { 
        ClassUtils.getClass("java.lang");
        fail("Expecting exception: ClassNotFoundException");
      
      } catch(ClassNotFoundException e) {
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Class<Double> class0 = Double.class;
      boolean boolean0 = ClassUtils.isAssignable((Class<?>) null, class0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassUtils classUtils0 = new ClassUtils();
      assertEquals('$', ClassUtils.INNER_CLASS_SEPARATOR_CHAR);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Class<Boolean>[] classArray0 = (Class<Boolean>[]) Array.newInstance(Class.class, 3);
      Class<?>[] classArray1 = ClassUtils.wrappersToPrimitives(classArray0);
      assertEquals(3, classArray1.length);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Object object0 = new Object();
      String string0 = ClassUtils.getShortClassName(object0, "{cwIL*EXh");
      assertEquals("Object", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = ClassUtils.getShortClassName((Object) null, "L");
      assertEquals("L", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = ClassUtils.getShortClassName((Class<?>) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = ClassUtils.getShortCanonicalName((String) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = ClassUtils.getShortClassName("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = ClassUtils.getShortClassName("[L");
      assertEquals("L[]", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = ClassUtils.getShortClassName("[@");
      assertEquals("@[]", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = ClassUtils.getShortClassName("[L|/?8s5FeF3;");
      assertEquals("|/?8s5FeF3[]", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = ClassUtils.getShortClassName("D");
      assertEquals("double", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = ClassUtils.getShortClassName("=weSR#G$`^20");
      assertEquals("=weSR#G.`^20", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = ClassUtils.getPackageName((Object) "", "Float");
      assertEquals("java.lang", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = ClassUtils.getPackageName((Object) null, "vW6%viNAUa!`1D,!CM");
      assertEquals("vW6%viNAUa!`1D,!CM", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = ClassUtils.getPackageName((Class<?>) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = ClassUtils.getPackageName((String) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String string0 = ClassUtils.getPackageCanonicalName("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String string0 = ClassUtils.getPackageCanonicalName("[");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = ClassUtils.getPackageCanonicalName("L|/?8s5FeF3");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String string0 = ClassUtils.getPackageName("L;");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Class<Boolean> class0 = Boolean.class;
      List<Class<?>> list0 = ClassUtils.getAllSuperclasses(class0);
      assertNotNull(list0);
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      List<Class<?>> list0 = ClassUtils.getAllSuperclasses((Class<?>) null);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      List<Class<?>> list0 = ClassUtils.getAllInterfaces((Class<?>) null);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      List<Class<?>> list0 = ClassUtils.convertClassNamesToClasses((List<String>) null);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      List<Class<?>> list0 = ClassUtils.getAllInterfaces(class0);
      List<String> list1 = ClassUtils.convertClassesToClassNames(list0);
      List<Class<?>> list2 = ClassUtils.convertClassNamesToClasses(list1);
      assertTrue(list2.equals((Object)list0));
      assertEquals(2, list2.size());
      assertNotNull(list2);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      List<String> list0 = ClassUtils.convertClassesToClassNames((List<Class<?>>) null);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.offerFirst("Linux");
      List<Class<?>> list0 = ClassUtils.convertClassNamesToClasses(linkedList0);
      List<String> list1 = ClassUtils.convertClassesToClassNames(list0);
      assertFalse(list1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 8);
      Class<Character>[] classArray1 = (Class<Character>[]) Array.newInstance(Class.class, 9);
      boolean boolean0 = ClassUtils.isAssignable(classArray0, classArray1, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      boolean boolean0 = ClassUtils.isAssignable((Class<?>[]) null, (Class<?>[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Class<Boolean> class0 = Boolean.class;
      Class<Boolean>[] classArray0 = (Class<Boolean>[]) Array.newInstance(Class.class, 3);
      classArray0[0] = class0;
      boolean boolean0 = ClassUtils.isAssignable(classArray0, classArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Boolean boolean0 = new Boolean((String) null);
      Class<Long> class0 = Long.TYPE;
      boolean boolean1 = ClassUtils.isAssignable((Class<?>) null, (Class<?>) class0, (boolean) boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Class<Double> class0 = Double.class;
      Class<Integer> class1 = Integer.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(class0, class1, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Class<Double> class0 = Double.TYPE;
      Class<Integer> class1 = Integer.class;
      boolean boolean0 = ClassUtils.isAssignable(class0, class1, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Class<Double> class0 = Double.TYPE;
      Class<Short> class1 = Short.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Class<ClassUtils> class0 = ClassUtils.class;
      Class<Short> class1 = Short.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(class0, class1, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Class<Short> class0 = Short.class;
      Class<?> class1 = ClassUtils.wrapperToPrimitive(class0);
      Class<Long> class2 = Long.class;
      boolean boolean0 = ClassUtils.isAssignable(class1, class2);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Class<Integer> class0 = Integer.TYPE;
      Class<Character> class1 = Character.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(class0, class1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Class<?> class1 = ClassUtils.wrapperToPrimitive(class0);
      Class<Long> class2 = Long.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(class1, class2, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Class<?> class0 = ClassUtils.getClass("double", true);
      Class<Integer> class1 = Integer.class;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Class<?> class1 = ClassUtils.wrapperToPrimitive(class0);
      Class<Long> class2 = Long.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(class2, class1, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Class<Boolean> class0 = Boolean.TYPE;
      Class<Character> class1 = Character.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(class0, class1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Class<?> class1 = ClassUtils.wrapperToPrimitive(class0);
      Class<Float> class2 = Float.class;
      boolean boolean0 = ClassUtils.isAssignable(class2, class1, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Class<Integer> class0 = Integer.TYPE;
      Class<Character> class1 = Character.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, false);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Class<Boolean> class0 = Boolean.TYPE;
      Class<Character> class1 = Character.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Class<Character> class0 = Character.TYPE;
      Class<Byte> class1 = Byte.class;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Class<?> class1 = ClassUtils.wrapperToPrimitive(class0);
      Class<Short> class2 = Short.class;
      boolean boolean0 = ClassUtils.isAssignable(class2, class1, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Class<Long> class0 = Long.TYPE;
      Class<Short> class1 = Short.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, false);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Class<Boolean> class0 = Boolean.TYPE;
      Class<Short> class1 = Short.class;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Class<Integer> class0 = Integer.TYPE;
      Class<Byte> class1 = Byte.class;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Class<Long> class0 = Long.TYPE;
      Class<Byte> class1 = Byte.class;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Class<Double>[] classArray0 = (Class<Double>[]) Array.newInstance(Class.class, 1);
      Class<?>[] classArray1 = ClassUtils.primitivesToWrappers(classArray0);
      assertEquals(1, classArray1.length);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Class<Short> class0 = Short.class;
      Class<?> class1 = ClassUtils.primitiveToWrapper(class0);
      assertEquals(17, class1.getModifiers());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Class<?>[] classArray0 = ClassUtils.primitivesToWrappers((Class<?>[]) null);
      assertNull(classArray0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Class<Double>[] classArray0 = (Class<Double>[]) Array.newInstance(Class.class, 0);
      Class<?>[] classArray1 = ClassUtils.primitivesToWrappers(classArray0);
      assertEquals(0, classArray1.length);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Class<?>[] classArray0 = ClassUtils.wrappersToPrimitives((Class<?>[]) null);
      assertNull(classArray0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 0);
      Class<?>[] classArray1 = ClassUtils.wrappersToPrimitives(classArray0);
      assertEquals(0, classArray1.length);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Class<Integer> class0 = Integer.TYPE;
      boolean boolean0 = ClassUtils.isInnerClass(class0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      boolean boolean0 = ClassUtils.isInnerClass((Class<?>) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Class<?> class0 = ClassUtils.getClass("org.apache.commons.lang.builder.ToStringStyle$SimpleToStringStyle", true);
      boolean boolean0 = ClassUtils.isInnerClass(class0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      // Undeclared exception!
      try { 
        ClassUtils.getClass((String) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // className must not be null.
         //
         verifyException("org.apache.commons.lang.ClassUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Class<?> class0 = ClassUtils.getClass("long[]", false);
      assertFalse(class0.isEnum());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      try { 
        ClassUtils.getClass("][]", false);
        fail("Expecting exception: ClassNotFoundException");
      
      } catch(ClassNotFoundException e) {
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Class<Boolean>[] classArray0 = (Class<Boolean>[]) Array.newInstance(Class.class, 0);
      Class<?>[] classArray1 = ClassUtils.toClass(classArray0);
      assertEquals(0, classArray1.length);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Class<?>[] classArray0 = ClassUtils.toClass((Object[]) null);
      assertNull(classArray0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Class<Character> class0 = Character.TYPE;
      Object[] objectArray0 = new Object[5];
      objectArray0[0] = (Object) class0;
      objectArray0[1] = (Object) class0;
      objectArray0[2] = (Object) class0;
      objectArray0[3] = (Object) class0;
      objectArray0[4] = (Object) "$";
      Class<?>[] classArray0 = ClassUtils.toClass(objectArray0);
      assertEquals(5, classArray0.length);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Class<Integer> class0 = Integer.TYPE;
      String string0 = ClassUtils.getShortCanonicalName((Object) class0, "=weSR#G.`^20");
      assertEquals("Class", string0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      String string0 = ClassUtils.getShortCanonicalName((Object) null, "!a V");
      assertEquals("!a V", string0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      Class<Float>[] classArray0 = (Class<Float>[]) Array.newInstance(Class.class, 7);
      String string0 = ClassUtils.getShortCanonicalName(classArray0[0]);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      String string0 = ClassUtils.getPackageCanonicalName((Object) null, "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      Class<Object> class0 = Object.class;
      String string0 = ClassUtils.getPackageCanonicalName(class0);
      assertEquals("java.lang", string0);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      String string0 = ClassUtils.getPackageCanonicalName((Class<?>) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      String string0 = ClassUtils.getPackageCanonicalName("[L");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      // Undeclared exception!
      try { 
        ClassUtils.getPackageCanonicalName("[@");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }
}
