package org.example.LeetCode;

public class DefangingAnIPAddress1108 {

    public static void main(String[] args) {
        System.out.println(defangIPaddr("1.1.1.1"));
    }

    public static String defangIPaddr(String address) {
        address = address.replace(".","[.]");
        return address;
    }
}
