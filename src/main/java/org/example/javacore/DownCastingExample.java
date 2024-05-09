package org.example.javacore;

class CastExample{
    public void test(){
        System.out.println("this is CastExample test method");
    }
}
public class DownCastingExample extends  CastExample{

    @Override
    public void test(){
        System.out.println("this is DownCastingExample test method");
    }
    public static void main(String[] args) {
        CastExample downCastingExample = new DownCastingExample();
        DownCastingExample downcastedClass = (DownCastingExample) downCastingExample;
        downcastedClass.test();
    }
}
