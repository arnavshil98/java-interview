package org.example.CommonCodingQuestions.arraygfg;

import java.util.Arrays;

public class CyclicRotationOfArray {
    public static void main(String[] args) {
//        clockwise rotation only single rotation
//         last all elements will be shifted by 1 and the first
//         element will be replaced by last element

        Integer[] arr = {2,5,7,8,1,3};
        int lastValue = arr[arr.length-1];
        for(int i = arr.length-1; i>0;i--){
            arr[i] = arr[i-1];
        }

        arr[0] = lastValue;

        Arrays.asList(arr).forEach(System.out::println);
    }
}
