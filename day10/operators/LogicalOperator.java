package com.training.day10.operators;

public class LogicalOperator {
	
	public static void main(String[] args) {
		int X = 60;
		int Y = 13;
		if ((X == Y) && (X != Y)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		
		if ((X == Y) || (X != Y)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

}
