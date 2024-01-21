package org.example;

import java.util.HashMap;
import java.util.Map;

@FunctionalInterface
interface FuncInterface
{
    // An abstract function
    void abstractFun(int x, String y);

    // A non-abstract (or default) function
    default void normalFun()
    {
        System.out.println("Hello");
    }

    static void print(String str){
        System.out.println("Printing "+str);
    }
}
public class LambdaClassTest {
    public static void main(String[] args) {
// anonymous inner class
        FuncInterface obj = (x,y) -> {
            System.out.println(x);
            System.out.println(y);
        };

        obj.abstractFun(2,"b");




        Map<String, Integer> ItemToPrice = new HashMap<>();

        ItemToPrice.put("apple",100);
        ItemToPrice.put("orange",60);
        ItemToPrice.put("mango",80);
        ItemToPrice.put("guava",40);

        ItemToPrice.forEach((x,y)-> System.out.println("furit "+ x + " price: " + y));

    }
}
