package com.training.day12.autoboxing;

import java.util.ArrayList;
import java.util.List;

public class AutoUnboxing {

	
	// Case 1 : sending Integer value to a method
	
	/*public static void myMethod(int num) { // case 1 - Starts
		System.out.println(num);
	}

	public static void main(String[] args) {
		// passed Integer objec, it would be
		// converted to int primitive  at Runtime

		myMethod(new Integer(2));
	}// Case1 -ends */ 
	
	// Case 2 :
	
	// 1.Assigning Integer to int: Autounboxing
	// 2.Assigning Long to long: Autounboxing
	

	/*
	public static void main(String[] args) { // case 2 - Starts
		
		Integer intObject = new Integer(100);
		int i=intObject;
		System.out.println(i);
		
	
		Long longObject = new Long(10L);
		long a = longObject;
		System.out.println(a);
		
		
	}// Case2 -ends */ 
	
	
	// Case 3 - Dealing with collections
	/*
	public static void main(String[] args) { // case 3 - Starts
		List<Integer> intList = new ArrayList<Integer>();
		int a=10;
		int b=20;
		int c=30;
		intList.add(a);
		intList.add(b);
		intList.add(c);
		System.out.println(intList);
		
		int firstValue = intList.get(0);
		int secondValue = intList.get(1);
		int thirdValue = intList.get(2);
		System.out.println(firstValue);
		System.out.println(secondValue);
		System.out.println(thirdValue);
		
		
		
	}// Case3 -ends */ 
	

}

//Note : For Every Case start and ends just remove /* and */
