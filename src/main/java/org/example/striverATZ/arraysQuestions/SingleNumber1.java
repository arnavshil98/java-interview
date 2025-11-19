package org.example.striverATZ.arraysQuestions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SingleNumber1 {
    public static int singleNum(int[] arr){
        HashMap<Integer,Integer> hm = new HashMap<>();

        for (int num:arr
             ) {
            if(hm.get(num)==null){
                hm.put(num,1);
            }else{
                hm.put(num,hm.get(num)+1);
            }
        }

       List<Map.Entry<Integer,Integer>> list= hm.entrySet().stream().filter(x->x.getValue()==1)
               .collect(Collectors.toList());
        int val = -1;
        if(!list.isEmpty()){
            val = list.get(0).getKey();
        }

        return val;
    }
    public static void main(String[] args) {
//        System.out.println(null+1);
        System.out.println(singleNum(new int[]{1,2,2,4,3,1,4}));
    }
}
