package org.example.gfg.dsa.array;

// GCD is same as HCF
public class GCDofTwoNos {
    // GCD using euclidean approach

    public static int gcd(int a, int b) {
        if (a == 0) return a;
        if (b == 0) return b;
        if (a == b) return a;
        if (a > b) {
            return gcd(a - b, b);
        }
        return gcd(a, b - a);
    }


    public static void main(String[] args) {
        int a = 0, b = 12;
        System.out.println("GCD of " + a + " and " + b + " is " + gcd(a, b));
    }
}
