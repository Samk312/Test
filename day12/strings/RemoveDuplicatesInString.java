package com.training.day12.strings;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesInString {
	
	public static void main(String[] args) {
		String s = "Charith sai";
		System.out.println("Original String : " + s);
		System.out.println("After Removing Duplicates : " + removeDuplicates(s));
	}

	public static String removeDuplicates(String s) {
		Set<Character> charSet = new HashSet<Character>();
		StringBuffer sb = new StringBuffer();
		for (int i=0; i<s.length(); i++) {
			Character c = s.charAt(i);
			
			if (!charSet.contains(c)) {
				charSet.add(c);
				sb.append(c);
			} else {
				System.out.println("Ignored to add this character as it is already present in Set, The character is : " + c);
			}
		}
		return sb.toString();
	}
	
}
