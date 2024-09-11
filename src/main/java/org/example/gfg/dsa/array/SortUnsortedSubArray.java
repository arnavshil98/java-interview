package org.example.gfg.dsa.array;

import java.util.Stack;

/*
Input: 2 5 65 55 50 70 90
Output: 2 5 50 55 65 70 90
The subarray from 2nd index to 4th index is in reverse order.
So the subarray is reversed, and the sorted array is printed.

Input: 1 7 6 5 4 3 2 8
Output: 1 2 3 4 5 6 7 8


 */
public class SortUnsortedSubArray {

    public static void SortSubArr(int[] arr) {
        int i = 0, j = 1;

        Stack<Integer> stack = new Stack<>();
        while (j < arr.length) {

            if (arr[i] < arr[j] && (j - i) == 1) {

                i++;
                j++;
            } else if (arr[i] > arr[j]) {
                stack.push(arr[j]);
                j++;
            } else {
                break;
            }

        }

        int tempMax = arr[i];
        while (i < j) {
            if (!stack.isEmpty()) {
                arr[i] = stack.pop();
            }
            i++;
        }
        arr[j - 1] = tempMax;

        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }

    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 65, 55, 50, 70, 90};
        SortSubArr(arr);
    }
}
