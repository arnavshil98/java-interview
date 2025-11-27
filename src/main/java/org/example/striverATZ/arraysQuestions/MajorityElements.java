package org.example.striverATZ.arraysQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MajorityElements {
    public static int majorityElement(int[] arr) {

        Map<Integer,Integer> hm = new HashMap<>();
        for (int i: arr
             ) {
            if(hm.get(i)==null){
                hm.put(i,1);
            }
            else {
                hm.put(i,hm.get(i)+1);
            }
        }

        Integer cutoff = arr.length/2;

        int majorityKey = -1;
        for (Map.Entry<Integer,Integer> data:hm.entrySet()){

                    if(data.getValue() > cutoff){
                        majorityKey = data.getKey();
                        break;
                    }

        }

        return majorityKey;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{7, 0, 0, 1, 7, 7, 2, 7, 7};
        int key = majorityElement(arr);
        System.out.println(key);
    }
}
