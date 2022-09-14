package com.practice;

import java.util.Arrays;

public class MergeSort {

    static int[] mergesort(int[] arr) {
        if(arr.length == 1) {
            return arr;
        }

        int mid = arr.length/2;
        int[] left = mergesort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergesort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    private static int[] merge(int[] first, int[] second) {
        int[] result = new int[first.length + second.length];
        int i=0,j=0,k=0;
        while (i<first.length && j<second.length) {
            if(first[i] < second[j]) {
                result[k] = first[i];
                i++;
            }
            else {
                result[k] = second[j];
                j++;
            }
            k++;
        }
        while(i < first.length) {
            result[k] = first[i];
            i++;
            k++;
        }
        while(j < second.length) {
            result[k] = second[j];
            j++;
            k++;
        }

        return result;
    }
    public static void main(String[] args) {
        int[] arr = {99,76,43,2,43,23,12,11,56,32,16};
        int[] arr1 = mergesort(arr);
        for(int i=0;i<arr1.length-1;i++) {
            System.out.print(arr1[i]+" ");
        }
    }
}
