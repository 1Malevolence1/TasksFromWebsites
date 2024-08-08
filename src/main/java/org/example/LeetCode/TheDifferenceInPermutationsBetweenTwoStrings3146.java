package org.example.LeetCode;

public class TheDifferenceInPermutationsBetweenTwoStrings3146 {
    public static void main(String[] args) {
        System.out.println(findPermutationDifference("abc", "bac"));
       System.out.println(findPermutationDifference("abcde", "edbac"));
    }

    public static int findPermutationDifference(String s, String t) {
        char[] lettrs = s.toCharArray();
        int sum = 0;
        int itemT;
        for (int item = 0; item < lettrs.length; item++) {
            itemT =  t.indexOf(lettrs[item]);
            sum += Math.abs(item - itemT);
        }
        return sum;
    }
}
