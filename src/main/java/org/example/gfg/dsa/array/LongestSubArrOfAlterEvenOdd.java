package org.example.gfg.dsa.array;

public class LongestSubArrOfAlterEvenOdd {
    //int a[] = {1, 23, 3, 4, 5, 7, 9}
    public static int longest(int[] arr) {
        int maxSize = 0;
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {

            int j = i + 1;

            if ((arr[i] % 2 != 0 && arr[j] % 2 == 0) ||
                    (arr[j] % 2 != 0 && arr[i] % 2 == 0)) {
                count++;
                maxSize = Math.max(maxSize, count);
            } else {
                count = 0;
            }
        }
        return maxSize;
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 7, 8, 9, 12, 13, 18};
        System.out.println("longest:" + longest(a));
    }
}
