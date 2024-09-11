package org.example.gfg.dsa.algo;

public class QuickSort {

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int pivotIndex = high;
        int i = (low - 1);



        while (low < high) {
            if (arr[low] < pivot)  {
                i++;
                // swap
                int temp = arr[i];
                arr[i] = arr[low];
                arr[low] = temp;

            }
            low++;
        }

        i = i + 1;
        int temp = arr[i];
        arr[i] = pivot;
        arr[pivotIndex] = temp;

        return i;
    }
    public static void quickSort(int[] arr, int low, int high) {

        if(low<high) {
            int updatedPivotIndex = partition(arr, low, high);


            quickSort(arr, low, updatedPivotIndex-1);
            quickSort(arr, updatedPivotIndex+1, high);
        }
        // swap pivot element with the element at index i+1

    }

    public static void main(String[] args) {
        int[] arr = {7 ,10 ,4 ,3 ,20 ,15};
        quickSort(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");
        }
    }
}
