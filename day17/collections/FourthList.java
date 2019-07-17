package com.training.day17.collections;

import java.util.ArrayList;
import java.util.List;

public class FourthList {
	
public static void main(String[] args) {
	List li = new ArrayList();
	
	System.out.println(li);
	// 1. adding elements to the list. In list, insertion order is preserved , List will allow duplicate elements.
	li.add("Varun");
	li.add("Kumar");
	li.add("Reddy");
	li.add("Reddy");
	System.out.println(li); // [Varun, Kumar, Reddy, Reddy]
	
	// 2.Adding the element at the specified index.
	li.add(1, "kiran");
	System.out.println(li); // [Varun, kiran, Kumar, Reddy, Reddy]
	
	// 3.we can add any object to the list becuase add() method accepts Object datatype.
	li.add(123L);
	System.out.println(li); // [Varun, kiran, Kumar, Reddy, Reddy, 123]
	
	// 4. Finding the index of string which is present in the list.
	//    If the specified value not present then indexOf() method will return -1.
	System.out.println(li.indexOf("Reddy")); // 3
	System.out.println(li.indexOf("tarun")); // -1
	
	// 5. If same value is present multiple times in a list , 
	//     we can find out the index which is present at last using lastIndexOf() method
	System.out.println(li.lastIndexOf("Reddy")); // 4
	
	// 5. removing the element at the specified index
	li.remove(3);
	System.out.println(li);//[Varun, kiran, Kumar, Reddy, 123]
	li.remove(1);
	System.out.println(li);//[Varun, Kumar, Reddy, 123]
	
	// 6. Replacing the value present at specified index with new value.
	// setting the 3rd index value with some other value (It is like replacing the value
	//existing in that index with new value)
	li.set(3, "palvai");
	System.out.println(li); // [Varun, Kumar, Reddy, palvai]
	
	// 7. Adding list to an existing list.
	List subList = new ArrayList();
	subList.add("Rajesh");
	subList.add("Reddy");
	
	System.out.println(subList);//[Rajesh, Reddy]
	
	li.addAll(subList);
	System.out.println(li); //[Varun, Kumar, Reddy, palvai, Rajesh, Reddy]
	
	
	// 8. Removing the list from an existing list, It is not mandatory that the values present 
	//in the child list values
	//    should be in the same order in the parent list.
	
	/* //In the same order 
	 li.removeAll(subList);
	 System.out.println(li); // [Varun, Kumar, palvai]  */
	
	/* // In any order
	List removeList = new ArrayList();
	removeList.add("Kumar");
	removeList.add("Rajesh");
	removeList.add("Reddy");
	li.removeAll(removeList);
	System.out.println(li); // [Varun, palvai] */
	
	//9. retainAll -- It is like interjection of li & subList
	/*
	subList.add("Kiran");
	subList.add("Varun");
	System.out.println(li); // [Varun, Kumar, Reddy, palvai, Rajesh, Reddy]
	System.out.println(subList); // [Rajesh, Reddy, Kiran, Varun]
	li.retainAll(subList);
	System.out.println(li); // [Varun, Reddy, Rajesh, Reddy]
	*/
	/*
	subList.add("Kiran");
	subList.add("Varun");
	System.out.println(li);
	System.out.println(subList);
	subList.retainAll(li); 
	System.out.println(subList);//[Rajesh, Reddy, Varun]
	*/
	
	
	// 10. To check size of the list
	/*
	System.out.println(li.size()); // 6
	System.out.println(subList.size());//3
	
	*/
	
	/*
	//11. It allows null values to be added 
	li.add(null);
	li.add(null);
	
	System.out.println(li);
	*/
	
	//12. To get element present at index
	System.out.println(li.get(2));
	
}
	
}
