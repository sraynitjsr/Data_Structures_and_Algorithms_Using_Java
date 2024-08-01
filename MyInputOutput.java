package com.sraynitjsr.inputout;

import java.util.Scanner;

public class MyInputOutput {
    public static void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer:");
        int myInt = scanner.nextInt();

        System.out.println("Enter a double:");
        double myDouble = scanner.nextDouble();

        System.out.println("Enter a boolean:");
        boolean myBoolean = scanner.nextBoolean();

        System.out.println("Enter a character:");
        char myChar = scanner.next().charAt(0);

        System.out.println("Enter a byte:");
        byte myByte = scanner.nextByte();

        System.out.println("Enter a short:");
        short myShort = scanner.nextShort();

        System.out.println("Enter a long:");
        long myLong = scanner.nextLong();

        System.out.println("Enter a float:");
        float myFloat = scanner.nextFloat();

        scanner.nextLine();

        System.out.println("Enter a string:");
        String myString = scanner.nextLine();

        System.out.println("You entered:");
        System.out.println("myInt: " + myInt);
        System.out.println("myDouble: " + myDouble);
        System.out.println("myBoolean: " + myBoolean);
        System.out.println("myChar: " + myChar);
        System.out.println("myByte: " + myByte);
        System.out.println("myShort: " + myShort);
        System.out.println("myLong: " + myLong);
        System.out.println("myFloat: " + myFloat);
        System.out.println("myString: " + myString);

        scanner.close();
    }
}
