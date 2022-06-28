package com.linearsearch;

public class LinearSearch {
    public static void main(String[] args) {
        LinearSearch ls = new LinearSearch();
        int[] num = {1,2,3,4,5,6,7,8,9,0,11,9999};
        ls.findElement(num, 9999);
    }

    public int findElement(int[] nums, int ele) {
        int count = 0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i] == ele) {
                count++;
                System.out.println(ele+" present at "+i+" index");
            }
        }
        if(count == 0){System.out.println("element is not present");}
        return -1;
    }
}