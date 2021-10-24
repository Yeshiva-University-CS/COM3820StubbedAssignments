package edu.yu.parallel;

/** Interface for the drill: specifies not only what function must be supplied
 * for clients, but also how that function must be implemented.  See the
 * requirement document for context and details.
 *
 * @author Avraham Leff
 */

import java.util.Comparator;
import java.util.List;
import edu.yu.parallel.Pear.Color;

public interface LambdaDrillInterface {

  /** Returns all GREEN Pears in the supplied List 
   *
   * You may not use any construct more powerful than the for-each loop.
   */
  List<Pear> allGreenPears(List<Pear> inventory);

  /** Return all Pears that have the specified color in the supplied list
   *
   * You may not use any construct more powerful than the for-each loop.
   */
  public List<Pear> pearsByColor(List<Pear> inventory, Color color);

  /** Return all Pears in the supplied list whose weight is greater than or
   * equal to the specified weight
   *
   * You may not use any construct more powerful than the for-each loop.
   */
  public List<Pear> pearsByWeight(List<Pear> inventory, int weight);

  /** Return all Pears in the specified list that match the specified
   * criterion.  Only one criterion is used in a match: the indicator parameter
   * specifies which criterion is used.
   *
   * @param inventory the set of Pears to be searched
   * @param color specifies a color to be matched
   * @param weight specifies a weight such that Pears whose weight is greater
   * than or equals to this value are matched
   * @param indicator true iff color criterion is the match, otherwise the
   * weight criterion is the match
   *
   * IMPORTANT: You may not use any construct more powerful than the for-each
   * loop.
   */
  public List<Pear>
    pearsByIndicator(List<Pear> inventory, Color color, int weight,
                     boolean indicator);

  /** Return all Pears in the specified list that pass the PearPredicate test.
   *
   * This interface uses a "behavior parameterization" programming style.
   *
   * IMPORTANT: You may not use any construct more powerful than the for-each
   * loop.
   */
  public List<Pear> pearsByPredicate(List<Pear> inventory, PearPredicate p);

  /** Return all Green Pears in the specified list, using an anonymous class,
   * to invoke your implementation of the pearsByPredicate() API.  The
   * anonymous class implements the PearPredicate interface to provide the
   * desired semantics.
   *
   * IMPORTANT: You MUST use implement using an anonymous class 
   * 
   */
  public List<Pear> filterGreenPearsByAnonymousClass(List<Pear> inventory);

  /** Return all Green Pears in the specified list, using a lambda expression,
   * to invoke your implementation of the pearsByPredicate() API.  The lamda
   * expression implements the PearPredicate interface to provide the desired
   * semantics.
   *
   * IMPORTANT: You MUST use implement using a lambda.
   * 
   */
  public List<Pear> filterGreenPearsByLambda(List<Pear> inventory);

  /** Sort the Pears in the inventory according to the Comparator's semantics:
   * when the method return, the client's input parameter is sorted.
   *
   * @see PearComparator
   */
  public void sortByExplicitParameter
    (List<Pear> inventory, Comparator<Pear> comparator);

  /** Sort the Pears in the inventory according to PearComparator semantics.
   *
   * IMPORTANT: your implementation MUST use an anonymous Comparator class
   */
  public void sortByAnonymousComparator(List<Pear> inventory);

  /** Sort the Pears in the inventory according to PearComparator semantics.
   *
   * IMPORTANT: your implementation MUST use a lambda to take advantage of the
   * fact that Comparator "is a functional interface and can therefore be used
   * as the assignment target for a lambda expression or method reference."
   */
  public void sortByLambda(List<Pear> inventory);

  /** Sort the Pears in the inventory by DECREASING weight: given instances
   * with equal weight, break the tie through a "sort by color".
   *
   * IMPORTANT: your implementation must chain method references together to
   * provide a single-statement implementation.
   *
   * @hint Look carefully at the java.util.Comparator API.
   */
  public void sortByChainingMethodReferences(List<Pear> inventory);
  
}
