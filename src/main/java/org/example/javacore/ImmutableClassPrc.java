package org.example.javacore;

import java.util.HashMap;
import java.util.Iterator;

public final class ImmutableClassPrc {

    private final int i;
    private final HashMap<Integer,String> hm;

    public ImmutableClassPrc(int i, HashMap<Integer, String> hm) {
        this.i = i;

        // implementing deep copy;
        HashMap<Integer,String> tempHm = new HashMap<>();

        for (Integer key : hm.keySet()) {
            tempHm.put(key, hm.get(key));
        }
        this.hm = tempHm;
    }

    public int getI() {
        return i;
    }

    public HashMap<Integer, String> getHm() {
        return hm;
    }




    public static void main(String[] args) {

        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(1,"one");
        hm.put(2,"two");
        int i = 10;

        ImmutableClassPrc immutableClassPrc = new ImmutableClassPrc(i,hm);

        System.out.println(immutableClassPrc.getI());
        System.out.println(immutableClassPrc.getHm());


        hm.put(3,"three");
        // without deep copy , hm will be updated
        System.out.println(immutableClassPrc.getI());
        System.out.println(immutableClassPrc.getHm());

    }
}
