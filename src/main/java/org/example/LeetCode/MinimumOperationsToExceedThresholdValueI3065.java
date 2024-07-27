package org.example.LeetCode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MinimumOperationsToExceedThresholdValueI3065 {
    public static void main(String[] args) {
        System.out.println(minOperations(new int[]{2,11,10,1,3}, 10));
        System.out.println(minOperations(new int[]{1,1,2,4,9}, 1));
        System.out.println(minOperations(new int[]{1,1,2,4,9}, 9));
    }

    public static int minOperations(int[] nums, int k) {
             Arrays.sort(nums);
             int countDelete = 0;

            for (Integer item: nums
                 ) {
                if(item < k){
                    countDelete++;
                }
            }
            return countDelete;
    }
}
