package org.example.LeetCode;

import java.util.Arrays;

public class LatestTimeYouCanObtainAfterReplacingCharacters3144 {

    public static void main(String[] args) {

        System.out.println(findLatestTime("1?:?4"));




    }


    public static String findLatestTime(String s) {
        String[] time = s.split(":");
        StringBuilder stringBuilder = new StringBuilder();

        if(time[0].equals("??")) time[0] = time[0].replace("?", "1");
        if(time[1].equals("??")) time[1] = time[1].replace("??", "59");

        if(time[0].charAt(0) == '?' && (time[0].charAt(1) != '1' && time[0].charAt(1) != '0')) time[0] = time[0].replace("?", "0");
        if(time[0].charAt(0) == '?' && (time[0].charAt(1) == '1' || time[0].charAt(1) == '0')) time[0] = time[0].replace("?", "1");
        if(time[0].charAt(1) ==  '?' && time[0].charAt(0) == '1') time[0] =  time[0].replace("?", "1");
       if(time[0].charAt(1) ==  '?' && time[0].charAt(0) == '0') time[0] =  time[0].replace("?", "9");

        if(time[1].charAt(0) == '?') time[1] = time[1].replace("?", "5");
        if(time[1].charAt(1) == '?') time[1] = time[1].replace("?", "9");

        return stringBuilder.append(time[0]).append(":").append(time[1]).toString();
    }
}
