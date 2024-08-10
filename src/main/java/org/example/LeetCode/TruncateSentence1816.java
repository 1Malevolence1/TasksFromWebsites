package org.example.LeetCode;

public class TruncateSentence1816 {


    public static void main(String[] args) {
        System.out.println(truncateSentence("Hello how are you Contestant",4));
        }

    public static String truncateSentence(String s, int k) {
        String[] massive = s.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int item = 0; item < k + 1; item++) {
            stringBuilder.append(massive[item]).append(" ");
        }

        return stringBuilder.toString().trim();
    }

}

