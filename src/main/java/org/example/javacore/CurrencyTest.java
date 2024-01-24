package org.example.javacore;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyTest {

    public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);
    double payment = scanner.nextDouble();

    NumberFormat usCurrencyFormatter = NumberFormat.getCurrencyInstance(Locale.US);
    String us =  usCurrencyFormatter.format(payment);

    NumberFormat chinaCurrencyFormatter = NumberFormat.getCurrencyInstance(Locale.CHINA);
    String china =  chinaCurrencyFormatter.format(payment);

    NumberFormat franceCurrencyFormatter = NumberFormat.getCurrencyInstance(Locale.FRANCE);
    String france =  franceCurrencyFormatter.format(payment);

// format for india is not available
    NumberFormat indiaCurrencyFormatter = NumberFormat.getCurrencyInstance(new Locale("en","india"));
    String india =  indiaCurrencyFormatter.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);

    }

}
