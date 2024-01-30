package org.example.CommonCodingQuestions;

public class CheckingPrime {
    public static void main(String[] args) {

        int n = 17;
        Boolean composite = false;
        for(int i = 2; i<n/2; i++){
            if(n%i==0){
                composite = true;
            }
        }

        System.out.println(composite);


    }
}
