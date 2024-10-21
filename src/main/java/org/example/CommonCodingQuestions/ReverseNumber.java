package org.example.CommonCodingQuestions;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 12345;
        int reverse = 0;

        while(num!=0){
            int remainder = num%10;
            reverse = reverse*10 + remainder;
            num = num/10;
        }
        System.out.println("Reversed number: " + reverse);
    }
}
