/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 24 09:06:12 GMT 2019
 */

package org.apache.commons.math.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.distribution.PoissonDistributionImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;


public class PoissonDistributionImpl_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(0.016);
      poissonDistributionImpl0.inverseCumulativeProbability(0.0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(0.016);
      double double0 = poissonDistributionImpl0.getMean();
      assertEquals(0.016, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(0.016);
      poissonDistributionImpl0.sample(150);
      assertEquals(0.016, poissonDistributionImpl0.getMean(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(1421.17385, 0);
      double double0 = poissonDistributionImpl0.probability(0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(21.0, 0.0);
      assertEquals(21.0, poissonDistributionImpl0.getMean(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(0.016);
      double double0 = poissonDistributionImpl0.normalApproximateProbability(115);
      assertEquals(1.0, double0, 0.01);
      assertEquals(0.016, poissonDistributionImpl0.getMean(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = null;
      try {
        poissonDistributionImpl0 = new PoissonDistributionImpl(0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is smaller than, or equal to, the minimum (0): mean (0)
         //
         verifyException("org.apache.commons.math.distribution.PoissonDistributionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(0.016);
      double double0 = poissonDistributionImpl0.probability((-1));
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.016, poissonDistributionImpl0.getMean(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(0.016);
      double double0 = poissonDistributionImpl0.probability(Integer.MAX_VALUE);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.016, poissonDistributionImpl0.getMean(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(1676.233450229506);
      double double0 = poissonDistributionImpl0.probability(12);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(6.283185307179586, 6.283185307179586, 1);
      int int0 = poissonDistributionImpl0.inverseCumulativeProbability(1);
      assertEquals(6.283185307179586, poissonDistributionImpl0.getMean(), 0.01);
      assertEquals(Integer.MAX_VALUE, int0);
  }
}
