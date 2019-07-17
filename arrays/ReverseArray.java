package com.training.arrays;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		reverseArray(new int[]{4, 5, 8, 9, 10});
        
        System.out.println("-------------------------");
         
        reverseArray(new int[]{12, 9, 21, 17, 33, 7});
         
        System.out.println("-------------------------");
         
        reverseArray(new int[]{891, 569, 921, 187, 343, 476, 555});
		
	}
	
	public static void reverseArray(int[] inputArray) {
		int temp;
		System.out.println("Array Before Reverse : "+Arrays.toString(inputArray));
		for (int i =0; i<inputArray.length/2; i++) {
			temp = inputArray[i];
			inputArray[i] = inputArray[inputArray.length-1-i];
			inputArray[inputArray.length-1-i] = temp;
		}
		System.out.println("Array After Reverse : "+Arrays.toString(inputArray));
	}
}
