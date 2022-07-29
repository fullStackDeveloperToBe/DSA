package com.recursion;

public class Factorial {
    public static void main(String[] args) {
        int ans = factorial(5);
        System.out.println(ans);
        System.out.println(fact(6));
    }
    static int factorial(int n) {
        int val = 1;
        for(int i=1;i<=n;i++) {
            val*=i;
        }
        return val;
    }
    static int fact(int n) {
        if(n <= 1) {
            return 1;
        }
        return n * fact(n-1);
    }
}
