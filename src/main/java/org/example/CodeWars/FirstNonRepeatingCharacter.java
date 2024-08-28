package org.example.CodeWars;

import java.util.HashSet;
import java.util.Set;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {
        System.out.println(firstNonRepeatingLetter("a"));
        System.out.println(firstNonRepeatingLetter("streSS"));
        System.out.println(firstNonRepeatingLetter("moon-men"));
        System.out.println(firstNonRepeatingLetter("moonmoon"));
        System.out.println(firstNonRepeatingLetter("I Like To Take Candy From A Baby"));
    }

    public static String firstNonRepeatingLetter(String s){
        String toLowerLine = s.toLowerCase();
        char[] charLetters = toLowerLine.toCharArray();
        Set<Character> setLetters = new HashSet<>();

        for (int i =0; i < charLetters.length; i++){
            char letter= charLetters[i];
            if(!setLetters.contains(letter)){
                int index = toLowerLine.indexOf(letter,toLowerLine.indexOf(letter)+ 1);
                if(index == -1) {
                    return String.valueOf(s.charAt(i));
                }
                setLetters.add(letter);
            }
        }
        return "";
    }
}
