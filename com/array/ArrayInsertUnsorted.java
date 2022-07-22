package com.array;

public class ArrayInsertUnsorted {

    static int insertElement(int[] arr, int n, int k, int capacity) {
        if(n >= capacity) {
            return n;
        }
        arr[n] = k;
        System.out.println((n+1));
        return (n + 1);
    }
    public static void main(String[] args) {
        int[] arr = new int[]{22, 54, 78, 12, 45, 1, 43, 21, 28, 87, 99, 91, 65, 39};
        int n = arr.length;
        int k = 29, capacity = 20, i;
        System.out.println(n);

        System.out.println("Array before inserting");
        for(i=0;i<n;i++)
            System.out.print(arr[i]+" ");

insertElement(arr, n, k, capacity);

        }
    }
