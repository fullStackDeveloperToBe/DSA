package com.sort.array;

import java.util.Arrays;

public class InsertionSort {

    static void insertionSort(int[] arr) {
        for(int i = 0 ; i < arr.length-1 ; i++) {
            int smallest = i;
            for(int j=i+1;j<arr.length;j++) {
                if(arr[smallest] > arr[j]) {
                    smallest = j;
                }
                int temp = arr[smallest];
                arr[smallest] = arr[i];
                arr[i] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {9,6,4,3,2,1};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
