package com.training.day11.loops;

public class ThirteenDisplayPrimenumbers {

	public static void main(String[] args) {
		
		int i = 100;
		StringBuffer sb = new StringBuffer();
		sb.append("Prime no's till " + i + " are : ");
		for (int j=2; j <= 100; j++) {
			int temp;
			boolean isPrime = true;
			for (int k= 2; k<=j/2; k++) {
				temp = j%k;
				if (temp == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				sb.append(j + " ");
			}
		}
		System.out.println(sb.toString());
	}

}
