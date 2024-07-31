package org.example.CommonCodingQuestions.gfgstrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergingSortedArray {

    public static void main(String[] args) {

        Integer [] arr1=  {1,4,6,7,11};
        Integer [] arr2 = {2,3,5,8,9};

       List<Integer> list1=  Arrays.asList(arr1);
       List<Integer> list2=  Arrays.asList(arr2);

       List<Integer> mergingList = new ArrayList<>();

        mergingList.addAll(list1);
        mergingList.addAll(list2);

         Collections.sort(mergingList);

        mergingList.forEach(System.out::println);


    }
}
