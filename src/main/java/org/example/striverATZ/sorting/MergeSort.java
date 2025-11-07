package org.example.striverATZ.sorting;
public class MergeSort {


    public static int[] mergeSort(int[] arr,int low , int high) {
        if(low>=high){
            return arr;
        }
        int mid = (low+high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        return merge(arr,low,mid,high);
    }

    public static int[] merge(int[] arr, int low, int mid, int high){
        int[] temp= new int[high - low + 1];
        int index=0;
        int i=low;
        int j=mid+1;
        while(i<=mid && j<=high){
            if(arr[i]<arr[j]){
                temp[index]= arr[i];
                i++;
                index++;
            }else {
                temp[index]= arr[j];
                j++;
                index++;
            }
        }

        while(i<=mid){
            temp[index]=arr[i];
            index++;
            i++;
        }

        while(j<=high){
            temp[index]=arr[j];
            index++;
            j++;
        }

        for (int k = 0; k < temp.length; k++) {
            arr[low+k]=temp[k];  // here I made mistake, arr[low+k] is important
        }

        return arr;
    }

    static void printArr(int[] sortedArr){
        for (int element: sortedArr
             ) {
            System.out.print(element+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr =new int[]{14,9,15,12,6,23,1,8,9};
        int[] arr2 = mergeSort(arr,0,8);
        printArr(arr2);
    }
}
