package org.example.CommonCodingQuestions.gfgstrings;

public class testHapp {

    public static int  maxValue(int[] arr){
        Integer max = Integer.MAX_VALUE;
        Integer min = Integer.MIN_VALUE;

        for(int i=0; i< arr.length;i++){
            if(arr[i]>max){
                min =max;
                max = arr[i];

            }
            if(arr[i]<min){
                min = max;
                max = arr[i];
            }
            if(arr[i]>min){
                min = arr[i];
            }
        }

        return max;

    }
    public static void main(String[] args) {

        int[] arr1 = {3, 1, 7, 2};

        System.out.println(maxValue(arr1));
    }
}
