package com.sraynitjsr.main;

import com.sraynitjsr.variables.*;
import com.sraynitjsr.inputout.*;
import com.sraynitjsr.streams.*;

public class MyMain {
    public static void main(String[] args) {
        System.out.println("Data Structures and Algorithms Using Java");
        
        System.out.println("Variables Package");
        MyVariables.start();

        System.out.println("Taking Input of Various Types and Output Them");
        MyInputOutput.start();

        System.out.println("Stream API Using Java");
        MyStreamAPI.start();
    }
}
