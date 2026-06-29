package org.example.dsa.heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class FindNClosest {

  public static void main(String[] args) {
    int[] arr={10,20,17,7,6,12};
    int n=9,k=2;
    PriorityQueue<int[]> priorityQueue=new PriorityQueue<int[]>(
        (a,b)->b[1]-a[1]);
    for(int ar:arr){
      int diff=Math.abs(ar-n);
      priorityQueue.add(new int[]{ar,diff});

      if(priorityQueue.size()>k){
        priorityQueue.poll();
      }
    }

    while(!priorityQueue.isEmpty()){
      System.out.println(priorityQueue.poll()[0]);
    }

    Arrays.stream(arr)
        .boxed().sorted((a,b)-> Integer.compare(Math.abs(a-n),Math.abs(b-n)))
        .limit(k)
        .forEach(System.out::println);

  }

}
