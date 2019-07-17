package com.training.arrays;

public class MaxElementInArray {
	public static void main(String[] args) {
		int a[] = {12,9,456,22,39,100,444,999,321,343,999};
		int max = a[0];
		for (int i=1; i<a.length-1; i++) {
			if (max <= a[i]) {
				max = a[i]; 
			} 
		}
		System.out.println("max element: " + max);
	}
}
