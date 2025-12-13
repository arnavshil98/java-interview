package org.example.goldmansachs;

public class MaxRepeatingCharacter {

    public static int maxRepeatingCharacters(String str){
    int index = 1;
    char oldChar = str.charAt(0);
    int maxCount = 1;
    int currentCount = 1;
    while(index<str.length()){
        if(str.charAt(index)==oldChar){
            currentCount++;
            index++;
        }else{
            maxCount = Math.max(currentCount,maxCount);
            oldChar = str.charAt(index);
            currentCount = 1;
            index++;
        }
    }

    return maxCount;
    }
    public static void main(String[] args) {
        String s = " aabbbbbccccccccccAAAaaaaaa";

        System.out.println(maxRepeatingCharacters(s));
    }
}
