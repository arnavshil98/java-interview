package org.example.striverATZ.SidingwindowAndTwopointer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MaxConsecutiveOnes3 {
    public static int longestOnes(int[] nums, int k) {
        int maxLength = 0;

// sliding window
        int i = 0, j = 0;

        List<Integer> arrayList = new ArrayList<>();
        int zeroCounter = 0;
        while (i < nums.length) {
            if (j < nums.length) { // not reached end of array
                if(nums[j]==1){
                    arrayList.add(nums[j]);
                    j++;

                }
                else if(nums[j]==0 && zeroCounter<k){
                        arrayList.add(nums[j]);
                        zeroCounter++;
                        j++;
                }else {
                    // its 0 but the second condition fails 0>k
                    // break the array
                    maxLength = Math.max(maxLength,arrayList.size());
                    arrayList = new ArrayList<>();
                    i++;
                    j=i;
                    zeroCounter=0; // reset 0 for new arraylist

                }
            }else {
                // reached end of array
                maxLength = Math.max(maxLength,arrayList.size());
                arrayList = new ArrayList<>();
                i++;
                j=i;
                zeroCounter=0; // reset 0 for new arraylist
            }

        }


        return maxLength ;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;

        System.out.println(longestOnes(arr, k));

    }
}
