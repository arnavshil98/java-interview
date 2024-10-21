package org.example.gfg.dsa.array;

public class GcdOfSubArr {
    /*
    problem statement: Longest sub-array with maximum GCD
    solution: max of the array will be the GCD, i.e. greatest common divisor
    hence 3 is the GCD
    now find contiguous array of 3.
     */
    public static int gcdSubArrLen(int[] arr) {

        int maxElement = 0;
        for (int i = 0; i < arr.length; i++) {
            maxElement = Math.max(maxElement, arr[i]);
        }

        int subArrMaxLength = 0;
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == maxElement) {
                counter++;
                subArrMaxLength = Math.max(counter, subArrMaxLength);
            } else {
                counter = 0;
            }
        }

        return subArrMaxLength;
    }


    // Driver code
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 3, 1, 3};
        int n = arr.length;
        System.out.println(gcdSubArrLen(arr));
    }

}
