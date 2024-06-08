package org.manu._2_recursion;

import java.util.Arrays;

public class StringPalindrome {
    public static void main(String[] args) {
        String str = "ABCDDCBA";
        char[] arr = str.toCharArray();
        System.out.println("arr " + Arrays.toString(arr));

        isPalindrome(arr, 0, arr.length - 1);
    }
    // time complexity O(n/2)
    private static void isPalindrome(char[] arr, int start, int end) {
        boolean isPalindrome = true;

        while (start < end) {
            if (arr[start] == arr[end]) {
                ++start;
                --end;
            }else {
                isPalindrome=false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("its a palindrome");
        } else {
            System.out.println("its Not a palindrome");
        }
    }


}
