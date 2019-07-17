package com.training.day17.collections;

public class ThirdClass implements FirstInterface, SecondInterface {
	
	@Override
	public void m1() {
		System.out.println("Implemented m1()");
	}
	
	@Override
	public void m2() {
		System.out.println("Implemented m2()");
	}

	
	public static void main(String[] args) {
		FirstInterface f = new ThirdClass();
		f.m1();
		
		SecondInterface s = new ThirdClass();
		s.m1();
		s.m2();
	}
}
/*
 
Output:
Implemented m1()
Implemented m1()
Implemented m2()

*/