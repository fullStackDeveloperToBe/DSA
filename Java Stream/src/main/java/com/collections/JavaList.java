package com.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class JavaList {
    public static void main(String[] args) {
        Collection<Integer> collect = new ArrayList<>();
        collect.add(98);
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(-5);
        Collections.sort(list);
        System.out.print(list+"="+collect);
    }
}
