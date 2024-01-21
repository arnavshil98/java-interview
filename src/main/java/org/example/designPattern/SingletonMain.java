package org.example.designPattern;

 class SingletonTest {

    private static SingletonTest instance;
    private SingletonTest(){

    }
    public static SingletonTest getInstance(){
        if(instance==null){
            instance = new SingletonTest();
        }
        return instance;
    }

}

public class SingletonMain{
    public static void main(String[] args) {
        SingletonTest singletonTest1 = SingletonTest.getInstance();
        SingletonTest singletonTest2 = SingletonTest.getInstance();

        System.out.println(singletonTest1.hashCode());
        System.out.println(singletonTest2.hashCode());
        // equal hashcode hence, same instance is created every time

    }
}

