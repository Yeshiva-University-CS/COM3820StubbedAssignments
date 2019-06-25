package edu.yu.parallel;

/** Interface defining an API for calculating primes
 *
 */
interface PrimeCalculator {

  /** Returns the number of primes in the specified range.
   *
   * @param start inclusive, must be greater than 1
   * @param end inclusive, must be less than Long.MAX_VALUE
   * @return number of primes in the specified
   */
  int nPrimesInRange(final long start, final long end);

}
