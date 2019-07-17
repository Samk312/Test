package com.training.day21.maps;

import java.util.HashMap;

public class SecondRetrieve {

	public static void main(String[] args) {
		
		HashMap hmap = new HashMap();
		
		hmap.put(3, "Three");
		hmap.put(8, "eight");
		hmap.put(2, "Two");
		hmap.put(6, "Six");
		hmap.put(1, "One");
		hmap.put(9, "Nine");
		hmap.put(21,"TwentyOne");
		hmap.put(5, "Five");
		hmap.put(10, "Ten");
		hmap.put(4, "Four");
		
		System.out.println("HashMap : " + hmap);
		
		System.out.println(hmap.get(3)); // if 3 is present then it will retrieve value , else it will print null

		System.out.println(hmap.containsKey(24));
		System.out.println(hmap.containsKey(21));
		
		System.out.println(hmap.keySet());
		
		for(Object i : hmap.keySet()) {
			int key = (Integer)i;
			String value = (String)hmap.get(key);
			System.out.println( "Key : " + key + " & value : " + value);
		}
		
		for (Object value : hmap.values()) {
			String actualValue = (String)value;
			System.out.println(actualValue);
		}
		
	}

}
