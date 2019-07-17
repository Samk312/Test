package com.training.day19.set;

import java.util.TreeSet;

public class ThirdTreeSet {

	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet();
		ts.add("one");
		ts.add("two");
		ts.add("three");
		ts.add("four");
		ts.add("five");
		ts.add("six");
		
		System.out.println(ts); 
		// Tree Set also won't print elements in the insertion order similar to HashSet 
		//but it will print the elements in the ascending order.
		
		// If we are using any object like int, char, String with Treeset, 
		// That class should implement Comparable interface.
		// if we are using primitive data types with TreeSet, primitives will be converted into equalent 
		// wrapper classes. Since each wrapper class is implemented comparable interface we can use 
		// primitive data types with TreeSet.
		
		ts.pollFirst();
		System.out.println(ts); 
		
		Student s3= new Student(2,"Uttej");
		Student s4= new Student(3,"Arshith");
		Student s5= new Student(1,"Kalyan");
		Student s6= new Student(4,"Varun");
		Student s7= new Student(3,"Arshith");
		Student s8= new Student(2,"Uttej");
		Student s9= new Student(4,"Varun");
		Student s10= new Student(1,"Kalyan");
		Student s1= new Student(1,"Kalyan");
		Student s2= new Student(1,"Kalyan");
		
		TreeSet objTree = new TreeSet();
		objTree.add(s1);
		objTree.add(s2);
		objTree.add(s3);
		objTree.add(s4);
		objTree.add(s5);
		objTree.add(s6);
		objTree.add(s7);
		objTree.add(s8);
		objTree.add(s9);
		objTree.add(s10);
		
		System.out.println(objTree);
		
		
		
		
	}

}
