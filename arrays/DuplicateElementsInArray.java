package com.training.arrays;

import java.util.HashMap;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
		FindDuplicates(new int[ ] {4, 5, 8, 9, 5, 8, 9, 10, 6,4});
		FindDuplicatesUsingHashMap(new int[] {1,34,22,22,33,44,22});
	}
	
	public static void FindDuplicates(int[] a) {
		for (int i =0 ; i<a.length; i++) {
			for (int j = i+1; j<a.length-1; j++) {
				if (i != j && a[i] == a[j] ) {
					System.out.println(a[j] + " got duplicated");
				}
			}
		}
	}
	
	public static void FindDuplicatesUsingHashMap(int[] a) {
		
		HashMap map = new HashMap();
		for(int i =0; i<a.length-1; i++) {
			if (!map.containsKey(a[i])) {
				map.put(a[i], a[i]);
			} else {
				System.out.println(a[i] + " got duplicated");
			}
			
		}
		
	}
}
