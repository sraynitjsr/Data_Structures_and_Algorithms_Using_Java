package com.sraynitjsr.inputout;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class MyInputOutput {
    public static void start() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            writer.write("Enter an integer:\n");
            writer.flush();
            int myInt = Integer.parseInt(reader.readLine());

            writer.write("Enter a double:\n");
            writer.flush();
            double myDouble = Double.parseDouble(reader.readLine());

            writer.write("Enter a boolean:\n");
            writer.flush();
            boolean myBoolean = Boolean.parseBoolean(reader.readLine());

            writer.write("Enter a character:\n");
            writer.flush();
            char myChar = reader.readLine().charAt(0);

            writer.write("Enter a byte:\n");
            writer.flush();
            byte myByte = Byte.parseByte(reader.readLine());

            writer.write("Enter a short:\n");
            writer.flush();
            short myShort = Short.parseShort(reader.readLine());

            writer.write("Enter a long:\n");
            writer.flush();
            long myLong = Long.parseLong(reader.readLine());

            writer.write("Enter a float:\n");
            writer.flush();
            float myFloat = Float.parseFloat(reader.readLine());

            writer.write("Enter a string:\n");
            writer.flush();
            String myString = reader.readLine();

            writer.write("You entered:\n");
            writer.write("myInt: " + myInt + "\n");
            writer.write("myDouble: " + myDouble + "\n");
            writer.write("myBoolean: " + myBoolean + "\n");
            writer.write("myChar: " + myChar + "\n");
            writer.write("myByte: " + myByte + "\n");
            writer.write("myShort: " + myShort + "\n");
            writer.write("myLong: " + myLong + "\n");
            writer.write("myFloat: " + myFloat + "\n");
            writer.write("myString: " + myString + "\n");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
