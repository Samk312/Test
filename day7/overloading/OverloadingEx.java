package com.training.day7.overloading;

public class OverloadingEx {
	
	public void m1(Object o) {
		System.out.println("Object");
	}
	
	public void m1(byte[] o) {
		System.out.println("byte");
	}
	
	public void m1(String o) {
		System.out.println("byte");
	}
	
	public static void main(String[] args) {
		OverloadingEx o = new OverloadingEx();
		//o.method1(null);
		
	}

}
