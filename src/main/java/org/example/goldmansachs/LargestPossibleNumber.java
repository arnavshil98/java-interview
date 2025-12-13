package org.example.goldmansachs;

import java.util.Arrays;
import java.util.Comparator;

public class LargestPossibleNumber {
    public static void printMaxNum(Integer[] arr){
        Arrays.sort(arr,(x,y)->{  // using lambda expression
            String a = String.valueOf(x);
            String b = String.valueOf(y);
            String ab = a+b;
            String ba = b+a;
            return ba.compareTo(ab);
        });
        String maxString = "";
        for (Integer i: arr
             ) {
            maxString+=i;
        }

        System.out.println(maxString);
    }
    public static void main(String[] args) {
       Integer[] input = {10, 68, 75, 7, 21, 12};
        printMaxNum(input);
    }
}
