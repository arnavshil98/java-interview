package org.example.javacore;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {

        Scanner  in    = new Scanner(System.in);
        System.out.print("input limit:");
        String[] input = new String[Integer.valueOf(in.nextLine())];

        /*
         nextLine() will move the cursor to next line and return the value of the
          line from which it traversed latest.
         */

        for (int i = 0; i < input.length; i++) {
            input[i] = in.nextLine();
        }

        System.out.printf("\nYour input:\n");
        for (String s : input) {
            System.out.println(s);
        }

    }
}
