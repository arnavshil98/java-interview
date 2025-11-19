package org.example.striverATZ2.sorting.sorting;

public class InsertionSort {

    public static void sort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            for(int j = i; j>=1; j--){
                if(arr[j]<arr[j-1]){
                    // swap
                    int smaller = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = smaller;
                }
            }
        }
    }
    public static void main(String[] args) {
        int [] arr = new int[]{14,9,15,12,6,8,13};
        sort(arr);

        for (int i: arr
             ) {
            System.out.print(i+ " ");
        }
    }
}
