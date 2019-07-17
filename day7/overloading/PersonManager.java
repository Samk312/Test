package com.training.day7.overloading;

public class PersonManager {
	
	public static void main(String[] args) {
		Person p = new Person();
		System.out.println(p.addition());
		System.out.println(p.addition(10));
		System.out.println(p.addition(10, 20));
	}

}
