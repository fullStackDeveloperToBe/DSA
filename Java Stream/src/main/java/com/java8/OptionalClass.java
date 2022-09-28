package com.java8;

import java.util.*;

public class OptionalClass {
    public static void main(String[] args) {
        System.out.println("Optional Class");
        Optional<String> opt = Optional.empty();
        Optional<String> opt1 = Optional.ofNullable("s");
        Optional<String> opt2 = Optional.of("s");
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(6);
        list.add(0);

        Collections.sort(list);
        System.out.println(list);
    }
}
