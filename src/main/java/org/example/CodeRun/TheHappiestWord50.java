package org.example.CodeRun;

import java.io.*;
import java.util.*;

public class TheHappiestWord50 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        //   String[] string = reader.readLine().split(" ");

        StringBuilder stringBuilder = new StringBuilder();
        String st;
        while (true) {

            if ((st = reader.readLine()) != null) {
                stringBuilder.append(st).append(" ");
            } else break;
        }

        String[] strings = stringBuilder.toString().trim().split("\\s+");

        Map<String, Integer> map = new HashMap<>();

        for (String word : strings) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        int max = Collections.max(map.values());

        List<String> keys = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) {
                keys.add(entry.getKey());
            }

            keys.sort(Comparator.naturalOrder());
            writer.write(String.valueOf(keys.get(0)));

            reader.close();
            writer.close();

        }
    }
}
