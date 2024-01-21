package org.example;

import java.util.Comparator;

public class ComparatorNameTest implements Comparator<ComparatorPriceTest> {

    String name;
    Integer price;

    public ComparatorNameTest(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public ComparatorNameTest() {

    }

    // compares two different objects
    @Override
    public int compare(ComparatorPriceTest o1, ComparatorPriceTest o2) {
        return o1.name.compareTo(o2.name); // this is part of java.lang.String not comparable
    }

}

