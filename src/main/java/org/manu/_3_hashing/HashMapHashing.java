package org.manu._3_hashing;

import java.util.HashMap;
import java.util.Map;

public class HashMapHashing {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 5, 4, 3, 2, 5, 1};

        //pre compute
        Map<Integer,Integer> hash = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int count=0;
            if (hash.containsKey(arr[i])){
                count= hash.get(arr[i]);
            }
            hash.put(arr[i],count+1);
        }

        //another way
        for (int i = 0; i < arr.length; i++) {
            if (hash.containsKey(arr[i])){
                hash.put(arr[i],hash.get(arr[i])+1);
            }
            hash.put(arr[i],1);
        }


        //ways of iterating over hash map
        System.out.println(hash);

        for (Map.Entry<Integer, Integer> map : hash.entrySet()) {
            System.out.println(map.getKey()+" "+map.getValue());
        }

        hash.forEach((key,value)-> System.out.println(key+"->"+value));
    }
}
