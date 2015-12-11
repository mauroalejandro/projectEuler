package main;

import problem.Problem0001;
import problem.Problem0002;
import problem.Problem0003;

public class Main {

	public static void main(String[] args) {
		if (args != null && args.length > 0) {
			System.out.println("Result: " + solve(args[0]));
		}

	}
	
	private static Object solve(String problem) {
		Object object = null;
		switch (problem) {
		case "1":
			object = Problem0001.multiples3and5(1000);
			break;
		case "2":
			object = Problem0002.EvenFibonacciNumbers(4000000);
			break;
		case "3":
			object = Problem0003.LargestPrimeFactor(600851475143L);
			break;
		case "4":
			object = Problem0001.multiples3and5(1000);
			break;
		case "5":
			object = Problem0001.multiples3and5(1000);
			break;
		case "6":
			object = Problem0001.multiples3and5(1000);
			break;
		default:
			break;
		}
		
		return object;
	}

}
