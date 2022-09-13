package com.comp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeMain {
    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee(34, "vishal", 1400));
        emp.add(new Employee(21, "kumar", 2700));
        emp.add(new Employee(24, "ashutosh", 360));
        emp.add(new Employee(1,"gani", 10));
        emp.add(new Employee(99, "zakhir", 3400));

        Collections.sort(emp, new NameComparator());
        System.out.println(emp);
    }
}
