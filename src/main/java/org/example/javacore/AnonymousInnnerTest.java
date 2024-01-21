package org.example.javacore;


interface AnonymousInterface{
    public void test();
    public void test1();
}

 class AnonymousClass{

    public void test(){
        System.out.println("AnonymousClass");
    }

 }

public class AnonymousInnnerTest {
    public void test(){
        System.out.println("this.AnonymousInnner");

    }
    public static void main(String[] args) {

        AnonymousInterface anonymousInterface = new AnonymousInterface() {
            @Override
            public void test() {
                System.out.println("AnonymousInnnerTest");
            }

            @Override
            public void test1() {
                System.out.println("AnonymousInnnerTest1");
            }
        };


        AnonymousClass anonymousClass = new AnonymousClass(){
            public void test(){
                System.out.println("AnonymousInnnerTest");
                super.test(); // every method of super class needs to be called inside a block
            }
        };

        anonymousInterface.test();
        anonymousInterface.test1();
        anonymousClass.test();

    }

}
