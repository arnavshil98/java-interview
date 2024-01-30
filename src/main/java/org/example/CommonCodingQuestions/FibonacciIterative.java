package org.example.CommonCodingQuestions;

import java.util.ArrayList;
import java.util.List;

public class FibonacciIterative {
    public static void main(String[] args) {
        Integer a = 0;
        Integer b = 1;
        Integer c = 1;
        List<Integer> li = new ArrayList<>();
       li.add(a);li.add(b);li.add(c);
        for(int i=0; i<5; i++){

         int sum = b+c;
         b = c;
         c = sum;
         li.add(sum);

        }

        li.forEach(System.out::println);

    }
}
