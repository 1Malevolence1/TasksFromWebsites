package org.example.LeetCode;

import java.util.*;

public class IntersectionOfTwoArrays349 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersection(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4})));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
       if(nums1.length < nums2.length) return findDuplicate(nums1, nums2);
       else return findDuplicate(nums2, nums1);
    }

    public static int[] findDuplicate(int[] small, int[] big){
        Set<Integer> list = new HashSet<>();
        for (int i = 0; i < small.length; i++) {
            for (int j = 0; j < big.length; j++) {
                if(small[i] == big[j]){
                    list.add(big[i]);
                }

                if(list.contains(big[i])){
                    break;
                }
            }
        }

        Object[] numbers = list.toArray();
        int[] massive = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            massive[i] = (int) numbers[i];
        }

        return massive;
    }
}
