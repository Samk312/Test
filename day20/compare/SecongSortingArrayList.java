package com.training.day20.compare;

import java.util.ArrayList;
import java.util.Collections;

public class SecongSortingArrayList {

	public static void main(String[] args) {
		
		ArrayList fruits = new ArrayList();
		 
		fruits.add("Pineapple");
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Banana");
		
		System.out.println("Before Sorting:");
		for (Object fruit:fruits) {
			System.out.println(fruit);
		}
		
		Collections.sort(fruits);
		
		System.out.println("After Sorting:");
		for (Object fruit:fruits) {
			System.out.println(fruit);
		}

	}

}
