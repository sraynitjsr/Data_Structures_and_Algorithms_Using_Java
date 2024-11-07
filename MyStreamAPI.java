package com.sraynitjsr.streams;

import java.util.*;
import java.util.stream.Collectors;

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

        System.out.println("\n");

        numbers.stream()
               .sorted()
               .forEach(System.out::println);

        System.out.println("\n");

        int sum = numbers.stream()
                         .reduce(0, Integer::sum);
        System.out.println("Sum of numbers: " + sum);

        System.out.println("\n");

        List<Integer> evenNumbers = numbers.stream()
                                           .filter(num -> num % 2 == 0)
                                           .collect(Collectors.toList());
        System.out.println("Even numbers: " + evenNumbers);

        System.out.println("\n");

        List<Integer> duplicates = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        duplicates.stream()
                  .distinct()
                  .forEach(System.out::println);

        System.out.println("\n");

        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7)
        );
        listOfLists.stream()
                   .flatMap(List::stream)
                   .forEach(System.out::println);
    }
}
