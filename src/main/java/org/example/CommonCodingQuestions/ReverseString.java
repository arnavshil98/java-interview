package org.example.CommonCodingQuestions;

public class ReverseString {

    public static void main(String[] args) {
        String s = "hello";

        StringBuffer sb = new StringBuffer();
        char[] arr = s.toCharArray();
        for(int i=arr.length-1; i>=0; i--){
            sb.append(arr[i]);
        }
        System.out.println(sb);

    }


}
