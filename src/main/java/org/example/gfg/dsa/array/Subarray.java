package org.example.gfg.dsa.array;

import java.util.Arrays;

public class Subarray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        for(int i = 0; i < arr.length; i++) {
            for(int j = i; j < arr.length; j++) {
             int[] subArr = new int[j+1];
             // add element from i to j
                int k = i;
                while(k<=j){
                    subArr[k]=arr[k];
                    k++;
                }
                Arrays.stream(subArr).forEach(System.out::print);
                System.out.println("");
            }
        }
    }
}
