package org.example.LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NumberOfLinesToWriteString806 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getSelutions(
                new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10}, "abcdefghijklmnopqrstuvwxyaaaaa")));
    }

    public static int[] numberOfLines(int[] widths, String s) {
        Map<Character, Integer> map = getMapNumberOfLines(widths);

        int maxWidths = 100;
        int countWidths = 0;

        StringBuilder stringBuilder = new StringBuilder();
        for(Character letter : s.toCharArray()){
            if(map.containsKey(letter) && map.get(letter) + countWidths <= maxWidths){
                countWidths += map.get(letter);
                stringBuilder.append(letter);
            }
            else {
                stringBuilder.append(" ").append(letter);
                countWidths = map.get(letter);
            }
        }

        System.out.println(stringBuilder);

        String[] strings = stringBuilder.toString().split(" ");
        String lastLinePixel = getCountLastLinePixel(map, strings[strings.length - 1]);

         return new int[]{strings.length, Integer.parseInt(lastLinePixel)};


    }
    public static Map<Character, Integer> getMapNumberOfLines(int[] widths){
        Map<Character, Integer> map = new HashMap<>();
        char letter = 97;
        for (int item: widths) {
            map.put(letter, item);
            letter++;
            if(letter==123) break;
        }
        System.out.println(map);
        return map;
    }
    public static String getCountLastLinePixel(Map<Character, Integer> map, String line){
        int countPixel = 0;
        for (Character letter: line.toCharArray()
             ) {
            if(map.containsKey(letter)){
                countPixel += map.get(letter);
            }
        }
        return String.valueOf(countPixel);
    }

// Потрясное решение
    public static int[] getSelutions(int[] widths, String s){
        int sum = 0, lines = 1;

        for(final char c : s.toCharArray()) {
            final int idx = c - 'a';

            if(sum + widths[idx] > 100) {
                lines++;
                sum = 0;
            }

            sum += widths[idx];
        }

        return new int[] { lines, sum };
    }
}
