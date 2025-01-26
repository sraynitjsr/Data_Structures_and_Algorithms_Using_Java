package com.sraynitjsr.oops;

interface Student {
	String SCHOOL_NAME = "Umakanta Academy";
	int MAX_AGE = 18;

	String getDetails();

	default void printDetails() {
		System.out.println("Student details: " + getDetails() + ", School: " + SCHOOL_NAME);
	}

	static void showGreeting() {
		System.out.println("Welcome to " + SCHOOL_NAME);
	}
}

class StudentImpl implements Student {
	private String name;
	private int age;

	public StudentImpl(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String getDetails() {
		return "Name: " + name + ", Age: " + age + " School Name" + SCHOOL_NAME;
	}
}

public class MyOOPSTwo {
	public static void start() {
		Student.showGreeting();
		StudentImpl obj = new StudentImpl("Subhradeep Ray", 17);
		obj.printDetails();
	}
}
