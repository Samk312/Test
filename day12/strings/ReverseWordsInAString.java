package com.training.day12.strings;

public class ReverseWordsInAString {

	public static void main(String[] args) {
		String s = "My Name Is Varun";
		String returnstring = reverseWordsInAString(s);
		System.out.println(returnstring);
	}
	
	
	public static String reverseWordsInAString(String s) {
		String returnString = "";
		String[] words = s.split(" ");
		
		for (int i = words.length-1; i>=0; i--) {
			returnString = returnString + words[i] + " ";
		}
		
		return returnString;
	}
}
