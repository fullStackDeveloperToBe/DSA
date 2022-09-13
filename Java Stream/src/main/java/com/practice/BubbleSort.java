package com.practice;

public class BubbleSort {

    static void bubbleSort(int[] arr) {
        int temp = 0;
        boolean swapped = false;
        for(int i=0;i<arr.length-1;i++) {
            swapped = false;
            for(int j=0;j<arr.length-1;j++) {
                if(arr[j] > arr[j+1]) {
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            if(swapped == false) { break; }
        }
    }
    public static void main(String[] args) {
        int[] arr = {99,56,43,32,21,17,12,34,9,3,1,0};
        bubbleSort(arr);
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
