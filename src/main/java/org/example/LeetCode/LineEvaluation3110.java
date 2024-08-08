package org.example.LeetCode;

import java.util.Map;
import java.util.stream.Stream;

public class LineEvaluation3110 {
    public static void main(String[] args) {
        System.out.println(scoreOfString("hello"));
        System.out.println(scoreOfString("zaz"));
    }
    public static int scoreOfString(String s) {
        char[] letters = s.toCharArray();
        int sum = 0;
        for (int item = 0; item < letters.length - 1; item++) {
            sum += Math.abs(letters[item] - letters[item + 1]);
        }

        return sum;

    }
}

