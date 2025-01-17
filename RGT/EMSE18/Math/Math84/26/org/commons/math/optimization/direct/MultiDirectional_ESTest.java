/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 22 10:48:44 GMT 2017
 */

package org.apache.commons.math.optimization.direct;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Comparator;
import org.apache.commons.math.optimization.RealPointValuePair;
import org.apache.commons.math.optimization.direct.MultiDirectional;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

public class MultiDirectional_ESTest  {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional((-2335.55927374), (-2335.55927374));
      RealPointValuePair[] realPointValuePairArray0 = new RealPointValuePair[9];
      double[] doubleArray0 = new double[8];
      RealPointValuePair realPointValuePair0 = new RealPointValuePair(doubleArray0, (-2335.55927374), false);
      realPointValuePairArray0[0] = realPointValuePair0;
      realPointValuePairArray0[1] = realPointValuePair0;
      realPointValuePairArray0[2] = realPointValuePairArray0[0];
      RealPointValuePair realPointValuePair1 = new RealPointValuePair(doubleArray0, (-1407.02865315));
      realPointValuePairArray0[3] = realPointValuePair1;
      doubleArray0[0] = 2.0E-4;
      multiDirectional0.simplex = realPointValuePairArray0;
      // Undeclared exception!
      try { 
        multiDirectional0.iterateSimplex((Comparator<RealPointValuePair>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.direct.MultiDirectional", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional((-557.1571577034827), (-557.1571577034827));
      RealPointValuePair[] realPointValuePairArray0 = new RealPointValuePair[1];
      double[] doubleArray0 = new double[0];
      RealPointValuePair realPointValuePair0 = new RealPointValuePair(doubleArray0, (-557.1571577034827));
      realPointValuePairArray0[0] = realPointValuePair0;
      multiDirectional0.simplex = realPointValuePairArray0;
      // Undeclared exception!
      try { 
        multiDirectional0.iterateSimplex((Comparator<RealPointValuePair>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.direct.MultiDirectional", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional((-2335.55927374), (-2335.55927374));
      RealPointValuePair[] realPointValuePairArray0 = new RealPointValuePair[9];
      double[] doubleArray0 = new double[8];
      RealPointValuePair realPointValuePair0 = new RealPointValuePair(doubleArray0, (-2335.55927374), false);
      realPointValuePairArray0[0] = realPointValuePair0;
      realPointValuePairArray0[1] = realPointValuePair0;
      multiDirectional0.setMaxEvaluations((-1));
      realPointValuePairArray0[2] = realPointValuePairArray0[1];
      realPointValuePairArray0[3] = realPointValuePairArray0[1];
      realPointValuePairArray0[4] = realPointValuePairArray0[1];
      realPointValuePairArray0[5] = realPointValuePair0;
      realPointValuePairArray0[6] = realPointValuePair0;
      realPointValuePairArray0[7] = realPointValuePair0;
      realPointValuePairArray0[8] = realPointValuePair0;
      multiDirectional0.simplex = realPointValuePairArray0;
      try { 
        multiDirectional0.iterateSimplex((Comparator<RealPointValuePair>) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Maximal number of evaluations (-1) exceeded
         //
         verifyException("org.apache.commons.math.optimization.direct.DirectSearchOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-1276));
      try { 
        multiDirectional0.iterateSimplex((Comparator<RealPointValuePair>) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Maximal number of iterations (-1,276) exceeded
         //
         verifyException("org.apache.commons.math.optimization.direct.DirectSearchOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      RealPointValuePair[] realPointValuePairArray0 = new RealPointValuePair[1];
      double[] doubleArray0 = new double[4];
      RealPointValuePair realPointValuePair0 = new RealPointValuePair(doubleArray0, 0.0);
      realPointValuePairArray0[0] = realPointValuePair0;
      multiDirectional0.simplex = realPointValuePairArray0;
      // Undeclared exception!
      try { 
        multiDirectional0.iterateSimplex((Comparator<RealPointValuePair>) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.commons.math.optimization.direct.MultiDirectional", e);
      }
  }
}
