package org.example.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumIndexSumOfTwoLists599 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findRestaurant(new String[]{"happy", "sad", "good"},
                new String[]{"sad", "happy", "good"})));
    }

    public static String[] findRestaurant(String[] list1, String[] list2) {
        int minIndex = Integer.MAX_VALUE;
        List<String> result = new ArrayList<>();
        for (int i = 0; i < list1.length; i++) {
            int sumIndex;
            for (int j = 0; j < list2.length; j++) {

                if(list1[i].equals(list2[j])){
                    sumIndex = i + j;
                    if(sumIndex < minIndex ){
                       minIndex = sumIndex;
                       result.clear();
                   }
                    if(sumIndex == minIndex){
                        result.add(list1[i]);
                    }
                }
            }
        }
        return result.toArray(new String[0]);
    }
}

