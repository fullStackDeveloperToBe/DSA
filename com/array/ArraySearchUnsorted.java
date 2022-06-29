package com.array;

public class ArraySearchUnsorted {

    static int findElement(int[] arr, int n, int k) {
        for(int i=0;i<n;i++) {
            if(k == arr[i]) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {22,54,78,12,45,1,43,21,28,87,99,91,65,39};
        int n = arr.length;
        int k = 29;
        int position = findElement(arr, n , k);

        if(position == -1) {
            System.out.println("Element is not present");
        }
        else {
            System.out.println("Element "+k+" is present at "+position+" index position");
        }
    }
}
