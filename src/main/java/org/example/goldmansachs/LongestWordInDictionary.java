package org.example.goldmansachs;

import java.util.List;

public class LongestWordInDictionary {

    public static int maxLengthWord(String word, List<String> dict){
        int wordLength = 0;
        int matchCount = 0;
        int maxLength  = 0;
        for (String val: dict
             ) {
            int i=0;
            while (i<val.length()){
                wordLength = val.length();
            }
        }
return 0;
    }
    public static void main(String[] args) {
        String word = "abppplee";
        List<String> dict = List.of("able","ale","apple","bale");
       int length =  maxLengthWord(word,dict);
        System.out.println(length);
    }
}
