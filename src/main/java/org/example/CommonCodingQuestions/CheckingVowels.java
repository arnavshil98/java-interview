package org.example.CommonCodingQuestions;
import java.util.Scanner;
import java.util.regex.*;
public class CheckingVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str);
        Boolean isVowel =  str.matches(".*[aeiou].*");
        System.out.println(isVowel);
    }
}
