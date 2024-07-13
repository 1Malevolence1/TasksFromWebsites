package org.example.LeetCode;

public class CountOddNumbersInAnIntervalRange1523 {

    public static void main(String[] args) {

        System.out.println(countOdds(3, 7));

    }

    public static int countOdds(int low, int high) {
        if (low % 2 != 0 && high % 2 != 0) {
            return (high - low) / 2 + 1;
        }
        if (low % 2 == 0) low++;
        if (high % 2 == 0) high--;
        return (high - low) / 2 + 1;
    }

}
