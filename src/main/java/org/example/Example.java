package org.example;

 class ParentClass {
    //private
     ParentClass() {
        // Private constructor
    }

    public static ParentClass createInstance() {
        // Static factory method to create an instance
        return new ParentClass();
    }
}

 class SubClass extends ParentClass {
    public SubClass() {
//        super(); // Calls the private constructor of the parent class
    }
}

public class Example {
    public static void main(String[] args) {
        // You cannot do this (since the constructor is private):
        // ParentClass obj = new ParentClass();

        // But you can create an instance using a static factory method:
        ParentClass obj = ParentClass.createInstance();

        // You can also create an instance of the subclass:
        SubClass subObj = new SubClass();
    }
}