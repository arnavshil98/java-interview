package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableMain {

    public static void main(String[] args) {
        ArrayList<ComparableTest> al = new ArrayList<>();
        al.add(new ComparableTest("ted",20000));
        al.add(new ComparableTest("teda",10000));
        al.add(new ComparableTest("feda",70000));

        Collections.sort(al); // compareTo(class x); natural sorting

        for (ComparableTest movie : al)
            System.out.println(movie.price + " "
                    + movie.name);
    }
}
