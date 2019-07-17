package com.training.arrays;

public class ArrayMinMax {

	
	public static void main(String[] args) {
		int a[] = {25,2,34,55,39,4322,11};
		
		int min=a[0];
		int max=a[0];
		int minIndex =0;
		int maxIndex =0;
		for (int i=1; i<a.length-1; i++) {
			if (min>a[i]) {
				min = a[i];
				minIndex = i;
			} else if (max < a[i]) {
				max = a[i];
				maxIndex = i;	
			}
		}
		
		System.out.println("Minimum value : "+ min+", At index : " +minIndex);
		System.out.println("Maximum value : "+ max+", At index : " +maxIndex);
	}
}
