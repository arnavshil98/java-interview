package org.example.gfg.dsa.array;

public class SubArrOfSizeK {
    // Function to print subarray of size k
    public static void printMaxSumSubArray(int arr[], int n, int k) {
        // sliding window technique
        int maxVal = 0;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        maxVal = sum;
        for (int i = 1; i <= n - k; i++) {
            sum = sum - arr[i - 1] + arr[i + k - 1];
            if (sum > maxVal)
                maxVal = sum;
        }

        System.out.println(maxVal);

    }

    public static void main(String[] args) {
        int arr[] = {3, 7, 90, 20, 10, 50, 40};
        //int [] arr = {4,7,8,1,9,2};
        // SubArray size
        int k = 3;
        int n = arr.length;
        printMaxSumSubArray(arr, n, k);
    }
}
