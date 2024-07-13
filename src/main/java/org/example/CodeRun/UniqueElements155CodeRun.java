package org.example.CodeRun;

import java.io.*;
import java.util.*;

public class UniqueElements155CodeRun {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);

        System.out.println(uniqueElements(list));

    }

    public static int uniqueElements(List<Integer> list) {

        Map<Integer, Integer> integerIntegerMap = new HashMap<>();

        for (int item = 0; item < list.size(); item++) {
            int num = (list.get(item));
            integerIntegerMap.put(num, integerIntegerMap.getOrDefault(num, 0) + 1);
        }

        System.out.println(integerIntegerMap.toString());

        int uniqueCount = 0;

        for (int count : integerIntegerMap.values()) {
            if (count == 1) uniqueCount++;

        }
        return uniqueCount;
    }
}


