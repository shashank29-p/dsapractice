package org.example.dsa.array;

import java.util.*;

public class TwoSum {

    public static void main(String[] args) {
        int[] arr={1,2,9,10,17};
        int target=19;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int complement= target-arr[i];
            if(map.containsKey(complement)){
                System.out.println(map.get(complement));
            }
            map.put(arr[i],i);
        }
    }
}
