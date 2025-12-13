package org.example.goldmansachs;

public class AtoiFunction {

    public static void atoi(String s){
        String atoiString = "";
        String[] sArr = s.split("");
        int index = 0;
        if(sArr[0].equals("-")){
            atoiString+="-";
            if(sArr[1].equals("0")){
                index = 2;
            }
        } else if (sArr[0].equals("0")) {
            index = 1;
        }


        while(index<sArr.length){
            if(sArr[index].matches("[0-9]")){
                atoiString += sArr[index];
            }
            index++;
        }

        System.out.println(atoiString);
    }
    public static void main(String[] args) {
        atoi("-08io-9-$y");
    }
}
