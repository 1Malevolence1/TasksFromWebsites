package org.example.LeetCode;

import java.util.Arrays;

public class ReverseString344 {
    public static void main(String[] args) {
        reverseString(new char[]{'h','e','l','l','o'});
    }
    public static void reverseString(char[] s) {
        int len = s.length;
        for(int i = 0; s.length / 2 > i; i++){
            char item = s[i];
            char last = s[len - 1];
            s[i] = last;
            s[len - 1] = item;
            len--;
        }

        System.out.println(Arrays.toString(s));
    }
}

