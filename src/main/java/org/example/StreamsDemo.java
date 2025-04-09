package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice","Bob","Charlie");
        List<String> upperCase  = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(upperCase);

    }
}
