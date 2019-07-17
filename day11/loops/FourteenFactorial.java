package com.training.day11.loops;

public class FourteenFactorial {

	
	public static void main(String[] args) {
		
		int number = 5;
		int result = 1;
		for (int i=number ; i >=2 ; i--) {
			result = result * i ;
		}
		
		System.out.println("Factorial of " + number + " = " + result);
	}
}
