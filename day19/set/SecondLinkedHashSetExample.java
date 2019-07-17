package com.training.day19.set;

import java.util.LinkedHashSet;

public class SecondLinkedHashSetExample {

	public static void main(String[] args) {
		LinkedHashSet ls = new LinkedHashSet();
		ls.add("one");
		ls.add("two");
		ls.add("three");
		ls.add("four");
		ls.add("five");
		ls.add("six");
		ls.add("seven");
		System.out.println(ls); // LinkedHashSet will print the elements in the order wise.
		
		LinkedHashSet sub = new LinkedHashSet();
		sub.add("four");
		sub.add("eight");
		sub.add("seven");
		sub.add("ten");
		
		System.out.println(sub);
		
		//ls.retainAll(sub);
		
		//System.out.println(ls);
		
		sub.retainAll(ls);
		System.out.println(sub);
	}

}
