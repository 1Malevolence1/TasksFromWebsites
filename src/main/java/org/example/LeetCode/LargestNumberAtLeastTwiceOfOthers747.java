package org.example.LeetCode;

public class LargestNumberAtLeastTwiceOfOthers747 {
    public static void main(String[] args) {
        System.out.println(dominantIndex(new int[]{1,2,3,4}));
    }

    public static int dominantIndex(int[] nums) {
            int max = 0;
            int maxIndex = 0;

        for (int index = 0; index < nums.length; index++) {
            if(nums[index] > max) {
                max = nums[index];
                maxIndex = index;
            }
        }


        for (int num : nums) {
            if (num * 2 == max) return maxIndex;
        }

            return -1;
    }
}

