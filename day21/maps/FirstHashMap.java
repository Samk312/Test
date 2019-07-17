package com.training.day21.maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class FirstHashMap {
	
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
		hmap.put(1, "thoursand");
		hmap.put(10, "Ten");
		hmap.put(4, "Four");
		
		System.out.println("HashMap : " + hmap);
		
		LinkedHashMap lmap = new LinkedHashMap();
		lmap.put(3, "Three");
		lmap.put(8, "eight");
		lmap.put(2, "Two");
		lmap.put(6, "Six");
		lmap.put(1, "One");
		lmap.put(9, "Nine");
		lmap.put(21,"TwentyOne");
		lmap.put(5, "Five");
		lmap.put(10, "Ten");
		lmap.put(1, "thoursand");
		lmap.put(4, "Four");
		
		System.out.println("Linked HashMap : " + lmap);
		
		
		TreeMap tmap = new TreeMap();
		
		tmap.put(3, "Three");
		tmap.put(8, "eight");
		tmap.put(2, "Two");
		tmap.put(21,"TwentyOne");
		tmap.put(6, "Six");
		tmap.put(1, "One");
		tmap.put(9, "Nine");
		tmap.put(1000, "Five");
		tmap.put(1000000000, "Ten");
		tmap.put(4, "Four");
		tmap.put(1, "thoursand");
		
		System.out.println("Tree Map : " + tmap);
		
		HashMap hmap1 = new HashMap();
		
		hmap1.put("Three", "Three");
		hmap1.put("Eight", "eight");
		hmap1.put("Two", "Two");
		hmap1.put("Six", "Six");
		hmap1.put("One", "One");
		hmap1.put("Nine", "Nine");
		hmap1.put("TwentyOne","TwentyOne");
		hmap1.put("Five", "Five");
		hmap1.put("Ten", "Ten");
		hmap1.put("Four", "Four");
		
		System.out.println("HashMap : " + hmap1);
		
		
		LinkedHashMap lmap1 = new LinkedHashMap();
		
		lmap1.put("Three", "Three");
		lmap1.put("Eight", "eight");
		lmap1.put("Two", "Two");
		lmap1.put("Six", "Six");
		lmap1.put("One", "One");
		lmap1.put("Nine", "Nine");
		lmap1.put("TwentyOne","TwentyOne");
		lmap1.put("Five", "Five");
		lmap1.put("Ten", "Ten");
		lmap1.put("Four", "Four");
		
		System.out.println("LinkedHashMap : " + lmap1);
		
		
		
		
		TreeMap tmap1 = new TreeMap();
		
		tmap1.put("Three", "Three");
		tmap1.put("Eight", "eight");
		tmap1.put("Two", "Two");
		tmap1.put("Six", "Six");
		tmap1.put("One", "One");
		tmap1.put("Nine", "Nine");
		tmap1.put("TwentyOne","TwentyOne");
		tmap1.put("Five", "Five");
		tmap1.put("Ten", "Ten");
		tmap1.put("Four", "Four");
		
		System.out.println("TreeMap : " + tmap1);
		
		
		
		
		
	}

}
