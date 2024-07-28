package org.example.LeetCode;

public class ReverseWordsInAString151 {
    public static void main(String[] args) {
        System.out.println(reverseWords("a good  example"));

    }

    public static String reverseWords(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] list = s.trim().split("\\s+");
        for (int item = list.length - 1; item >= 0 ; item--) {
            stringBuilder.append(list[item]).append(" ");
        }
        return stringBuilder.toString().trim();
    }
}