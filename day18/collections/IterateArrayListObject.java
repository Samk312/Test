package com.training.day18.collections;
import java.util.ArrayList;

public class IterateArrayListObject {

	public static void main(String[] args) {
		
		
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
		
		ArrayList al = new ArrayList();
		al.add(s3);
		al.add(s4);
		al.add(s5);
		al.add(s6);
		al.add(s7);
		al.add(s8);
		al.add(s9);
		al.add(s10);
		al.add(s1);
		al.add(s2);
		
		System.out.println(al);
		/* 
		 //Scenario 1: With out overriding toString() and hashCode();
		 
		 
		for (Object element : al) {
			Student s = (Student) element;
			System.out.println(s);
		}
		*/
		/*Output:
		 	Student@677327b6
			Student@14ae5a5
			Student@7f31245a
			Student@6d6f6e28
			Student@135fbaa4
			Student@45ee12a7
			Student@330bedb4
			Student@2503dbd3
			Student@4b67cf4d
			Student@7ea987ac

		 */
		
		/*
		 // Scenario 2 : overriding toString()
		  for (Object element : al) {
			Student s = (Student) element;
			System.out.println(s);
		}
		*/
		
		/* 
		 // Using indexOf() to findout the string present in an arrayList
		ArrayList l = new ArrayList();
		l.add("Varun");
		l.add("uttej");
		l.add("kiran");
		l.add("reddy");
		l.add("palvai");
		
		System.out.println(l.indexOf("uttej"));
		
		*/
		
		/*
		 // using indexOf() for Objects .
		  * 1.it will print -1 if you won't  override equals() method as it will compare the memory addresses.
		  * 2.it will print the index if you override the equals() method.
		
		Student temp = new Student(1,"Kalyan");
		System.out.println(al.indexOf(temp));
		
		 */
	}

}
