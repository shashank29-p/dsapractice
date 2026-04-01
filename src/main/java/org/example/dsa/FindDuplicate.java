package org.example.dsa;

import java.util.Arrays;

public class FindDuplicate {

  public static void main(String[] args) {
    int[] arr=new int[]{1,2,3,2,4};
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
  }

}
