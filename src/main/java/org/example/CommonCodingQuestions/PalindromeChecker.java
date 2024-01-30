package org.example.CommonCodingQuestions;

public class PalindromeChecker {
    public static void main(String[] args) {
        String str = "abccba";
        String s1 = new String();
        String s2 = new String();
        s2 = str.substring(3,6);
        System.out.println(s2);

        for(int i = (str.length()/2)-1; i>=0; i--){
            s1 = s1+ str.charAt(i);
        }

        System.out.println(s1);
        System.out.println(s1.equals(s2));

    }
}
