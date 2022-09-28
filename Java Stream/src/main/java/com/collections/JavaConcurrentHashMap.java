package com.collections;

import java.util.concurrent.ConcurrentHashMap;

public class JavaConcurrentHashMap {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1,"sun");
        map.put(2,"moon");
        System.out.println(map.get(1));
        System.out.print(map);
    }
}
