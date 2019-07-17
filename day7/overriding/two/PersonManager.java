package com.training.day7.overriding.two;

public class PersonManager {
	
	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new B();
		B b1 = new B();
		//B b2 = new A();
		a1.test();
		a2.test();
		b1.test();
		//b2.test();
	}

}
