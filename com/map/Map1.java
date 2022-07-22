package com.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map1 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Hashmap");
        map.put(2, "TreeMap");
        map.put(3, "Hashmap");
        System.out.println(map);
        Set<Map.Entry<Integer, String>> set = map.entrySet();
        Set<Integer> setKey= map.keySet();
        System.out.println(set);
        System.out.println(setKey);
        System.out.println(map.containsValue("Hashmap"));


    }
}
