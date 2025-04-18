package org.example.streamapi;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class HmSorting {
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(1,"a");
        hm.put(3,"c");
        hm.put(2,"b");
        hm.put(4,"d");

        HashMap<Integer,String> hm2  = hm.entrySet().stream().sorted(Map.Entry.<Integer,String>comparingByKey().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,
                        (v1,v2)->v2, LinkedHashMap::new));

        hm2.forEach((x,y)-> System.out.println("x: "+x+" y: "+y));

        Arrays.stream("aabbcccdddd".split("")).distinct().forEach(System.out::println);
        Arrays.stream("abcd".split("")).map(e->new StringBuilder(e).reverse()).forEach(System.out::print);

    }


}
