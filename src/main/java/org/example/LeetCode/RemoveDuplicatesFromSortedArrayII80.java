package org.example.LeetCode;

import java.util.*;

public class RemoveDuplicatesFromSortedArrayII80 {
    public static void main(String[] args) {
       System.out.println(removeDuplicates(new int[]{0,0,1,1,1,1,2,3,3}));
        System.out.println(removeDuplicates(new int[]{-3,-1,0,0,0,3,3}));
        System.out.println(removeDuplicates(new int[]{1,1,1,1,2,2,3}));
    }


    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 1;
        int count = 1;

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] == nums[j - 1]) {
                count++;
            } else {
                count = 1;
            }

            if (count <= 2) {
                nums[i] = nums[j];
                i++;
            }
        }

        return i;
    }
}
