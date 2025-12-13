package org.example.goldmansachs;

public class StepsCount {

    public static int step(int n){
        if(n==1)
            return 1;
        else if(n==2)
            return 2;
        else if(n==3)
            return 4;
        else
        return step(n-1)+ step(n-2) + step(n-3);
    }
    public static void main(String[] args) {
        System.out.println(step(3));
    }
}
