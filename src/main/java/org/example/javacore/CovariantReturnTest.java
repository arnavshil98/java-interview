package org.example.javacore;


class A{
}

class B extends A{
}

class C extends B{
    A test(){
        return  new A();
    };

}

class D extends C{
    B test(){
        return new B();
    }
}



public class CovariantReturnTest {


    public static void main(String[] args) {
        C c = new C();

        System.out.println(c.test() instanceof A);

        D d = new D();


        System.out.println(d.test() instanceof B);
    }
}
