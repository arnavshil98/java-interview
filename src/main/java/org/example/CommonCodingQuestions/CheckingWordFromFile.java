package org.example.CommonCodingQuestions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckingWordFromFile {

    static boolean isPresent(String path, String word) throws FileNotFoundException {
        File file = new File(path);
        System.out.println(file.length());
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine()){
         String line  = sc.nextLine();
            System.out.println("line: " + line);
            if(line.contains(word)){
                return true;
            }
         }
        return false;
    }

    public static void main(String[] args) throws FileNotFoundException {
       Boolean has =  isPresent("C:\\Users\\arnav\\Documents\\resume\\Arnav Shil_resume_new.docx","java");
        System.out.println(has);
    }

}
