package edu.yu.parallel;

/** A factory API for creating implementations of the PrefixSum interface.
 *
 * @author Avraham Leff
 */

public enum PrefixSumImplementations {
  Serial, ParallelPrefix, JDKParallel;

  public static PrefixSum
  PrefixSumFactory (final PrefixSumImplementations impl) {
    PrefixSum prefixSum = null;
    switch(impl) {
    case Serial:
      prefixSum = new SerialPrefixSum();
      break;
    case ParallelPrefix:
      prefixSum = new ParallelPrefixSum();
      break;
    case JDKParallel:
      prefixSum = new JDKParallelPrefixSum();
      break;
    default:
      throw new IllegalArgumentException
        ("Unknown PrefixSum implementation: "+impl);
    }

    return prefixSum;
  } // PrefixSum

} // class
