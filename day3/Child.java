package com.training.day3;

public class Child extends Parent {
	
	int i = 10;
	static int j = 20;
	
	public Child() {
		System.out.println("In child constructor");
	}
	
	public void m1() {
		System.out.println("In Child m1() ");
	}
	
	public static void m2() {
		System.out.println("In Child m2() ");
	}

}
