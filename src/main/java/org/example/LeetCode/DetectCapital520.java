package org.example.LeetCode;

public class DetectCapital520 {
    public static void main(String[] args) {
        System.out.println(detectCapitalUse("USA"));
        System.out.println(detectCapitalUse("FlaG"));
        System.out.println(detectCapitalUse("Google"));
        System.out.println(detectCapitalUse("leetcode"));
    }

    public static   boolean detectCapitalUse(String word) {
        boolean firstLetterUpper = word.charAt(0) == Character.toUpperCase(word.charAt(0));



        if(firstLetterUpper){
           if(onlyFirstLetterUpper(word)) return true;
           if(allLettersUpper(word)) return true;
        }
        return allLettersLower(word);
    }



    public static  boolean allLettersUpper(String word){
        return word.equals(word.toUpperCase());
    }

    public  static boolean onlyFirstLetterUpper(String word){
        return word.length() > 1 &&
                word.substring(1).equals(word.substring(1).toLowerCase());
    }

    public static boolean allLettersLower(String word) {
      return   word.equals(word.toLowerCase());
    }

}
