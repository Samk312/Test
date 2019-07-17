package com.training.day11.loops;

public class TenBreak {
	
	public static void main(String[] args) {
		
		/*
		// Case 1 : Inside one loop if condition matches
		
		for (int i=1; i<=20; i++) {
				if (i == 10) {
					break;
				}
			System.out.print("i : " +i + " \t");
		}
		
		// Note : It will stop printing values from 10 onwards.
		// o/p: i : 1 	i : 2 	i : 3 	i : 4 	i : 5 	i : 6 	i : 7 	i : 8 	i : 9 	
		*/
		
		/*
		// Case 2 : Inside two loops if outer loop variable condition matches
		for (int i=0; i<20; i++) {
			for (int j = 0; j<=5; j++) {
				if (i == 10) {
					break;
				}
				System.out.println("i : " + i + ", j : " + j);
			}
			
		}
		*/
		// Note : It will stop printing the values where 10 is used.
		
		// Case 3 : Inside two loops if inner loop variable condition matches
				for (int i=0; i<20; i++) {
					for (int j = 0; j<=5; j++) {
						if (j == 3) {
							break;
						}
						System.out.println("i : " + i + ", j : " + j);
					}
					
				}
				// Note : It will stop printing the immediate above loop 
				//		  where j value is 3 is used and it won't execute remaining lines.
				// It means it will skip the current loop on which it is running.
		
	}

}
/*
i :0
i :1
i :2
i :3
i :4
i :5
i :6
i :7
i :8
i :9
*/