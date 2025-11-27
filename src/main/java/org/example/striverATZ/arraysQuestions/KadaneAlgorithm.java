package org.example.striverATZ.arraysQuestions;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class KadaneAlgorithm {

    public static int maxSumSubArray(int[] arr) {
        int oldSum = arr[0];
        int maxVal = oldSum;
        for (int i = 1; i < arr.length; i++) {
           int currentSum = (oldSum < 0) ? arr[i] : oldSum + arr[i];
            oldSum = currentSum;
            maxVal = Math.max(maxVal, currentSum);
        }
        return maxVal;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, -8, 7, -1, 2, 3}; // -2, -3, -7, -2, -10, -4 -> -2
        // 2, 3, -8, 7, -1, 2, 3 -> 11

        int max = maxSumSubArray(arr);

        System.out.println(max);

    }
}
