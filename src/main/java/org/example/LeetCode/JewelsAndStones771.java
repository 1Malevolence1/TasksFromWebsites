package org.example.LeetCode;

import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones771 {

    public static void main(String[] args) {

    }

    public static int numJewelsInStones(String jewels, String stones) {

        Set<Character> setJewelry = new HashSet<>();
        for (char j : jewels.toCharArray()) {
            setJewelry.add(j);
        }

        int countJewelry = 0;
        for (char stone : stones.toCharArray()) {
            if (setJewelry.contains(stone)) {
                countJewelry++;
            }
        }

        return countJewelry;
    }
}
