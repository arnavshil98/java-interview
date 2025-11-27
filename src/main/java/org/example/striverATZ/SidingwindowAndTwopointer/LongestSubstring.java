package org.example.striverATZ.SidingwindowAndTwopointer;
import java.util.*;
public class LongestSubstring {

    public static int lengthOfLongestSubstring(String s) {
        Map<String,Integer> distinctCount = new HashMap<String,Integer>();
        String[] arr = s.trim().split("");
        if(s.isEmpty()){
            return 0;
        }
        int i = 0; int j=0;
        int maxSize = 0;
        while(i<arr.length){
            if(j<arr.length)
            {
                if(!distinctCount.containsKey(arr[j])||j<arr.length){
                    distinctCount.put(arr[j],1);
                    j++;
                }else{
                    // duplicate entry
                    // size of substring
                    int currentSize = distinctCount.entrySet().size();
                    maxSize = Math.max(maxSize,currentSize);
                    distinctCount = new HashMap<>();
                    i++;
                    j=i;
                }
            }else{
                // we have reached end of string, the above condition fails
                // reducing window to new i
                int currentSize = distinctCount.entrySet().size();
                maxSize = Math.max(maxSize,currentSize);
                distinctCount = new HashMap<>();
                i++;
                j=i;
            }
        }

        return maxSize;

    }
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }
}
