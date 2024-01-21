package org.example;

import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapPrc {

    public static void main(String[] args) {
        Map<String,Integer> hm = new IdentityHashMap<>();
        hm.put("A",1);
        hm.put(new String("A"),1);

        hm.forEach((x,y)->{
            System.out.println("furit "+ x + " price: " + y);
        });

    }

}
