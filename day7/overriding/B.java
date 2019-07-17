package com.training.day7.overriding;

public class B extends A {
	public int i=10;
	public static int j=20;
	void test() {
		System.out.println("B");
	}
	
	void test1() {
		System.out.println("Hello");
	}
	
	static void test2() {
		System.out.println("In B Static Method");
	}
	
	public void m1() {
		System.out.println("m1() of B");
	}
	
	public void m2(Integer i) {
		System.out.println("m2(Integer i)");
	}
	
	public void m2(int i) {
		System.out.println("m2(int i) of B");
	}
}
