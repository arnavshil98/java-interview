package org.example.CommonCodingQuestions;

public class PrintDiamond {
    public static void main(String[] args) {

        for(int i = 1; i<=3; i++){
            for(int j=3-i; j>=1;j--){
                System.out.printf(" ");
            }
            for(int k = 1; k<=i; k++){
                System.out.printf("*");
            }
            System.out.println("\n");
        }
    }
}
