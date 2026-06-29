package org.example.dsa.heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class Median {

  public static void main(String[] args) {

    /*
    Simple Rule to Remember
Heap Type             poll() returns
Min-Heap (large)      Smallest number
Max-Heap (small)      Biggest number

    * */

    PriorityQueue<Integer> small=new PriorityQueue<>(Collections.reverseOrder());//max heap
    PriorityQueue<Integer> large=new PriorityQueue<>();//min heap

    int[] nums={1,1,1,2,2,3};
    for(int num:nums) {
      small.add(num);
      large.add(small.poll());
      if(large.size()>small.size()){
        small.add(large.poll());
      }
    }

    if(small.size()>large.size()){
      System.out.println(small.peek());
      return;
    }
    System.out.println(small.peek()+large.peek()/2.0);
  }

}
