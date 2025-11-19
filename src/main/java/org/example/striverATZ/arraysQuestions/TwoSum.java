package org.example.striverATZ.arraysQuestions;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target){
        int [] twoSumArr = new int [2];
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(target==nums[i]+ nums[j]){
                    twoSumArr[0] = nums[i];
                    twoSumArr[1]=nums[j];
                }
            }
        }
        return twoSumArr;
    }
    public static void main(String[] args) {
       int[] nums = new int[]{1, 3, 5, -7, 6, -3};
       int target = 0;
       int [] twoSumArr = twoSum(nums,target);
        for (int i: twoSumArr
             ) {
            System.out.print(i+",");
        }
    }
}
