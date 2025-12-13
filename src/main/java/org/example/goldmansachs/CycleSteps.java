package org.example.goldmansachs;

import java.util.ArrayList;
import java.util.List;

public class CycleSteps {

    public static int steps(int[] arr){
        List<Integer> visitedIndex = new ArrayList<>();
        int index = arr[0];
        visitedIndex.add(0);
        int step = 0;
        while(index< arr.length){
            if(!visitedIndex.contains(index))
            {   visitedIndex.add(index);
                index = arr[index];
                step++;
            }else{
                break;
            }
        }

        return step;
    }
    public static void main(String[] args) {
        int[] arr = {2,4,1,0,5,3};
        System.out.println(steps(arr));
    }
}
