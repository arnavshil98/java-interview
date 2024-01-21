package org.example;

public class ComparableTest implements Comparable<ComparableTest>{

    String name;
    Integer price;

    public ComparableTest(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public ComparableTest() {

    }
// NATURAL SORTING
    @Override
    public int compareTo(ComparableTest o) {
        return this.price -  o.price;
    }


}
