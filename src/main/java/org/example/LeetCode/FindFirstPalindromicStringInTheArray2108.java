package org.example.LeetCode;

public class FindFirstPalindromicStringInTheArray2108 {
    public static void main(String[] args) {

    }

    public String firstPalindrome(String[] words) {
            StringBuilder stringBuilder;
            for (String word : words){
                stringBuilder = new StringBuilder(word);
                if (word.contentEquals(stringBuilder.reverse())){
                    return word;
                }
            }


            return "";
    }
}
