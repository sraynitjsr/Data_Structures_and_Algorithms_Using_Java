package com.sraynitjsr.basics;

public class MyBasics {
	public static void start() {
		int myInt = 10;
		String myStr = "Hello World!";
		char myChar = 'A';
		float myFloat = 10.25f;
		System.out.println(myInt + " " + myStr + " " + myChar + " " + myFloat);
		
		System.out.println((int)myChar + " is the ASCII of " + myChar);
		
		System.out.println(myStr + " is of length " + myStr.length());
		
		String str = "123";
		System.out.println(Integer.parseInt(str));
		
		int number = 321;
		System.out.println(Integer.toString(number));
	}
}
