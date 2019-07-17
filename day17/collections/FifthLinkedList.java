package com.training.day17.collections;

import java.util.LinkedList;
import java.util.List;

public class FifthLinkedList {
	
	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		//1.Adding elements to the LinkedList
	     list.add("Harry");
	     list.add("Ajeet");
	     list.add("Tom");
	     list.add("Steve");

	     // Displaying LinkedList elements
	     System.out.println("LinkedList elements: "+list); //[Harry, Ajeet, Tom, Steve]
	 
	     // Adding another element
	     list.add("Kate");
	 
	     // Displaying LinkedList elements after add(E e)
	     System.out.println("LinkedList elements: "+list); //[Harry, Ajeet, Tom, Steve, Kate]
	     
	     
	  // 2.Adding new Element at 4TH Position 
	     list.add(3, "NEW ELEMENT");
	     System.out.println("LinkedList elements After Addition:" + list);//[Harry, Ajeet, Tom, NEW ELEMENT, Steve, Kate]
	     
	     // 3. Adding elements at first and last of the list
	     list.addFirst("first"); // list.offerFirst("first")
	     list.addLast("last");//list.offerLast("last")
	     System.out.println("LinkedList elements:" + list);//[first, Harry, Ajeet, Tom, NEW ELEMENT, Steve, Kate, last]
	     
	     // 4. removing first and last elements from LinkedList
	     list.removeFirst(); // list.offerFirst("first")
	     list.removeLast();//list.offerLast("last")
	     System.out.println("\nList Elements after Remove:" + list); //[Harry, Ajeet, Tom, NEW ELEMENT, Steve, Kate]
	     
	     // 5. removing element from sepecified index
	     list.remove(3);
	     System.out.println("\nList Elements after Remove:" + list); //[Harry, Ajeet, Tom, Steve, Kate]
	     
	     // 6. removing first occurenece of an element using remove() or removeFirst() ore removeFirstOccurence()
	     
	     list.add("Harry");
	     
	     System.out.println(list);
	     
	     list.remove("Harry"); // list.rempoveFirst("Harry") or list.removeFirstOccurence("Harry")
	     System.out.println("List Elements after Remove:" + list);
	     
	    /* //7. removign all elements of linked list
	     
	     list.clear();
	     System.out.println("elements after removal" + list);
	     */
	     
	     // 8. append all elements of linked list to another list
	     
	     LinkedList subList = new LinkedList();
	     subList.add("One");
	     subList.add("Two");
	     subList.add("Three");
	     subList.add("Four");
	     
	     list.addAll(subList);
	     System.out.println("list after adding sublist:" + list);
	     
	}

}
