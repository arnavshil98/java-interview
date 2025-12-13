package org.example.goldmansachs;

public class MaxOccuringSubstring {

    public static void printMaxOccurenceAndIndex(String s){
        int maxCountStartIndex = 0;
        int maxCount = 1;
        char oldChar = s.charAt(0);
        int currentCount = 1;
        int index = 1;
        while(index<s.length()){
            if(s.charAt(index)==oldChar){
                currentCount++;
            }else{
//                maxCount = Math.max(currentCount,maxCount);
                oldChar = s.charAt(index);
                if(currentCount>maxCount){
                    // index is current and changed from old
                    maxCountStartIndex = index-currentCount;
                    maxCount = currentCount;
                    currentCount = 1;
                }else{
                    currentCount = 1;
                }
            }
            index++;
        }

        if(currentCount>maxCount){
            // index is current and changed from old
            maxCountStartIndex = (index)-currentCount;
            maxCount = Math.max(maxCount,currentCount);
        }
         // edge case for last char max length and no change in element after that
        // hence the else in while loop won't work

        System.out.println("maxCount: " + maxCount + " maxCountStartIndex: " + maxCountStartIndex);
    }
    public static void main(String[] args) {
String s = "aaabbbbcccaaaaaaa";
        printMaxOccurenceAndIndex(s);
    }
}
