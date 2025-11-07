package org.example.striverATZ.sorting;

import static org.example.striverATZ.sorting.Selectionsorting.printArr;

public class InsertionSorting {

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

        printArr(arr);
    }
    public static void main(String[] args) {
        sorting(new int[]{14,9,15,12,6,8,13});
    }
}
