package com.sraynitjsr.arrays;

public class MyArrays {
	public static void start() {
		int myArray[] = new int[10];			
		for (int i = 0; i < 10; i++) {
			myArray[i] = i * i;
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.print(myArray[i] + " ");
		}
		System.out.println();
		
		String myString[][] = new String[5][5];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				myString[i][j] = Integer.toString(i*j);
			}
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(myString[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
