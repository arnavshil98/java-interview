package org.example.gfg.dsa.array;

import java.util.ArrayList;
import java.util.List;

public class SubSequenceArray {


    public static void subsequences(int[] arr, int index, List<Integer> subArray) {
        if (index == arr.length) {
            System.out.println(subArray);
            return;
        } else {
            subArray.add(arr[index]);
            subsequences(arr, index + 1, subArray);
            subArray.remove(subArray.size() - 1);
            subsequences(arr, index + 1, subArray);
        }
    }


    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        List<Integer> li = new ArrayList<>();
        subsequences(arr, 0, li);
    }
}
