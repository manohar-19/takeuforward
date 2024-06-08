package org.manu._3_hashing;

import java.util.HashMap;
import java.util.Map;

public class Highest_Lowest_Frequency {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 5, 4, 3, 2, 5, 1,1};

        //pre compute
        Map<Integer, Integer> hash = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (hash.containsKey(arr[i])) {
                hash.put(arr[i], hash.get(arr[i]) + 1);
            }else {
                hash.put(arr[i], 1);
            }
        }
        System.out.println(hash);
        int maxEle = 0, maxFreq = 0;
        int minEle = 0, minFreq = arr.length;

        for (Map.Entry<Integer, Integer> map : hash.entrySet()) {
            int key = map.getKey();
            int value = map.getValue();

            if (value > maxFreq) {
                maxFreq = value;
                maxEle = key;
            }
            if (value < minFreq) {
                minFreq = value;
                minEle = key;
            }
        }

        System.out.println("Max key" + maxEle + " value " + maxFreq);
        System.out.println("Min key" + minEle + " value " + minFreq);
    }
}
