package org.example.CommonCodingQuestions;

public class MultiLevelSwitchCase {
    public static void main(String[] args) {
// multilevel switch case is available from java 14.
        int i = 8;
        switch (i){
            case 1: {
                System.out.println(1);
                break;
            }
            case 2:{
                System.out.println(2);
                break;
            }
            default:{
                System.out.println("NA");
                break;
            }
        }


    }
}
