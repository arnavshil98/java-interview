package org.example.CommonCodingQuestions.arraygfg;

public class PeakNumber {
    public static void main(String[] args) {
        int array[]= {5, 10, 20, 15};

        for(int i = 1; i<array.length-1; i++){
         if(array[i]>array[i+1] && array[i]>array[i-1]){
             System.out.println(array[i]);
             break;
         }
        }
    }
}
