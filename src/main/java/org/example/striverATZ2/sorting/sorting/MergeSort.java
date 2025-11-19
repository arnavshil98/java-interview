package org.example.striverATZ2.sorting.sorting;

public class MergeSort {

    public static int[] divide(int[] arr, int low, int high){
        if(low>=high)
            return arr;
        int mid = (low+high)/2;
        divide(arr,low,mid);
        divide(arr,mid+1, high);
        return conquer(arr,low,mid,high);
    }

    private static int[] conquer(int[] arr, int low, int mid, int high) {
        int [] sortedArr = new int[high-low+1];

        for (int i = 0; i < sortedArr.length; i++) {
            int j = low;
            int k = mid+1;
            while(j<=mid && k<=high){
                 if(arr[j]<arr[k]){
                     sortedArr[i] = arr[j];
                   j++;
                   i++;
                 }else {
                     sortedArr[i] = arr[k];
                     k++;
                     i++;
                 }
            }
            while (j<=mid){
                sortedArr[i] = arr[j];
                j++;
                i++;
            }

            while(k<=high){
                sortedArr[i] = arr[k];
                k++;
                i++;
            }
        }
        for (int k = 0; k < sortedArr.length; k++) {
            arr[low+k]=sortedArr[k];  // here I made mistake, arr[low+k] is important
        }
        return arr;
    }

    public static void main(String[] args) {
        int [] arr = new int []{14,9,15,12,6};
        int[] arr2 = divide(arr,0, 4);
        for (int i: arr2
        ) {
            System.out.print(i+ " ");
        }

            }
}
