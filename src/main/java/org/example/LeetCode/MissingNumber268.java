package org.example.LeetCode;

import java.util.Arrays;

public class MissingNumber268 {

    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{3, 0, 1}));
    }

    public static int missingNumber(int[] nums) {
        int realSum = 0;
        int sum = 0;

        for (int num : nums) {
            sum += num;
        }

        for (int i = 0; i <= nums.length; i++) {
            realSum += i;
        }
        return realSum - sum;
    }
}
