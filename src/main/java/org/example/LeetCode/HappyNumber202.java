package org.example.LeetCode;

import java.util.Map;

public class HappyNumber202 {
    public static void main(String[] args) {
        for (int item = 1; item < 10000; item++) {
            if(isHappy(item)) System.out.println(item);
        }

    }

    public static  boolean isHappy(int n) {
        int checkOnReplace = n;
        while (n != 1){
            if(n == 4) return false;
            n = newCount(n);

        }

        return true;
    }

    private static int newCount(int n){
        int newCount = 0;
        while (n > 0){
            newCount += (int) Math.pow(n % 10, 2);

            n /= 10;
        }

        return newCount;
    }
}
