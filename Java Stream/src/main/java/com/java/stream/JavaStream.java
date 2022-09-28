package com.java.stream;

import java.util.Arrays;
import java.util.List;

public class JavaStream {
    public static void main(String[] args) {
        System.out.println("Java Stream 8");
        List<String> name = Arrays.asList("Anil", "Sunil", "Akshay", "Nikhil", "Aarav");
        List<String> filteredList = name.stream().filter(n -> n.startsWith("A")).toList();
//        System.out.print(filteredList);
//        filteredList.forEach(System.out::println);

        String na = name.stream()
                .filter(n -> "Aarav".equals("Aarav"))
                .findFirst()
                .orElse(null);

        System.out.println(na);
    }
}
