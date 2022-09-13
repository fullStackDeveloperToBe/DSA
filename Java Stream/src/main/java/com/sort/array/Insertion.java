package com.sort.array;

public class Insertion {

    static void insertSort(int[] arr) {
        for(int i=1;i<arr.length;i++) {
            int current = arr[i];
            int j = i-1;
            while(j>=0 && arr[j] > current) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
    }
    public static void main(String[] args) {
        int[] arr = {7,5,4,2,9};
        insertSort(arr);
        for(int i=0;i<arr.length;i++) {

            System.out.print(arr[i]+" ");
        }
    }
}