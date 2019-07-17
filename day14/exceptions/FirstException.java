package com.training.day14.exceptions;

public class FirstException {
	
	public static void main(String[] args) {
		
		//Case 1:  Without Exception Handling
		/*
		
		int a = 20;
		int b = 0;
		int c = a/b; // RTE , /by zero 
		System.out.println("HelloWorld");
		//Note : in the above program we will get RTE at int c=a/b; 
		//hence "HelloWorld" will not get printed. Here due to one issue we are 
		//stopping other statements to execute, to avoid this situation we 
		// will handle the exception. 
		
		*/
		// Case 2 : With Exception Handling using try/catch
		/*
		int a = 20;
		int b = 0;
		try {
			int c = a/b;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception occured , Divide by zero");
		}
		System.out.println("HelloWorld");
		*/
		// Note : In the above program we handled the exeption and hence we can exeute the statements after int c=a/b . 
		//that is we can able to print "HelloWorld".
		
	}

}
