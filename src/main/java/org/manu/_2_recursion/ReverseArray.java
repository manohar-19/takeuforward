package org.manu._2_recursion;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,4,5,6,7};
        func2(arr, 0, arr.length-1 );
        System.out.println(Arrays.toString(arr));
    }

    private static void func1(int[] arr, int start, int end) {

        while (start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            ++start;
            --end;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static int[] func2(int[] arr, int start, int end) {

        if (start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            func2(arr,start+1,end-1);
        }
        return arr;
    }

}
