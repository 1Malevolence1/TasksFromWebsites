package org.example.LeetCode;

public class CheckIfTwoStringArraysAreEquivalent1662 {
    public static void main(String[] args) {

    }


    public    boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String line1 = String.join("",word1);
        String line2 = String.join("",word2);
        return line1.equals(line2);
    }

}

