package org.example.striverATZ.sorting;

public class Selectionsorting {

    public static void sorting(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            // traversing array
            int smallest = arr[i];
            int smallestIndex = i;
            for(int j=i; j< arr.length;j++){
                // smallest at ith index
                if(arr[j]<smallest){
                    smallest = arr[j];
                    smallestIndex = j;
                }
            }
            //swap
            arr[smallestIndex] = arr[i];
            arr[i] = smallest;
        }

        printArr(arr);
    }

    private static void printArr(int[] arr) {
        for (int i:arr
             ) {
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        sorting(new int[]{13,46,24,52,20,9});
    }
}
