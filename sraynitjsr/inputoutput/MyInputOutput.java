package com.sraynitjsr.inputoutput;

import java.util.Scanner;

public class MyInputOutput {
	public static void start() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter A String:");
		String str = sc.next();
		System.out.println("Entered String is: " + str);

		System.out.println("Enter An Integer:");
		int number = Integer.parseInt(sc.next());
		System.out.println("Entered Integer is: " + number);

		System.out.println("Enter A Fractional Number:");
		float fraction = Float.parseFloat(sc.next());
		System.out.println("Entered Float Number is: " + fraction);

		System.out.println("Enter A Character:");
		String charInput = sc.next();
		char character = charInput.charAt(0);
		System.out.println("Entered Character is: " + character);

		sc.close();
	}
}
