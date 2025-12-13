package org.example.goldmansachs;

public class MaxInRotatedArray {

    public static int search(int[] arr, int low, int high){
        if(low<high){
           int mid = (low + high)/2;
           if(arr[mid-1]<arr[mid] && arr[mid +1]< arr[mid]){
               return mid;
           }
           else if(arr[mid-1]< arr[mid] && arr[mid+1]> arr[mid]){
               return search(arr,mid+1, high);
           }
        }

        return -1;
    }
    public static void main(String[] args) {
        int [] arr = new int[]{3,4,5,6,7,8,9,1,2}; // {3,4,5,1,2};
        int maxValIndex = search(arr,0,arr.length-1);
        int minValIndex = maxValIndex + 1;
        System.out.println("maxVal: " + arr[maxValIndex] + " minVal: " + arr[minValIndex]);

    }
}
