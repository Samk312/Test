package com.training.day14.exceptions;

public class ExceptionQuestions {
	
	public static void main(String[] args) {
		System.out.println(m1());
	}
	
	public static int m1() {
		int a =20, b=5;
		int result = 0;
		try {
			result = a/b;
			return result;
		} catch (Exception e) {
			result = 1;
			return result;
		} finally {
			result = 2;
			return result;
		}
	}
}
