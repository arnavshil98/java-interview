package org.example.gfg.dsa.array;

public class SumOfOddSubArray {

    public static void sumOfOddSubArr(int[] arr, int k) {
    // print starting index of each sub array.
       boolean exits = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                exits = true;
                System.out.print(i+1 + " ");
            }
        }
        if(!exits)
            System.out.println(-1);

    }

    public static void main(String[] args) {

        int arr[] = {7, 2, 11, 4, 19};
        int K = 3;
        sumOfOddSubArr(arr, K);

    }
}
