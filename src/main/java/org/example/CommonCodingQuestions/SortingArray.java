package org.example.CommonCodingQuestions;

import java.util.Arrays;

public class SortingArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 8, 9, 6};

        Arrays.sort(arr);
        int i = 0;
        while (i < arr.length) {
            System.out.println(arr[i]);
            i++;
        }

    }
}
