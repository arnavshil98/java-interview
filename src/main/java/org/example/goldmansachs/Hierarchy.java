package org.example.goldmansachs;

public class Hierarchy {

    public static int reportees(int n){
        if((n!=1 || n%3!=0) && n>9){
            return 0;
        }
        if(n==1){
            return reportees(n+2) + 3;
        }else {
            return reportees(n+3) + 3;
        }

    }

    public static void main(String[] args) {
        System.out.println(reportees(3));
    }
}
