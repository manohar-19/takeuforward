package org.manu._1_basic_math;

public class CountDigits {
    public static void main(String[] args) {
        int num = 2046353;
        int count=0;
        while (num>0){
            count++;
            num= num/10;
        }
        System.out.println("total count is "+count);
    }
}
