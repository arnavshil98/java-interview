package org.example;

import java.util.Optional;


public class OptionalTest {

    static  Optional<Integer> getData(Integer x){
        return  Optional.of(x);
    }

    public static void main(String[] args) {

        System.out.println(Optional.ofNullable(null));
        Optional<String> checkForWord = Optional.ofNullable("sw");
        /*
            of Nullable returns Optional[null] else Optional[1]
         */
        System.out.println(checkForWord.isPresent());

        if(checkForWord.isPresent()){
            System.out.println(checkForWord.get());
        }else {
            System.out.println("null");
        }
    }
}
