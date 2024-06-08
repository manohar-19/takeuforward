package org.manu._4_sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 3, 5, 7, 2, 6, 8};
        bubble_sort(arr);

    }

 //Time complexity: O(N2), (where N = size of the array),
 // for the worst, and average cases.
    private static void bubble_sort(int[] arr) {
        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
