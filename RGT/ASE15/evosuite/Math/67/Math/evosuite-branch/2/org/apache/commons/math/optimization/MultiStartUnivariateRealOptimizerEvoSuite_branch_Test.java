/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 19:22:31 GMT 2014
 */

package org.apache.commons.math.optimization;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.MathRuntimeException;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer;
import org.apache.commons.math.optimization.UnivariateRealOptimizer;
import org.apache.commons.math.random.JDKRandomGenerator;
import org.apache.commons.math.random.MersenneTwister;
import org.apache.commons.math.random.RandomAdaptor;
import org.apache.commons.math.random.RandomGenerator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class MultiStartUnivariateRealOptimizerEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      UnivariateRealOptimizer univariateRealOptimizer0 = null;
      int int0 = 0;
      MersenneTwister mersenneTwister0 = new MersenneTwister();
      assertNotNull(mersenneTwister0);
      
      RandomAdaptor randomAdaptor0 = new RandomAdaptor((RandomGenerator) mersenneTwister0);
      assertNotNull(randomAdaptor0);
      
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, int0, (RandomGenerator) randomAdaptor0);
      assertNotNull(multiStartUnivariateRealOptimizer0);
      assertEquals(2147483647, multiStartUnivariateRealOptimizer0.getMaximalIterationCount());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getIterationCount());
      assertEquals(2147483647, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getEvaluations());
      
      int int1 = 82;
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer1 = new MultiStartUnivariateRealOptimizer((UnivariateRealOptimizer) multiStartUnivariateRealOptimizer0, int1, (RandomGenerator) randomAdaptor0);
      assertNotSame(multiStartUnivariateRealOptimizer0, multiStartUnivariateRealOptimizer1);
      assertNotSame(multiStartUnivariateRealOptimizer1, multiStartUnivariateRealOptimizer0);
      assertNotNull(multiStartUnivariateRealOptimizer1);
      assertFalse(multiStartUnivariateRealOptimizer0.equals((Object)multiStartUnivariateRealOptimizer1));
      assertFalse(int1 == int0);
      assertFalse(multiStartUnivariateRealOptimizer1.equals((Object)multiStartUnivariateRealOptimizer0));
      assertFalse(int0 == int1);
      assertEquals(2147483647, multiStartUnivariateRealOptimizer0.getMaximalIterationCount());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getIterationCount());
      assertEquals(2147483647, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getEvaluations());
      assertEquals(2147483647, multiStartUnivariateRealOptimizer1.getMaxEvaluations());
      assertEquals(0, multiStartUnivariateRealOptimizer1.getIterationCount());
      assertEquals(0, multiStartUnivariateRealOptimizer1.getEvaluations());
      assertEquals(2147483647, multiStartUnivariateRealOptimizer1.getMaximalIterationCount());
      
      UnivariateRealFunction univariateRealFunction0 = null;
      GoalType goalType0 = GoalType.MAXIMIZE;
      // Undeclared exception!
      try {
        double double0 = multiStartUnivariateRealOptimizer1.optimize(univariateRealFunction0, goalType0, (double) int0, (double) int0, (double) int0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      UnivariateRealOptimizer univariateRealOptimizer0 = null;
      int int0 = 3284;
      MersenneTwister mersenneTwister0 = new MersenneTwister((long) int0);
      assertNotNull(mersenneTwister0);
      
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, int0, (RandomGenerator) mersenneTwister0);
      assertNotNull(multiStartUnivariateRealOptimizer0);
      assertEquals(2147483647, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      assertEquals(2147483647, multiStartUnivariateRealOptimizer0.getMaximalIterationCount());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getIterationCount());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getEvaluations());
      
      try {
        double[] doubleArray0 = multiStartUnivariateRealOptimizer0.getOptimaValues();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no optimum computed yet
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      UnivariateRealOptimizer univariateRealOptimizer0 = null;
      int int0 = 884;
      MersenneTwister mersenneTwister0 = new MersenneTwister((long) int0);
      assertNotNull(mersenneTwister0);
      
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, int0, (RandomGenerator) mersenneTwister0);
      assertNotNull(multiStartUnivariateRealOptimizer0);
      assertEquals(0, multiStartUnivariateRealOptimizer0.getEvaluations());
      assertEquals(2147483647, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getIterationCount());
      assertEquals(2147483647, multiStartUnivariateRealOptimizer0.getMaximalIterationCount());
      
      try {
        double[] doubleArray0 = multiStartUnivariateRealOptimizer0.getOptima();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no optimum computed yet
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      UnivariateRealOptimizer univariateRealOptimizer0 = null;
      int int0 = (-44);
      MersenneTwister mersenneTwister0 = new MersenneTwister();
      assertNotNull(mersenneTwister0);
      
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, int0, (RandomGenerator) mersenneTwister0);
      assertNotNull(multiStartUnivariateRealOptimizer0);
      assertEquals(2147483647, multiStartUnivariateRealOptimizer0.getMaximalIterationCount());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getEvaluations());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getIterationCount());
      assertEquals(2147483647, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      
      // Undeclared exception!
      try {
        double double0 = multiStartUnivariateRealOptimizer0.getFunctionValue();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      UnivariateRealOptimizer univariateRealOptimizer0 = null;
      int int0 = (-54);
      RandomGenerator randomGenerator0 = null;
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, int0, randomGenerator0);
      assertNotNull(multiStartUnivariateRealOptimizer0);
      assertEquals(2147483647, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getEvaluations());
      assertEquals(2147483647, multiStartUnivariateRealOptimizer0.getMaximalIterationCount());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getIterationCount());
      
      // Undeclared exception!
      try {
        multiStartUnivariateRealOptimizer0.resetRelativeAccuracy();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UnivariateRealOptimizer univariateRealOptimizer0 = null;
      int int0 = (-44);
      MersenneTwister mersenneTwister0 = new MersenneTwister();
      assertNotNull(mersenneTwister0);
      
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, int0, (RandomGenerator) mersenneTwister0);
      assertNotNull(multiStartUnivariateRealOptimizer0);
      assertEquals(0, multiStartUnivariateRealOptimizer0.getEvaluations());
      assertEquals(2147483647, multiStartUnivariateRealOptimizer0.getMaximalIterationCount());
      assertEquals(2147483647, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getIterationCount());
      
      int int1 = multiStartUnivariateRealOptimizer0.getMaximalIterationCount();
      assertEquals(Integer.MAX_VALUE, int1);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertEquals(0, multiStartUnivariateRealOptimizer0.getEvaluations());
      assertEquals(2147483647, multiStartUnivariateRealOptimizer0.getMaximalIterationCount());
      assertEquals(2147483647, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      UnivariateRealOptimizer univariateRealOptimizer0 = null;
      int int0 = 0;
      MersenneTwister mersenneTwister0 = new MersenneTwister(int0);
      assertNotNull(mersenneTwister0);
      
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, int0, (RandomGenerator) mersenneTwister0);
      assertNotNull(multiStartUnivariateRealOptimizer0);
      assertEquals(2147483647, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getIterationCount());
      assertEquals(2147483647, multiStartUnivariateRealOptimizer0.getMaximalIterationCount());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getEvaluations());
      
      int int1 = multiStartUnivariateRealOptimizer0.getEvaluations();
      assertEquals(0, int1);
      assertTrue(int1 == int0);
      assertTrue(int0 == int1);
      assertEquals(2147483647, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getIterationCount());
      assertEquals(2147483647, multiStartUnivariateRealOptimizer0.getMaximalIterationCount());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getEvaluations());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JDKRandomGenerator jDKRandomGenerator0 = new JDKRandomGenerator();
      assertNotNull(jDKRandomGenerator0);
      
      UnivariateRealOptimizer univariateRealOptimizer0 = null;
      int int0 = (-4034);
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, int0, (RandomGenerator) jDKRandomGenerator0);
      assertNotNull(multiStartUnivariateRealOptimizer0);
      assertEquals(2147483647, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getIterationCount());
      assertEquals(2147483647, multiStartUnivariateRealOptimizer0.getMaximalIterationCount());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getEvaluations());
      
      // Undeclared exception!
      try {
        double double0 = multiStartUnivariateRealOptimizer0.getAbsoluteAccuracy();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      UnivariateRealOptimizer univariateRealOptimizer0 = null;
      int int0 = (-2828);
      JDKRandomGenerator jDKRandomGenerator0 = new JDKRandomGenerator();
      assertNotNull(jDKRandomGenerator0);
      
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, int0, (RandomGenerator) jDKRandomGenerator0);
      assertNotNull(multiStartUnivariateRealOptimizer0);
      assertEquals(0, multiStartUnivariateRealOptimizer0.getIterationCount());
      assertEquals(2147483647, multiStartUnivariateRealOptimizer0.getMaximalIterationCount());
      assertEquals(2147483647, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getEvaluations());
      
      // Undeclared exception!
      try {
        double double0 = multiStartUnivariateRealOptimizer0.getResult();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      UnivariateRealOptimizer univariateRealOptimizer0 = null;
      int int0 = (-1367);
      MersenneTwister mersenneTwister0 = new MersenneTwister(int0);
      assertNotNull(mersenneTwister0);
      
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, int0, (RandomGenerator) mersenneTwister0);
      assertNotNull(multiStartUnivariateRealOptimizer0);
      assertEquals(0, multiStartUnivariateRealOptimizer0.getIterationCount());
      assertEquals(2147483647, multiStartUnivariateRealOptimizer0.getMaximalIterationCount());
      assertEquals(2147483647, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getEvaluations());
      
      // Undeclared exception!
      try {
        multiStartUnivariateRealOptimizer0.resetMaximalIterationCount();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      UnivariateRealOptimizer univariateRealOptimizer0 = null;
      int int0 = 1162;
      MersenneTwister mersenneTwister0 = new MersenneTwister();
      assertNotNull(mersenneTwister0);
      
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, int0, (RandomGenerator) mersenneTwister0);
      assertNotNull(multiStartUnivariateRealOptimizer0);
      assertEquals(2147483647, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      assertEquals(2147483647, multiStartUnivariateRealOptimizer0.getMaximalIterationCount());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getIterationCount());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getEvaluations());
      
      // Undeclared exception!
      try {
        multiStartUnivariateRealOptimizer0.resetAbsoluteAccuracy();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      UnivariateRealOptimizer univariateRealOptimizer0 = null;
      int int0 = (-12);
      MersenneTwister mersenneTwister0 = new MersenneTwister((long) int0);
      assertNotNull(mersenneTwister0);
      
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, int0, (RandomGenerator) mersenneTwister0);
      assertNotNull(multiStartUnivariateRealOptimizer0);
      assertEquals(0, multiStartUnivariateRealOptimizer0.getIterationCount());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getEvaluations());
      assertEquals(2147483647, multiStartUnivariateRealOptimizer0.getMaximalIterationCount());
      assertEquals(2147483647, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      
      // Undeclared exception!
      try {
        multiStartUnivariateRealOptimizer0.setRelativeAccuracy((double) int0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      UnivariateRealOptimizer univariateRealOptimizer0 = null;
      int int0 = 3289;
      int[] intArray0 = new int[1];
      MersenneTwister mersenneTwister0 = new MersenneTwister(intArray0);
      assertNotNull(mersenneTwister0);
      assertArrayEquals(new int[] {0}, intArray0);
      
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, int0, (RandomGenerator) mersenneTwister0);
      assertNotNull(multiStartUnivariateRealOptimizer0);
      assertArrayEquals(new int[] {0}, intArray0);
      assertEquals(2147483647, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      assertEquals(2147483647, multiStartUnivariateRealOptimizer0.getMaximalIterationCount());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getIterationCount());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getEvaluations());
      
      // Undeclared exception!
      try {
        double double0 = multiStartUnivariateRealOptimizer0.getRelativeAccuracy();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      UnivariateRealOptimizer univariateRealOptimizer0 = null;
      int int0 = 884;
      MersenneTwister mersenneTwister0 = new MersenneTwister((long) int0);
      assertNotNull(mersenneTwister0);
      
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, int0, (RandomGenerator) mersenneTwister0);
      assertNotNull(multiStartUnivariateRealOptimizer0);
      assertEquals(0, multiStartUnivariateRealOptimizer0.getEvaluations());
      assertEquals(2147483647, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getIterationCount());
      assertEquals(2147483647, multiStartUnivariateRealOptimizer0.getMaximalIterationCount());
      
      int int1 = multiStartUnivariateRealOptimizer0.getIterationCount();
      assertEquals(0, int1);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertEquals(0, multiStartUnivariateRealOptimizer0.getEvaluations());
      assertEquals(2147483647, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getIterationCount());
      assertEquals(2147483647, multiStartUnivariateRealOptimizer0.getMaximalIterationCount());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int int0 = (-271);
      UnivariateRealOptimizer univariateRealOptimizer0 = null;
      MersenneTwister mersenneTwister0 = new MersenneTwister((long) int0);
      assertNotNull(mersenneTwister0);
      
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, int0, (RandomGenerator) mersenneTwister0);
      assertNotNull(multiStartUnivariateRealOptimizer0);
      assertEquals(2147483647, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      assertEquals(2147483647, multiStartUnivariateRealOptimizer0.getMaximalIterationCount());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getEvaluations());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getIterationCount());
      
      // Undeclared exception!
      try {
        multiStartUnivariateRealOptimizer0.setAbsoluteAccuracy((double) int0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      UnivariateRealOptimizer univariateRealOptimizer0 = null;
      int int0 = 884;
      MersenneTwister mersenneTwister0 = new MersenneTwister((long) int0);
      assertNotNull(mersenneTwister0);
      
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, int0, (RandomGenerator) mersenneTwister0);
      assertNotNull(multiStartUnivariateRealOptimizer0);
      assertEquals(0, multiStartUnivariateRealOptimizer0.getIterationCount());
      assertEquals(2147483647, multiStartUnivariateRealOptimizer0.getMaximalIterationCount());
      assertEquals(2147483647, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getEvaluations());
      
      int int1 = multiStartUnivariateRealOptimizer0.getMaxEvaluations();
      assertEquals(Integer.MAX_VALUE, int1);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertEquals(0, multiStartUnivariateRealOptimizer0.getIterationCount());
      assertEquals(2147483647, multiStartUnivariateRealOptimizer0.getMaximalIterationCount());
      assertEquals(2147483647, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getEvaluations());
  }
}
