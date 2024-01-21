package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionsTest {

    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, -1, -2, 4};

        Arrays.stream(array).sorted().forEach(System.out::println);
        Integer addition = Arrays.stream(array).sorted().reduce(0,Integer::sum);
        System.out.println("*****");
        System.out.println(addition);
    }

}
