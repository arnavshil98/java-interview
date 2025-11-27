package org.example.striverATZ.SidingwindowAndTwopointer;

import java.util.Map;

public class MaximumSumSubarray {
/*
Input: nums = [10, 5, 2, 7, 1, 9],  k=15

Output: 4

Explanation:

The longest sub-array with a sum equal to 15 is [5, 2, 7, 1], which has a length of 4.
 This sub-array starts at index 1 and ends at index 4, and the sum of its elements (5 + 2 + 7 + 1) equals 15.
 Therefore, the length of this sub-array is 4.

 */
    public static int maxSumSubArray(int[] arr, int size){
        int oldSum = 0;
        for (int i = 0; i < size; i++) { //0(K)
            oldSum+=arr[i];
        }
        System.out.println("currentSum:"+oldSum);
        int maxSum = oldSum;
        for (int i = size; i < arr.length; i++) { // O(N)
        int currentSum = oldSum +   arr[i] - arr[i-size];
            System.out.println("currentSum:"+currentSum);
        maxSum = Math.max(oldSum,currentSum);
        oldSum = currentSum;
        }
            return maxSum;
    }
    public static void main(String[] args) {
        System.out.println(maxSumSubArray(new int[]{10,5,2,7,2,9},3)); // O(K)+O(N)
    }
}
