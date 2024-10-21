package org.example.gfg.dsa.array;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamArr {

        public static void main(String[] args) {
      String s1=  new String("hello");
      String s2=  new String("hello");
            System.out.println(s1==s2);

            Arrays.asList("hello","ywllo","hi","bye").stream().collect(Collectors.counting());
        }
}
