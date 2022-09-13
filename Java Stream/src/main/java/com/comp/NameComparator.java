package com.comp;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        System.out.println(e1.getName()+"->"+e2.getName());
        return e1.getName().compareTo(e2.getName());
    }
}
