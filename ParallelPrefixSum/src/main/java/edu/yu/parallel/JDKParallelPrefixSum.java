package edu.yu.parallel;

/** Wrapper implementation of the JDK's parallel prefix sum.
 *
 */

public class JDKParallelPrefixSum implements PrefixSum {

  /** No-arg constructor
   */
  public JDKParallelPrefixSum() {}

  @Override
  public int[] prefixSum(int[] input) {
      return input;
  }
}
