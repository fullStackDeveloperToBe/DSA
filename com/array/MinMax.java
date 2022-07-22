package com.array;

public class MinMax {

    static class Pair {
        int min;
        int max;
    }

    static Pair getMinMax(int[] arr, int n) {
        Pair minmax = new Pair();

        if(n == 0) {
            minmax.min = 0;
            minmax.max = 0;
            return minmax;
        }

        if(n == 1) {
            minmax.min = arr[0];
            minmax.max = arr[0];
            return minmax;
        }

        if(arr[0] > arr[1]) {
            minmax.max = arr[0];
            minmax.min = arr[1];
        }
        else {
            minmax.max = arr[1];
            minmax.min = arr[0];
        }

        for(int i=2;i<n;i++) {
            if(arr[i] > minmax.max) {
                minmax.max = arr[i];
            }
            else if(arr[i] < minmax.min){
                minmax.min = arr[i];
            }
        }
        return minmax;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4,8,34,67,12,45,89,25,6,99,123,535,86};
        int len = arr.length;
        //System.out.println(len);
        Pair minmax = getMinMax(arr, len);
        System.out.print(minmax.min+"  ->  "+minmax.max);


    }
}
