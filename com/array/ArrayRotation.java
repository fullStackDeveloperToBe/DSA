package com.array;

public class ArrayRotation {

    public static void rotateLeft(int[] arr, int n, int r) {
        for (int i = 0; i < r; i++) {
            rotateByOne(arr, n);
        }
    }

    public static void rotateByOne(int[] arr, int n) {
        int temp = arr[0],i;
        for (i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
            arr[i] = temp;
    }

    public static void main(String[] args) {

        int arr[] = new int[]{1, 2, 3, 4};
        int n = arr.length;
        int r = 1;
        System.out.println("Before Array Rotation");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        rotateLeft(arr, n, r);
        System.out.println("After Array Rotation");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
