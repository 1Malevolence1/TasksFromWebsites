package org.example.LeetCode;

import java.util.HashMap;
import java.util.Map;

public class FindTheDifference389 {;

    public static void main(String[] args) {
        System.out.println(findTheDifference("abcd", "abcde"));
        System.out.println(findTheDifference("", "e"));

    }

    public static char findTheDifference(String s, String t) {
        int[] letters = new int[26];

        for (int i = 0; i < s.length(); i++) {
            letters[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < t.length(); i++) {
            letters[t.charAt(i) - 'a']--;
        }

        for (int i = 0; i < letters.length; i++) {
            if (letters[i] == -1) return (char) (i + 'a');
        }

        return 0;
    }

    public static char findTheDifferenceHash(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < t.length(); i++) {
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
        }


        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return 0;
    }
}
