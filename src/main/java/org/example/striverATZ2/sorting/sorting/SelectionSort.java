package org.example.striverATZ2.sorting.sorting;

public class SelectionSort {

    public static void sort(int[] arr){
        // last element will always be max
        for(int i = 0; i< arr.length-1; i++){
            //comparing last and 2nd last
            int min = Integer.MAX_VALUE;
            int minIndex=0;
            for (int j = i; j < arr.length ; j++) {
                if(arr[j]<min){
                    min = arr[j];
                    minIndex=j;
                }
            }
            arr[minIndex] = arr[i];
            arr[i] = min;
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
