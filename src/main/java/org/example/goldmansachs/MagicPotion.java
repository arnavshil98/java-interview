package org.example.goldmansachs;

public class MagicPotion {
    public static void magicPotion(String s){
        String[] arr = s.split("");
        String modifiedString = arr[0];
        int index = 1;
        while (index<s.length()){
            if(2*index<s.length()){
                String s1 = s.substring(0,index);
                String s2 = s.substring(index, 2*index);
                if(s1.equals(s2)){
                    modifiedString+="*";
                    index=2*index;

                }else{
                    modifiedString+= arr[index];
                    index++;

                }
            }else {
                modifiedString+= arr[index];
                index++;

            }
        }

        System.out.println(modifiedString);
    }
    public static void main(String[] args) {
/*
ABCABCABCABC -> ABC**
ABCABCABC -> ABC*ABC
ABABCABABCD -> AB*C*D
 */

         magicPotion("ABCABCABC");


        String s="ABCABCABC";
        StringBuilder sb=new StringBuilder();
        int n=s.length(),c=0;
        sb.append(s.charAt(0));
        for(int i=1;i<n;i++)
        {
            if(2*i<=n)
            {
                String compare=s.substring(0,i);
                if(compare.equals(s.substring(i,2*i)))
                {
                    sb.append("*");
                    c++;
                    i=2*i-1;
                }
                else
                {
                    sb.append(s.charAt(i));
                }
            }
            else
            {
                sb.append(s.charAt(i));
            }
        }
        if(c>1)
        {
            System.out.println(sb.length()-c+1);
            ;
        }
        else
            System.out.println(sb.length());

        System.out.println(sb);
    }


}
