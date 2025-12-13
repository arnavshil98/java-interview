package org.example.goldmansachs;

public class EncodeString {

    public static String encode(String str){
        StringBuilder sb = new StringBuilder();
        char oldChar = str.charAt(0);
        int index = 1;
        int currentCount = 1;
        while(index<str.length()){
            if(str.charAt(index)==oldChar){
                currentCount++;
            }else{
                sb.append(oldChar);
                sb.append(currentCount);
                oldChar = str.charAt(index);
                currentCount = 1;
            }
            index++;
        }

        return String.valueOf(sb);
    }
    public static void main(String[] args) {
        String s = "aabbcccddee";
        System.out.println(encode(s));
    }
}
