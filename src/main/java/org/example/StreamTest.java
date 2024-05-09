package org.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

public class StreamTest {
    public static void main(String[] args) {

        // changing string to array and then sorting

        String s = "hello";
       char[]cha =  s.toCharArray();

    Arrays.sort(cha);

    for(char e:cha){
        System.out.println("element of char array:"+ e);
    }




        List<Integer> li = new ArrayList<>();
        li.add(2);
        li.add(7);
        li.add(8);
        li.add(3);
        li.add(4);
        li.add(1);

        // map
        li.stream().map(e->e*2).forEach(System.out::println);
      //   filter
        li.stream().filter(e->{ // only true value is passed successfully
            if(e%2==0)
            { return true;}
             else{return false;}
        }).forEach(System.out::println);

      //   sort
        // study comparator vs comparable
        li.stream().sorted((o1, o2) -> o2-o1).forEach(System.out::println); // reversed
        li.stream().sorted().forEach(System.out::println); // natural
        li.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        Boolean result =  li.stream().allMatch(i-> i>4); // return boolean
        System.out.println(result);

        // flatmap

        List<List<Integer>> fm = new ArrayList<>();
        fm.add(Arrays.asList(1,4,5));
        fm.add(Arrays.asList(7,9,15));
        fm.add(Arrays.asList(12,41,55));
        fm.add(Arrays.asList(19,41,51));

        fm.stream().flatMap(Collection::stream).forEach(System.out::println);
        System.out.println("###################");
        fm.stream().flatMap(e->Stream.of(e)).forEach(System.out::println);
        System.out.println("########## reduce #########");

        List<Integer> fmFlat =  fm.stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println(fmFlat);
        Integer sum  = fm.stream().flatMap(Collection::stream).reduce(0,(subtotal,i)-> subtotal + i);
        Integer sum1  = fm.stream().flatMap(Collection::stream).reduce(0,Integer::sum);
        Integer count  = fm.stream().flatMap(Collection::stream).reduce(0,Integer::max);
        System.out.println("###### sum #####");
        System.out.println(sum);
        System.out.println(sum1);
        System.out.println(count);

        // sorting hashmap

        Map<String, Integer> ItemToPrice = new HashMap<>();

        ItemToPrice.put("apple",100);
        ItemToPrice.put("orange",60);
        ItemToPrice.put("mango",80);
        ItemToPrice.put("guava",40);

        ItemToPrice.forEach((x,y)-> System.out.println("fruit "+ x + " price: " + y));

        Map<String, Integer> sortedByValue = ItemToPrice
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String,Integer>comparingByValue().reversed())
                .collect(
                        toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1,
                                LinkedHashMap::new));

        System.out.println(sortedByValue);

       // printing keys of the hashmap

        for (Map.Entry<String, Integer> e:ItemToPrice.entrySet()
             ) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        // reversed sorting for hashmap

        /*
         parallel stream
         stream that execute in parallel and make use of
         multiple processor cores

         2 types of stream
             1. sequential
             listOfNumbers.stream().forEach(number ->
             System.out.println(number + " " + Thread.currentThread().getName()));
             2. parallel
              List<Integer> listOfNumbers = Arrays.asList(1, 2, 3, 4);
              listOfNumbers.parallelStream().forEach(number ->
              System.out.println(number + " " + Thread.currentThread().getName()));

note:  However, the order of execution is out of our control. It may change every time we run the program:

              Parallel streams make use of the fork-join framework and its common pool of worker threads.

The fork-join framework was added to java.util.concurrent in Java 7 to handle task management between multiple threads.

         */


        List<Integer> lil = new ArrayList<>();
        lil.add(2);
        lil.add(7);
        lil.add(8);
        lil.add(3);
        lil.add(4);
        lil.add(1);
        System.out.println("####### parallel stream ##########");
        lil.parallelStream().forEach(System.out::println); // sequence of print is not maintained

        List<Integer> listOfNumbers = Arrays.asList(1, 2, 3, 4);
        int parallelSum = listOfNumbers.parallelStream().reduce(0, Integer::sum);
        System.out.println("parallelSum");
        System.out.println(parallelSum);
        /* fork-join framework will create multiple threads to get sum and all the individual
         thread will be summed up to give final output
         */

        List<Integer> listOfNumbers1 = Arrays.asList(1, 2, 3, 4);
        int seqSum = listOfNumbers.stream().reduce(0,Integer::sum);
        System.out.println("seqSum");
        System.out.println(seqSum);

    }
}
