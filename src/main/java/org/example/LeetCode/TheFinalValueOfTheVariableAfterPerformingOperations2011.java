package org.example.LeetCode;

public class TheFinalValueOfTheVariableAfterPerformingOperations2011 {
    public static void main(String[] args) {


    }


    public int finalValueAfterOperations(String[] operations) {
            int sum = 0;
            for (String item : operations){
                if(item.equals("++X") || item.equals("X++")) sum++;
                else sum--;
            }
            return sum;
    }

}
