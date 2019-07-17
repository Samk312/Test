package com.training.day12.strings;

public class FirstString {
	
	public static void main(String[] args) {
		String s1 = "ravi";
		String s2 = "ravi";
		
		if (s1 == s2) {
			System.out.println("s1 & s2 are equal");
		} else {
			System.out.println("s1 & s2 are not equal");
		}
		
		String s3 = new String ("ravi");
		
		if (s1 == s3) {
			System.out.println("s1 & s3 are equal");
		} else {
			System.out.println("s1 & s3 are not equal");
		}
		
		System.out.println("s1.hashCode() : " + s1.hashCode());
		System.out.println("s2.hashCode() : " + s2.hashCode());
		System.out.println("s3.hashCode() : " + s3.hashCode());
		
		if (s1.equals(s2)) {
			System.out.println("s1 & s2 are equal");
		} else {
			System.out.println("s1 & s2 are not equal");
		}
		
		if (s1.equals(s3)) {
			System.out.println("s1 & s3 are equal");
		} else {
			System.out.println("s1 & s3 are not equal");
		}
		
		
		
		// Note : Two objects are said to be equal only if
		//1. obj1.equals(obj2) returns true;
		//2. obj1.hashCode() and obj2.hashCode() are same.
		
		//In case of strings two objects are equal because
		//1. Internal implementation of String class equals() method compares two objects based on every character.
		//2. Internal implementation of String class hashCode() method creates hash with every character of a String.
		
	}

}
