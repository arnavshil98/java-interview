package org.example.CommonCodingQuestions.arraygfg;

import java.util.ArrayList;
import java.util.List;

public class CountingPairs {
    public static void main(String[] args) {
        // only pairs
       int[] arr = {10, 12, 10, 15, -1, 7, 6, 5, 4, 2, 1, 1, 1};
       int K = 11 ;
       int s = 0;
       for(int i=0; i< arr.length; i++){

          int sum = 0;
           for(int j =i; j< arr.length; j++){
               List<Integer> ex = new ArrayList<>();
               ex.add(arr[i]);
                sum = arr[i] + arr[j];
                if(sum==K){
                    ex.add(arr[j]);
                    System.out.println("array");
                    ex.forEach(System.out::println);
                    s +=1;
                }
           }
       }

        System.out.println("count: "+s);
    }
}
