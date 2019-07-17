package com.training.day12.strings;

public class FirstPrimitiveExample {

	public static void main(String[] args) {
		
		int x=10;
		int y=10;
		
		if (x == y) {
			System.out.println("Both are same");
		}
		
		Integer z = new Integer(10);
		
		if (x == z) {
			System.out.println("x & z are same");
		} else {
			System.out.println("x & z are not same");
		}
		

	}

}
