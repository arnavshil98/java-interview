package org.example.designpatterrnPractice;


class BuilderClass{

    private  int i;
    private  String s;

    public  BuilderClass setI(int i1){
        this.i = i1;
        return this;
    }

    public  BuilderClass setS(String s1){
        this.s = s1;
        return  this;
    }

    public  BuilderClass getInstance(){
        return this;
    }

    @Override
    public String toString() {
        return "BuilderClass{" +
                "i=" + i +
                ", s='" + s + '\'' +
                '}';
    }
}
public class BuilderPractice {
    public static void main(String[] args) {
        BuilderClass builderClass = new BuilderClass().setI(1).setS("hello").getInstance();
        System.out.println(builderClass.toString());

    }
}
