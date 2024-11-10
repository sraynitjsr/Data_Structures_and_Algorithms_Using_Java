package com.sraynitjsr.exceptionhandling;

import java.io.IOException;
import java.nio.file.*;
import java.sql.SQLException;

public class MyExceptionHandlingTwo {

    public static void start() {
        try {
            System.out.println("Outer try block started.");
            try {
                System.out.println("Inner try block started.");
                int[] arr = new int[2];
                arr[5] = 10;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Caught ArrayIndexOutOfBoundsException in inner block: " + e.getMessage());
                throw new IOException("IOException thrown from inner catch");
            } catch (IOException e) {
                System.out.println("Caught IOException in inner block: " + e.getMessage());
            }
        } catch (IOException e) {
            System.out.println("Caught IOException in outer block: " + e.getMessage());
        } finally {
            System.out.println("Finally block after nested try-catch.");
        }

        try {
            String str = "Hello";
            int num = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught a general exception: " + e.getMessage());
        }

        try {
            Path path = Paths.get("nonexistentfile.txt");
            Files.readString(path);
        } catch (IOException e) {
            System.out.println("Caught IOException while reading file: " + e.getMessage());
        }

        try {
            connectToDatabase();
        } catch (SQLException e) {
            System.out.println("Caught SQLException: " + e.getMessage());
        }

        try {
            processData("invalidData");
        } catch (CustomException e) {
            System.out.println("Caught custom exception: " + e.getMessage());
        }

        try {
            throw new CustomException("Custom exception with cause", new SQLException("Database error"));
        } catch (CustomException e) {
            System.out.println("Caught custom exception with cause: " + e.getMessage());
            System.out.println("Cause: " + e.getCause().getMessage());
        }
    }

    private static void connectToDatabase() throws SQLException {
        throw new SQLException("Unable to connect to the database.");
    }

    private static void processData(String data) throws CustomException {
        if ("invalidData".equals(data)) {
            throw new CustomException("Invalid data received");
        }
        System.out.println("Data processed successfully");
    }

    static class CustomException extends Exception {
        public CustomException(String message) {
            super(message);
        }

        public CustomException(String message, Throwable cause) {
            super(message, cause);
        }
    }
}
