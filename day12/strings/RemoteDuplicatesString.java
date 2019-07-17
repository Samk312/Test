package com.training.day12.strings;
public class RemoteDuplicatesString {
	public static void main(String[] args) {
		String string1 = "abccba";
		String result = "";
		if (string1 != null) {
			for (int i=0; i<string1.length(); i++) {
				if (result.indexOf(string1.substring(i, i+1)) == -1) {
					result = result + string1.substring(i, i+1);
				}
			}
		}
		System.out.println(result);
	}
}