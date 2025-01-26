package com.sraynitjsr.loops;

public class MyLoops {
	public static void start() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Counter: " + i);
		}
		System.out.println();

		String str = "My Long String";
		int j = 0;
		while (j < str.length()) {
			if (str.charAt(j) != ' ') {
				System.out.print(str.charAt(j));
			} else if (str.charAt(j) == ' ') {
				System.out.print("_");
			}
			j++;
		}
		System.out.println();
	}
}
