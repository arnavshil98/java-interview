package org.example.designPattern;

interface Bird{
    public void chirp();
}

class Sparrow implements Bird{

    @Override
    public void chirp() {
        System.out.println("chi-chi");
    }
}

interface Animal{
    public void sound();
}


class Dog implements Animal{

    @Override
    public void sound() {
        System.out.println("bhow-bhow");
    }
}


class AdapterDesign implements Animal{

    Bird bird;
    public AdapterDesign(Bird bird){
        this.bird = bird;
    };
    @Override
    public void sound() {
        System.out.println("animal sound");
        this.bird.chirp();
    }
}

public class AdapterMain {
    public static void main(String[] args) {
        AdapterDesign adapterDesign = new AdapterDesign(new Sparrow());
        adapterDesign.sound();

    }
}
