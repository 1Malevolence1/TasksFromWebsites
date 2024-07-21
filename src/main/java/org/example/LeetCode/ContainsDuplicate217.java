package org.example.LeetCode;

import java.awt.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class ContainsDuplicate217 {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2}));
    }

    public static boolean containsDuplicate(int[] nums) {
        long distinctCount = Stream.of(nums).distinct().count();
        return nums.length != distinctCount;
    }
}
