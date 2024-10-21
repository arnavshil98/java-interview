package org.example;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class IteratingTest {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        li.add(2);
        li.add(4);
        li.add(1);
        li.add(8);
/*
 iterator concurrent modification is not possible
 use java.util.concurrent.ConcurrentHashMap
 or java.util.concurrent.CopyOnWriteArrayList
 */

        Collections.sort(li, Comparator.reverseOrder());
        Iterator<Integer> iterator = li.iterator();
        while (iterator.hasNext()) {
            li.set(2, 9);

            if (iterator.next() == 4) {
                iterator.remove();
            }
        }

        System.out.println(li);


        // reverse order iteration using list iterator

        // we have to pass size only in case of reverse traversal

        ListIterator<Integer> listIterator = li.listIterator(li.size()); // we have to pass size of list
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

        // we don't need to pass size in this case
        ListIterator<Integer> iterator1 = li.listIterator();

        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());

        }


    /*
     enumeration works only on legacy classes i.e. vectors and hashtable
     modification is not possible , read only
     */


        Vector<Integer> vector = new Vector<>(); // thread safe , synchronized
        vector.add(2);
        vector.add(4);
        vector.add(1);
        vector.add(8);
// iterator concurrent modification is possible
        Enumeration<Integer> iterator12 = vector.elements(); // read-only

        while (iterator12.hasMoreElements()) {
            vector.set(2, 9);
            iterator12.nextElement();
// note: remove method is not available in enumeration
//            if(iterator1.nextElement()==4){
//                iterator1.remove();
//            }
        }
        System.out.println("vector");
        System.out.println(vector);


        Hashtable<Integer, String> hash
                = new Hashtable<Integer, String>();

        // Inserting key-value pairs into hash table
        // using put() method
        hash.put(1, "Geeks");
        hash.put(2, "for");
        hash.put(3, "Geeks");

        // Now creating an Enumeration object
        //  to read elements
        Enumeration<String> e = hash.elements();

        // Condition holds true till there is
        // single key remaining

        // Printing elements of hashtable
        // using enumeration
        while (e.hasMoreElements()) {

            // Printing the current element
            System.out.println(e.nextElement());
        }


        /*
        fail fast and fail safe
         */
        Map<String, Integer> hm1 = new HashMap<>();
        hm1.put("one", 1);
        hm1.put("two", 2);
        hm1.put("three", 3);
        hm1.put("four", 4);

        System.out.println("######### fail fast #########");
        Iterator<String> itr = hm1.keySet().iterator();

        while (itr.hasNext()) {
            System.out.println(hm1.get(itr.next()));
            hm1.put("five", 5); // concurrent modification exception

        }

        ConcurrentHashMap<String, Integer> hm2 = new ConcurrentHashMap<>();
        hm2.put("one", 1);
        hm2.put("two", 2);
        hm2.put("three", 3);
        hm2.put("four", 4);

        System.out.println("######### fail fast #########");
        Iterator<String> itr2 = hm2.keySet().iterator();

        while (itr2.hasNext()) {
            System.out.println(hm2.get(itr2.next()));
            hm2.put("five", 5);

        }
    }
}
