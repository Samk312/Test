package com.training.arrays;

import java.util.Arrays;

public class RemoveDuplicateInArray {

	public static void main(String[] args) {
		removeDuplicates(new int[]{4, 5, 8, 9, 5, 8, 9, 10, 6,4});
        
        System.out.println("-------------------------");
         
        removeDuplicates(new int[]{12, 9, 21, 17, 33, 7});
         
        System.out.println("-------------------------");
         
        removeDuplicates(new int[]{891, 569, 921, 187, 343, 476, 555});
		
	}
	
	public static void removeDuplicates(int a[]) {
		System.out.println("Original Elements In Array : " + Arrays.toString(a));
		for (int i=0 ; i<a.length; i++) {
			for (int j=i+1; j<a.length-1; j++) {
				if (i != j && a[i] == a[j]) {
					if (j != a.length-2) {
						a[j] = a[j+1];
					}
				}
			}
		}
		System.out.println("After removing deuplicate elements : " + Arrays.toString(a));
	}
}
