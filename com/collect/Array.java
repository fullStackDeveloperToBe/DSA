package com.collect;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[] {0,1,2,3,4,5,6,7,8,9};
        String[] str = new String[10];
        System.out.println(arr[0]);
        System.out.println(str[0]);
        System.out.println(Arrays.toString(arr));

        for(int i=0;i< str.length;i++) {
            str[i] = sc.next();
        }

        for(String strfe : str) {
            System.out.print(strfe+" ");
        }
    }
}

