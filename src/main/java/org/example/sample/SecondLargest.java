package org.example;

import com.google.common.util.concurrent.AbstractScheduledService.Scheduler;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SecondLargest {

  public static void main(String[] args) {
    int[] a1 = {1, 2, 3, 40, 5, 90, 7, 8, 9, 80,100};
    //1 way
    /*IntStream a=Arrays.stream(a1).sorted();
    System.out.println(a.limit(a1.length-1).max().getAsInt());*/

    //2 way
 /*   int top= Arrays.stream(a1).max().getAsInt();
    int secondMax=0;
    for(int i=0;i<a1.length;i++){
     if(a1[i]<top && a1[i]>secondMax){
       secondMax=a1[i];
     }
    }
    System.out.println(secondMax);
 */

    //3 way
    int top=0;
    for (int i=0;i< a1.length;i++){
      for (int j = i + 1; j < a1.length; j++) {
        if (a1[i] > a1[j]) {
        top = a1[i];
        a1[i] = a1[j];
        a1[j] = top;
      }
    }
    }
    System.out.println(a1[a1.length-2]);
  }
}
