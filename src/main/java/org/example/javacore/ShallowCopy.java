package org.example.javacore;

public class ShallowCopy implements Cloneable{

    private Integer i;
    private String s;

    public ShallowCopy(Integer i, String s){
        this.i = i;
        this.s = s;
    }


    @Override
    public Object clone() {
        return this;
    }

    public Integer getI() {
        return i;
    }

    public void setI(Integer i) {
        this.i = i;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return "ShallowCopy{" +
                "i=" + i +
                ", s='" + s + '\'' +
                '}';
    }

    public static void main(String[] args) throws CloneNotSupportedException {

        ShallowCopy deepCopyClass = new ShallowCopy(1,"hello");
        ShallowCopy deepCopyClass1 = (ShallowCopy) deepCopyClass.clone();

        System.out.println(deepCopyClass);
        System.out.println(deepCopyClass1);

        deepCopyClass1.setI(2);
        deepCopyClass1.setS("my god");

        System.out.println(deepCopyClass);
        System.out.println(deepCopyClass1);
    }
}
