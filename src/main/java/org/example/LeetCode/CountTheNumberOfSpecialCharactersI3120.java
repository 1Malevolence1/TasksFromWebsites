package org.example.LeetCode;

import java.util.*;

public class CountTheNumberOfSpecialCharactersI3120 {


    public static void main(String[] args) {
        System.out.println(numberOfSpecialChars("Cc"));
    }

    public static int numberOfSpecialChars(String word) {
        Set<Character> letters = new HashSet<>();
        for (Character letter : word.toCharArray()) {
            letters.add(letter);
        }
        int count = 0;
        Object[] lettersMassive = letters.toArray();
        for (int item = 0; item < lettersMassive.length - 1; item++) {
            char itemOne = (char) lettersMassive[item];
            char itemTwo = (char) lettersMassive[item + 1];
            if(itemTwo + 32 ==itemOne || itemOne + 32 == itemTwo){
                count++;
            }
        }

        return count;
    }
}
