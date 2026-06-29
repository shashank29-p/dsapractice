package org.example.dsa;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class FindDuplicate {

  public static void main(String[] args) {
    int[] arr=new int[]{1,2,1,2,4};
    Arrays.sort(arr); // Step 1: Sort the array

    int i = 0; // First pointer
    int j = 1; // Second pointer

    while (j < arr.length) {
      if (arr[i] == arr[j]) { // If duplicates found
        System.out.println(arr[i]);
      }
      i++; // Move both pointers
      j++;
    }

    int[] array=new int[]{7,3,4,7,3,5};
    Set<Integer> set=new LinkedHashSet<>();
    for(int a: array){
      set.add(a);
    }

    int[] result=new int[set.size()];
    int m=0;
    for(int s:set){
      result[m++]=s;
    }
    Arrays.stream(result).forEach(System.out::println);
  }



}
