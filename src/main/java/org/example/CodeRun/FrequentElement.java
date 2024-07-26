package org.example.CodeRun;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class FrequentElement {



    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

     /*   int len = Integer.parseInt(reader.readLine());
        String numberss = reader.readLine();*/

     /*   if(len == 0) {
            writer.write(String.valueOf(0));
            return;
        }*/
/*
        String[] numbersMassive = numberss.split("");*/

        int[] test = new int[]{3,3,3};




      /*  for (int item = 0; item < test.length; item++) {
            numbers[item] = Integer.parseInt(numbersMassive[item]);
        }*/
      //  int[] numbers = new int[]{Integer.parseInt(reader.readLine())}

        Map<Integer, Integer> mapNumbers = new HashMap<>();

        for(int number: test){
            mapNumbers.put(number, mapNumbers.getOrDefault(number, 0) + 1);
        }


        int maxNumber = 0;
        int maxCount = 0;

        for(Map.Entry<Integer, Integer> entry : mapNumbers.entrySet()){
            if(entry.getValue() >= maxCount){
                maxNumber = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        System.out.println(maxNumber);

        reader.close();
        writer.close();
    }
}
