package org.example.CommonCodingQuestions.arraygfg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UnionAndIntersectionOfArrays {

    static Integer[] arr = {1,2,5,23,9};
    static Integer[] arr1 = {2,3,5,6,7,8,12,56,8,1};
    public static void main(String[] args) {

        List<Integer> arrUnion = new ArrayList<>();
        List<Integer> arrIntersection = new ArrayList<>();

        for(int i=0; i<arr.length;i++){
            if(!arrUnion.contains(arr[i])){
                arrUnion.add(arr[i]);
            }
        }

        for(int i=0; i<arr1.length;i++){
            if(!arrUnion.contains(arr1[i])){
                arrUnion.add(arr1[i]);
            }
        }

        arrUnion.forEach(System.out::print);

        System.out.println("########### intersection ##############");

        List<Integer> arrList  = Arrays.asList(arr);
        List<Integer> arr1List = Arrays.asList(arr1);

        if(arrList.size()<arr1List.size()){
           arrList.stream().filter(e->{
                if(arr1List.contains(e)) return true;
                else{
                    return  false;
                }
            }).forEach(System.out::println);
        }else{
            arr1List.stream().filter(e->{
                if(arrList.contains(e)) return true;
                else{
                    return  false;
                }
            }).forEach(System.out::println);
        }


    }
}
