package com.training.day12.autoboxing;

import java.util.ArrayList;
import java.util.List;

public class AutoBoxing {

	
	// Case 1 : sending int value to a method
	
	/*public static void myMethod(Integer num) { // case 1 - Starts
		System.out.println(num);
	}

	public static void main(String[] args) {
		// passed int (primitive type), it would be
		// converted to Integer object at Runtime

		myMethod(2);
	}// Case1 -ends */ 
	
	// Case 2 :
	
	// 1.Assigning int to Integer: Autoboxing
	// 2.Assigning long to Long: Autoboxing
	

	/*
	public static void main(String[] args) { // case 2 - Starts
		int i=100;
		Integer intObject = i;
		System.out.println(intObject);
		
		long a = 10L;
		Long longObject = a;
		System.out.println(longObject);
		
		
	}// Case2 -ends */ 
	
	
	// Case 3 - Dealing with collections
	/*
	public static void main(String[] args) { // case 3 - Starts
		List<Integer> intList = new ArrayList<Integer>();
		System.out.println(intList);
		int a=10;
		int b=20;
		int c=30;
		intList.add(a);
		intList.add(b);
		intList.add(c);
		System.out.println(intList);
		
		
	}// Case3 -ends */ 
	
	

}

//Note : For Every Case start and ends just remove /* and */