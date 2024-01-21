package org.example;

import java.util.Comparator;

public class ComparatorPriceTest implements Comparator<ComparatorPriceTest> {

    String name;
    Integer price;

    public ComparatorPriceTest(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public ComparatorPriceTest() {

    }


    // compares two different objects
    @Override
    public int compare(ComparatorPriceTest o1, ComparatorPriceTest o2) {
      // ascending order
        if (o1.price > o2.price) return 1;
        else if (o1.price < o2.price) return -1;
        else return 0;
    }

}
