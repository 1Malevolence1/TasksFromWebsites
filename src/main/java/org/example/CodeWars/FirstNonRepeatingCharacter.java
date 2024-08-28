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
        for(String letter : s.split("")){
            if(s.toUpperCase().indexOf(letter.toUpperCase()) == s.toUpperCase().lastIndexOf(letter.toUpperCase())) return String.valueOf(letter);
        }
        return "";
    }
}
