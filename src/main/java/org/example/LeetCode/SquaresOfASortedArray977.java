package org.example.LeetCode;

import java.util.Arrays;

public class SquaresOfASortedArray977 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortedSquares(new int[]{-7, -3, 2, 3, 11})));
    }

    public static int[] sortedSquares(int[] nums) {
        return Arrays.stream(nums).map(item -> item * item).sorted().toArray();
    }
}
