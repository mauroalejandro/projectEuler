package problem;

public class Problem0003 {

	/**
	 * The prime factors of 13195 are 5, 7, 13 and 29.
	 * 
	 * @param number
	 * @return The largest prime factor of a number.
	 */
	public static Long LargestPrimeFactor(Long number) {
		Long largestPrime = 0L;
		Long num = 1L;
		Long prime = 1L;
		Long[] primes = {};
		boolean isPrime = false ;
		boolean done = false ;
		while (!done) {
			for (int i = 0; i < primes.length; i++) {
				if (primes[i] % prime == 0) {
					isPrime = false ;					
				}
			}
			if (isPrime) {
				isPrime = reu
			}
		}
		return largestPrime;
	}
}
