package org.example.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ValidAnagram242 {

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram","nagaram"));
    }

    public  static boolean isAnagram(String s, String t) {
        List<String> listLettersS = listLettres(s);
        List<String> listLettersT = listLettres(t);

        System.out.println(listLettersS);
        System.out.println(listLettersT);

        listLettersT.sort(Comparator.naturalOrder());
        listLettersS.sort(Comparator.naturalOrder());

        System.out.println(listLettersS);
        System.out.println(listLettersT);

        return listLettersS.equals(listLettersT);
    }

    private static   List<String> listLettres(String word){
        return new ArrayList<>(Arrays.asList(word.split("")));
    }



    public static boolean isAnagramAnotherSolution(String s, String t){
        if (s.length() != t.length()) {
            return false;
        }

        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        for (int j : freq) {
            if (j != 0) {
                return false;
            }
        }

        return true;
    }
}

