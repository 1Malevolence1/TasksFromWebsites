package org.example.LeetCode;

public class ThreeConsecutiveOdds {

    public static void main(String[] args) {
        System.out.println(threeConsecutiveOdds(new int[]{1,2,34,3,4,5,7,23,12}));
        System.out.println(threeConsecutiveOdds(new int[]{2,6,4,12}));
    }
    public static boolean threeConsecutiveOdds(int[] arr) {
        int count = 0;
        for (int index: arr
             ) {
            if(index % 2 != 0) count++;
            if(count == 3) return true;
            if(index % 2 == 0) count =0;
        }
        return false;
    }
}
