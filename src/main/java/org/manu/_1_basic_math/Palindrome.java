package org.manu._1_basic_math;

public class Palindrome {
    public static void main(String[] args) {
        int num = 12321;
        int copy = num;
        int rev = 0;

        while (num > 0) {
            rev = (rev * 10) + num % 10;
            num = num / 10;
        }
        if (copy == rev) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
