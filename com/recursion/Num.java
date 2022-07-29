package com.recursion;

public class Num {
    public static void main(String[] args) {
        print(999);
    }

    static void print(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        print(n-1);
    }
}
