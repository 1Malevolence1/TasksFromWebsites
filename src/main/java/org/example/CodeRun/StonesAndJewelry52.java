package org.example.CodeRun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StonesAndJewelry52 {

    public static void main(String[] args) {


        String jewelry = "ab";
        String stones = "aabbccdd";


        Set<Character> setJewelry = new HashSet<>();
        for (char j: jewelry.toCharArray()) {
            setJewelry.add(j);
        }

        int countJewelry = 0;
        for(char stone: stones.toCharArray()){
            if(setJewelry.contains(stone)){
                countJewelry++;
            }
        }


        System.out.println(countJewelry);

    }
}
