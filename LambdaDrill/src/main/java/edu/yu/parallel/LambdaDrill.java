package edu.yu.parallel;

/** Implements LamdaDrillInterface as per constraints in requirements document.  
 *
 * @author Avraham Leff
 */

import java.util.Comparator;
import java.util.*;
import edu.yu.parallel.Pear.Color;

public class LambdaDrill implements LambdaDrillInterface {
  /** No-arg ctor
   */
  public LambdaDrill() { // no-op
    // Students: you may NOT add another constructor
    //
    // You MAY add whatever code you like
  }

  @Override
  public List<Pear> allGreenPears(final List<Pear> inventory) {
    return null;
  }

  @Override
  public List<Pear>
    pearsByColor(final List<Pear> inventory, final Color color)
  {
    return null;
  }

  @Override
  public List<Pear> pearsByWeight(List<Pear> inventory, int weight) {
    return null;
  }

  @Override
  public List<Pear>
    pearsByIndicator(List<Pear> inventory, Color color, int weight,
                     boolean indicator)
  {
    return null;
  }

  @Override
  public List<Pear> pearsByPredicate(List<Pear> inventory, PearPredicate p) {
    return null;
  }

  @Override
  public List<Pear> filterGreenPearsByAnonymousClass(List<Pear> inventory) {
    return null;
  }      

  @Override
  public List<Pear> filterGreenPearsByLambda(List<Pear> inventory) {
    return null;
  }

  @Override
  public void sortByExplicitParameter
    (List<Pear> inventory, Comparator<Pear> comparator)
  {
  }

  @Override
  public void sortByAnonymousComparator(List<Pear> inventory) {
  }

  @Override
  public void sortByLambda(List<Pear> inventory) {
  }

  @Override
  public void sortByChainingMethodReferences(List<Pear> inventory) {
  }

}  // class
