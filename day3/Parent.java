package com.training.day3;

public class Parent {
	int i = 1000;
	static int j = 2000;
	
	public Parent() {
		System.out.println("In Parent Constructor");
	}
	public void m1() {
		System.out.println("In Parent m1() ");
	}
	public void m3() {
		System.out.println("In Parent m3() ");
	}
	public static void m2() {
		System.out.println("In Parent m2() ");
	}

}
