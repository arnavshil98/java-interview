package org.example;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.stream.Collectors;

enum Call{
    RECEIVED, DROP
}

public class EnumSetPrac {
    public static void main(String[] args) {
        EnumSet<Call> set1 = EnumSet.of(Call.DROP, Call.RECEIVED);
        System.out.println(set1);


        Arrays.stream(Call.values()).forEach(System.out::println);
    }



}
