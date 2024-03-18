package org.example.CommonCodingQuestions.gfgstrings;
import java.util.*;
public class ReverseString {

   static int shortestDistance(ArrayList<String> s, String word1, String word2) {
        // code here

        int minDist = 0;
        int indexWord1=0;
        int indexWord2 = s.size();
        int k = 0;
        int diff = indexWord2 - indexWord1;
        for(String i:s ){
            if(i.equals(word1)){
                indexWord1 = k;
            }
            if(i.equals(word2)){
                indexWord2 = k;
            }
            int currentDiff = indexWord2-indexWord1;
            if(currentDiff<0){
                currentDiff = currentDiff * (-1);
            }
            if(currentDiff<diff){
                diff = currentDiff;
            }
            k++;

//
//            System.out.println("indexWord1:"+ indexWord1);
//            System.out.println("indexWord2:"+ indexWord2);
//            System.out.println("diff"+ diff);
        }
       if(diff<0){
           diff = diff * (-1);
       }
        return diff;
    }

    public static void main(String[] args) {
String str = "axa ffn ty bs oin bs axa";
String[] arr = str.split("\\s");

ArrayList<String> li = new ArrayList<>();
for(int i=0; i<arr.length;i++){
    li.add(arr[i]);
}
        System.out.println(shortestDistance(li,"bs","axa"));
    }

}
