package com.training.day20.compare;

public class B {

	public static void main(String[] args) {
		A a = new A() {
			@Override
			public void m1() {
				System.out.println("implemented");
			}
		};
		a.m1();

	}

}
