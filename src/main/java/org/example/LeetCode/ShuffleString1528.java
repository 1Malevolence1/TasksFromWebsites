package org.example.LeetCode;

import java.util.Arrays;

public class ShuffleString1528 {


    public static void main(String[] args) {
        System.out.println(restoreString("codeleet", new int[]{4, 5, 6, 7, 0, 1, 2, 3}));
    }

    public static String restoreString(String s, int[] indices) {
        String[] newWord = new String[s.length()];
        String[] letter = s.split("");
        int j;
        for (int item = 0; item < indices.length; item++) {
            j = indices[item];
            newWord[j] = letter[item];
        }
        return String.join("",newWord);
    }
}
