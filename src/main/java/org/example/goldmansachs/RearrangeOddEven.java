package org.example.goldmansachs;

public class RearrangeOddEven {

    public static void rearrange(int[] arr){
        // if found odd, shift left till we find the left number as odd
        int oddPointer=0;
        int evenPointer = arr.length-1; // we don't know first occurence
        while(oddPointer< evenPointer){


            if(arr[oddPointer]%2==0 && arr[evenPointer]%2!=0){
                int old = arr[oddPointer];
                arr[oddPointer] = arr[evenPointer];
                arr[evenPointer] = old;

            }

            while(oddPointer< arr.length && arr[oddPointer]%2!=0){
                oddPointer++;
            }

            while(evenPointer>=0 && arr[evenPointer]%2==0){
                evenPointer--;
            }
        }
    }



    public static void rearrangeArray(int[] arr){

    }
    public static void main(String[] args) {
        int[] arr = new int[]{3,5,6,8,1,3};
        rearrange(arr);

        for (int i: arr
             ) {
            System.out.print(i+" ");
        }
    }
}
