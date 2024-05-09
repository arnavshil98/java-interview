package org.example.javacore;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class ImmutableHashMapPrc {

    final Integer i;
    final String s;

    final HashMap<Integer,String> hm;


    public ImmutableHashMapPrc(Integer i, String s, HashMap<Integer, String> hm) {
        this.i = i;
        this.s = s;

        HashMap<Integer, String> tempHm = new HashMap<>(hm);
        this.hm = tempHm;

        // this.hm = hm;
    }

    public Integer getI() {
        return i;
    }

    public String getS() {
        return s;
    }

    public HashMap<Integer, String> getHm() {
        return hm;
    }

    @Override
    public String toString() {
        return "ImmutableHashMapPrc{" +
                "i=" + i +
                ", s='" + s + '\'' +
                ", hm=" + hm +
                '}';
    }

    public static void main(String[] args) {

        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(1,"a");
        hm.put(2,"b");
        hm.put(3,"c");
        ImmutableHashMapPrc immutableHashMapPrc = new ImmutableHashMapPrc(2,"java", hm);
        System.out.println(immutableHashMapPrc.toString());

        hm.put(4,"d");
        System.out.println(immutableHashMapPrc.toString());
    }
}
