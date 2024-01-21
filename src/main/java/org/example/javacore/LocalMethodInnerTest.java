package org.example.javacore;

public class LocalMethodInnerTest {

    public int getClassA(int i){
        // here private class is not allowed
        class A{
            int i;
            public A(int i){
                this.i = i;
            }

            public int getI(){
                return i;
            }
        }

        A a = new A(i);
        return a.getI();
    }

    public static void main(String[] args) {
        LocalMethodInnerTest test = new LocalMethodInnerTest();
        System.out.println(test.getClassA(9));
    }
}
