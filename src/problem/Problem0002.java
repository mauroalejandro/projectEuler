package problem;

public class Problem0002 {

	/**
	 * Each new term in the Fibonacci sequence is generated by adding the previous two terms. 
	 * By starting with 1 and 2, the first 10 terms will be: 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
	 * 
	 * @param number
	 * @return The sum of the even-valued terms.
	 */
	public static Integer EvenFibonacciNumbers(Integer number) {
		Integer before = 1;
		Integer current = 2;
		Integer sum = 0;
		Integer sumTmp = 0;
		while (current < number) {
			if (current % 2 == 0) {
				sum = sum + current;				
			}
			sumTmp = current + before;
			before = current;
			current = sumTmp;
		}
		return sum;
	}
}
