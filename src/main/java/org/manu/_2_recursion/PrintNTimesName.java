package org.manu._2_recursion;

public class PrintNTimesName {
    public static void main(String[] args) {
        print(1, 5);
    }

    public static void print(int i, int size){
        if (i>size) return;
        System.out.println("Manu");
        print(++i, size);
    }
}
