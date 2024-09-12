package org.example.LeetCode;

import java.util.*;

public class IntersectionOfTwoArraysII350 {

    public static void main(String[] args) {
    }
    public static int[] intersect(int[] nums1, int[] nums2){
        Map<Integer, Integer> frequencyMap = new HashMap<>();


        for (int num : nums1) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        List<Integer> result = new ArrayList<>();

        for (int num : nums2) {
            if (frequencyMap.containsKey(num) && frequencyMap.get(num) > 0) {
                result.add(num);
                frequencyMap.put(num, frequencyMap.get(num) - 1);
            }
        }

        int[] resultArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
        }

        return resultArray;
    }
}
