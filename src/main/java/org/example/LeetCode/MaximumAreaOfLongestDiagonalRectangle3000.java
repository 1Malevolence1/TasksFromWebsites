package org.example.LeetCode;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MaximumAreaOfLongestDiagonalRectangle3000 {

    public static void main(String[] args) {




        System.out.println(areaOfMaxDiagonal(new int[][]{{2,6},{5,1},{3,10},{8,4}}));
    }

    public  static int areaOfMaxDiagonal(int[][] dimensions) {
        int area = 1;
        double maxDiagonal = Integer.MIN_VALUE;

        for (int i = 0; i < dimensions.length; i++) {
            double diagonal = 0;
            for (int j = 0; j < dimensions[i].length;  j++) {
                diagonal  += Math.pow(dimensions[i][j], 2);
            }
            if(diagonal > maxDiagonal || (diagonal == maxDiagonal && dimensions[i][0] * dimensions[i][1] > area)){
                maxDiagonal = diagonal;
                area = dimensions[i][0] * dimensions[i][1];
            }
        }
        return area;
    }
}

