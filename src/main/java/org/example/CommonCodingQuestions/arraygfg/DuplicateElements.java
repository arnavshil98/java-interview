package org.example.CommonCodingQuestions.arraygfg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// solve in time: O(N) and space: O(1)
public class DuplicateElements {
    public static void main(String[] args) {
        Integer[] arr = {1,3,2,4,5,6,2,4};
        List<Integer> duplicateList = new ArrayList<>();
        for(int i = 0; i< arr.length;i++){
            if(!duplicateList.contains(arr[i])){
                duplicateList.add(arr[i]);
            }
        }
        duplicateList.forEach(System.out::println);
    }
}
