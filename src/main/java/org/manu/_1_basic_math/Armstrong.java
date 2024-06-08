package org.manu._1_basic_math;

public class Armstrong {
    public static void main(String[] args) {
        int num = 371;
        double sum=0;
        int copy=num;
        double k = String.valueOf(num).length();
        while (copy>0){
            int value=  copy%10;
            sum = sum + Math.pow(value,k);
            copy/=10;
        }
        if (num==sum){
            System.out.println("Armstrong");
        }else {
            System.out.println("Not an Armstrong");
        }
    }
}
