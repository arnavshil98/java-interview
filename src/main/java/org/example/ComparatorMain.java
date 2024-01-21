package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ComparatorMain {
    public static void main(String[] args) {
        List<ComparatorPriceTest> al = new ArrayList<>();
        al.add(new ComparatorPriceTest("harry potter", 1230000));
        al.add(new ComparatorPriceTest("aero", 930000));
        Collections.sort(al, new ComparatorPriceTest()); // comparator sorting by price

        for (ComparatorPriceTest movie : al)
            System.out.println(movie.price + " " + movie.name);

        Collections.sort(al, new ComparatorNameTest()); // comparator sorting by name natural sorting internally by using .compareTo()

        for (ComparatorPriceTest movie : al)
            System.out.println(movie.price + " " + movie.name);
    }


}

