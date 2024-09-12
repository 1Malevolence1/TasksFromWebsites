package org.example.LeetCode;

public class AssignCookies455 {

    public static void main(String[] args) {
       // System.out.println(findContentChildren(new int[]{1,2,3}, new int[]{3}));
        System.out.println(findContentChildren(new int[]{1,2}, new int[]{1,2,3}));
    }
    public static int findContentChildren(int[] g, int[] s) {
        int count = 0;
        for (int i = g.length - 1; 0 <= i ; i--) {
            for (int j = 0; j < s.length; j++) {
                if(s[j] == 0) continue;
                if(g[i] == s[j]){
                    g[i] = 0;
                    s[j] = 0;
                    count++;
                }
            }
        }
        return count;
    }
}
