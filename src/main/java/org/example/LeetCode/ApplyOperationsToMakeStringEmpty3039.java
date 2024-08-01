package org.example.LeetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ApplyOperationsToMakeStringEmpty3039 {
    public static void main(String[] args) {
        System.out.println(lastNonEmptyString("aabcbbca"));
    }


    // Решает поставленную задачу, но не укладывается по вермени
    public static String lastNonEmptyString(String s) {
        Set<Character> removedChars = new HashSet<>();
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < sb.length(); i++) {
            char currentChar = sb.charAt(i);
            if (!removedChars.contains(currentChar)) {
                removedChars.add(currentChar);
                sb.deleteCharAt(i);
                i--; // Уменьшаем индекс, чтобы проверить удаленный символ снова
            }
        }

        return sb.toString();
    }
}
