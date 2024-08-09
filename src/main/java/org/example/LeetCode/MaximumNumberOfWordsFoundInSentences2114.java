package org.example.LeetCode;

public class MaximumNumberOfWordsFoundInSentences2114 {


    public static void main(String[] args) {
        System.out.println(mostWordsFound(new String[]{"alice and bob love leetcode","i think so too","this is great thanks very much"}));
    }
    public static int mostWordsFound(String[] sentences) {
        int max = Integer.MIN_VALUE;
        for(String lines : sentences){
            String[] words = lines.split(" ");
            if(words.length > max){
                max = words.length;
            }
        }
        return max;
    }
}
