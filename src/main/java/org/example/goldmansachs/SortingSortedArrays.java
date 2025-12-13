package org.example.goldmansachs;

import java.util.Arrays;

public class SortingSortedArrays {

    public static void sort(int[] arr1, int[] arr2){
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i = 0;
        while(i< arr1.length){
            if(arr1[i]<arr2[0]){
                i++;
            }else{
                // swap
                int largerVal = arr1[i];
                arr1[i] = arr2[0];
                arr2[0] = largerVal;
                i++;
                Arrays.sort(arr1);
                Arrays.sort(arr2);
            }
        }
    }
    public static void main(String[] args) {
        int [] arr1 = new int[] {0,2,5,8};
        int [] arr2 = new int []{1,6,7};
        sort(arr1,arr2);
        for (int i: arr1
             ) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i: arr2
        ) {
            System.out.print(i + " ");
        }
    }
}
