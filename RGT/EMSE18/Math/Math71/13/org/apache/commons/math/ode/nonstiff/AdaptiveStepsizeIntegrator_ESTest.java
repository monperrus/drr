/*
 * This file was automatically generated by EvoSuite
 * Wed Jan 11 15:03:27 GMT 2017
 */

package org.apache.commons.math.ode.nonstiff;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.ode.TestProblem5;
import org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator;
import org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator;
import org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator;
import org.apache.commons.math.ode.nonstiff.HighamHall54Integrator;
import org.apache.commons.math.ode.nonstiff.StepProblem;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

public class AdaptiveStepsizeIntegrator_ESTest  {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 661.5818027878898;
      doubleArray0[1] = 661.5818027878898;
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(661.5818027878898, 661.5818027878898, doubleArray0, doubleArray0);
      TestProblem5 testProblem5_0 = new TestProblem5();
      dormandPrince853Integrator0.integrate(testProblem5_0, 661.5818027878898, doubleArray0, (-617.212436294), doubleArray0);
      assertArrayEquals(new double[] {2.1108160251805356E51, 2.1108160251805356E51}, doubleArray0, 0.01);
      assertEquals(38, dormandPrince853Integrator0.getEvaluations());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(119.8241622058294, (-3.6840314986403864), (-3.6840314986403864), (-3.6840314986403864));
      double double0 = dormandPrince54Integrator0.filterStep(119.8241622058294, false, true);
      assertEquals(3.6840314986403864, double0, 0.01);
      assertEquals(21.010378099036448, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1.8641099758258801, 1.8641099758258801, 1.8641099758258801, 1.09861228866811);
      StepProblem stepProblem0 = new StepProblem(1.09861228866811, 1.8641099758258801, 1.8641099758258801);
      double[] doubleArray0 = new double[1];
      graggBulirschStoerIntegrator0.integrate(stepProblem0, 0.0, doubleArray0, (-11.57390253996), doubleArray0);
      assertEquals(64, graggBulirschStoerIntegrator0.getEvaluations());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-7.138976441746258), (-7.138976441746258), (-7.138976441746258), (-7.138976441746258));
      TestProblem5 testProblem5_0 = new TestProblem5();
      graggBulirschStoerIntegrator0.sanityChecks(testProblem5_0, (-337.2), doubleArray0, (-7.138976441746258), doubleArray0);
      assertEquals(7.138976441746258, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, 0.0, 0.0);
      graggBulirschStoerIntegrator0.resetInternalState();
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(0.0, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 664.0844998166298;
      doubleArray0[1] = 664.0844998166298;
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(664.0844998166298, 664.0844998166298, doubleArray0, doubleArray0);
      TestProblem5 testProblem5_0 = new TestProblem5();
      dormandPrince853Integrator0.integrate(testProblem5_0, 664.0844998166298, doubleArray0, 0.0, doubleArray0);
      assertArrayEquals(new double[] {1.8778689473633449E27, 1.8778689473633449E27}, doubleArray0, 0.01);
      assertEquals(26, dormandPrince853Integrator0.getEvaluations());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.01, 0.01, 0.01, 0.01);
      StepProblem stepProblem0 = new StepProblem(0.01, 0.01, (-959.2));
      double[] doubleArray0 = new double[1];
      graggBulirschStoerIntegrator0.integrate(stepProblem0, 0.0, doubleArray0, 0.01, doubleArray0);
      assertEquals(8, graggBulirschStoerIntegrator0.getEvaluations());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, 0.0, 0.0);
      double double0 = graggBulirschStoerIntegrator0.getMinStep();
      assertEquals(0.0, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-3.6840314986403864), (-617.212436294), doubleArray0, doubleArray0);
      double double0 = graggBulirschStoerIntegrator0.getMinStep();
      assertEquals((-3.6840314986403864), double0, 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(47.68469415503961, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(27.94888452941996, 27.94888452941996, doubleArray0, doubleArray0);
      double double0 = dormandPrince853Integrator0.getMaxStep();
      assertEquals(27.94888452941996, double0, 0.01);
      assertEquals(27.94888452941996, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-689.1157167091), (-689.1157167091), doubleArray0, doubleArray0);
      double double0 = graggBulirschStoerIntegrator0.getMaxStep();
      assertEquals((-689.1157167091), double0, 0.01);
      assertEquals(689.1157167091, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.01, 0.01, 0.01, 0.01);
      StepProblem stepProblem0 = new StepProblem(0.01, 0.01, (-959.2));
      double[] doubleArray0 = new double[1];
      graggBulirschStoerIntegrator0.integrate(stepProblem0, 0.0, doubleArray0, (-11.573902539959631), doubleArray0);
      graggBulirschStoerIntegrator0.getCurrentStepStart();
      assertEquals(8121, graggBulirschStoerIntegrator0.getEvaluations());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, 0.0, 0.0);
      double double0 = graggBulirschStoerIntegrator0.filterStep(0.0, false, false);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  ////@Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1539.9371), 534.62855, doubleArray0, doubleArray0);
      TestProblem5 testProblem5_0 = new TestProblem5();
      try { 
        graggBulirschStoerIntegrator0.sanityChecks(testProblem5_0, (-1.7090315695105702), doubleArray0, (-1539.9371), doubleArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // dimensions mismatch: ODE problem has dimension 2, initial state vector has dimension 3
         //
         verifyException("org.apache.commons.math.ode.AbstractIntegrator", e);
      }
  }

  ////@Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.0, 0.0, 0.0, 0.0);
      TestProblem5 testProblem5_0 = new TestProblem5();
      // Undeclared exception!
      try { 
        dormandPrince54Integrator0.sanityChecks(testProblem5_0, (-1.2251564463762044), (double[]) null, (-1.2251564463762044), (double[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.ode.AbstractIntegrator", e);
      }
  }

  ////@Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.01, 0.01, 0.01, 0.01);
      StepProblem stepProblem0 = new StepProblem(0.01, 0.01, (-959.2));
      double[] doubleArray0 = new double[1];
      graggBulirschStoerIntegrator0.addEventHandler(stepProblem0, (-11.573902539959631), (-1207.5412669), 1654);
      graggBulirschStoerIntegrator0.integrate(stepProblem0, 0.0, doubleArray0, (-11.573902539959631), doubleArray0);
      // Undeclared exception!
      try { 
        graggBulirschStoerIntegrator0.integrate(stepProblem0, (-1207.5412669), doubleArray0, (-11.573902539959631), doubleArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // internal error, please fill a bug report at https://issues.apache.org/jira/browse/MATH
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  ////@Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(694.40842983, 694.40842983, 694.40842983, 2938.22);
      TestProblem5 testProblem5_0 = new TestProblem5();
      double[] doubleArray0 = new double[7];
      try { 
        graggBulirschStoerIntegrator0.integrate(testProblem5_0, 694.40842983, doubleArray0, 0, doubleArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // dimensions mismatch: ODE problem has dimension 2, initial state vector has dimension 7
         //
         verifyException("org.apache.commons.math.ode.AbstractIntegrator", e);
      }
  }

  ////@Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-1379.89547134), (-2806.277010489), (-1323.584949531965), (-1379.89547134));
      TestProblem5 testProblem5_0 = new TestProblem5();
      // Undeclared exception!
      try { 
        highamHall54Integrator0.integrate(testProblem5_0, 3.626860407847019, (double[]) null, (-1379.89547134), (double[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.ode.AbstractIntegrator", e);
      }
  }

  ////@Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-0.2908093278463649), (-0.2908093278463649), (-3.7333333333333334), (-3.7333333333333334));
      TestProblem5 testProblem5_0 = new TestProblem5();
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = new double[4];
      // Undeclared exception!
      try { 
        highamHall54Integrator0.initializeStep(testProblem5_0, false, 1061, doubleArray0, 1061, doubleArray1, doubleArray1, doubleArray1, doubleArray1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.01, 0.01, 0.01, 0.01);
      StepProblem stepProblem0 = new StepProblem(0.01, 0.01, (-959.2));
      double[] doubleArray0 = new double[1];
      graggBulirschStoerIntegrator0.integrate(stepProblem0, 0.0, doubleArray0, (-11.573902539959631), doubleArray0);
      double double0 = graggBulirschStoerIntegrator0.initializeStep(stepProblem0, false, 1654, doubleArray0, 1654, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
      assertEquals(8122, graggBulirschStoerIntegrator0.getEvaluations());
      assertEquals((-0.01), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.3266554585296874, 1469.8567685750174, doubleArray0, doubleArray0);
      TestProblem5 testProblem5_0 = new TestProblem5();
      // Undeclared exception!
      try { 
        highamHall54Integrator0.initializeStep(testProblem5_0, false, (-2738), doubleArray0, 1469.8567685750174, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(661.5818027878898, 661.5818027878898, doubleArray0, doubleArray0);
      TestProblem5 testProblem5_0 = new TestProblem5();
      dormandPrince853Integrator0.setInitialStepSize(661.5818027878898);
      double double0 = dormandPrince853Integrator0.initializeStep(testProblem5_0, true, 1463, doubleArray0, 0.064, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(661.5818027878898, double0, 0.01);
      assertEquals(661.5818027878898, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.3266554585296874, 1469.8567685750174, doubleArray0, doubleArray0);
      TestProblem5 testProblem5_0 = new TestProblem5();
      highamHall54Integrator0.setInitialStepSize(0.3266554585296874);
      double double0 = highamHall54Integrator0.initializeStep(testProblem5_0, false, (-2738), doubleArray0, 1469.8567685750174, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(21.912022652229915, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals((-0.3266554585296874), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(367.5302715, 0.0, 1326.099465504856, 367.5302715);
      double double0 = dormandPrince853Integrator0.getMinStep();
      assertEquals(367.5302715, double0, 0.01);
      assertEquals(0.0, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(0.0, 0.0, 1293.864034, (-2084.22));
      double double0 = dormandPrince853Integrator0.getMaxStep();
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1730.768473914, 15.0, 15.0, 15.0);
      double double0 = graggBulirschStoerIntegrator0.filterStep(674.0, true, true);
      assertEquals(15.0, double0, 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(161.1258114291748, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  ////@Test(timeout = 4000)
  public void test26()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-2115.491819245), 1289.93, (-531.3746817733), (-531.3746817733));
      try { 
        highamHall54Integrator0.filterStep(1289.93, false, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // minimal step size (2.12E03) reached, integration needs 1.29E03
         //
         verifyException("org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-4421.938723), (-4421.938723), (-4421.938723), (-4421.938723));
      double double0 = dormandPrince853Integrator0.filterStep((-170.967), false, true);
      assertEquals(4421.938723, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
      assertEquals((-4421.938723), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.01, 0.01, 0.01, 0.01);
      StepProblem stepProblem0 = new StepProblem(0.01, 0.01, (-959.2));
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        graggBulirschStoerIntegrator0.initializeStep(stepProblem0, true, 1654, doubleArray0, 1654, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.01, 0.01, 0.01, 0.01);
      StepProblem stepProblem0 = new StepProblem(0.01, 0.01, (-959.2));
      stepProblem0.setRate(0.0);
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (-506.420814);
      graggBulirschStoerIntegrator0.integrate(stepProblem0, 0.0, doubleArray0, (-11.573902539959631), doubleArray0);
      assertEquals(8121, graggBulirschStoerIntegrator0.getEvaluations());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.01, 0.01, 0.01, 0.01);
      StepProblem stepProblem0 = new StepProblem(0.01, 0.01, (-959.2));
      double[] doubleArray0 = new double[1];
      graggBulirschStoerIntegrator0.setInitialStepSize(0.01);
      graggBulirschStoerIntegrator0.integrate(stepProblem0, 0.0, doubleArray0, (-11.573902539959631), doubleArray0);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(stepProblem0, (-1207.5412669), doubleArray0, (-11.573902539959631), doubleArray0);
  }

  ////@Test(timeout = 4000)
  public void test31()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = new double[3];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(660.7987986043391, 660.7987986043391, doubleArray0, doubleArray1);
      TestProblem5 testProblem5_0 = new TestProblem5();
      try { 
        dormandPrince853Integrator0.integrate(testProblem5_0, 0.25, doubleArray0, 660.7987986043391, doubleArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // dimensions mismatch: state vector has dimension 2, relative tolerance vector has dimension 3
         //
         verifyException("org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  ////@Test(timeout = 4000)
  public void test32()  throws Throwable  {
      double[] doubleArray0 = new double[12];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-596.517), (-596.517), doubleArray0, doubleArray0);
      StepProblem stepProblem0 = new StepProblem((-596.517), 20.0, 20.0);
      double[] doubleArray1 = new double[1];
      try { 
        graggBulirschStoerIntegrator0.integrate(stepProblem0, 1.0E-10, doubleArray1, (-596.517), doubleArray1);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // dimensions mismatch: state vector has dimension 1, absolute tolerance vector has dimension 12
         //
         verifyException("org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.01, 0.01, 0.01, 0.01);
      graggBulirschStoerIntegrator0.setInitialStepSize(6.265569375E11);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(0.01, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(662.8087010695589, 662.8087010695589, doubleArray0, doubleArray0);
      dormandPrince853Integrator0.setInitialStepSize(0.0);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(662.8087010695589, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.3266554585296874, 1469.8567685750174, doubleArray0, doubleArray0);
      double double0 = highamHall54Integrator0.getCurrentStepStart();
      assertEquals(21.912022652229915, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.01, 0.01, 0.01, 0.01);
      StepProblem stepProblem0 = new StepProblem(0.01, 0.01, (-959.2));
      double[] doubleArray0 = new double[1];
      graggBulirschStoerIntegrator0.integrate(stepProblem0, 0.0, doubleArray0, (-11.573902539959631), doubleArray0);
      double double0 = graggBulirschStoerIntegrator0.initializeStep(stepProblem0, true, 1654, doubleArray0, 1654, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
      assertEquals(8122, graggBulirschStoerIntegrator0.getEvaluations());
      assertEquals(0.01, double0, 0.01);
  }
}
