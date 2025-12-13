package org.example.goldmansachs;

public class PairSumTarget {

    public static void pairSum(int[] arr, int target){
        int i=0; int j = arr.length-1;

        while(i<arr.length && j>=0 && j>i){
            int remainder = target-arr[i]-arr[j];
            while(j>i){
                if(remainder<0) {
                    j--;
                    remainder = target-arr[i]-arr[j];
                }
                else if (remainder>0) {
                    i++;
                    remainder = target-arr[i]-arr[j];

                }else{
                    System.out.println(arr[i]+" "+ arr[j]);
                    break;
                }
            }
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int [] arr = new int[]{1,2,3,4,5};
        int target = 7;
        pairSum(arr,target);
    }
}
