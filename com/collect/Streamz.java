package com.collect;

//import java.util.*;
//import java.util.stream.IntStream;
//import java.util.stream.Stream;
//
//public class Streamz {
//    public static void main(String[] args) {
//
//        List<String> list = Arrays.asList("abc1", "abc2", "abc3");
//        long size = list.stream().skip(2)
//                .map(element -> element.substring(0, 1)).sorted().count();
//        System.out.println(size);
//
//    }
//}

import java.awt.*;
import java.util.ArrayList;

public class Streamz {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        list.forEach(n -> { if(n%2 == 0) System.out.println(n);});
    }
}
