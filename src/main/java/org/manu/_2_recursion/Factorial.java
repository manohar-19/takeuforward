package org.manu._2_recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(func(4));
    }

    private static int func(int i) {
        if (i==0){
            return 1;
        }
        return i * func(i-1);
    }
}
