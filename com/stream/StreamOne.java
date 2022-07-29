package com.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class StreamOne {
    public static void main(String[] args) {
//        Stream<String> string = Stream.empty();
//        System.out.println(string.toList());
//        Collection<String> collection = Arrays.asList("a", "b", "c");
//        Stream<String> streamOfCollection = collection.stream().filter(ele -> ele.equals("b"));
//        System.out.println(streamOfCollection.toList());
//        Stream<String> streamBuilder =
//                Stream.<String>builder().add("a").add("b").add("c").build();
//        System.out.println(streamBuilder.toList());
//
//        Stream<String> streamGenerated =
//                Stream.generate(() -> "element").limit(10);
//        System.out.println(streamGenerated.toList());
//
//        Stream<Integer> streamIterated = Stream.iterate(40, n -> n + 2).limit(5);
//        System.out.println(streamIterated.toList());
//
//
//        List<String> elements = Stream.of("a", "b", "c").filter(element -> element.contains("d"))
//                        .collect(Collectors.toList());
//        Optional<String> anyElement = elements.stream().findAny();
//        Optional<String> firstElement = elements.stream().findFirst();
//
//        System.out.println(elements.stream().toList());
//        System.out.println(anyElement.stream().toList());
//        System.out.println(firstElement.stream().toList());
//
//        Stream<String> onceModifiedStream =
//                Stream.of("abcd", "bbcd", "cbcd").skip(1);
//
//        System.out.println(onceModifiedStream.toList());

        ArrayList<String> list = new ArrayList<>();
        list.add("One");
        list.add("OneAndOnly");
        list.add("Derek");
        list.add("Change");
        list.add("factory");
        list.add("justBefore");
        list.add("Italy");
        list.add("Italy");
        list.add("Thursday");
        list.add("");
        list.add("");

        List<String> streams = list.stream().filter(l -> l.contains("u")).toList();
        System.out.println(streams);
        Stream<String> stream = list.stream().filter(element -> element.contains("d"));
        System.out.println(stream.toList());
        boolean isValid = list.stream().anyMatch(element -> element.contains("h")); // true
        boolean isValidOne = list.stream().allMatch(element -> element.contains("a")); // false
        boolean isValidTwo = list.stream().noneMatch(element -> element.contains("z")); // false
        System.out.println(isValid+" -> "+isValidOne+" -> "+isValidTwo);


        List<Integer> integers = Arrays.asList(1, 1, 1);
        Integer reduced = integers.stream().reduce(23, (a, b) -> a + b);
        System.out.println(reduced);


    }
}
