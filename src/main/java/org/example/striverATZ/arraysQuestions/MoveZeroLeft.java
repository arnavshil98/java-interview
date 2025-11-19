package org.example.striverATZ.arraysQuestions;

public class MoveZeroLeft {

    public static void method(int[] arr){
        int count=0;
        for (int i = 0; i < arr.length; i++) {

            if(arr[i]==0) {
                for (int j = 0; j < (arr.length-1) - count; j++) {
                    //left shift numbers swap with previous
                    if(arr[j]==0) {
                        int left = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = left;
                    }
                }
                count++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {0,1,4,0,5,2};
        method(arr);
        for (int i: arr
             ) {
            System.out.print(i+",");
        }
    }
}
