package org.example.LeetCode;

import java.util.*;

import static java.util.Collections.swap;

public class SortThePeople2418 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortPeople(new String[]{"Mary", "John", "Emma"}, new int[]{180, 165, 170})));
        System.out.println(Arrays.toString(sortPeople(new String[]{"Alice","Bob","Bob"}, new int[]{155,185,150})));
    }


    public static String[] sortPeople(String[] names, int[] heights) {

        while (true){
        int count = 0;
        for (int i = 0; i < heights.length - 1; i++) {
                if (heights[i] < heights[i + 1]) {
                    String name = names[i];
                    names[i] = names[i + 1];
                    names[i + 1] = name;

                    int lastCount = heights[i];
                    heights[i] = heights[i + 1];
                    heights[i + 1] = lastCount;
                    count++;
                }
            }
            if(count == 0) break;
        }
        return names;
    }
}
