package org.example.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveElement27 {

    public static void main(String[] args) {
        System.out.println((removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2)));
    }


    public static int removeElement(int[] nums, int val) {
        List<Integer> list = new ArrayList<>();
        for (Integer item : nums) {
            if (item != val) list.add(item);
        }

        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }
        return list.size();
    }

}
