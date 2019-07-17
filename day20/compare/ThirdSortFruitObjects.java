package com.training.day20.compare;

import java.util.Arrays;

public class ThirdSortFruitObjects {

	public static void main(String[] args) {
		Fruit[] fruits = new Fruit[4];
		
		Fruit pineappale = new Fruit("Pineapple", "Pineapple description",20); 
		Fruit apple = new Fruit("Apple", "Apple description",100); 
		Fruit orange = new Fruit("Orange", "Orange description",30); 
		Fruit banana = new Fruit("Banana", "Banana description",90); 
		
		fruits[0]=pineappale;
		fruits[1]=apple;
		fruits[2]=orange;
		fruits[3]=banana;

//		System.out.println("Before Sorting :");
//		
//		for(Fruit fruit:fruits) {
//			System.out.println(fruit);
//		}
		// 1. with out implementing comparable interface in Fruit class
		
		// Since Arrays.sort() will accept the object which should implement comparable interface,
		// since we have not implemented we will get run time error.
		 	Arrays.sort(fruits);
		  	for(Fruit fruit:fruits) {
				System.out.println(fruit);
			}
		
		System.out.println("*********");
		
		//2. Implement comparable interface in Fruit class and compare based on fruit name
		// comment the quantiy code in compareTo()
		/*
			Arrays.sort(fruits);
			System.out.println("After Sorting  Based on fruitName:");
			for(Fruit fruit:fruits) {
				System.out.println(fruit);
			}
		*/

		//3. Implement comparable interface in Fruit class and compare based on quantiy
		// comment the fruitName code in compareTo()
		/*
			Arrays.sort(fruits);
			System.out.println("After Sorting  Based on fruitName:");
			for(Fruit fruit:fruits) {
				System.out.println(fruit);
			}
		*/
		
	}

}
