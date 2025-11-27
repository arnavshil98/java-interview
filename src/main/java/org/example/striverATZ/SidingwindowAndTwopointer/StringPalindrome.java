package org.example.striverATZ.SidingwindowAndTwopointer;

public class StringPalindrome {

    public static boolean isPalindrome(String word){

        int i=0, j= word.length()-1;
        if(word.isEmpty() || word.length()==1){
            return false;
        }
        boolean palindrome = true;
        while(i<=word.length()/2 - 1 & j>=word.length()/2){
            if(word.charAt(i)==word.charAt(j)){
                i++;j--;
            }else {
                palindrome = false;
                break;
            }
        }

        return palindrome;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("a"));
    }
}
