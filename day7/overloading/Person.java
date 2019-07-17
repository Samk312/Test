package com.training.day7.overloading;

public class Person {
	
	int addition() {
		System.out.println("in addition ()");
		return 10+20;
	}
	
	int addition(int a) {
		System.out.println("in addition (int a)");
		return a+10;
	}
	
	int addition(int a,int b) {
		System.out.println("in addition (int a, int b)");
		return a+b;
	}
	
	int addition (String a, int b) {
		return 1;
	}
	
	int addition (int a, String b) {
		return 1;
	}

}
