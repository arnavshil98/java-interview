package org.example.gfg.dsa.array;

import java.util.ArrayList;
import java.util.List;

public class EqualSumSubArray {

    public static void equalSumSubArr(int[] a, int low, int high) {
        List<Integer> leftArray = new ArrayList<Integer>();
        List<Integer> rightArray = new ArrayList<Integer>();
        int leftSum = a[low];
        int rightSum = a[high];

        leftArray.add(a[low]);
        rightArray.add(a[high]);

        while (low < high) {

            if (leftSum < rightSum) {
                low++;
                leftArray.add(a[low]);
                leftSum+=a[low];
            }
            else if(leftSum==rightSum){
                break;
            }
            else {
                high--;
                rightArray.add(a[high]);
                rightSum+=a[high];

            }
        }

        System.out.println("leftArray: " + leftArray);
        System.out.println("rightArray: " + rightArray);
    }

    public static void main(String[] args) {
        int[] arr = {5,5,4,2,1,3};
        equalSumSubArr(arr, 0, arr.length - 1);
    }
}
