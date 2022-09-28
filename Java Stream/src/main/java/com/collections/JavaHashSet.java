package com.collections;

import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;

public class JavaHashSet {
    public static void main(String[] args) {
        HashSet<Integer> hashset = new HashSet<>();
        hashset.add(23);
        hashset.add(21);
        hashset.add(23);
        System.out.print(hashset);
    }
}
