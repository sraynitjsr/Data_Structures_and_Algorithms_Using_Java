package com.sraynitjsr.dsa;

import java.util.*;

public class MyArrayList {
	public static void start() {
		System.out.println("\nInside ArrayList Class");
		
		ArrayList<Integer> myList = new ArrayList<>();
		myList.add(2020);
		myList.add(3546);
		myList.add(4635);
		myList.add(4040);
		myList.add(100100);
		
		System.out.println("Current List is");
		myList.forEach(val -> System.out.println("Value " + val));
		
		System.out.println("\nDeleting Data 2020\n");
		myList.remove((Object)2020);
		
		System.out.println("Current List is");
		myList.forEach(val -> System.out.println("Value " + val));
		
		System.out.println("\nDeleting Value at Index 1\n");
		myList.remove(1);
		
		System.out.println("Current List is");
		myList.forEach(val -> System.out.println("Value " + val));
	}
}
