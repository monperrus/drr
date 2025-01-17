/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 03 20:19:10 GMT 2019
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.function.HarmonicOscillator;
import org.apache.commons.math.analysis.function.Log1p;
import org.apache.commons.math.analysis.function.Logit;
import org.apache.commons.math.analysis.function.Sinc;
import org.apache.commons.math.analysis.function.Tanh;
import org.apache.commons.math.analysis.solvers.AllowedSolution;
import org.apache.commons.math.analysis.solvers.IllinoisSolver;
import org.apache.commons.math.analysis.solvers.PegasusSolver;
import org.apache.commons.math.analysis.solvers.RegulaFalsiSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

 
public class BaseSecantSolver_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-0.8311663925221553));
      Log1p log1p0 = new Log1p();
      illinoisSolver0.setup(4855, log1p0, (-1.9480280583821637E-33), 4855, 1.0);
      illinoisSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-7.72), (-7.72), (-7.72));
      assertEquals((-7.72), pegasusSolver0.getAbsoluteAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.16666666666745392, 0.16666666666745392);
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator(597, (-2632.0), 1.570796251296997);
      UnivariateRealFunction univariateRealFunction0 = harmonicOscillator0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = illinoisSolver0.solve(597, univariateRealFunction0, (-2632.0), (-1629.108), 1490.296174268, allowedSolution0);
      assertEquals(1490.296174268, illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-1735.7365933337787), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-2281.28));
      Logit logit0 = new Logit();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double0 = pegasusSolver0.solve(127, (UnivariateRealFunction) logit0, 0.5, 0.5, allowedSolution0);
      assertEquals(0.5, pegasusSolver0.getMin(), 0.01);
      assertEquals(0.5, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-2281.28));
      Logit logit0 = new Logit();
      pegasusSolver0.setup(127, logit0, 0.0, 0.5, 0.5);
      double double0 = pegasusSolver0.doSolve();
      assertEquals(0.5, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-0.9999681247734539), (-0.9999681247734539));
      Sinc sinc0 = new Sinc();
      double double0 = regulaFalsiSolver0.solve(858, (UnivariateRealFunction) sinc0, 0.0, (double) 858, (-0.9999681247734539));
      assertEquals((-0.9999681247734539), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(857.6547944300136, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(1337, (UnivariateRealFunction) tanh0, (-496.62993198), (double) 1325, 0.0, allowedSolution0);
      assertEquals(1325.0, pegasusSolver0.getMax(), 0.01);
      assertEquals((-1.366829753480438E-16), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(1337, (UnivariateRealFunction) tanh0, (-496.62993198), 280.65, (-1333.9522329), allowedSolution0);
      assertEquals((-1333.9522329), pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-5.478784830794799E-11), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(1337, (UnivariateRealFunction) tanh0, (-496.62993198), 280.65, (-1333.9522329), allowedSolution0);
      assertEquals(280.65, pegasusSolver0.getMax(), 0.01);
      assertEquals(3.555584164270905E-23, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(1337, (UnivariateRealFunction) tanh0, (-496.62993198), (double) 1325, 0.0, allowedSolution0);
      assertEquals((-496.62993198), pegasusSolver0.getMin(), 0.01);
      assertEquals(7.676834862084276E-9, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(1337, (UnivariateRealFunction) tanh0, (-497.39242191684525), 280.65, (-1333.9522329), allowedSolution0);
      assertEquals((-497.39242191684525), pegasusSolver0.getMin(), 0.01);
      assertEquals((-5.352417737312175E-18), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(1337, (UnivariateRealFunction) tanh0, (-496.62993198), 280.15758193898574, (-1333.9522329), allowedSolution0);
      assertEquals((-496.62993198), pegasusSolver0.getMin(), 0.01);
      assertEquals(1.97744881329901E-8, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(1337, (UnivariateRealFunction) tanh0, (-496.62993198), 708.53808, (-1333.9522329), allowedSolution0);
      assertEquals(708.53808, pegasusSolver0.getMax(), 0.01);
      assertEquals((-1.7784572041695118E-7), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(1337, (UnivariateRealFunction) tanh0, (-496.62993198), 280.65, (-1333.9522329), allowedSolution0);
      assertEquals((-1333.9522329), pegasusSolver0.getStartValue(), 0.01);
      assertEquals(3.555584164270905E-23, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.16666666666745392, 0.16666666666745392);
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator(597, (-2632.0), 1.570796251296997);
      UnivariateRealFunction univariateRealFunction0 = harmonicOscillator0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double0 = illinoisSolver0.solve(597, univariateRealFunction0, (-2632.0), (-1629.108), 1490.296174268, allowedSolution0);
      assertEquals(1490.296174268, illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-1735.7365933337787), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(1337, (UnivariateRealFunction) tanh0, (-496.62993198), (double) 2123, (-1333.9522329), allowedSolution0);
      assertEquals((-1333.9522329), pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-2.025889505760344E-14), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(1316, (UnivariateRealFunction) tanh0, (-496.62993198), 284.93113326300954, (-1333.9522329), allowedSolution0);
      assertEquals(284.93113326300954, pegasusSolver0.getMax(), 0.01);
      assertEquals(1.0523287197270191E-15, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(1337, (UnivariateRealFunction) tanh0, (-496.62993198), 0.062413095114496935, (-1333.9522329), allowedSolution0);
      assertEquals(0.062413095114496935, pegasusSolver0.getMax(), 0.01);
      assertEquals((-3.2688821200458203E-14), double0, 0.01);
  }
}
