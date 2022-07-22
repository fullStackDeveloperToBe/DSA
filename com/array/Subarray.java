package com.array;

public class Subarray {

    static int findArray(int[] a, int n, int t){
        int cur_sum=0;
        for(int i=0;i<n;i++) {
            cur_sum = a[i];
            for(int j=i+1;j<n;j++) {
                if(cur_sum == t) {
                    int p = j-1;
                    System.out.println(
                            "Sum found between indexes " + i
                                    + " and " + p);
                }
                if(cur_sum > t || j == n)
                    break;
                cur_sum = cur_sum + a[j];
            }
        }
        System.out.println("Hai");
        return -1;
    }
    public static void main(String[] args) {
        Subarray sa = new Subarray();
        int[] arr = new int[]{15, 2, 4, 8, 9, 5, 10, 23};
        int n =  arr.length;
        int target = 23;
        sa.findArray(arr, n, target);
    }
}
