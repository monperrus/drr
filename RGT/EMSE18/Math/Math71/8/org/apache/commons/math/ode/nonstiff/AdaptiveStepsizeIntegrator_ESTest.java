/*
 * This file was automatically generated by EvoSuite
 * Wed Jan 11 08:43:37 GMT 2017
 */

package org.apache.commons.math.ode.nonstiff;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math.ode.TestProblem5;
import org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator;
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
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1926.697555), (-1926.697555), (-1926.697555), (-1926.697555));
      StepProblem stepProblem0 = new StepProblem((double) 2627, (-1424.92137), 1.0);
      double[] doubleArray0 = new double[1];
      graggBulirschStoerIntegrator0.sanityChecks(stepProblem0, 5553.64, doubleArray0, 2627, doubleArray0);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(1926.697555, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(2123.9053626285, 0.0, 1.0, 1.0);
      highamHall54Integrator0.resetInternalState();
      assertEquals(2123.9053626285, highamHall54Integrator0.getMinStep(), 0.01);
      assertEquals(0.0, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(1805.6230261150863, 1805.6230261150863, doubleArray0, doubleArray0);
      double double0 = dormandPrince853Integrator0.getMinStep();
      assertEquals(1805.6230261150863, double0, 0.01);
      assertEquals(1805.6230261150863, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-3136.9657), (-3136.9657), doubleArray0, doubleArray0);
      double double0 = dormandPrince54Integrator0.getMinStep();
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals((-3136.9657), double0, 0.01);
      assertEquals(3136.9657, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(0.0, 0.0, doubleArray0, doubleArray0);
      double double0 = dormandPrince853Integrator0.getMaxStep();
      assertEquals(0.0, double0, 0.01);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(0.0, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-2107.215933118484), (-2107.215933118484), doubleArray0, doubleArray0);
      double double0 = dormandPrince853Integrator0.getMaxStep();
      assertEquals(2107.215933118484, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals((-2107.215933118484), double0, 0.01);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.0, 0.0, doubleArray0, doubleArray0);
      dormandPrince54Integrator0.filterStep(0.0, false, true);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(0.0, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.49995000374975, (-4452.0), 0.49995000374975, 0.49995000374975);
      double double0 = graggBulirschStoerIntegrator0.filterStep(3792.6510489, true, true);
      assertEquals(3792.6510489, double0, 0.01);
      assertEquals(47.178145541064744, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(1.0E-10, 1169.53096996466, (-3432.2940906465), 1.0E-10);
      double double0 = highamHall54Integrator0.filterStep((-2216.1), true, true);
      assertEquals((-1169.53096996466), double0, 0.01);
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(3.4198405956486626E-4, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
  }

  ////@Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(246.2238940458785, 2499.53573, 2499.53573, 246.2238940458785);
      double[] doubleArray0 = new double[2];
      StepProblem stepProblem0 = new StepProblem(0.0, (-686.08), (-1882.1277));
      try { 
        dormandPrince853Integrator0.sanityChecks(stepProblem0, 0.0, doubleArray0, 2.4936055526796523, doubleArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // dimensions mismatch: ODE problem has dimension 1, initial state vector has dimension 2
         //
         verifyException("org.apache.commons.math.ode.AbstractIntegrator", e);
      }
  }

  ////@Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-318.86320492732), (-318.86320492732), 1.0E-10, 0.001);
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        dormandPrince54Integrator0.sanityChecks((FirstOrderDifferentialEquations) null, 0.0, doubleArray0, (-1857.37345), doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.ode.AbstractIntegrator", e);
      }
  }

  ////@Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(1848.1824, 0.0, doubleArray0, doubleArray0);
      TestProblem5 testProblem5_0 = new TestProblem5();
      try { 
        dormandPrince853Integrator0.integrate(testProblem5_0, 0.0, doubleArray0, 1848.1824, doubleArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // dimensions mismatch: ODE problem has dimension 2, initial state vector has dimension 4
         //
         verifyException("org.apache.commons.math.ode.AbstractIntegrator", e);
      }
  }

  ////@Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(1.0E-15, Double.NaN, doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        highamHall54Integrator0.integrate((FirstOrderDifferentialEquations) null, 1.0E-10, doubleArray0, Double.NaN, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.ode.AbstractIntegrator", e);
      }
  }

  ////@Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, 0.0, 3162.7);
      graggBulirschStoerIntegrator0.setMaxEvaluations(0);
      TestProblem5 testProblem5_0 = new TestProblem5();
      double[] doubleArray0 = new double[1];
      try { 
        graggBulirschStoerIntegrator0.initializeStep(testProblem5_0, true, 0, doubleArray0, 0.0, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // 
         //
         verifyException("org.apache.commons.math.ode.AbstractIntegrator", e);
      }
  }

  ////@Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(8, 0.0, 1895.59343111, 0.0, 0.0);
      double[] doubleArray1 = new double[4];
      // Undeclared exception!
      try { 
        adamsMoultonIntegrator0.initializeStep((FirstOrderDifferentialEquations) null, false, (-1559), doubleArray0, 1895.59343111, doubleArray0, doubleArray0, doubleArray1, doubleArray1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  ////@Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-2078.994642952901), 4725.8890138049, (-2371.076935822), 0.0);
      try { 
        graggBulirschStoerIntegrator0.filterStep(0.0, false, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // minimal step size (2.08E03) reached, integration needs 0.00E00
         //
         verifyException("org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1902.0, 1902.0, 1902.0, 1902.0);
      StepProblem stepProblem0 = new StepProblem(1902.0, 0.3530431783688017, 1902.0);
      graggBulirschStoerIntegrator0.integrate(stepProblem0, 0.3530431783688017, doubleArray0, 2163.358501652, doubleArray0);
      double[] doubleArray1 = new double[5];
      double double0 = graggBulirschStoerIntegrator0.initializeStep(stepProblem0, false, 2, doubleArray1, 2, doubleArray0, doubleArray0, doubleArray1, doubleArray1);
      assertEquals(16, graggBulirschStoerIntegrator0.getEvaluations());
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, 0.0, 3162.7);
      TestProblem5 testProblem5_0 = new TestProblem5();
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        graggBulirschStoerIntegrator0.initializeStep(testProblem5_0, true, 0, doubleArray0, 1715.07025, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TestProblem5 testProblem5_0 = new TestProblem5();
      double[] doubleArray0 = new double[10];
      double[] doubleArray1 = new double[2];
      doubleArray1[0] = 319.835;
      doubleArray1[1] = 3162.7;
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 319.835, doubleArray0, doubleArray1);
      // Undeclared exception!
      try { 
        graggBulirschStoerIntegrator0.initializeStep(testProblem5_0, false, 0, doubleArray1, 319.835, doubleArray1, doubleArray0, doubleArray0, doubleArray1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      StepProblem stepProblem0 = new StepProblem(1902.0, 0.3530431783688017, 1902.0);
      double[] doubleArray1 = new double[0];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(2163.358501652, 2163.358501652, doubleArray1, doubleArray1);
      // Undeclared exception!
      try { 
        dormandPrince853Integrator0.initializeStep(stepProblem0, false, (-2145934823), doubleArray1, 0.0, doubleArray1, doubleArray0, doubleArray0, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1.0E-6, (-40.71049729571157), 1.0E-6, 1.0E-6);
      TestProblem5 testProblem5_0 = new TestProblem5();
      graggBulirschStoerIntegrator0.setInitialStepSize(1.0E-6);
      double[] doubleArray0 = new double[2];
      double double0 = graggBulirschStoerIntegrator0.initializeStep(testProblem5_0, true, (-2136280696), doubleArray0, (-2.136280696E9), doubleArray0, doubleArray0, doubleArray0, doubleArray0);
      assertEquals(1.0E-6, double0, 0.01);
      assertEquals(0.006380477826598222, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, doubleArray0, doubleArray0);
      double double0 = graggBulirschStoerIntegrator0.getMinStep();
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-1985.29), (-0.322376179245283), 0.0, (-866.016515638448));
      double double0 = highamHall54Integrator0.getMaxStep();
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(0.322376179245283, double0, 0.01);
      assertEquals(25.29842297246743, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
  }

  ////@Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 1.0001;
      doubleArray0[1] = 1.0001;
      TestProblem5 testProblem5_0 = new TestProblem5();
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(8, 1388.456, 1.0001, doubleArray0, doubleArray0);
      try { 
        adamsMoultonIntegrator0.integrate(testProblem5_0, 1.117643295602979, doubleArray0, (-2036.359513), doubleArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // minimal step size (1.39E03) reached, integration needs 1.08E00
         //
         verifyException("org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  ////@Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-816.9706346026), 0.0, (-816.9706346026), (-816.9706346026));
      StepProblem stepProblem0 = new StepProblem(3162.7, (-2907.3762040307706), (-816.9706346026));
      try { 
        graggBulirschStoerIntegrator0.integrate(stepProblem0, (-816.9706346026), doubleArray0, 3162.7, doubleArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // minimal step size (8.17E02) reached, integration needs 0.00E00
         //
         verifyException("org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-17.9589318631188), (-17.9589318631188), 1.0E-6, (-17.9589318631188));
      TestProblem5 testProblem5_0 = new TestProblem5();
      graggBulirschStoerIntegrator0.integrate(testProblem5_0, 1589.0, doubleArray0, (-2321.9437152), doubleArray0);
      assertEquals(1541, testProblem5_0.getCalls());
      assertEquals(17.9589318631188, graggBulirschStoerIntegrator0.getMinStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1.0E-6, (-40.71049729571157), 1.0E-6, (-40.71049729571157));
      TestProblem5 testProblem5_0 = new TestProblem5();
      graggBulirschStoerIntegrator0.setInitialStepSize(1.0E-6);
      double[] doubleArray0 = new double[2];
      double double0 = graggBulirschStoerIntegrator0.initializeStep(testProblem5_0, false, (-2136280696), doubleArray0, (-2.136280696E9), doubleArray0, doubleArray0, doubleArray0, doubleArray0);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(0.006380477826598222, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals((-1.0E-6), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, 0.0, 3162.7);
      graggBulirschStoerIntegrator0.setInitialStepSize(0.0);
      TestProblem5 testProblem5_0 = new TestProblem5();
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        graggBulirschStoerIntegrator0.initializeStep(testProblem5_0, true, 0, doubleArray0, 1715.07025, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1902.0, 1902.0, 1902.0, 1902.0);
      graggBulirschStoerIntegrator0.setInitialStepSize(2665.6343218885972);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(1902.0, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-3231.883227155336), 538.01762341, (-3231.883227155336), (-3231.883227155336));
      graggBulirschStoerIntegrator0.setInitialStepSize(100.0);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(1318.6395007782662, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1.0E-6, (-40.71049729571157), (-40.71049729571157), 1.0E-6);
      double double0 = graggBulirschStoerIntegrator0.getCurrentStepStart();
      assertEquals(0.006380477826598222, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1902.0, 1902.0, 1902.0, 1902.0);
      StepProblem stepProblem0 = new StepProblem(1902.0, 0.3530431783688017, 1902.0);
      graggBulirschStoerIntegrator0.integrate(stepProblem0, 0.3530431783688017, doubleArray0, 2163.358501652, doubleArray0);
      double double0 = graggBulirschStoerIntegrator0.initializeStep(stepProblem0, true, 2, doubleArray0, 2, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
      assertEquals(16, graggBulirschStoerIntegrator0.getEvaluations());
      assertEquals(1902.0, double0, 0.01);
  }
}
