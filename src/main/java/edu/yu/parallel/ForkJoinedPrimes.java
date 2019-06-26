/** No-op implementation of ForkJoinedPrimes: the assignment doc specifies
 * the "real" requirements.
 *
 * @author Avraham Leff
 */
package edu.yu.parallel;

public class ForkJoinedPrimes implements PrimeCalculator {
    public int nPrimesInRange(final long start, final long end) {
	return -1;
    }
}

