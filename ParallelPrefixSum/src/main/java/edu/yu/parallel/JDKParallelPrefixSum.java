package edu.yu.parallel;

/** Implementation of the PrefixSum API should be a (very thin) wrapper of the
 * JDK's Arrays.parallelPrefix() API.
 *
 * @author Avraham Leff
 */

import java.math.BigDecimal;

public class JDKParallelPrefixSum implements PrefixSum {

  /** No-arg constructor: students MAY NOT add another constructor signature.
   */
  public JDKParallelPrefixSum() {}

  @Override
  public BigDecimal[] prefixSum(BigDecimal[] input) {
      return null;
  }
}
