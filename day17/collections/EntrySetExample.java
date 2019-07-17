package com.training.day17.collections;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EntrySetExample {
	
	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
		
		for (int i=1; i<=10000000; i++) {
			map.put(i, "String" + i);
		}
		
		Date d1 = new Date();
		System.out.println(d1.getTime());
		for (Entry<Integer, String> entry : map.entrySet()) {
			Integer key = entry.getKey();
			String value = entry.getValue();
		}
		Date d2 = new Date();
		System.out.println(d2.getTime());
		
		/*1463479288711
		  1463479289794
		  diff = 1083
		*/
		
		Date d3 = new Date();
		System.out.println(d3.getTime());
		for (Integer key : map.keySet()) {
			String value = map.get(key);
		}
		Date d4 = new Date();
		System.out.println(d4.getTime());
		/*
		1463479289794
		1463479290183
		diff = 389
		*/
	}

}
