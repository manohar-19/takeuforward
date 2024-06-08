package org.manu._3_hashing;

public class HashString {
    public static void main(String[] args) {

        String str = "agfkasfkjahyfekjfhfh";

        /*
        pre-compute
         length should be 256 , if the string contains both uppercase and lowercase
        */
        int[] hash = new int[26];
        for (int i = 0; i < str.length(); i++) {
            hash[str.charAt(i)-'a']++;
        }

        //fetch
        char c = 'a';
        for (int i = 0; i < hash.length; i++) {
            System.out.println(c + " " + hash[c-'a']);
            c++;
        }
    }
}
