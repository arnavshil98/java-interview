package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnmodifiableCollectionPrc {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        li.add(1);
        li.add(4);
        li.add(6);
        li.add(9);

           li = Collections.unmodifiableList(li);
           li.add(2);




    }




}
