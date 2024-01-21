package org.example.javacore;
import java.lang.Cloneable;
public class CloneableTest implements Cloneable {
  CloneableTest cloneMeth() throws CloneNotSupportedException{
        return (CloneableTest) super.clone();
    }
    public static void main(String[] args) {
        try{
            CloneableTest test = new CloneableTest();
            CloneableTest response =   test.cloneMeth();
            System.out.println(response instanceof CloneableTest);

        }catch (CloneNotSupportedException ex){
            System.out.println(ex.getMessage());
        }

    }
}