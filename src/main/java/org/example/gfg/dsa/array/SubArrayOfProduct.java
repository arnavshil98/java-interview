package org.example.gfg.dsa.array;

/*
Input: arr[] = {-2, -1, 3, -4, 5}, K = 2
Output: YES

Input: arr[] = {3, -1, -1, -1, 5}, K = 3
Output: YES
 */
public class SubArrayOfProduct {

    public static void testSubArrayOfProduct(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            int product = arr[i];
            if (product == k) {
                System.out.println(arr[i]);
                break;
            }

            for (int j = i + 1; j < arr.length; j++) {
                product = product * arr[j];

                if (product == k) {
                    for (int f = i; f <= j; f++) {
                        System.out.println(arr[f]);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {-2, -1, 3, -4, 5};
        testSubArrayOfProduct(arr, 6);
    }
}
