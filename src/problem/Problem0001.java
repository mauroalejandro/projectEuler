package problem;

public class Problem0001 {

	/**
	 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
	 * The sum of these multiples is 23.
	 * 
	 * @param number
	 * @return the sum of all the multiples of 3 or 5 below 'number'
	 */
	public static Integer multiples3and5(int number) {
		Integer sum = 0;
		for (int i = 3; i < number; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum = sum + i; 
			}
		}
		return sum;
	}
	
}