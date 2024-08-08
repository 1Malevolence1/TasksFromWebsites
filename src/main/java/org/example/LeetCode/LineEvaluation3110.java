package org.example.LeetCode;

import java.util.stream.IntStream;

public class LineEvaluation3110 {
    public static void main(String[] args) {
        System.out.println(scoreOfString("hello"));
        System.out.println(scoreOfString("zaz"));
    }
    public static int scoreOfString(String s) {
        int[] codes = s.chars().toArray();
        return IntStream.range(0, codes.length - 1).map(i -> Math.abs(codes[i] - codes[i + 1])).sum();
    }
}

