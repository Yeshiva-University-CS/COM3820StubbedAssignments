package edu.yu.parallel;

/** Implements the PrefixSum interface using a "divide-and-conquer" approach,
 * specifically, one that's based on the JDK's "fork/join" library.  The cutoff
 * threshold for the implementation is specified by the PrefixSum.threshold
 * property: clients are responsible for setting the property before creating
 * an instance of this class.
 *
 * @author Avraham Leff
 */

import java.math.BigDecimal;

public class ParallelPrefixSum implements PrefixSum {
  /** No-arg constructor: students MAY NOT add another constructor signature.
   */
  public ParallelPrefixSum() {
  }

  @Override
  public BigDecimal[] prefixSum(BigDecimal[] input) {
      return null;
  }    
}
