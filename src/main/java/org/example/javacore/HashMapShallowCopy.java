package org.example.javacore;

public class HashMapShallowCopy implements Cloneable{

    private Integer i;
    private String s;

    public HashMapShallowCopy(Integer i, String s) {
        this.i = i;
        this.s = s;
    }

    @Override
    protected HashMapShallowCopy clone() throws CloneNotSupportedException {
        return this;
    }

    @Override
    public String toString() {
        return "HashMapShallowCopy{" +
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

        HashMapShallowCopy hashMapShallowCopy = new HashMapShallowCopy(2, "original");
        HashMapShallowCopy hashMapShallowCopyClone = hashMapShallowCopy.clone();

        System.out.println(hashMapShallowCopy.toString());
        System.out.println(hashMapShallowCopyClone.toString());

        hashMapShallowCopy.setI(3);
        hashMapShallowCopy.setS("updated");

        System.out.println(hashMapShallowCopy.toString());
        System.out.println(hashMapShallowCopyClone.toString());

    }
}
