package org.manu._4_sorting;

import java.util.Arrays;

public class SelectionSorting {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 3, 5, 7, 2, 6, 8};
        selection_sort(arr);

    }
//Time complexity: O(N2), (where N = size of the array),
// for the best, worst, and average cases.
    private static void selection_sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
