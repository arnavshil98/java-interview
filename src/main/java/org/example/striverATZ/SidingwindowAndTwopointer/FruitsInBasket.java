package org.example.striverATZ.SidingwindowAndTwopointer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FruitsInBasket {
    public static int maxCountFruitsInTwoBaskets(int[] fruits){
        Map<Integer,Integer> fruitsCount = new HashMap<>();
        int i=0;
        int maxFruits = 0; //empty basket
        Set<Map.Entry<Integer,Integer>> basketList = new HashSet<>();
        while(i<fruits.length){
            basketList  = fruitsCount.entrySet();
            if(basketList.size()==2){
                if(!fruitsCount.containsKey(fruits[i])){
                    // calculate max fruits
                    int currentFruitsCount = 0;
                    for (Map.Entry<Integer,Integer> fruit: basketList
                         ) {
                        currentFruitsCount+=fruit.getValue();
                    }
                    maxFruits = Math.max(maxFruits,currentFruitsCount);
                    System.out.println(fruitsCount);
                    fruitsCount = new HashMap<>(); // reset the basket i will be same as this will insert current elemt to new basket
                    i--; // setting back the i to initialize new basket first element
                }else{
                    fruitsCount.put(fruits[i], fruitsCount.get(fruits[i])+1);
                    i++;
                }
            }else{
                if(!fruitsCount.containsKey(fruits[i])){
                    fruitsCount.put(fruits[i],1);
                }else{
                    fruitsCount.put(fruits[i], fruitsCount.get(fruits[i])+1);
                }
                i++;
            }
        }

        // checking the last case as the iteration has crossed last index, now the evaluation is not possible for max
        int currentFruitsCount = 0;
        for (Map.Entry<Integer,Integer> fruit: basketList
        ) {
            currentFruitsCount+=fruit.getValue();
        }
        maxFruits = Math.max(maxFruits,currentFruitsCount);
        System.out.println(fruitsCount);

        return maxFruits;
    }


    public static void main(String[] args) {
        int[] fruits = new int[]{1,2,3,2,2,3};//3,3,2,1,2,1,0
        int basketCount = maxCountFruitsInTwoBaskets(fruits);
        System.out.println(basketCount);
    }
}
