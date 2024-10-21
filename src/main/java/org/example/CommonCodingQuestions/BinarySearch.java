package org.example.CommonCodingQuestions;

public class BinarySearch {

    static int index = 0;
    public static void findIndex (int[] arr,int firstIndex,int highIndex, int find){

        int middleIndex = (firstIndex + highIndex)/2;

        if(arr[middleIndex]== find){
            index = middleIndex;

        } else if (arr[middleIndex]< find) {
            // right array
            findIndex(arr,middleIndex,arr.length-1,find);
        } else if (arr[middleIndex]> find) {
            findIndex(arr,0,middleIndex,find);
        }

    }
    public static void main(String[] args) {
       int[] arr = {3,5,7,9,22,23}; // always sorted

        int find  = 22;


      findIndex(arr,0,arr.length-1,find);
        System.out.println("index of required value: "+index);



    }
}
