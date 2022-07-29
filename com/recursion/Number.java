package com.recursion;

public class Number {
    public static void main(String[] args) {
        printNumber(1);
    }

    private static void printNumber(int n) {
        if(n==11) {
            return;
        }
        System.out.println(n);
        printNumber(n+1);
    }
}
