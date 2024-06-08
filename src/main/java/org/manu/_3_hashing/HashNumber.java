package org.manu._3_hashing;

import java.util.Arrays;

public class HashNumber {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 5, 4, 3, 2, 5, 1};

        //pre compute
        int[] hash = new int[6];
        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]]++;
        }

        //fetch
        for (int i = 0; i < hash.length; i++) {
            System.out.println(i + " " + hash[i]);
        }
    }


}
