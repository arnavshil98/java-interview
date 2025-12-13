package org.example.goldmansachs;

public class RemoveConsecutiveRepeats {

    public static String nonRepeatingString(String s){
        if(s.isEmpty()){
            return s;
        }
        StringBuilder str = new StringBuilder();
        str.append(s.charAt(0));
        int index = 1;
        while(index<s.length()){
            if(s.charAt(index)!=str.charAt(str.length()-1)){
                str.append(s.charAt(index));
            }
            index++;
        }

        return str.toString();
    }
    public static void main(String[] args) {
        System.out.println(nonRepeatingString("saabbs"));
    }
}
