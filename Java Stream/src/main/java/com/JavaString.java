package com;

public class JavaString {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = new String("Hello");
//        s1 = "World";
//        s2 = "World";
        System.out.println(s1+" -> "+s2);
        if(s1 == s2) {
            System.out.print("true");
        }
        else {
            System.out.print("false");
        }
    }
}
