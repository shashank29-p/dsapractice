package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.checkerframework.checker.units.qual.A;

public class TwoArray {

  public static void main(String[] args) {
    int[] a1 = {1, 2, 3, 40, 5, 90, 7, 8, 9, 80,100};
    int[] evenArray=new int[0];
    int[] oddArray=new int[0];
    for(int i=0;i< a1.length;i++){
      if (a1[i] % 2 == 0) {
        evenArray = Arrays.copyOf(evenArray, evenArray.length + 1); // Increase array size
        evenArray[evenArray.length - 1] = a1[i]; // Add even number to the end
      } else {
        oddArray = Arrays.copyOf(oddArray, oddArray.length + 1); // Increase array size
        oddArray[oddArray.length - 1] = a1[i]; // Add odd number to the end
      }
    }
    System.out.println(Arrays.toString(evenArray));
    System.out.println(Arrays.toString(oddArray));
  }


}
