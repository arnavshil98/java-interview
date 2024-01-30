package org.example.CommonCodingQuestions;

import java.util.HashMap;

public class DistinctCharCount {
    public static void main(String[] args) {
        String str = "aabbbdccdcd";
        char[] arr = str.toCharArray();

        HashMap<Character,Integer> characters = new HashMap<>();

        for(char i:arr){
            if(!characters.containsKey(i)){
                characters.put(i,1);
            }else {
                Integer value = characters.get(i);
                characters.put(i,value+1);
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        characters.forEach((x,y)-> {stringBuffer.append(x).append(y);});

        System.out.println(stringBuffer);

    }
}
