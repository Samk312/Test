package com.training.day11.loops;

public class ElevenContinue {
	
	public static void main(String[] args) {
		for (int i=0; i<20; i++) {
			if (i == 15) {
				continue;
			}
			System.out.println("i : "+i);
		}
	}

}
