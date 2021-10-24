package edu.yu.parallel;

/** Interface for specifying "predicates about Pears".
 *
 * @author Avraham Leff
 */

public interface PearPredicate {

  /** Return true iff the specified Pear instance "matches" the test.
   */
  boolean test(Pear a);
}
