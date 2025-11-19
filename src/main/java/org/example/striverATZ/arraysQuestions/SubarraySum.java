package org.example.striverATZ.arraysQuestions;

public class SubarraySum {

    public static int longestSubarray(int[] nums, int k) {
        int maxCount = 0;
    // picking start of subarray
        for(int i=0; i< nums.length; i++){
            //subarray of different lengths
            int sum=0;
            int count = 0;
            for (int j = i; j < nums.length; j++) {
                sum= sum + nums[j];
                count++;
                if(sum==k)
                    maxCount = Math.max(count,maxCount);
                else if (sum>k) {
                    break;
                }
            }

        }
        return maxCount;
    }
    public static void main(String[] args) {
        int [] arr = new int []{10, 5, 2, 7, 1, 9};
        int sum = 15;
        System.out.println(longestSubarray(arr,sum));
    }
}
