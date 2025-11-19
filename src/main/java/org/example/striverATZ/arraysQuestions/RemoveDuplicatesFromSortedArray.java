package org.example.striverATZ.arraysQuestions;

public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        int existingValue = nums[0];
        int distinctCount = 1;
        int[] distinctArr = new int[nums.length];
        int index = 0;
        distinctArr[index] = existingValue;
        for(int i=1; i<nums.length;i++){
            if(existingValue!=nums[i]){
                distinctCount++;
                existingValue = nums[i];
                index = index +1;
                distinctArr[index] = existingValue;
            }
        }

//        nums = distinctArr;
        for (int i = 0; i <=distinctCount ; i++) {
            nums[i] = distinctArr[i];
        }

        return distinctCount;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{0,0,3,3,5,6};
        int k = removeDuplicates(nums); // Calls your implementation
        int[] expectedNums = nums;
        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            System.out.print(expectedNums[i] + " ");
        }

    }
}
