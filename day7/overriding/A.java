package com.training.day7.overriding;

import java.io.IOException;

public class A {
	public int i=1;
	public static int j=2;
	void test() {
		System.out.println("A");
	}
	
	static void test2() {
		System.out.println("In A Static Method");
	}
	
	public void m1() throws IOException {
		System.out.println("m1() of A");
	}
	
	public void m2(int i) {
		System.out.println("m2(int i) of A");
	}

}
