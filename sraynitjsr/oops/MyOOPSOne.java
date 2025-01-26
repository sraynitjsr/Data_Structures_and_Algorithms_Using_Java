package com.sraynitjsr.oops;

class A {
	public String displayA() {
		return "Inside A";
	}
}

class B extends A {
	public String displayB() {
		return "Inside B";
	}
	public String displayA() {
		return "Inside B But Returning A, Overriding";
	}
}

class C extends B {
	public String displayC() {
		return "Inside C";
	}
}

public class MyOOPSOne {
	public static void start() {
		A obj1 = new A();
		B obj2 = new B();
		C obj3 = new C();
		System.out.println(obj1.displayA());
		System.out.println(obj2.displayA() + "<>" + obj2.displayB());
		System.out.println(obj3.displayA() + "<>" + obj3.displayB() + "<>" + obj3.displayC());
	}
}
