package org.example;

import java.util.ArrayList;
import java.util.List;

public class JosephusSurvivedCodeWar {


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < 8; i++) {
            list.add(i);
        }

        System.out.println(josephusSurvivor(41,1));
        System.out.println(josephusSurvivorList(list, 3));
    }

    public static int josephusSurvivor( final int n, final int k) {
        int i = 1, ans =0;
        while (i <= n){
            ans = ( ans + k) % i;
            i++;
        }
    return ans + 1;
    }

    public static int josephusSurvivorList(List<Integer> survives,  final int k) {
        int count = 0;
        int item = 0;

        for(;;){
            if(survives.size() == 1) return survives.get(0);

            if(count == k){
                item = survives.remove(item);
                count = 0;

            }
            item++;
            count++;
        }
    }
}

