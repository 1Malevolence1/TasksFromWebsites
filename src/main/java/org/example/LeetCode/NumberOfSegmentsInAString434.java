package org.example.LeetCode;

import java.util.StringTokenizer;

public class NumberOfSegmentsInAString434 {

    public static void main(String[] args) {

    }

    public static int countSegmentsSolution(String s) {
        StringTokenizer stringTokenizer = new StringTokenizer(s);
        return stringTokenizer.countTokens() ;
    }

    public static int countSegmentsMy(String s) {
        if(s.trim().isEmpty()) return 0;
        String[] massive = s.trim().split("\\s+");
        return massive.length;
    }
}
