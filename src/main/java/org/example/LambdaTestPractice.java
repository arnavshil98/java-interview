package org.example;

interface Testing{
    default void count(){
        System.out.println("this is default Testing counting method");
    }

    public void abstractMeth();
}

interface Testing1{
    public void abstractMeth();
    default void count(){
        System.out.println("this is default Testing1 counting method");
    }
}

public class LambdaTestPractice implements Testing,Testing1{

    @Override
    public void count(){
        Testing.super.count();
    }

    @Override
    public void abstractMeth() {
        System.out.println("implemented class");
    }
    public static void main(String[] args) {
        LambdaTestPractice lambdaTestPractice = new LambdaTestPractice();
        lambdaTestPractice.abstractMeth();
        lambdaTestPractice.count();
    }


}
