package com.training.day20.compare;

import java.util.Arrays;

public class FirstSortArray {

	public static void main(String[] args) {
		String[] fruits = {"Bananana","Papaya","Apple","Orange","Mango"};
		
		System.out.println("Before Sorting : ");
		
		for (String fruit:fruits) {
			System.out.println(fruit);
		}
		
		Arrays.sort(fruits);
		
		System.out.println("After Sorting : ");

		for (String fruit:fruits) {
			System.out.println(fruit);
		}
		
	}

}
