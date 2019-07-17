package com.training.day4.abstractclass;

public abstract class Two {
	int i;
	abstract void test();
	static void disp() {
		System.out.println("Inside static method of abstract class");
		
	}
	public static void main(String[] args) {
		Two.disp();
	}
	
}
