package org.example.striverATZ2.sorting.sorting;

public class BubbleSorting {

    public static void bubbleSort(int[] arr){
        for (int i = 0; i < (arr.length); i++) {
            // i = arr.len-1 j loop will not work
            boolean swapped = false;
            for (int j = 0; j < (arr.length-1)-i; j++) {
                // 2nd last index and last index comparison
                if(arr[j]>arr[j+1]){
                    // swap
                    int larger = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = larger;
                    swapped = true;
                }
            }

            if(!swapped)
                break;
        }
    }
    public static void main(String[] args) {
        int [] arr = new int[]{2,6,12,8,1,10};
        bubbleSort(arr);

        for (int i: arr
             ) {
            System.out.print(i+" ");
        }

    }
}
