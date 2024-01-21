package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchronisedListTest {
    public static void main(String[] args) {
        List<String> al = new ArrayList<>();

        // Adding elements to above List
        al.add("Ram");
        al.add("Shyam");
        al.add("Alice");
        al.add("Bob");

       List<String> li =  Collections.synchronizedList(al);

        synchronized (li){
            Iterator<String> it = li.iterator();
            while (it.hasNext()){
                System.out.println(it.next());
            }

        }

    }



}
