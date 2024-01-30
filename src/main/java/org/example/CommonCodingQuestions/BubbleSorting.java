package org.example.CommonCodingQuestions;

public class BubbleSorting {

    public static void main(String[] args) {

        int[] arr = {6,8,2,9};

        for(int i=0; i<arr.length; i++){
            int remainingLength = arr.length-i;
            for(int j=0; j< remainingLength-1; j++){
                // biggest element last
                if(arr[j]>arr[j+1]){
                    int largerNum = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = largerNum;
                }
            }
        }

        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
