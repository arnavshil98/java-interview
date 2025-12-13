package org.example.goldmansachs;

import java.util.ArrayList;
import java.util.List;

public class NonRepeatingCharacters {

    public static void nonRepeatCharacter(String word){
        word = word.toUpperCase();
        boolean flag = false;
        for(char i : word.toCharArray()){
            if(word.indexOf(i)==word.lastIndexOf(i)){
                System.out.println("First non repeating character is : "+i);
                flag=true;
                break;
            }
        }
        if(!flag)
            System.out.println("Everything repeats here");

    }

    public static void main(String[] args) {
        nonRepeatCharacter("papaya");
    }
}
