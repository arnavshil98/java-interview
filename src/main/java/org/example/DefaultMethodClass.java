package org.example;


interface Interface1{

    public void test();
    default void display(){
        System.out.println("display of interface 1");
    }

}

interface Interface2{
    public void test();
    default void display(){
        System.out.println("display of interface 2");
    }

}
public class DefaultMethodClass implements Interface1, Interface2{

    @Override
    public void test() {
        System.out.println("hi");
    }

//        @Override
//    public void display(){
//        //this will give compilation error as ambigious method will be used
//    }
    @Override
    public void display() {
        Interface1.super.display();
    }

    public static void main(String[] args) {
        DefaultMethodClass defaultMethodClass = new DefaultMethodClass();
        defaultMethodClass.display();
        defaultMethodClass.test();
    }

}
