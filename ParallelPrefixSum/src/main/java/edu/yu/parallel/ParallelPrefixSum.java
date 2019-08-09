package edu.yu.parallel;

/** Implements PrefixSum interface using two-pass fork-join algorithm
 */
public class ParallelPrefixSum implements PrefixSum {

    /** No-arg constructor.
     */
    public ParallelPrefixSum() {}

    @Override
    public int[] prefixSum(int[] input) {
	return input;
    }
}
