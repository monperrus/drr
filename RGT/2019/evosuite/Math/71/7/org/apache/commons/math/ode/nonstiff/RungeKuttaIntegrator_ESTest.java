/*
 * This file was automatically generated by EvoSuite
 * Tue Jun 04 02:47:20 GMT 2019
 */

package org.apache.commons.math.ode.nonstiff;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.ode.FirstOrderConverter;
import org.apache.commons.math.ode.SecondOrderDifferentialEquations;
import org.apache.commons.math.ode.events.EventHandler;
import org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator;
import org.apache.commons.math.ode.nonstiff.EulerIntegrator;
import org.apache.commons.math.ode.nonstiff.MidpointIntegrator;
import org.apache.commons.math.ode.sampling.FixedStepHandler;
import org.apache.commons.math.ode.sampling.StepNormalizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

 
public class RungeKuttaIntegrator_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator(1399.5448674);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(1).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[2];
      double double0 = eulerIntegrator0.integrate(firstOrderConverter0, 1399.5448674, doubleArray0, 0.0, doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(1).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[2];
      MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator(0.0419047619047619);
      double[] doubleArray1 = new double[2];
      // Undeclared exception!
      midpointIntegrator0.integrate(firstOrderConverter0, 0.4521763729974359, doubleArray1, 2173.0, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(1).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[2];
      MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator(0.0419047619047619);
      StepNormalizer stepNormalizer0 = new StepNormalizer(1, (FixedStepHandler) null);
      midpointIntegrator0.addStepHandler(stepNormalizer0);
      // Undeclared exception!
      try { 
        midpointIntegrator0.integrate(firstOrderConverter0, 0.0, doubleArray0, 1.0, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.ode.sampling.StepNormalizer", e);
      }
  }

////  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator(0.0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(3).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[6];
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(eventHandler0).g(anyDouble() , any(double[].class));
      classicalRungeKuttaIntegrator0.addEventHandler(eventHandler0, 0.0, 0.0, 209);
      // Undeclared exception!
      classicalRungeKuttaIntegrator0.integrate(firstOrderConverter0, 0.0, doubleArray0, 1.0, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(1).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[2];
      MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator(1);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn(1).when(eventHandler0).eventOccurred(anyDouble() , any(double[].class) , anyBoolean());
      doReturn((double)1, Double.NaN, (double)1, Double.NaN, (double)1).when(eventHandler0).g(anyDouble() , any(double[].class));
      midpointIntegrator0.addEventHandler(eventHandler0, 1, 1, 832);
      // Undeclared exception!
      try { 
        midpointIntegrator0.integrate(firstOrderConverter0, 14.659408349563849, doubleArray0, 1, doubleArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // internal error, please fill a bug report at https://issues.apache.org/jira/browse/MATH
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }
}
