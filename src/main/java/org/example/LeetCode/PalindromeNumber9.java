package org.example.LeetCode;

public class PalindromeNumber9 {

    public static void main(String[] args) {

        System.out.println(isPalindrome(123));
        System.out.println(isPalindrome(-123));
        System.out.println(isPalindrome(111));
        System.out.println(isPalindrome(10));
        System.out.println(isPalindrome(141));
        System.out.println(isPalindrome(-111));
        System.out.println(isPalindrome(0));

        System.out.println(isPalindrome(1));

    }

   public static boolean isPalindrome(int x) {
       String s = String.valueOf(x);
       int n = s.length();

       for (int i=0; i<n/2; i++) {
           if (s.charAt(i) != s.charAt(n-i-1)) return false;
       }


       return true;
    }
}
