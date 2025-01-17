/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 03 16:43:47 GMT 2019
 */

package org.apache.commons.math3.geometry.euclidean.twod;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D;
import org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet;
import org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D;
import org.apache.commons.math3.geometry.euclidean.twod.Line;
import org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet;
import org.apache.commons.math3.geometry.euclidean.twod.Segment;
import org.apache.commons.math3.geometry.euclidean.twod.SubLine;
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;
import org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane;
import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.apache.commons.math3.geometry.partitioning.SubHyperplane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

 
public class PolygonsSet_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet((-784.043), (-924.567775), 3.0, (-543.17622798));
      polygonsSet0.computeGeometricalProperties();
      assertFalse(polygonsSet0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet((-2927.344747899), 0.0, (-2927.344747899), (-2541.9149524426675));
      BSPTree<Euclidean2D> bSPTree0 = polygonsSet0.getTree(true);
      PolygonsSet polygonsSet1 = polygonsSet0.buildNew(bSPTree0);
      assertNotSame(polygonsSet0, polygonsSet1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet((-2927.344747899), 0.0, (-2927.344747899), (-2541.9149524426675));
      BSPTree<Euclidean2D> bSPTree0 = polygonsSet0.getTree(true);
      Vector2D vector2D0 = new Vector2D(0.0, (-8.78597813258));
      Line line0 = new Line(vector2D0, (-8.78597813258));
      bSPTree0.insertCut(line0);
      polygonsSet0.computeGeometricalProperties();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet();
      polygonsSet0.computeGeometricalProperties();
      assertFalse(polygonsSet0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf("");
      BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>(boolean0);
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree0);
      double double0 = polygonsSet0.getSize();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet((-97.188019), 0.0, (-1535.9179486092078), (-1013.5));
      polygonsSet0.getVertices();
      polygonsSet0.computeGeometricalProperties();
      assertFalse(polygonsSet0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean2D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean2D>>();
      Vector2D vector2D0 = Vector2D.ZERO;
      SubLine subLine0 = new SubLine(vector2D0, vector2D0);
      linkedList0.add((SubHyperplane<Euclidean2D>) subLine0);
      Vector2D vector2D1 = new Vector2D(0.0, 38.5217559);
      Line line0 = new Line(vector2D1, 2780.0);
      Segment segment0 = new Segment(vector2D1, vector2D1, line0);
      SubLine subLine1 = new SubLine(segment0);
      linkedList0.add((SubHyperplane<Euclidean2D>) subLine1);
      PolygonsSet polygonsSet0 = new PolygonsSet(linkedList0);
      // Undeclared exception!
      try { 
        polygonsSet0.computeGeometricalProperties();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.twod.Line", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean2D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean2D>>();
      Vector2D vector2D0 = Vector2D.ZERO;
      SubLine subLine0 = new SubLine(vector2D0, vector2D0);
      linkedList0.add((SubHyperplane<Euclidean2D>) subLine0);
      Vector2D vector2D1 = new Vector2D(0.0, 38.5217559);
      Line line0 = new Line(vector2D1, 2780.0);
      Segment segment0 = new Segment(vector2D1, vector2D1, line0);
      SubLine subLine1 = new SubLine(segment0);
      Line line1 = new Line(vector2D1, vector2D1);
      LinkedList<SubHyperplane<Euclidean1D>> linkedList1 = new LinkedList<SubHyperplane<Euclidean1D>>();
      IntervalsSet intervalsSet0 = new IntervalsSet(linkedList1);
      linkedList0.add((SubHyperplane<Euclidean2D>) subLine1);
      AbstractSubHyperplane<Euclidean2D, Euclidean1D> abstractSubHyperplane0 = subLine1.buildNew(line1, intervalsSet0);
      linkedList0.add((SubHyperplane<Euclidean2D>) abstractSubHyperplane0);
      PolygonsSet polygonsSet0 = new PolygonsSet(linkedList0);
      polygonsSet0.computeGeometricalProperties();
      assertFalse(polygonsSet0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean2D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean2D>>();
      Vector2D vector2D0 = Vector2D.POSITIVE_INFINITY;
      Vector2D vector2D1 = new Vector2D((-0.312213444315515), vector2D0);
      Line line0 = new Line(vector2D0, (-0.312213444315515));
      Segment segment0 = new Segment(vector2D1, vector2D1, line0);
      SubLine subLine0 = new SubLine(segment0);
      linkedList0.add((SubHyperplane<Euclidean2D>) subLine0);
      Line line1 = new Line(vector2D1, (-0.312213444315515));
      SubLine subLine1 = line1.wholeHyperplane();
      linkedList0.add((SubHyperplane<Euclidean2D>) subLine1);
      PolygonsSet polygonsSet0 = new PolygonsSet(linkedList0);
      polygonsSet0.computeGeometricalProperties();
      assertFalse(polygonsSet0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean2D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean2D>>();
      Vector2D vector2D0 = Vector2D.POSITIVE_INFINITY;
      Vector2D vector2D1 = new Vector2D((-0.312213444315515), vector2D0);
      Line line0 = new Line(vector2D0, (-0.312213444315515));
      Segment segment0 = new Segment(vector2D1, vector2D1, line0);
      SubLine subLine0 = new SubLine(segment0);
      linkedList0.add((SubHyperplane<Euclidean2D>) subLine0);
      Line line1 = new Line(vector2D1, (-0.312213444315515));
      SubLine subLine1 = line1.wholeHyperplane();
      linkedList0.add((SubHyperplane<Euclidean2D>) subLine1);
      SubLine subLine2 = new SubLine(vector2D1, vector2D1);
      linkedList0.add((SubHyperplane<Euclidean2D>) subLine2);
      PolygonsSet polygonsSet0 = new PolygonsSet(linkedList0);
      // Undeclared exception!
      try { 
        polygonsSet0.computeGeometricalProperties();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: internal error, please fill a bug report at https://issues.apache.org/jira/browse/MATH
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", e);
      }
  }
}
