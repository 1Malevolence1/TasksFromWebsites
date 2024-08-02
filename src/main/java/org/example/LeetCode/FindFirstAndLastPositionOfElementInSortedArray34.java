package org.example.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindFirstAndLastPositionOfElementInSortedArray34 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(searchRange(new int[]{5,7,7,8,8,10}, 8)));
        System.out.println(Arrays.toString(searchRange(new int[]{1}, 1)));
    }

    public static int[] searchRange(int[] nums, int target) {

        if(nums.length == 0) return new int[]{-1,-1};



        int firstItemTarget =-1;
        int lastItemTarget = -1;
        for (int item = 0; item < nums.length; item++) {
            if(nums[item] == target) {
                firstItemTarget = item;
                break;
            }
        }

        if(firstItemTarget == -1) return new int[]{firstItemTarget, lastItemTarget};

        for (int item = nums.length - 1;  item  >= 0 ; item--) {
            if (nums[item] == target) {
                lastItemTarget = item;
                break;
            }
        }
        return new int[]{firstItemTarget, lastItemTarget};
    }
}
