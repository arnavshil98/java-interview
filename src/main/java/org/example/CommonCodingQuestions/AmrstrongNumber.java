package org.example.CommonCodingQuestions;

public class AmrstrongNumber {
    public static void main(String[] args) {

        int n = 153;
        double l = 0;
        String[] nStr = String.valueOf(n).split("");
        for(int i=0; i<nStr.length;i++){
            l = l+ Math.pow(Double.valueOf(nStr[i]),nStr.length);
        }

        System.out.println(l);
    }
}
