package org.example.javacore;

import org.example.designPattern.ParentTest;

 class ChildTest  extends ParentTest {

    @Override
    public void execute(){
        System.out.println("child execute");
    }


    public static void main(String[] args) {
        ChildTest test = new ChildTest();
        test.execute();


        ParentTest test1 = new ParentTest();
//        test1.test(); default
//        test1.execute(); protected
        test1.testM();// public

    }

}
