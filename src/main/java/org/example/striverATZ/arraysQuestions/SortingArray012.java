package org.example.striverATZ.arraysQuestions;


public class SortingArray012 {

    public static void sorting(int[] nums, int low, int high){
        if(low<=high){
            int pivotIndex = quickSort(nums,low,high);
            sorting(nums,low,pivotIndex-1);
            sorting(nums,pivotIndex+1,high);
        }
    }

    public static int quickSort(int[] nums, int low, int high){
        int pivot = nums[low];
        int i=low+1,j= high;
        while(i<j){
            while (i<=high && nums[i]<pivot){
               i++;
            }
            while(j>=low && nums[j]>pivot){
                j--;
            }
            // we get correct i and j
            if(i<j){
                // swap
                int iVal = nums[i];
                nums[i] = nums[j];
                nums[j] = iVal;
            }
        }
        // we know that i>j
        int newPivot  = nums[j];
        nums[j] = pivot;
        nums[low] = newPivot;
        return j;
    }


    public static void sorting(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            //limiting condition j=0, inner loop fails
            for (int j = i; j >= 1; j--) {
                //sorting
                if(arr[j]<arr[j-1]){
                    int larger = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = larger;
                }
            }
        }

//        printArr(arr);
    }
    public static void main(String[] args) {
        int [] nums = new int[]{1,2, 0, 2, 1, 0};
        sorting(nums,0, nums.length-1);

        for (int e:nums
             ) {
            System.out.print(e+" ");
        }
    }
}
