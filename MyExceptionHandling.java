package com.sraynitjsr.exceptionhandling;

public class MyExceptionHandling {
    public static void start() {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero - " + e.getMessage());
        }

        try {
            int[] arr = new int[5];
            arr[10] = 50;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds - " + e.getMessage());
        }

        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Error: Null pointer encountered - " + e.getMessage());
        }

        try {
            String invalidNumber = "abc";
            int num = Integer.parseInt(invalidNumber);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format - " + e.getMessage());
        }

        try {
            String str = "123a";
            int number = Integer.parseInt(str);
            int[] arr = new int[3];
            arr[10] = 5;
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        }

        try {
            int[] arr = new int[2];
            arr[1] = 10;
            System.out.println("Array value at index 1: " + arr[1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds - " + e.getMessage());
        } finally {
            System.out.println("This block is always executed (finally).");
        }

        try {
            throw new CustomException("This is a custom exception!");
        } catch (CustomException e) {
            System.out.println("Custom Exception caught: " + e.getMessage());
        }
    }

    static class CustomException extends Exception {
        public CustomException(String message) {
            super(message);
        }
    }
}
