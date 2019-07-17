package com.training.day4.abstractclass;

public abstract class Five {
	
	int i;
	void test() {
		System.out.println("Inside test()");
		
	}

}

/* We can declare a concrete class as abstract . By doing this we are restricting
to create object to this class.
Class can't be 100% abstract because every class is having atleast one 
constructor in it and constructor is a concrete method.class*/