package com.array;

public class JavaDSA {
    public static void main(String[] args) {
//        int[] a = new int[5];
//        a[0] = 0;
//        a[1] = 1;
//        a[2] = 2;
//        for(int i = 0;i < a.length;i++)
//            System.out.print(a[i]+" - ");
//        System.out.println();
//        System.out.println("------------------------");
//        int[] b = new int[]{0,1,2,3,4,5};
//        for(int j = 0;j < b.length;j++)
//            System.out.print(b[j]+" - ");
//        System.out.println();
//        System.out.println("------------------------");
//        int[] c = {01,11,21,31,41,51};
//        for(int j = 0;j < c.length;j++)
//            System.out.print(c[j]+" - ");

        int[] arr = new int[]{2,4,8,5,0,7,23,28,34,99,-1};
        int max = arr[0];
        for(int i=0;i<arr.length;i++) {
            if(arr[i]>max) {
                max = arr[i];
            }
        }
        System.out.println(max+" is the largest number in the array");




    }
}
