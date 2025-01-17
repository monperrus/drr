/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 18:42:15 GMT 2014
 */

package org.apache.commons.math3.geometry.euclidean.twod;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Collection;
import java.util.LinkedList;
import org.apache.commons.math3.exception.MathInternalError;
import org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D;
import org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet;
import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.apache.commons.math3.geometry.partitioning.SubHyperplane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class PolygonsSetEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = 1.7976931348623157E308;
      double double1 = 1.0;
      double double2 = (-2058.6192597351474);
      PolygonsSet polygonsSet0 = new PolygonsSet(double0, double2, double1, double2);
      assertEquals(false, polygonsSet0.isEmpty());
      assertNotNull(polygonsSet0);
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      
      // Undeclared exception!
      try {
        double double3 = polygonsSet0.getSize();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: internal error, please fill a bug report at https://issues.apache.org/jira/browse/MATH
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double double0 = 0.0;
      double double1 = 29.661;
      double double2 = (-1623.663411079628);
      PolygonsSet polygonsSet0 = new PolygonsSet(double0, double2, double1, double2);
      assertEquals(false, polygonsSet0.isEmpty());
      assertNotNull(polygonsSet0);
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
      assertFalse(double2 == double1);
      assertFalse(double2 == double0);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      
      double double3 = polygonsSet0.getSize();
      assertEquals(false, polygonsSet0.isEmpty());
      assertEquals(2684442.352914766, double3, 0.01D);
      assertFalse(double1 == double3);
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
      assertFalse(double3 == double0);
      assertFalse(double3 == double2);
      assertFalse(double3 == double1);
      assertFalse(double2 == double1);
      assertFalse(double2 == double3);
      assertFalse(double2 == double0);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertFalse(double0 == double3);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      double double0 = 1.7976931348623157E308;
      double double1 = 1.0;
      double double2 = (-2058.6192597351474);
      PolygonsSet polygonsSet0 = new PolygonsSet(double1, double0, double2, double0);
      assertEquals(false, polygonsSet0.isEmpty());
      assertNotNull(polygonsSet0);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
      assertFalse(double2 == double1);
      assertFalse(double2 == double0);
      
      polygonsSet0.computeGeometricalProperties();
      assertEquals(false, polygonsSet0.isEmpty());
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
      assertFalse(double2 == double1);
      assertFalse(double2 == double0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      double double0 = 0.0;
      double double1 = (-1623.663411079628);
      PolygonsSet polygonsSet0 = new PolygonsSet(double0, double1, double0, double1);
      assertEquals(false, polygonsSet0.isEmpty());
      assertNotNull(polygonsSet0);
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
      
      double double2 = polygonsSet0.getSize();
      assertEquals(false, polygonsSet0.isEmpty());
      assertEquals(2636282.872478734, double2, 0.01D);
      assertFalse(double0 == double1);
      assertFalse(double0 == double2);
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
      assertFalse(double2 == double1);
      assertFalse(double2 == double0);
      
      polygonsSet0.computeGeometricalProperties();
      assertEquals(false, polygonsSet0.isEmpty());
      assertFalse(double0 == double1);
      assertFalse(double0 == double2);
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      double double0 = Double.POSITIVE_INFINITY;
      PolygonsSet polygonsSet0 = new PolygonsSet(double0, double0, double0, double0);
      assertEquals(false, polygonsSet0.isEmpty());
      assertNotNull(polygonsSet0);
      
      String string0 = "Bcv6C";
      Boolean boolean0 = Boolean.valueOf(string0);
      assertFalse(boolean0);
      
      BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>((Object) boolean0);
      assertNotNull(bSPTree0);
      
      PolygonsSet polygonsSet1 = polygonsSet0.buildNew(bSPTree0);
      assertEquals(false, polygonsSet0.isEmpty());
      assertEquals(true, polygonsSet1.isEmpty());
      assertNotSame(polygonsSet0, polygonsSet1);
      assertNotSame(polygonsSet1, polygonsSet0);
      assertNotNull(polygonsSet1);
      assertFalse(polygonsSet0.equals((Object)polygonsSet1));
      assertFalse(polygonsSet1.equals((Object)polygonsSet0));
      
      double double1 = polygonsSet1.getSize();
      assertEquals(false, polygonsSet0.isEmpty());
      assertEquals(true, polygonsSet1.isEmpty());
      assertNotSame(polygonsSet0, polygonsSet1);
      assertNotSame(polygonsSet1, polygonsSet0);
      assertEquals(0.0, double1, 0.01D);
      assertFalse(polygonsSet0.equals((Object)polygonsSet1));
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
      assertFalse(polygonsSet1.equals((Object)polygonsSet0));
  }

  //@Test(timeout = 4000)
  public void test5()  throws Throwable  {
      double double0 = 3.4028234663852886E38;
      double double1 = 0.0;
      double double2 = (-10.487154410750058);
      PolygonsSet polygonsSet0 = new PolygonsSet(double0, double1, double1, double2);
      assertEquals(false, polygonsSet0.isEmpty());
      assertNotNull(polygonsSet0);
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
      assertFalse(double2 == double1);
      assertFalse(double2 == double0);
      assertFalse(double0 == double1);
      assertFalse(double0 == double2);
      
      polygonsSet0.computeGeometricalProperties();
      assertEquals(false, polygonsSet0.isEmpty());
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
      assertFalse(double2 == double1);
      assertFalse(double2 == double0);
      assertFalse(double0 == double1);
      assertFalse(double0 == double2);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean2D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean2D>>();
      assertEquals("[]", linkedList0.toString());
      assertEquals(0, linkedList0.size());
      assertNotNull(linkedList0);
      
      PolygonsSet polygonsSet0 = new PolygonsSet((Collection<SubHyperplane<Euclidean2D>>) linkedList0);
      assertEquals("[]", linkedList0.toString());
      assertEquals(0, linkedList0.size());
      assertEquals(false, polygonsSet0.isEmpty());
      assertNotNull(polygonsSet0);
      
      polygonsSet0.computeGeometricalProperties();
      assertEquals("[]", linkedList0.toString());
      assertEquals(0, linkedList0.size());
      assertEquals(false, polygonsSet0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      double double0 = 3.4028234663852886E38;
      double double1 = 2646.4527713359344;
      double double2 = 2917.591276133984;
      PolygonsSet polygonsSet0 = new PolygonsSet(double0, double2, double2, double1);
      assertEquals(false, polygonsSet0.isEmpty());
      assertNotNull(polygonsSet0);
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      assertFalse(double0 == double2);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      
      polygonsSet0.computeGeometricalProperties();
      assertEquals(false, polygonsSet0.isEmpty());
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      assertFalse(double0 == double2);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
  }
}
