package com.collect;

class A {
    int marks;
    String name;

    public A(int marks, String name) {
        this.marks = marks;
        this.name = name;
    }
}
public class This {
    public static void main(String[] args) {
        A a = new A(96, "abc");
//        a.marks = 96;
//        a.name = "panther";
        System.out.println(a.marks+" : "+a.name);

    }
}
