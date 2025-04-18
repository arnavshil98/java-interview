package org.example.CommonCodingQuestions;


import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ReverseLinkedList {
    public static void main(String[] args) {
        List<Integer> ll = new LinkedList<>();
        ll.add(2);
        ll.add(6);
        ll.add(7);
        ll.add(8);
        Collections.reverse(ll);
        System.out.println(ll);
        // listIterator(***** important list.size() ****)
        ListIterator<Integer> reverseLi = ll.listIterator(ll.size());
        while(reverseLi.hasPrevious()){
            System.out.println(reverseLi.previous());
        }


        }


}
