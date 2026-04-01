package org.example;

import java.util.Arrays;

public class MidElement {

  public static void main(String[] args) {
    int[] a1 = {1, 2, 3, 40, 5, 90, 88, 8, 9, 80,4,99};
    int temp=0;
    for(int i=0;i<a1.length;i++){
      for(int j=i+1;j< a1.length;j++){
        if (a1[i] > a1[j]) {
          temp=a1[i];
          a1[i]=a1[j];
          a1[j]=temp;
        }
      }
    }
    int length=a1.length/2;
    System.out.println(Arrays.toString(a1));
    System.out.println(Arrays.toString(new int[]{a1[length-1]}));
  }

}
