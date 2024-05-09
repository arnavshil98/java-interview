package org.example.javacore;

import java.util.HashMap;

public class HashMapDeepCopy implements Cloneable{

 private Integer i;
 private String s;

    public HashMapDeepCopy(Integer i, String s) {
        this.i = i;
        this.s = s;
    }

    @Override
   protected HashMapDeepCopy clone() throws CloneNotSupportedException {
        return (HashMapDeepCopy)super.clone();
    }

    @Override
    public String toString() {
        return "HashMapDeepCopy{" +
                "i=" + i +
                ", s='" + s + '\'' +
                '}';
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

    public static void main(String[] args) throws CloneNotSupportedException {

        HashMapDeepCopy hashMapDeepCopy = new HashMapDeepCopy(2, "original");
        HashMapDeepCopy hashMapDeepCopyClone = hashMapDeepCopy.clone();

        System.out.println(hashMapDeepCopy.toString());
        System.out.println(hashMapDeepCopyClone.toString());

        hashMapDeepCopy.setI(3);
        hashMapDeepCopy.setS("updated");

        System.out.println(hashMapDeepCopy.toString());
        System.out.println(hashMapDeepCopyClone.toString());

    }
}
