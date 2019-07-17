package com.training.day5.polymorphism;

public class One {

	One() {
		
	}
	
	void One() {
		
	}
	
	void m1() throws ArithmeticException{
		System.out.println(" in void m1() method");
	}
	
	public void m1(int i) throws NumberFormatException {
		System.out.println(" in void m1(int i) method");
	}
	
	
	void m1(String s) {
		System.out.println(" in void m1(String s) method");
	}
	
	int m1(double d) {
		int i = 0;
		System.out.println(" in void m1(double d) method");
		return i;
	}
	
	int m1(double d, int i) {
		int j = 0;
		System.out.println(" in void m1() method");
		return j;
	}
	
	public static void main(String[] args) {
		System.out.println("Hello");
	}
	
}
