/*
 * This file was automatically generated by EvoSuite
 * Sun Jun 23 15:10:12 GMT 2019
 */

package org.apache.commons.math.special;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.special.Gamma;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;


public class Gamma_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double double0 = Gamma.regularizedGammaP(14.136097974741746, 818.31);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double double0 = Gamma.regularizedGammaQ(986.846679016727, 1.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double double0 = Gamma.logGamma(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double double0 = Gamma.logGamma(0.0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double double0 = Gamma.regularizedGammaP(Double.NaN, 1682.1345255920255);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double double0 = Gamma.regularizedGammaP((-2.1026444172410488E-4), Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double double0 = Gamma.regularizedGammaP((-455.228720388887), 3.399464998481189E-5, 3.301067679372105E-4, 3409);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double double0 = Gamma.regularizedGammaP(2607.658763996879, (-3305.2498697298), 0.0, 911);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double double0 = Gamma.regularizedGammaP(1.0E-8, 0.0, 986.846679016727, 0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double double0 = Gamma.regularizedGammaQ(3.399464998481189E-5, 3.399464998481189E-5);
      assertEquals(3.301067679372105E-4, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      try { 
        Gamma.regularizedGammaQ(3.399464998481189E-5, 3.399464998481189E-5, 3.301067679372105E-4, 0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Maximal number of iterations (0) exceeded
         //
         verifyException("org.apache.commons.math.special.Gamma", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double double0 = Gamma.regularizedGammaQ(Double.NaN, Double.NaN, Double.NaN, 161);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double double0 = Gamma.regularizedGammaQ(1714.2, Double.NaN, 1.0, (-245));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double double0 = Gamma.regularizedGammaQ((double) 0, (double) 6, 986.846679016727, 0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double double0 = Gamma.regularizedGammaQ(1682.1345255920255, (-1647.0));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double double0 = Gamma.regularizedGammaQ(986.846679016727, (double) 0, (double) 0, 1);
      assertEquals(1.0, double0, 0.01);
  }
}
