package com.practice;

public class SelectionSort {

    static void selectionSort(int[] arr) {
        for(int i=0;i<arr.length-1;i++) {
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
        int[] arr = {99,56,43,32,21,17,12,34,9,3,1,0};
        selectionSort(arr);
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
