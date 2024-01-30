package org.example.CommonCodingQuestions;

public class SecondHighestInteger {

    static int secondHighest(int arr[]){
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;


        for(int i: arr){
            if(i>highest){
                secondHighest = highest;
                highest = i;
            } else if (i>secondHighest) {
                secondHighest = i;
            }
        }

        return secondHighest;

    }
    public static void main(String[] args) {

        int[] arr = {2,5,1,8,9};
       int index =  secondHighest(arr);
        System.out.println(index);
    }
}
