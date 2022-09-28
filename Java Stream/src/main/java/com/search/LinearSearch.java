package com.search;

public class LinearSearch {

    static void linearSearch(int[] arr, int key) {
        boolean isPresent = false;
        for(int i=0;i<arr.length;i++) {
            if(key == arr[i]) {
                System.out.println("key is present in "+(i+1));
                isPresent = true;
            }
        }
        if(isPresent == false) {
            System.out.println("key is not present");
        }
    }
    public static void main(String[] args) {
        System.out.println("Linear Search");
        int[] arr = {3,6,9,2,45,23,87,92};
        linearSearch(arr, 26);

    }
}
