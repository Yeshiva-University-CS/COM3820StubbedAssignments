package edu.yu.parallel;

/** Defines a factory API for creating implementations of the PrimeCalculator
 * interface.
 *
 * @author Avraham Leff
 */

public enum PrimeCalculatorImplementations {
    SerialPrimes, SievedPrimes, TwoThreadPrimes;

    public static PrimeCalculator
    PrimeCalculatorFactory (final PrimeCalculatorImplementations impl) {
	PrimeCalculator calculator = null;
	switch(impl) {
	case SerialPrimes:
	    calculator = new SerialPrimes();
	    break;
	case SievedPrimes:
	    calculator = new SievedPrimes();
	    break;
	case TwoThreadPrimes:
	    calculator = new TwoThreadPrimes();
	    break;
	default:
	    throw new IllegalArgumentException("Unknown PrimeCalculator implementation: "
					       +impl);
	}
	
	return calculator;
    } // PrimeCalculator

    
} // enum
