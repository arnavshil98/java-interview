package org.example;

import java.util.ArrayList;
import java.util.StringJoiner;

public class StringTest {
    public static void main(String[] args) {
    // byte to string
    byte [] byArr = {71,72,71};
    // char to string
    char [] chArr = {'K','Y','L'};

    String st  = new String(byArr);
    String st1 = new String(chArr);
    System.out.println(st);
    System.out.println(st1);
        System.out.println( st.toCharArray().length);
        System.out.println(st.startsWith("g".toUpperCase()));

        System.out.println(st.substring(0,3));  // fromIndex included, toIndex not included

        /*
        string buffer is thread safe as has synchronised method in it,
         while string builder is thread unsafe.
         */

        // string to string buffer
        StringBuffer sb = new StringBuffer(st);

        String name = "Sachin";
        name = name.concat(" Tendulkar");
        System.out.println(name);
        /*
        As you can see in the given figure that two objects are created but
         s reference variable still refers to “Sachin” and not to “Sachin Tendulkar”. But if we explicitly
        assign it to the reference variable, it will refer to the “Sachin Tendulkar” object.
         */
        String s1 = "TAT";
        String s2 = "TAT";
        String s3 = new String("TAT");
        String s4 = new String("TAT");

        System.out.println(s1==s1); // true
        System.out.println(s1==s2); // true they refer same heap memory
        System.out.println(s3==s4); // false




        // Creating an empty ArrayList of string type
        ArrayList<String> al = new ArrayList<>();

        // Adding elements to above List
        al.add("Ram");
        al.add("Shyam");
        al.add("Alice");
        al.add("Bob");

        // Creating object of class inside main()
        StringJoiner sj1 = new StringJoiner(",");

    System.out.println(sj1.add(al.get(0)).add(al.get(1)));

    }
}