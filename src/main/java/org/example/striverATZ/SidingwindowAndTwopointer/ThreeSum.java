package org.example.striverATZ.SidingwindowAndTwopointer;

import java.util.*;

public class ThreeSum {
    /*
    i != j, i != k, and j != k
    nums[i] + nums[j] + nums[k] == 0.

    Input: nums = [2, -2, 0, 3, -3, 5]
    Output: [[-2, 0, 2], [-3, -2, 5], [-3, 0, 3]]

    Explanation:
    nums[1] + nums[2] + nums[0] = 0
    nums[4] + nums[1] + nums[5] = 0
    nums[4] + nums[2] + nums[3] = 0
     */


    public static List<List<Integer>> threeSum(int[] nums, int target) {
        Set<List<Integer>> listOfSums = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int initial = nums[i];
            List<Integer> list = new ArrayList<>();
            list.add(nums[i]);
            int j = 0;
            int k = nums.length-1;
            int remainingSum = target - initial;
            while(j<=nums.length && k>=0){
                if(nums[j]+nums[k]==remainingSum){
                    list.add(nums[j]);
                    list.add(nums[k]);
                    Collections.sort(list);
                    listOfSums.add(list);
                    break;
                } else if (nums[j]+nums[k]<remainingSum) {
                    j++;
                }else {
                    k--;
                }

            }

        }

        return new ArrayList<>(listOfSums);

    }
    public static void main(String[] args) {
        int [] arr = new int []{2, -1, -1, 3, -1};
        System.out.println( threeSum(arr,0));
    }
}
