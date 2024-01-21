package org.example;

public class StarPrint {
    public static void main(String[] args) {

       int g = 4;

        for (int i = 0; i <= 4; i++) {
            // loop to create space
            for (int f = g; f >=0; f--) {
                System.out.print(" ");
            }
            // loop to print star
               for (int x = 0; x < 2 * i - 1; x++) {
                   System.out.print("*");
               }
            g = g-1;
            System.out.print("\n");
        }



        int h = 0;

        for (int i = 4; i > 0; i--) {
            for (int f = h; f >=0; f--) {
                System.out.print(" ");
            }

            for (int x = 0; x < 2 * i - 1; x++) {
                System.out.print("*");
            }
            h = h+1;
            System.out.print("\n");
        }

    }
}
