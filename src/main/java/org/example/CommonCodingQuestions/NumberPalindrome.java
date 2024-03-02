package org.example.CommonCodingQuestions;

public class NumberPalindrome {
    public static void main(String[] args) {
    int n = 1213;
    String str = "";
    String[] nStr = String.valueOf(n).split("");
    for(int i=nStr.length-1; i>=0;i--){
            str = str.concat(nStr[i]);

        }
    if(str.equals(String.valueOf(n))) {
        System.out.println("palindrome numbers");
    }
    else{
        System.out.println("not palindrome");
    }
    }
}
