package org.example.striverATZ.sorting;

public class QuickSort {

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = pivotFn(arr, low, high);

            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static int pivotFn(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low+1;
        int j = high;
        while (i < j ) {
            while(i<=high && arr[i]<pivot){
                i++;
            }
            while(j>=low && arr[j]>pivot){
                j--;
            }
            if(i<j) { // here I made mistake
                int larger = arr[i];
                arr[i] = arr[j];
                arr[j] = larger;
            }
        }

        // rearrange the pivot to correct position
        int pivotIndex = j;
        int replace = arr[j];
        arr[j] = pivot;
        arr[low] = replace;
        return pivotIndex;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4, 6, 2, 5, 7, 9, 1, 3};
        quickSort(arr, 0, 7);
        for (int i : arr
        ) {
            System.out.print(i + " ");
        }
    }
}
