package org.example.CommonCodingQuestions;

public class Factorial {

    public static int factorial(int n){
        if(n==1 || n==0) return 1;

        return n * factorial(n-1);
    }
    public static void main(String[] args) {


        System.out.println(factorial(4));

    }
}
