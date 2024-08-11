package org.example.LeetCode;

import java.io.InputStream;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ConcatenationOfArray1929 {


    public static void main(String[] args) {
        System.out.println(Arrays.toString(getConcatenation(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(getConcatenationStream(new int[]{1, 2, 3})));
    }

    public static int[] getConcatenation(int[] nums) {
        int count = 0;
        int[] massive = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            massive[i] = nums[i];
            count++;
        }
        for (int i = 0; i < nums.length; i++) {
            massive[count] = nums[i];
            count++;
        }

        return massive;
    }

    public static int[] getConcatenationStream(int[] nums) {
        return IntStream.concat(Arrays.stream(nums), Arrays.stream(nums)).toArray();
    }
}
