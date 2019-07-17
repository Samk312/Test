package com.training.arrays;

import java.util.Arrays;

public class InsertIntoArray {
	
	public static void main(String[] args) {
		int a[] =  new int[10];
		a[0]=10;
		a[1]=10;
		a[2]=10;
		a[3]=10;
		a[4]=10;
		a[5]=10;
		a[6]=10;
		a[7]=10;
		a[8]=10;
		
		
		System.out.println("Before Insertion : " + Arrays.toString(a));
		a = insert(a, 2, 333);
		System.out.println("After Insertion : " + Arrays.toString(a));
	}
	
	public static int[] insert(int a[], int index, int value) {
		int arrayLength = a.length;
		if (index < arrayLength-1) {
			for (int i = arrayLength-2; i >= index-1; i--) {
				System.out.println("i : " + i);
				a[i+1] = a[i];
			}
			a[index-1] = value;
		}
		return a;
	}

}
