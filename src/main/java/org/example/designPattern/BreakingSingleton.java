package org.example.designPattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class BreakingSingleton {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        SingletonTest singletonTest = SingletonTest.getInstance();
        SingletonTest singletonTest1  = SingletonTest.getInstance();

        System.out.println(singletonTest.hashCode());
        System.out.println(singletonTest1.hashCode());

        /*
            approach: constructor access and remove private access
            grant full access, then create new object
         */

        SingletonTest singletonTest2 = null;
        Constructor<? extends SingletonTest> constructor =  SingletonTest.class.getDeclaredConstructor();

            constructor.setAccessible(true);

        singletonTest2 = (SingletonTest) constructor.newInstance();
        System.out.println(singletonTest2.hashCode());

    }
}
