package org.manu._2_recursion;

public class PrintNto1 {
    public static void main(String[] args) {
        func(4,4);
    }

    private static void func(int i, int n) {
        if (i<1)return;
        System.out.println(i);
        func(--i,n);
    }
}
