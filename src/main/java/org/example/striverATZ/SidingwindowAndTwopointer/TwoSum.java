package org.example.striverATZ.SidingwindowAndTwopointer;

import java.util.Arrays;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
//        Arrays.sort(nums); // this changes the index
        int i=0,j=nums.length-1;
        int firstIndex = -1;
        int secondIndex = -1;
        while(j>=0) {
            if(nums[i]+ nums[j]==target){
                firstIndex = i;
                secondIndex = j;
                break;
            }
            else if(nums[i]+ nums[j]<target){
                i++;
            }else{
                j--;
            }
        }
        int originalFirstIndex = firstIndex;
        firstIndex = Math.min(originalFirstIndex,secondIndex);
        secondIndex = Math.max(originalFirstIndex,secondIndex);
        return new int[]{firstIndex,secondIndex};
    }
    public static void main(String[] args) {
        int [] arr = new int[]{-3, 3, 5, -3,-7, 6, -3};
        int[] response = twoSum(arr,0);

//        System.out.println(response);
        for (int i: response
             ) {
            System.out.print(i+" ");
        }
    }
}
