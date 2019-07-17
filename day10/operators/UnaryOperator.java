package com.training.day10.operators;

public class UnaryOperator {
	public static void main(String[] args) {
		int result = 0;
		result = +1;
        System.out.println(result);
 
        result--;
        System.out.println(result);
 
        result++;
        System.out.println(result);
 
        result = -result;
        System.out.println(result);
 
        boolean success = false;
        System.out.println(success);
        System.out.println(!success);
	}
}
