package org.example.dailyporblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class CommonElement {

  public static void main(String[] args) {
    int[] arr={1,2,3,4,5,6,7};
    int[] arr1={2,3,6,9};
    //One way
    int[] result=IntStream.of(arr)
        .filter(value -> IntStream.of(arr1).anyMatch(x->x==value)).toArray();
    Arrays.stream(result).forEach(System.out::println);

    System.out.println("----------------------------------------");

    //second way
    List<Integer> list=new ArrayList<>();
    for(int num:arr){
      list.add(num);
    }
    for(int num:arr1){
      if(list.contains(num)){
        System.out.println(num + " ");
      }
    }
  }
}
