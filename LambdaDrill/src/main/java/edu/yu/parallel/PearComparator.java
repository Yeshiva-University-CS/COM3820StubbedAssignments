package edu.yu.parallel;

/** Sorts Pear instances by "ascending weight", and given two instances with
 * equal weight, breaks the tie by comparing according to the result of
 * Pear.Color.compareTo().
 *
 * @author Avraham Leff
 */

import java.util.Comparator;

public class PearComparator implements Comparator<Pear> {

  @Override
  public int compare(Pear a1, Pear a2) {
    // replace with better implementation
    return 42;
  }

}
