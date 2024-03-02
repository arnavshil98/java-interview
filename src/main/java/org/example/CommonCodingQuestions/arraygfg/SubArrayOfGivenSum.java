package org.example.CommonCodingQuestions.arraygfg;

import java.util.StringJoiner;

public class SubArrayOfGivenSum {
    public static void main(String[] args) {
       int arr[] = {1, 4, 20, 3, 10, 5}; int sum = 33;

        boolean satisfied = false;
        for(int i =0; i<arr.length; i++){
            int currentSum = 0;

            StringJoiner stringJoiner = new StringJoiner(",");

            for(int j = i; j<arr.length; j++ ){
                currentSum += arr[j];

                if(currentSum==sum){
                    stringJoiner.add(String.valueOf(arr[j]));
                    satisfied = true;
                    break;
                }
                if(currentSum>sum){
                    stringJoiner.add(String.valueOf(arr[j]));
                    break;
                }

                stringJoiner.add(String.valueOf(arr[j]));
            }
            if(satisfied) {
                System.out.println("sub array sum to " +sum+" :"+stringJoiner);
                break;
            }
        }


    }
}
