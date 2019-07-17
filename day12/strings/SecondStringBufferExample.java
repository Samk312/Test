package com.training.day12.strings;

public class SecondStringBufferExample {

	public static void main(String[] args) {
		
		// 1. Creation of StringBuffer using default constructor
		
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.length()); // 0
		sb.append("Varun");
		sb.append("Reddy");
		System.out.println(sb);
		
		System.out.println(sb.length());//10
		
		// 2. Creation of String Buffer using parametrized constructor.
		
		StringBuffer sb1= new StringBuffer("Varun");
		sb1.append("Reddy");
		System.out.println(sb1);
		
		if (sb == sb1) {
			System.out.println("Both sb & sb1 are equal");
		} else {
			System.out.println("sb & sb1 are not equal");
		}
		
		System.out.println(sb.hashCode());
		System.out.println(sb1.hashCode());
		System.out.println(sb.equals(sb1));
		
		//Note: 1. In String Buffer class , sun people did not implemented 
		//the equals() and hashCode() method , hence they use the Object class equals method.
		// in Object class equals() method, objects are compared based on references, 
		//since we created the sb and sb1 using new operator , System.out.println(sb == sb1) will print false;
		
		// To overcome the above issue we will convert the StringBuffer object to String object
		String s1 = sb.toString();
		String s2 = sb1.toString();
		
		if (s1 == s2) {
			System.out.println("Both s1 & s2 are equal");
		} else {
			System.out.println("Both s1 & s2 are not equal");
		}
		
		if (s1.equals(s2)) {
			System.out.println("Both s1 & s2 are equal");
		} else {
			System.out.println("Both s1 & s2 are not equal");
		}
		
		
		// reverse a String buffer 
		
		StringBuffer reverse = sb1.reverse();
		System.out.println(reverse);
		
		

	}

}
