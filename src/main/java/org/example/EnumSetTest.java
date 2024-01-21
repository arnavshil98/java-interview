package org.example;


import java.util.EnumSet;
public class EnumSetTest {
    public static void main(String[] args){
        EnumSet<EnumList> set1, set2;

        set1 = EnumSet.of(EnumList.TEST);
        set2 = EnumSet.of(EnumList.DEBUG,EnumList.PROD);

        System.out.println(set1);
        System.out.println(set2);

        System.out.println(EnumList.TEST.name());
        System.out.println(EnumList.TEST.name() instanceof String);

    }
}
