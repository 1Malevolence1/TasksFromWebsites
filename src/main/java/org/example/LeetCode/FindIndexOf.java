package org.example.LeetCode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FindIndexOf{

    public static void main(String[] args) {
        System.out.println(strStr("leetcode", "et"));
    }

    public  static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
