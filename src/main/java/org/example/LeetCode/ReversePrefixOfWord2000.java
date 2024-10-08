package org.example.LeetCode;

public class ReversePrefixOfWord2000 {
    public static void main(String[] args) {
    //   System.out.println(reversePrefix("abcdefd",'d'));
       // System.out.println(reversePrefix("j",'j'));
        System.out.println(reversePrefix("xxxxxxxxxx",'x'));
    }

    public static String reversePrefix(String word, char ch) {
        int j = word.indexOf(ch);
        if (j != -1) {
            return new StringBuilder(word.substring(0, j + 1)).reverse().toString() + word.substring(j + 1);
        }
        return word;
    }
}
