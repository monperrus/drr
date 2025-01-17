/*
 * This file was automatically generated by EvoSuite
 * Wed Jan 18 23:02:50 GMT 2017
 */

package org.apache.commons.math3.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.math3.distribution.DiscreteDistribution;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well19937a;
import org.apache.commons.math3.random.Well44497b;
import org.apache.commons.math3.random.Well512a;
import org.apache.commons.math3.util.Pair;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

public class DiscreteDistribution_ESTest  {

  //@Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinkedList<Pair<Short, Double>> linkedList0 = new LinkedList<Pair<Short, Double>>();
      Short short0 = new Short((short)1873);
      Double double0 = new Double((double) (short)1873);
      Pair<Short, Double> pair0 = new Pair<Short, Double>(short0, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Short> discreteDistribution0 = new DiscreteDistribution<Short>((List<Pair<Short, Double>>) linkedList0);
      try { 
        discreteDistribution0.sample(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of samples (0)
         //
         verifyException("org.apache.commons.math3.distribution.DiscreteDistribution", e);
      }
  }

  //@Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedList<Pair<Short, Double>> linkedList0 = new LinkedList<Pair<Short, Double>>();
      Double double0 = new Double((double) (short)1873);
      Pair<Short, Double> pair0 = new Pair<Short, Double>((Short) null, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Short> discreteDistribution0 = new DiscreteDistribution<Short>((List<Pair<Short, Double>>) linkedList0);
      // Undeclared exception!
      try { 
        discreteDistribution0.sample((int) (short)1873);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.distribution.DiscreteDistribution", e);
      }
  }

  //@Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Well19937a well19937a0 = new Well19937a(103);
      LinkedList<Pair<Float, Double>> linkedList0 = new LinkedList<Pair<Float, Double>>();
      DiscreteDistribution<Float> discreteDistribution0 = null;
      try {
        discreteDistribution0 = new DiscreteDistribution<Float>((RandomGenerator) well19937a0, (List<Pair<Float, Double>>) linkedList0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // array sums to zero
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  //@Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Well512a well512a0 = new Well512a();
      LinkedList<Pair<Integer, Double>> linkedList0 = new LinkedList<Pair<Integer, Double>>();
      linkedList0.add((Pair<Integer, Double>) null);
      DiscreteDistribution<Integer> discreteDistribution0 = null;
      try {
        discreteDistribution0 = new DiscreteDistribution<Integer>((RandomGenerator) well512a0, (List<Pair<Integer, Double>>) linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.distribution.DiscreteDistribution", e);
      }
  }

  //@Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedList<Pair<Double, Double>> linkedList0 = new LinkedList<Pair<Double, Double>>();
      Double double0 = new Double((double) (-11));
      Pair<Double, Double> pair0 = new Pair<Double, Double>(double0, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Double> discreteDistribution0 = null;
      try {
        discreteDistribution0 = new DiscreteDistribution<Double>((List<Pair<Double, Double>>) linkedList0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -11 is smaller than the minimum (0)
         //
         verifyException("org.apache.commons.math3.distribution.DiscreteDistribution", e);
      }
  }

  //@Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DiscreteDistribution<Integer> discreteDistribution0 = null;
      try {
        discreteDistribution0 = new DiscreteDistribution<Integer>((List<Pair<Integer, Double>>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.distribution.DiscreteDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedList<Pair<Object, Double>> linkedList0 = new LinkedList<Pair<Object, Double>>();
      Double double0 = new Double(1.7976931348623157E308);
      Pair<Double, Double> pair0 = new Pair<Double, Double>(double0, double0);
      Pair<Object, Double> pair1 = new Pair<Object, Double>(pair0);
      linkedList0.offer(pair1);
      linkedList0.add(pair1);
      DiscreteDistribution<Object> discreteDistribution0 = new DiscreteDistribution<Object>((List<Pair<Object, Double>>) linkedList0);
      Double double1 = (Double)discreteDistribution0.sample();
      assertEquals(1.7976931348623157E308, (double)double1, 0.01);
  }

  //@Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedList<Pair<Object, Double>> linkedList0 = new LinkedList<Pair<Object, Double>>();
      Double double0 = new Double(1.7976931348623157E308);
      Pair<Double, Double> pair0 = new Pair<Double, Double>(double0, double0);
      Pair<Object, Double> pair1 = new Pair<Object, Double>(pair0);
      linkedList0.offer(pair1);
      DiscreteDistribution<Object> discreteDistribution0 = new DiscreteDistribution<Object>((List<Pair<Object, Double>>) linkedList0);
      try { 
        discreteDistribution0.sample((-1672));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of samples (-1,672)
         //
         verifyException("org.apache.commons.math3.distribution.DiscreteDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedList<Pair<Object, Double>> linkedList0 = new LinkedList<Pair<Object, Double>>();
      Double double0 = new Double(0.8331226845037416);
      Pair<Object, Double> pair0 = new Pair<Object, Double>((Object) null, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Object> discreteDistribution0 = new DiscreteDistribution<Object>((List<Pair<Object, Double>>) linkedList0);
      Double double1 = (Double)discreteDistribution0.sample();
      assertNull(double1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedList<Pair<Object, Double>> linkedList0 = new LinkedList<Pair<Object, Double>>();
      Double double0 = new Double(1.7976931348623157E308);
      Pair<Double, Double> pair0 = new Pair<Double, Double>(double0, double0);
      Pair<Object, Double> pair1 = new Pair<Object, Double>(pair0);
      linkedList0.offer(pair1);
      linkedList0.add(pair1);
      DiscreteDistribution<Object> discreteDistribution0 = new DiscreteDistribution<Object>((List<Pair<Object, Double>>) linkedList0);
      discreteDistribution0.sample(1223);
      // Undeclared exception!
      discreteDistribution0.sample(2146);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedList<Pair<Object, Double>> linkedList0 = new LinkedList<Pair<Object, Double>>();
      Double double0 = new Double(1.7976931348623157E308);
      Pair<Double, Double> pair0 = new Pair<Double, Double>(double0, double0);
      Pair<Object, Double> pair1 = new Pair<Object, Double>(pair0);
      linkedList0.offer(pair1);
      DiscreteDistribution<Object> discreteDistribution0 = new DiscreteDistribution<Object>((List<Pair<Object, Double>>) linkedList0);
      List<Pair<Object, Double>> list0 = discreteDistribution0.getSamples();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Well512a well512a0 = new Well512a();
      LinkedList<Pair<Integer, Double>> linkedList0 = new LinkedList<Pair<Integer, Double>>();
      Integer integer0 = new Integer(666);
      Double double0 = new Double((double) 666);
      Pair<Integer, Double> pair0 = new Pair<Integer, Double>(integer0, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Integer> discreteDistribution0 = new DiscreteDistribution<Integer>((RandomGenerator) well512a0, (List<Pair<Integer, Double>>) linkedList0);
      double double1 = discreteDistribution0.probability(integer0);
      assertEquals(1.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedList<Pair<Object, Double>> linkedList0 = new LinkedList<Pair<Object, Double>>();
      Double double0 = new Double(1.7976931348623157E308);
      Pair<Double, Double> pair0 = new Pair<Double, Double>(double0, double0);
      Pair<Object, Double> pair1 = new Pair<Object, Double>(pair0);
      linkedList0.offer(pair1);
      DiscreteDistribution<Object> discreteDistribution0 = new DiscreteDistribution<Object>((List<Pair<Object, Double>>) linkedList0);
      double double1 = discreteDistribution0.probability((Object) null);
      assertEquals(0.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LinkedList<Pair<Object, Double>> linkedList0 = new LinkedList<Pair<Object, Double>>();
      Double double0 = new Double(1.7976931348623157E308);
      Pair<Double, Double> pair0 = new Pair<Double, Double>(double0, double0);
      Pair<Object, Double> pair1 = new Pair<Object, Double>(pair0);
      linkedList0.offer(pair1);
      DiscreteDistribution<Object> discreteDistribution0 = new DiscreteDistribution<Object>((List<Pair<Object, Double>>) linkedList0);
      double double1 = discreteDistribution0.probability(linkedList0);
      assertEquals(0.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedList<Pair<Object, Double>> linkedList0 = new LinkedList<Pair<Object, Double>>();
      Double double0 = new Double(0.8331226845037416);
      Pair<Object, Double> pair0 = new Pair<Object, Double>((Object) null, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Object> discreteDistribution0 = new DiscreteDistribution<Object>((List<Pair<Object, Double>>) linkedList0);
      double double1 = discreteDistribution0.probability((Object) null);
      assertEquals(1.0, double1, 0.01);
  }

  //@Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Well44497b well44497b0 = new Well44497b();
      LinkedList<Pair<Byte, Double>> linkedList0 = new LinkedList<Pair<Byte, Double>>();
      Byte byte0 = new Byte((byte) (-62));
      Double double0 = new Double((double) (byte) (-62));
      Pair<Byte, Double> pair0 = new Pair<Byte, Double>(byte0, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Byte> discreteDistribution0 = null;
      try {
        discreteDistribution0 = new DiscreteDistribution<Byte>((RandomGenerator) well44497b0, (List<Pair<Byte, Double>>) linkedList0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -62 is smaller than the minimum (0)
         //
         verifyException("org.apache.commons.math3.distribution.DiscreteDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Well512a well512a0 = new Well512a();
      LinkedList<Pair<Integer, Double>> linkedList0 = new LinkedList<Pair<Integer, Double>>();
      Integer integer0 = new Integer(666);
      Double double0 = new Double((double) 666);
      Pair<Integer, Double> pair0 = new Pair<Integer, Double>(integer0, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Integer> discreteDistribution0 = new DiscreteDistribution<Integer>((RandomGenerator) well512a0, (List<Pair<Integer, Double>>) linkedList0);
      discreteDistribution0.reseedRandomGenerator(666);
  }

  //@Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LinkedList<Pair<Object, Double>> linkedList0 = new LinkedList<Pair<Object, Double>>();
      DiscreteDistribution<Object> discreteDistribution0 = null;
      try {
        discreteDistribution0 = new DiscreteDistribution<Object>((List<Pair<Object, Double>>) linkedList0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // array sums to zero
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }
}
