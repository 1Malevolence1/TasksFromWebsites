package org.example.LeetCode;

import java.util.*;

public class SortVowelsInAString2785 {
    public static void main(String[] args) {
        System.out.println(sortVowels("lEetcOde"));
        System.out.println(sortVowels("lYmpH"));
    }

    public static String sortVowels(String s) {
        Set<Character> vowels = Set.of('a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U');
        List<Character> list = findVowels(s, vowels);
        char[] letters = s.toCharArray();
        int count = 0;
        for (int i = 0; i < letters.length; i++) {
            if(vowels.contains(letters[i])){
                letters[i] = list.get(count);
                list.remove(count);
            }
        }
        return new String(letters);
    }

    public  static List<Character> findVowels(String s, Set<Character> vowels){
        List<Character> list = new ArrayList<>();

        char[] letters = s.toCharArray();
        for (char letter : letters){
            if(vowels.contains(letter)){
                list.add(letter);
            }
        }
        list.sort(Comparator.naturalOrder());
        return list;
    }

}
