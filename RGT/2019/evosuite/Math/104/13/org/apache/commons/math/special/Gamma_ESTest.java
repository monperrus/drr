/*
 * This file was automatically generated by EvoSuite
 * Sun Jun 23 15:13:54 GMT 2019
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
      double double0 = Gamma.regularizedGammaP(1073.402464, 127294.84453834976);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double double0 = Gamma.regularizedGammaQ((double) 0, (-3455.12));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double double0 = Gamma.logGamma(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double double0 = Gamma.logGamma((-1291.0974712472));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double double0 = Gamma.regularizedGammaP(Double.NaN, (-1437.413249960357), (double) 0, (-378));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double double0 = Gamma.regularizedGammaP(1646.510324, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double double0 = Gamma.regularizedGammaP((-3836.36663282287), 1.0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double double0 = Gamma.regularizedGammaP(1284.65513447011, (-1.0));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double double0 = Gamma.regularizedGammaP(1.7976931348623157E308, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double double0 = Gamma.regularizedGammaQ(1.0E-8, 1.0E-8);
      assertEquals(1.7843463706590512E-7, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double double0 = Gamma.regularizedGammaP(1915.8, 1915.8);
      assertEquals(0.5030381903820215, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      try { 
        Gamma.regularizedGammaQ(1757.7757, 1.0E-8, 0.0, 8);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Maximal number of iterations (8) exceeded
         //
         verifyException("org.apache.commons.math.special.Gamma", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double double0 = Gamma.regularizedGammaQ(Double.NaN, (-2582.682744015889), Double.NaN, 0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double double0 = Gamma.regularizedGammaQ(0.0, Double.NaN, 0.0, (-2528));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double double0 = Gamma.regularizedGammaQ(1646.510324, (-560.1), 382.431148, 9);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double double0 = Gamma.regularizedGammaQ(1875.393184, 0.0, 1915.8, 0);
      assertEquals(1.0, double0, 0.01);
  }
}
