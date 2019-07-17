package com.training.day19.set;

import java.util.HashSet;

public class FirstHashsetExample {

	public static void main(String[] args) {
		
		HashSet hset = new HashSet();

	      // Adding elements to the HashSet -- insertion order is not preserved
	      hset.add("Apple");
	      hset.add("Mango");
	      hset.add("Grapes");
	      hset.add("Orange");
	      hset.add("Fig");
	      System.out.println(hset);
	      //Addition of duplicate elements -- it won't allow duplicate values
	      hset.add("Apple");
	      hset.add("Mango");
	      System.out.println(hset);
	      //Addition of null values -- it will allow only one null value.
	      hset.add(null);
	      hset.add(null);

	      //Displaying HashSet elements
	      System.out.println(hset); // 
	      
	      // using addAll()
	      HashSet subSet = new HashSet();
	      subSet.add("rose");
	      subSet.add("lilly");
	      subSet.add("jasmin");
	      
	      hset.addAll(subSet);
	      System.out.println(hset);
	      //hset.removeAll(subSet);
	      //hset.remove("lilly");
	      System.out.println(hset);
	      System.out.println(hset.contains("lilly"));
	      System.out.println(hset.contains("123"));
	      System.out.println(hset.containsAll(subSet));
	}

}
