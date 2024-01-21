package org.example.javacore;


class Base{

    static class Apple{
        static int i = 1;
        static String s = "hi";

        public static void test(){
            System.out.println("i: "+ i + " s: "+ s);
        }

    }
}

public class NestedClassTest {

static  String st = "hello";
    public static void main(String[] args) {
        System.out.println(st);
        Base.Apple.test();

    }

}
