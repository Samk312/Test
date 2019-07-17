package com.training.day12.strings;

public class ThirdStringBuilder {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		sb.append("Varun");
		sb.append("Reddy");
		
		System.out.println(sb); // VarunReddy
		
		StringBuilder sb1 = new StringBuilder("VarunReddy");
		
		if (sb == sb1) {
			System.out.println("sb & sb1 are same");
		} else {
			System.out.println("sb & sb1 are not same");
		}
		
		System.out.println("sb.hashCode() : " + sb.hashCode());
		System.out.println("sb1.hashCode() : " + sb1.hashCode());
		if (sb.equals(sb1)) {
			System.out.println("sb & sb1 are same");
		} else {
			System.out.println("sb & sb1 are not same");
		}

	}

}
