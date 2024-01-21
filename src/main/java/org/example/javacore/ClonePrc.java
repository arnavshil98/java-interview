package org.example.javacore;
import java.lang.Cloneable;
public class ClonePrc  implements Cloneable{

    static int i;
    static String s;

    static String p;
    public ClonePrc(int i, String s){
        this.i = i;
        this.s = s;
    }


    public static void test(){
        p = "sds";
    }

    @Override
    public String toString() {
        return "ClonePrc{" +
                "i=" + i +
                ", s='" + s + '\'' +
                '}';
    }

    public Object cloneObj() throws CloneNotSupportedException{
    return super.clone();
}

public static void main(String[] args) throws CloneNotSupportedException {
    ClonePrc obj = new ClonePrc(1,"hi");
    ClonePrc objClone = (ClonePrc)obj.cloneObj();

    System.out.println(obj.toString());
    System.out.println(objClone.toString());
    System.out.println(objClone instanceof ClonePrc);

}


}
