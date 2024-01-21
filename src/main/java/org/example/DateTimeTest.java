package org.example;

import java.util.regex.Pattern;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateTimeTest {
   public static void main(String[] args) {
    Boolean isFormatted =   Pattern.matches("(((20[012]\\d|19\\d\\d)|(1\\d|2[0123]))-((0[0-9])|(1[012]))-((0[1-9])|([12][0-9])|(3[01])))"
            ,"1997-10-02");
      System.out.println(isFormatted);

      ////////////////////// vowel test //////////////

       System.out.println("vowel test: "+"a".matches("[aeiouAEIOU]"));
       System.out.println("vowel test: "+"a".matches("/*[aeiou]/*"));

       ////////////////////// vowel test //////////////

      LocalDate dt =  LocalDate.of(1997, Month.JULY,1);
      DateTimeFormatter ft = DateTimeFormatter.ofPattern("dd-MM-YYYY");
      String formattedDate = dt.format(ft);
      System.out.println(formattedDate);
   }
}
