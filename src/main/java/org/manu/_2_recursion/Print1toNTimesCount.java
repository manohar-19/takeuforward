package org.manu._2_recursion;

public class Print1toNTimesCount {
    public static void main(String[] args) {
        print(1, 5);
    }

    public static void print(int i, int size){
        if (i>size) return;
        System.out.println(i);
        print(++i, size);
    }
}
