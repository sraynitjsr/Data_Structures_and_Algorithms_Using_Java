package com.sraynitjsr.streams;

import java.util.*;
import java.util.stream.Collectors;

public class MyStreamAPI {
    
    public static void start() {
        System.out.println("Stream API Using Java");

        // 1. Filter Even Numbers
        filterEvenNumbers();
        
        // 2. Double Each Number
        doubleNumbers();
        
        // 3. Sort Numbers
        sortNumbers();
        
        // 4. Sum of Numbers
        sumNumbers();
        
        // 5. Collect Even Numbers
        collectEvenNumbers();
        
        // 6. Remove Duplicates
        removeDuplicates();
        
        // 7. Flatten List of Lists
        flattenListOfLists();
        
        // 8. Find Max Value in a List
        findMaxValue();
        
        // 9. Check If Any Number Is Divisible by 3
        checkDivisibleByThree();
        
        // 10. Count Occurrences of Each Element
        countOccurrences();
        
        // 11. Find First Matching Element
        findFirstMatchingElement();
    }

    // 1. Filter Even Numbers
    private static void filterEvenNumbers() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        numbers.stream()
               .filter(num -> num % 2 == 0)
               .forEach(System.out::println);
        System.out.println("\n");
    }

    // 2. Double Each Number
    private static void doubleNumbers() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        numbers.stream()
               .map(num -> num * 2)
               .forEach(System.out::println);
        System.out.println("\n");
    }

    // 3. Sort Numbers
    private static void sortNumbers() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        numbers.stream()
               .sorted()
               .forEach(System.out::println);
        System.out.println("\n");
    }

    // 4. Sum of Numbers
    private static void sumNumbers() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int sum = numbers.stream()
                         .reduce(0, Integer::sum);
        System.out.println("Sum of numbers: " + sum);
        System.out.println("\n");
    }

    // 5. Collect Even Numbers
    private static void collectEvenNumbers() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> evenNumbers = numbers.stream()
                                           .filter(num -> num % 2 == 0)
                                           .collect(Collectors.toList());
        System.out.println("Even numbers: " + evenNumbers);
        System.out.println("\n");
    }

    // 6. Remove Duplicates
    private static void removeDuplicates() {
        List<Integer> duplicates = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        duplicates.stream()
                  .distinct()
                  .forEach(System.out::println);
        System.out.println("\n");
    }

    // 7. Flatten List of Lists
    private static void flattenListOfLists() {
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7)
        );
        listOfLists.stream()
                   .flatMap(List::stream)
                   .forEach(System.out::println);
        System.out.println("\n");
    }

    // 8. Find Max Value in a List
    private static void findMaxValue() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Optional<Integer> max = numbers.stream()
                                       .max(Integer::compareTo);
        max.ifPresent(value -> System.out.println("Max value: " + value));
        System.out.println("\n");
    }

    // 9. Check If Any Number is Divisible by 3
    private static void checkDivisibleByThree() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        boolean anyDivisibleByThree = numbers.stream()
                                             .anyMatch(num -> num % 3 == 0);
        System.out.println("Any number divisible by 3? " + anyDivisibleByThree);
        System.out.println("\n");
    }

    // 10. Count Occurrences of Each Element
    private static void countOccurrences() {
        List<String> words = Arrays.asList("apple", "banana", "apple", "cherry", "banana", "banana");
        Map<String, Long> wordCount = words.stream()
                                           .collect(Collectors.groupingBy(word -> word, Collectors.counting()));
        System.out.println("Word Occurrences: " + wordCount);
        System.out.println("\n");
    }

    // 11. Find First Matching Element
    private static void findFirstMatchingElement() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Optional<Integer> firstMatch = numbers.stream()
                                              .filter(num -> num > 5)
                                              .findFirst();
        firstMatch.ifPresent(num -> System.out.println("First number greater than 5: " + num));
        System.out.println("\n");
    }
}
