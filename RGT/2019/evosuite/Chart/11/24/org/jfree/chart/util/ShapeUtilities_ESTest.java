/*
 * This file was automatically generated by EvoSuite
 * Fri Jun 21 22:42:33 GMT 2019
 */

package org.jfree.chart.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.awt.geom.Path2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JInternalFrame;
import javax.swing.text.DefaultCaret;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.util.RectangleAnchor;
import org.jfree.chart.util.ShapeUtilities;
import org.junit.runner.RunWith;


public class ShapeUtilities_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createUpTriangle(0.0F);
      assertEquals(1, generalPath0.getWindingRule());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JInternalFrame jInternalFrame0 = new JInternalFrame("~}0.#[;E");
      Rectangle rectangle0 = jInternalFrame0.getNormalBounds();
      Point2D point2D0 = ShapeUtilities.getPointInRectangle(2524, 2524, rectangle0);
      Line2D.Double line2D_Double0 = new Line2D.Double(point2D0, point2D0);
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createLineRegion(line2D_Double0, 2524);
      boolean boolean0 = ShapeUtilities.equal(generalPath0, (GeneralPath) null);
      assertEquals(0.0, line2D_Double0.x2, 0.01);
      assertFalse(boolean0);
      assertEquals(0.0, line2D_Double0.y1, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiamond(0.0F);
      // Undeclared exception!
      try { 
        ShapeUtilities.createTranslatedShape(shape0, (RectangleAnchor) null, (double) 0.0F, 0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'anchor' argument.
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createDownTriangle((-2113.126F));
      GeneralPath generalPath1 = new GeneralPath();
      boolean boolean0 = ShapeUtilities.equal(generalPath1, generalPath0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDownTriangle((-182.13158F));
      // Undeclared exception!
      try { 
        ShapeUtilities.drawRotatedShape((Graphics2D) null, shape0, (-182.13158F), (-182.13158F), (-1.0F));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createDiagonalCross(1020.12946F, 1020.12946F);
      assertEquals(1, generalPath0.getWindingRule());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Shape shape0 = ShapeUtilities.clone((Shape) null);
      assertNull(shape0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createDownTriangle((-182.13158F));
      GeneralPath generalPath1 = (GeneralPath)ShapeUtilities.clone(generalPath0);
      generalPath0.moveTo(4870.004F, (-2528.3F));
      generalPath1.quadTo((-182.13158F), 0.0F, 0.0F, 0.0F);
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDownTriangle((-182.13158F));
      boolean boolean0 = ShapeUtilities.equal(shape0, shape0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float();
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Float0, 0.0F);
      boolean boolean0 = ShapeUtilities.equal((Shape) line2D_Float0, shape0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double();
      boolean boolean0 = ShapeUtilities.equal((Shape) line2D_Double0, (Shape) line2D_Double0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double(0.0, 2455.286, 0.0, 0.0);
      boolean boolean0 = ShapeUtilities.equal((Shape) ellipse2D_Double0, (Shape) ellipse2D_Double0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double();
      boolean boolean0 = ShapeUtilities.equal((Shape) ellipse2D_Double0, (Shape) polygon0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Arc2D.Double arc2D_Double0 = new Arc2D.Double();
      boolean boolean0 = ShapeUtilities.equal((Shape) arc2D_Double0, (Shape) arc2D_Double0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Arc2D.Double arc2D_Double0 = new Arc2D.Double();
      boolean boolean0 = ShapeUtilities.equal((Shape) arc2D_Double0, (Shape) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      Line2D.Double line2D_Double0 = new Line2D.Double();
      boolean boolean0 = ShapeUtilities.equal((Shape) polygon0, (Shape) line2D_Double0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      boolean boolean0 = ShapeUtilities.equal((Shape) polygon0, (Shape) polygon0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float();
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Float0, 0.0F);
      boolean boolean0 = ShapeUtilities.equal(shape0, (Shape) line2D_Float0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float();
      boolean boolean0 = ShapeUtilities.equal((Line2D) null, (Line2D) line2D_Float0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Line2D) null, (Line2D) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double();
      boolean boolean0 = ShapeUtilities.equal((Line2D) line2D_Double0, (Line2D) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double(Double.POSITIVE_INFINITY, (-1.0), Double.POSITIVE_INFINITY, (-1.0));
      line2D_Double0.setLine(904.2388513, Double.NaN, (-1.0), (-1573.0));
      boolean boolean0 = ShapeUtilities.equal((Line2D) line2D_Double0, (Line2D) line2D_Double0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double();
      Line2D.Double line2D_Double1 = new Line2D.Double(0, 0, (-1847.5799319309954), 329.428871573567);
      boolean boolean0 = ShapeUtilities.equal((Line2D) line2D_Double0, (Line2D) line2D_Double1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) null, (Ellipse2D) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double();
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) null, (Ellipse2D) ellipse2D_Double0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float();
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) ellipse2D_Float0, (Ellipse2D) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double();
      ellipse2D_Double0.height = 392.5517734;
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float();
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) ellipse2D_Float0, (Ellipse2D) ellipse2D_Double0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Arc2D) null, (Arc2D) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Arc2D.Float arc2D_Float0 = new Arc2D.Float(0);
      boolean boolean0 = ShapeUtilities.equal((Arc2D) null, (Arc2D) arc2D_Float0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Arc2D.Float arc2D_Float0 = new Arc2D.Float();
      boolean boolean0 = ShapeUtilities.equal((Arc2D) arc2D_Float0, (Arc2D) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Arc2D.Double arc2D_Double0 = new Arc2D.Double(Double.NaN, 0.0, 0.0F, (-3071.0), 1.0F, 83.07375135, 0);
      boolean boolean0 = ShapeUtilities.equal((Arc2D) arc2D_Double0, (Arc2D) arc2D_Double0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DefaultCaret defaultCaret0 = new DefaultCaret();
      Arc2D.Double arc2D_Double0 = new Arc2D.Double(defaultCaret0, Double.NaN, 3327.287362029271, 0);
      boolean boolean0 = ShapeUtilities.equal((Arc2D) arc2D_Double0, (Arc2D) arc2D_Double0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Arc2D.Double arc2D_Double0 = new Arc2D.Double();
      arc2D_Double0.setAngles(1.5, 1.5, (-3330.80032105149), 0.0);
      Arc2D.Float arc2D_Float0 = new Arc2D.Float();
      boolean boolean0 = ShapeUtilities.equal((Arc2D) arc2D_Double0, (Arc2D) arc2D_Float0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Arc2D.Double arc2D_Double0 = new Arc2D.Double();
      Arc2D.Double arc2D_Double1 = new Arc2D.Double(1);
      boolean boolean0 = ShapeUtilities.equal((Arc2D) arc2D_Double0, (Arc2D) arc2D_Double1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      boolean boolean0 = ShapeUtilities.equal((Polygon) null, polygon0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Polygon) null, (Polygon) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      boolean boolean0 = ShapeUtilities.equal(polygon0, (Polygon) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      Polygon polygon1 = new Polygon();
      polygon1.npoints = 1019;
      boolean boolean0 = ShapeUtilities.equal(polygon0, polygon1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      Polygon polygon1 = new Polygon(polygon0.xpoints, polygon0.ypoints, 0);
      boolean boolean0 = ShapeUtilities.equal(polygon0, polygon1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      Polygon polygon1 = new Polygon(polygon0.ypoints, polygon0.xpoints, 0);
      polygon0.xpoints = polygon1.ypoints;
      boolean boolean0 = ShapeUtilities.equal(polygon0, polygon1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((GeneralPath) null, (GeneralPath) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      GeneralPath generalPath0 = new GeneralPath();
      boolean boolean0 = ShapeUtilities.equal((GeneralPath) null, generalPath0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createRegularCross(1119.1448F, 1119.1448F);
      GeneralPath generalPath1 = new GeneralPath(0);
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      GeneralPath generalPath0 = new GeneralPath(0, 4);
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDownTriangle((-182.13158F));
      Shape shape1 = ShapeUtilities.createRegularCross((-182.13158F), (-182.13158F));
      boolean boolean0 = ShapeUtilities.equal(shape0, shape1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createDownTriangle((-182.13158F));
      GeneralPath generalPath1 = (GeneralPath)ShapeUtilities.clone(generalPath0);
      generalPath1.quadTo((-182.13158F), 0.0F, 0.0F, 0.0F);
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDownTriangle(0.0F);
      Path2D.Double path2D_Double0 = (Path2D.Double)ShapeUtilities.createTranslatedShape(shape0, 572.417487375, 474.703506);
      assertEquals(1, path2D_Double0.getWindingRule());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      // Undeclared exception!
      try { 
        ShapeUtilities.createTranslatedShape((Shape) null, (double) 404.1886F, 3572.0282376302);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'shape' argument.
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.CENTER;
      // Undeclared exception!
      try { 
        ShapeUtilities.createTranslatedShape((Shape) null, rectangleAnchor0, Double.NaN, (-1168.213191));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'shape' argument.
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float(0.0F, 0.0F, 0.0F, 0.0F);
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP_RIGHT;
      Path2D.Double path2D_Double0 = (Path2D.Double)ShapeUtilities.createTranslatedShape((Shape) rectangle2D_Float0, rectangleAnchor0, (-2502.7580876644192), (-2033.51842435751));
      assertEquals(1, path2D_Double0.getWindingRule());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      GeneralPath generalPath0 = new GeneralPath();
      Path2D.Double path2D_Double0 = (Path2D.Double)ShapeUtilities.rotateShape(generalPath0, 0.0, 0.0F, 21.643938F);
      assertEquals(1, path2D_Double0.getWindingRule());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Shape shape0 = ShapeUtilities.rotateShape((Shape) null, 0.0, 189.48683F, 189.48683F);
      assertNull(shape0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float(1.0F, (-2365.0156F), (-65.4089F), 0.0F);
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createLineRegion(line2D_Float0, (-2113.126F));
      assertEquals(1, generalPath0.getWindingRule());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      JInternalFrame jInternalFrame0 = new JInternalFrame("~}0.#[;E");
      Rectangle rectangle0 = jInternalFrame0.getNormalBounds();
      rectangle0.setFrame(2523.48, 2523.48, 2523.48, 2523.48);
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(0.0, 0.5, 2523.0, 2110.4382F);
      boolean boolean0 = ShapeUtilities.contains(rectangle0, rectangle2D_Double0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double(0.0F, 0.0, 0, 1244.17044851364);
      Rectangle rectangle0 = ellipse2D_Double0.getBounds();
      DefaultCaret defaultCaret0 = new DefaultCaret();
      boolean boolean0 = ShapeUtilities.contains(defaultCaret0, rectangle0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double((-85.727012881), 3327.287362029271, 9.094206629732174E-5, 868.869);
      Rectangle2D rectangle2D0 = rectangle2D_Double0.getBounds2D();
      rectangle2D_Double0.add(3327.287362029271, 1404.6407462727145);
      boolean boolean0 = ShapeUtilities.contains(rectangle2D0, rectangle2D_Double0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float(0.0F, 0.0F, (-1.0F), 0.0F);
      Rectangle2D rectangle2D0 = ellipse2D_Float0.getBounds2D();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      boolean boolean0 = ShapeUtilities.contains(rectangle2D0, rectangle2D_Double0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double(0.0F, 0.0, 0, 1244.17044851364);
      Rectangle rectangle0 = ellipse2D_Double0.getBounds();
      DefaultCaret defaultCaret0 = new DefaultCaret();
      boolean boolean0 = ShapeUtilities.contains(rectangle0, defaultCaret0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double(0.0F, 0.0F, (-1.0F), (-1.0F));
      Rectangle2D rectangle2D0 = ellipse2D_Double0.getBounds2D();
      boolean boolean0 = ShapeUtilities.intersects(rectangle2D0, rectangle2D0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(1593.221435546875, 881.0, 1593.221435546875, 1593.221435546875);
      boolean boolean0 = ShapeUtilities.intersects(rectangle2D_Double0, rectangle2D_Double0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double();
      Rectangle2D rectangle2D0 = ellipse2D_Double0.getBounds2D();
      rectangle2D0.setFrame(814.6107177734375, 0.0, 0.0, (-2875.30566343991));
      boolean boolean0 = ShapeUtilities.intersects(rectangle2D0, rectangle2D0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float(0.0F, 0.0F, 8.681169F, 0.0F);
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(83.31672539, 0.0, 1465.0, 0.0F);
      Rectangle2D rectangle2D0 = rectangle2D_Double0.createIntersection(rectangle2D_Float0);
      Rectangle2D rectangle2D1 = rectangle2D_Float0.createUnion(rectangle2D0);
      boolean boolean0 = ShapeUtilities.intersects(rectangle2D1, rectangle2D0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float(0.0F, 0.0F, 0.0F, 0.0F);
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(0.0F, 0.0F, 1208.0, (-2502.7580876644192));
      boolean boolean0 = ShapeUtilities.intersects(rectangle2D_Double0, rectangle2D_Float0);
      assertFalse(boolean0);
  }
}
