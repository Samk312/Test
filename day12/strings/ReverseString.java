package com.training.day12.strings;

public class ReverseString {

	
	public static void main(String[] args) {
		String s = "My Name is varun";
		
		// 1. using String Buffer 
		String reverse = reverseUsingStringBuffer(s);
		System.out.println("Using StringBuffer : " + reverse);
		
		// 2. Using CharArray
		reverse = reverseUsingCharArray(s);
		System.out.println("Using CharArray : " + reverse);
	}
		
	
	public static String reverseUsingStringBuffer(String s) {
		StringBuffer sb = new StringBuffer(s);
		String reverse = sb.reverse().toString();
		return reverse;
		
		
	}
	
	public static String reverseUsingCharArray(String s) {
		char[] charArray = s.toCharArray();
		StringBuffer sb = new StringBuffer();
		for (int i = charArray.length-1; i >=0; i--) {
			sb.append(charArray[i]);
		}
		String reverse = sb.toString();
		return reverse;
	}
}
