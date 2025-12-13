package org.example.goldmansachs;

public class MinLengthSubArray {
    public static void sumSubArrayContiguous(int [] arr, int target){
    // sliding window
        int currentSum =arr[0];
        int i = 0;
        int j = 0;
int minLength = Integer.MAX_VALUE;
        while(i < arr.length && j< arr.length){

            if(currentSum<target){
                j++;
                if(j< arr.length)
                currentSum+=arr[j];
            } else if (currentSum>target) {
                if(i<arr.length)
                currentSum-=arr[i];
                i++;
            }else {
                System.out.println("i: " + i +" j: " +j);
                // we have reached optimum length but it may not be min length
                int currentLength = j-i+1;
                minLength = Math.min(currentLength,minLength);
                System.out.println(minLength);
                i=j+1;
                currentSum = arr[i];
                j++;
            }
        }

    };


    public static void sumSubArrayNonContiguous(int [] arr, int target){
    // two pointer
        int i=0;
        int j = arr.length-1;
        int currentSum = arr[i]+ arr[j];
        while(i<arr.length && j>=0){

        if(currentSum<target){
            i++;
        } else if (currentSum>target) {
            j--;
        }else {
            System.out.println(arr[i] + " "+arr[j]);
            break;
        }
        }

    }
    public static void main(String[] args) {
        int [] arr = new int[]{1,2,3,4};
        int target = 3;
        sumSubArrayContiguous(arr,target);
        sumSubArrayNonContiguous(arr,target);
    }
}
