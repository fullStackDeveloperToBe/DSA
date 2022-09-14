package com.practice;

public class InsertionSort {

    static void insertionSort(int[] arr) {
        for(int i=1;i<arr.length;i++) {
            int key = arr[i];
            int j=i-1;
            while(j>=0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    public static void main(String[] args) {
        int[] arr = {99,56,43,32,21,17,12,34,9,3,1,0};
        insertionSort(arr);
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
