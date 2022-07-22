package com.array;

class BinarySearch {
    static int ceilSearch(int arr[], int low, int high,
                          int x)
    {
        if (high == 0) {
            return -1;
        }
        while (low <= high) {
            int mid = low + (high - low) / 2; // calculate mid

            if (x == arr[mid]) {
                return mid;
            }
            if (x < arr[mid]) {
                high = mid - 1;
            }

            else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String[] args)
    {
        int arr[] = { 1, 2, 8, 10, 13, 17, 19, 23, 28 };
        int n = arr.length;
        int x = 22;
        int index = ceilSearch(arr, 0, n - 1, x);
        if (index == -1)
            System.out.println("Ceiling of " + x + " doesn't exist in array");
        else
            System.out.println("ceiling of " + x + " is " + arr[index]);
    }
}
