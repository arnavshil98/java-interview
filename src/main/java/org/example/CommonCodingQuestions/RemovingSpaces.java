package org.example.CommonCodingQuestions;

public class RemovingSpaces {
    public static void main(String[] args) {
        String str = "geregtr sadfh";

        str = str.replaceAll("\\s","");
        System.out.println(str);

// trimming
        String str2 = " wqedergtr ";
        System.out.println(str2.length());
        str2 = str2.trim();
        System.out.println(str2.length());
    }
}
