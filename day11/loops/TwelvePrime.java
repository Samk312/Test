package com.training.day11.loops;

public class TwelvePrime {
	
	public static void main(String[] args) {
		
		int num = 9;
//		if (args != null && args.length > 0) {
//			num = Integer.parseInt(args[0]);
//		}
		
		boolean isPrime = true;
		int temp;
		for (int i = 2; i <= num/2 ; i++) {
			temp = num%i;
			
			if (temp == 0) {
				isPrime = false;
				break;
			}
		}
		
		if (isPrime) {
			System.out.println(num + " is a prime number");
		} else {
			System.out.println(num + " is not a prime number");
		}
	}

}
