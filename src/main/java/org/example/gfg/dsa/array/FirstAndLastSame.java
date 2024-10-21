package org.example.gfg.dsa.array;

import java.util.Arrays;
import java.util.Optional;
import java.util.StringJoiner;

/*
Input: arr[] = {‘g’, ‘e’, ‘e’, ‘k’, ‘s’}
Output: 2
{‘e’, ‘e’} is the maximum length sub-array satisfying the given condition.
Input: arr[] = {‘a’, ‘b’, ‘c’, ‘d’, ‘a’}
Output: 5
{‘a’, ‘b’, ‘c’, ‘d’, ‘a’} is the required sub-array
 */
public class FirstAndLastSame {

    public static int subArrLength(char[] arr) {

        int diff = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean matched = false;
            for (int j = i; j < arr.length; j++) {

                if (arr[i] == arr[j] && i != j) {
                    matched = true;
                    diff = j - i;
                }

            }
            if (matched)
                break;
        }

        return diff;

    }

    public static void main(String[] args) {
        char[] arr = {'g', 'e', 'e', 'k', 's'};

        System.out.println(subArrLength(arr) + 1);


    }
}
