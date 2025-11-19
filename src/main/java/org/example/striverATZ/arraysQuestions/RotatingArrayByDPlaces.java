package org.example.striverATZ.arraysQuestions;

public class RotatingArrayByDPlaces {

    public static void rotateArray(int[] nums, int k) {
        while(k>=1){
            int first = nums[0];
            for(int i=nums.length-1; i>=1; i--){
                int left = nums[i-1];
                nums[i-1] = nums[i];
                nums[i] = left;
            }

            k--;

        }
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        rotateArray(nums,3);
        for (int i: nums
             ) {
            System.out.print(i+ " ");
        }
    }
}
