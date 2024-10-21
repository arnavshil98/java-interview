package org.example;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class OptionalTest {

    static  Optional<Integer> getData(Integer x){
        return  Optional.of(x);
    }

    public static void main(String[] args) {

        System.out.println(Optional.ofNullable(null));
        Optional<String> checkForWord = Optional.ofNullable("hello");

        String s = checkForWord.orElse("NA");
        checkForWord.orElseThrow(()-> new IllegalArgumentException("Invalid word"));
        System.out.println("s:"+ s);
        /*
            of Nullable returns Optional[null] else Optional[1]
         */
//        Optional.of(null); --> exception as param should be not null
        System.out.println(checkForWord.isPresent());

        if(checkForWord.isPresent()){
            System.out.println(checkForWord.get());
        }else {
            System.out.println("null");
        }

        System.out.println(Optional.of("heeeeeeee").get());
        System.out.println(Optional.ofNullable(null) instanceof Optional);
        System.out.println(Optional.ofNullable("hello").orElse("Hi"));
//        Optional.ofNullable("Namaste").orElse("Hi");
        boolean namasteList = Optional.ofNullable("Namaste")
                .stream().collect(Collectors.toList()) instanceof List;
        System.out.println("namasteList:"+ namasteList);
    }
}
