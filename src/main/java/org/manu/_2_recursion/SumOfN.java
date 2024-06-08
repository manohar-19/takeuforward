package org.manu._2_recursion;


public class SumOfN {
    public static void main(String[] args) {
        func(3,0);
    }

    private static void func(int i, int sum) {
        if (i<1){
            System.out.println(sum);
            return;
        }
        func(i-1,sum+i);

    }
}
