package com.sraynitjsr.dsa;

import java.io.*;

public class MyInputOutput {
	public static void start() throws Exception {
		System.out.println("\nInside Input Output Class");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter A String");
		String name = br.readLine();
		
		System.out.println("Enter An Integer");
		int roll = Integer.parseInt(br.readLine());
		
		System.out.println("Enter Salary");
		float sal = Float.parseFloat(br.readLine());
		
		System.out.println("Entered Name is " + name);
		System.out.println("Entered Roll No is " + roll);
		System.out.println("Entered Salary is " + sal);
	}
}
