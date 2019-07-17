package com.training.day12.strings;

public class ReverseWordsAndLetters {

	public static void main(String[] args) {
		String s = "My Name Is Varun";
		System.out.println("ActualWord : " + s);
		
		String revereWordsInaString = ReverseWordsInAString.reverseWordsInAString(s);
		System.out.println("After reversing words : " + revereWordsInaString);
		
		String reverseWordsAndLetters = reverseLettersInaWord(revereWordsInaString);
		System.out.println("After reversing words and Letters: " + reverseWordsAndLetters);
	}
	
	public static String reverseLettersInaWord(String s) {
		String words[] = s.split(" ");
		String reverseWordsString = "";
		for (int i = 0; i < words.length; i++) {
			reverseWordsString = reverseWordsString+ReverseString.reverseUsingCharArray(words[i]) + " ";
		}
		return reverseWordsString;
	}
	
}
