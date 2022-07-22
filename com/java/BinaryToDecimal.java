package com.java;

public class BinaryToDecimal {

    public static void toBinary(int num) {
        int[] bin = new int[100];
        int i=0;
        while(num > 0) {
            bin[i] = num%2;
            num = num/2;
            i++;
        }
        for(int j=i-1;j>=0;j--) {
            System.out.print(bin[j]);
        }
    }
    public static void main(String[] args) {
        toBinary(2234);


    }
}
