package com.training.day7.overriding;

import java.io.IOException;

public class OverrideTest {
	
	public static void main(String[] args) throws IOException {
		A a = new A();
		B b = new B();
		a.test();
		b.test();
	
		a.test2();
		b.test2();
		
		A a1 = new B();
		System.out.println("Hello");
		a1.test();
		a1.test2();
		a1.m1();
		a1.m2(10);
		
		System.out.println(a.i);
		System.out.println(a.j);
		
		System.out.println(b.i);
		System.out.println(b.j);
		
		System.out.println(a1.i);
		System.out.println(a1.j);
	}

}
