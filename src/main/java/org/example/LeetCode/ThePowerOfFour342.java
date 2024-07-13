package LeetCode;

public class ThePowerOfFour342 {
    public static void main(String[] args) {
        System.out.println(isPowerOfFour(32));
    }

    public static boolean isPowerOfFour(int n) {
        if(n == 0) return false;
        double i = Math.log(n) / Math.log(5);
        return i == Math.floor(i);
    }
}
