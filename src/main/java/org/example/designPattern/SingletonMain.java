package org.example.designPattern;

class SingletonTest {

    private static SingletonTest instance;

    private SingletonTest() {
        if (instance != null) {
            throw new RuntimeException("Use getInstance() method to create instance");
        }
    }

    public static SingletonTest getInstance() {
        if (instance == null) {
            synchronized (SingletonTest.class) {
                instance = new SingletonTest();
            }
        }
        return instance;
    }

}

public class SingletonMain {
    public static void main(String[] args) {
        SingletonTest singletonTest1 = SingletonTest.getInstance();
        SingletonTest singletonTest2 = SingletonTest.getInstance();

        System.out.println(singletonTest1.hashCode());
        System.out.println(singletonTest2.hashCode());
        // equal hashcode hence, same instance is created every time

    }
}

