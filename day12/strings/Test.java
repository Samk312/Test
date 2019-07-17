package com.training.day12.strings;

public class Test {

	public static void main(String[] args) {
		//String s1= "varun";
		String s1= new String("varun");
		StringBuffer sb2= new StringBuffer("varun");
		
		System.out.println(Boolean.parseBoolean("true"));
		

		if (s1.equals(sb2)) {
			System.out.println("S1 & Sb2 are equal");
		} else {
			System.out.println("S1 & Sb2 are not equal");
		}
	}

}
