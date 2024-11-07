package com.sraynitjsr.streams;

import java.util.Arrays;
import java.util.List;

public class MyStreamAPI {
    public static void start() {
        System.out.println("Stream API Using Java");

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        numbers.stream()
               .filter(num -> num % 2 == 0)
               .forEach(System.out::println);

        System.out.println("\n");

        numbers.stream()
               .map(num -> num * 2)
               .forEach(System.out::println);
    }
}
