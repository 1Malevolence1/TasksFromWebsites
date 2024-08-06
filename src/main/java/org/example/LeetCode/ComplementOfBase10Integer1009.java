package org.example.LeetCode;

public class ComplementOfBase10Integer1009 {
    public static void main(String[] args) {
        System.out.println(bitwiseComplement(5));
    }

    public static int bitwiseComplement(int n) {
        return Integer.parseInt(Integer.toBinaryString(n).replace("0","*").replace("1", "0").replace("*", "1"), 2);
    }

}
