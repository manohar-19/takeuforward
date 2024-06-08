package org.manu._2_recursion;

import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        fib(6);
    }


    private static void fib(int num) {
        if (num==0){
            System.out.println(0);
        }else {
            int[] fib = new int[num+1];
            fib[0]=0;
            fib[1]=1;
            for (int i = 2; i <= num; i++) {
                fib[i] = fib[i-1]+ fib[i-2];
            }

            System.out.println(Arrays.toString(fib));
        }

    }


}
