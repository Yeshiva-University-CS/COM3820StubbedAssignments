package edu.yu.parallel;

/** Interface defining an API for calculating prefix sums
 *
 * @author Avraham Leff
 */
public interface PrefixSum {

  /** Computes and returns the inclusive prefix sum of each element of the
   * array.  By invoking this method, the client transfers ownership of the
   * array to the implementor of the method, such that the contents of the
   * parameter are undefined after the method returns.  A copy of the input
   * should be made prior to method invocation if the client will subsequently
   * need the original array.
   *
   * Example: if the input array initially holds [2, 1, 0, 3], the method will
   * return an array consisting of [2, 3, 3, 6].
   *
   * @param input array
   * @return array whose elements are the inclusive prefix sum of the input
   * @see https://en.wikipedia.org/wiki/Prefix_sum
   */
  int[] prefixSum(int[] input);
}



