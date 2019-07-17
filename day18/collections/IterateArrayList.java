package com.training.day18.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IterateArrayList {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("Varun");
		al.add("Kumar");
		al.add("Reddy");
		al.add("Palvai");
		al.add(123);
		
		// 1. using for-each
		for (Object element:al) {
			System.out.println(element);
		}
		
		System.out.println("**********");
		
		// 2. using iterator
		Iterator iterator = al.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("**********");
		//3. using ListIterator from starting
		ListIterator li = al.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		
		// 4. using ListIterator from last
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
		
		

	}

}
