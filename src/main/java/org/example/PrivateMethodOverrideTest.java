package org.example;

/* #### OVERRIDE PRIVATE METHODS ###
 private methods of a class can't be overridden
 but calling it inside a public method will resolve the issue

 #### OVERRIDE STATIC METHOD ###
static method will be loaded into memory during compile time
hence can't be overridden by inheritance
 */
class A {
    public static void call() {
        System.out.println("class A call function");
    }

    private void display() {
        System.out.println("A.display");
    }

    public void callDisplay() {
        System.out.println("A.callDisplay");
        display();
    }
}

class B extends A {
    public static void call() {
        System.out.println("class B call function");
    }

    private void display() {
        System.out.println("B.display");
    }

    // need public method to call a private method in other class
    public void callDisplay() {
        System.out.println("B.callDisplay");
        display();
    }

}

public class PrivateMethodOverrideTest {
    public static void main(String[] args) {
        A b = new B(); // upcasting
        b.callDisplay();
        b.call();
    }
}
