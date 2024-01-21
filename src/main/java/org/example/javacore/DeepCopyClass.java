package org.example.javacore;

public class DeepCopyClass  implements Cloneable{

    private Integer i;
    private String s;

    public DeepCopyClass(Integer i, String s){
        this.i = i;
        this.s = s;
    }


    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
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
        return "DeepCopyClass{" +
                "i=" + i +
                ", s='" + s + '\'' +
                '}';
    }

    public static void main(String[] args) throws CloneNotSupportedException {

        DeepCopyClass deepCopyClass = new DeepCopyClass(1,"hello");
        DeepCopyClass deepCopyClass1 = (DeepCopyClass) deepCopyClass.clone();

        System.out.println(deepCopyClass.toString());
        System.out.println(deepCopyClass1.toString());

        deepCopyClass1.setI(2);
        deepCopyClass1.setS("my god");

        System.out.println(deepCopyClass.toString());
        System.out.println(deepCopyClass1.toString());
    }
}
