package org.manu._1_basic_math;

public class GCD {
    public static void main(String[] args) {
        int num1 = 9, num2 = 12;
        int gcd =0;
        int count =0;
        // one way
        for (int i = 1; i <= Math.min(num1, num2); i++) {

            if (num1%i==0 && num2%i==0){
                gcd=i;
            }
            System.out.println(++count);
        }

        System.out.println("gcd is"+gcd);
        count=0;

        // another way
        for (int i = Math.min(num1, num2); i >0; i--) {
            if (num1%i==0 && num2%i==0){
                gcd=i;
                break;
            }
            System.out.println(++count);
        }

        System.out.println("gcd is"+gcd);
    }
}
