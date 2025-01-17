/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 17:21:38 GMT 2014
 */

package org.apache.commons.math3.genetics;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.genetics.Chromosome;
import org.apache.commons.math3.genetics.ElitisticListPopulation;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class ElitisticListPopulationEvoSuite_branch_Test   {

  ////@Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = 5261;
      ElitisticListPopulation elitisticListPopulation0 = null;
      try {
        elitisticListPopulation0 = new ElitisticListPopulation(int0, int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // elitism rate (5,261)
         //
      }
  }

 // //@Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int int0 = 22;
      double double0 = (-2829.3436073263597);
      ElitisticListPopulation elitisticListPopulation0 = null;
      try {
        elitisticListPopulation0 = new ElitisticListPopulation(int0, double0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // elitism rate (-2,829.344)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LinkedList<Chromosome> linkedList0 = new LinkedList<Chromosome>();
      assertNotNull(linkedList0);
      assertEquals("[]", linkedList0.toString());
      assertEquals(0, linkedList0.size());
      
      Chromosome chromosome0 = null;
      boolean boolean0 = linkedList0.add(chromosome0);
      assertEquals("[null]", linkedList0.toString());
      assertEquals(1, linkedList0.size());
      assertTrue(boolean0);
      
      int int0 = 1;
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation((List<Chromosome>) linkedList0, int0, (double) int0);
      assertNotNull(elitisticListPopulation0);
      assertEquals(1, elitisticListPopulation0.getPopulationSize());
      assertEquals(1.0, elitisticListPopulation0.getElitismRate(), 0.01D);
      assertEquals("[null]", elitisticListPopulation0.toString());
      assertEquals(1, elitisticListPopulation0.getPopulationLimit());
      assertEquals("[null]", linkedList0.toString());
      assertEquals(1, linkedList0.size());
      
      ElitisticListPopulation elitisticListPopulation1 = (ElitisticListPopulation)elitisticListPopulation0.nextGeneration();
      assertNotSame(elitisticListPopulation0, elitisticListPopulation1);
      assertNotSame(elitisticListPopulation1, elitisticListPopulation0);
      assertNotNull(elitisticListPopulation1);
      assertEquals(1, elitisticListPopulation0.getPopulationSize());
      assertEquals(1.0, elitisticListPopulation0.getElitismRate(), 0.01D);
      assertEquals("[null]", elitisticListPopulation0.toString());
      assertEquals(1, elitisticListPopulation0.getPopulationLimit());
      assertEquals(1, elitisticListPopulation1.getPopulationLimit());
      assertEquals(1, elitisticListPopulation1.getPopulationSize());
      assertEquals(1.0, elitisticListPopulation1.getElitismRate(), 0.01D);
      assertEquals("[null]", elitisticListPopulation1.toString());
      assertEquals("[null]", linkedList0.toString());
      assertEquals(1, linkedList0.size());
      assertFalse(elitisticListPopulation0.equals((Object)elitisticListPopulation1));
      assertFalse(elitisticListPopulation1.equals((Object)elitisticListPopulation0));
  }
}
