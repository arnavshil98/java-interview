package org.example.goldmansachs;

import java.util.HashSet;
import java.util.Set;

public class Panagram {

    public static boolean isPanagram(String s){

        String[] arr = s.split("");
        Set<String> uniqueCharacters = new HashSet<>();
        for (String str: arr
             ) {
            if(str.matches("[a-zA-Z]"))
                uniqueCharacters.add(str);
        }
        return uniqueCharacters.size()==26;
    }
    public static void main(String[] args) {
       boolean isPanagram =  isPanagram("The quick brown fox jumps over a lazy dog");
        System.out.println(isPanagram);
    }
}
