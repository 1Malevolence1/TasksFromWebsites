package org.example.LeetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromSortedArray26 {
    public static void main(String[] args) {
       System.out.println(removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
        System.out.println(removeDuplicates(new int[]{1,1,2}));
        System.out.println(removeDuplicates(new int[]{-1,0,0,0,0,3,3}));

    }

    public static int removeDuplicates(int[] nums) {
            int i = 0;
            for(int item = 0; item < nums.length; item++ ){
               if(nums[i] != nums[item]){
                   i++;
                   nums[i] = nums[item];
               }
            }
            return i+1;
    }
}
