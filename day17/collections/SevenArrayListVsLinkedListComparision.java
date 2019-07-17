package com.training.day17.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class SevenArrayListVsLinkedListComparision {
	
	public static void main(String[] args) {
		
		ArrayList arrayList = new ArrayList();
		LinkedList linkedList = new LinkedList();
		
		// 1. comparision using add () 
		// ArrayList add
		long startTime = System.nanoTime();
		 
		for (int i = 0; i < 100000; i++) {
			arrayList.add(i);
		}
		
		long endTime = System.nanoTime();
		long duration = endTime - startTime;
		System.out.println("ArrayList add:  " + duration);
		 
		// LinkedList add
		startTime = System.nanoTime();
		 
		for (int i = 0; i < 100000; i++) {
			linkedList.add(i);
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("LinkedList add: " + duration);
		
		/*
		  OutPut : 
		  	ArrayList add:  16302000
		  	LinkedList add: 13626000

		  Observation : add() of ArrayList is taking more time than LinkedList, So its proved that 
		  Linked List will be more useful if you are going for frequent insertion . 
		  But since the time taken for ArrayList and LinkedList is not that much difference, 
		  We will prefer ArrayList while doing insertions.
		 */
		
		// 2. Comparision using get ()
		// ArrayList get
		startTime = System.nanoTime();
		 
		for (int i = 0; i < 10000; i++) {
			arrayList.get(i);
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("ArrayList get:  " + duration);
		 
		// LinkedList get
		startTime = System.nanoTime();
		 
		for (int i = 0; i < 10000; i++) {
			linkedList.get(i);
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("LinkedList get: " + duration);
		 
		/*
		    OutPut :
		 	ArrayList get:  3795000
			LinkedList get: 139708000
			Observation : So its proved that Arraylist is mainly for retrieval purpose Since internally 
			it uses index based retrieval , its taking less time compared to LinkedList
		 */
		//3. Comparision using remove ()
		 
		// ArrayList remove
		startTime = System.nanoTime();
		 
		for (int i = 9999; i >=0; i--) {
			arrayList.remove(i);
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("ArrayList remove:  " + duration);
		 
		 
		 
		// LinkedList remove
		startTime = System.nanoTime();
		 
		for (int i = 9999; i >=0; i--) {
			linkedList.remove(i);
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		
		System.out.println("LinkedList remove: " + duration);
		
		/* 
		 Output : 
		  ArrayList remove:  368173000
		  LinkedList remove: 172223000
		  Observation : Since Linked List uses DoubleLinkedList, it will be easy for deletion 
		  as just we need to modify the next node address in the first node next address location.
		 * 
		 */
		
		//Conclusion:
		// 1. We will go for ArrayList , if we have frequent retrieval operation as it uses Arrays 
		// internally which are of indexes
		// 2. We will go for LinkedList, if we have frequent requirement of adding/deleting operation as it
		// uses DoublyLinkedList, we just need to modify the addresses of two nodes.
		 
	}

}
