package com.training.day14.exceptions;

public class FourthUserDefinedException extends Exception {
	
	FourthUserDefinedException(String msg) {
		System.out.println(msg);
	}
	
	public static void main(String[] args) throws FourthUserDefinedException {
		
		int age = 10;
		
		if (age < 18) {
			throw new FourthUserDefinedException("You are not eligible to cast vote as age value is : " + age);
		} else {
			System.out.println("You are eligible to cast vote");
		}
		
		System.out.println("Printing Other statements");
		
	}
	
	
	void m1() throws FourthUserDefinedException {
		int age = 10;
		
		if (age < 18) {
			throw new FourthUserDefinedException("You are not eligible to cast vote as age value is : " + age);
		} else {
			System.out.println("You are eligible to cast vote");
		}
		
	}
	

}
