package org.example.designPattern;
class PhoneBuilder{
    private int ram;
    private int cameraPixel;
    private String screen;

    public PhoneBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public PhoneBuilder setCameraPixel(int cameraPixel) {
        this.cameraPixel = cameraPixel;
        return this;
    }

    public PhoneBuilder setScreen(String screen) {
        this.screen = screen;
        return this;
    }

    public PhoneBuilder getInstance(){
        return this;
    }

    @Override
    public String toString() {
        return "PhoneBuilder{" +
                "ram=" + ram +
                ", cameraPixel=" + cameraPixel +
                ", screen='" + screen + '\'' +
                '}';
    }
}

public class BuilderMain
{
    public static void main(String[] args) {
        PhoneBuilder phoneBuilder = new PhoneBuilder();
        phoneBuilder.setRam(8).setCameraPixel(48).getInstance();

        System.out.println(phoneBuilder.toString());
    }
}