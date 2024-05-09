package org.example.javacore;

import java.lang.reflect.Field;

class Apple{
    String name = "kashmiri";
    int count = 0;
}
public class JavaReflection {

    public static void main(String[] args) {

    /*
     we can use java reflection to make copy of the original java class.
     we can use this to break singleton class.
     we can also use shallow copy to break singleton class
     */

       Class<? extends Apple> apple =  Apple.class;
       Field[] fields = apple.getDeclaredFields();

       for (Field f: fields){
           System.out.println(f.getName());
       }

    }
}
