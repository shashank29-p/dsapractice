package org.example.dsa.heap;

import java.util.PriorityQueue;

public class FindKthLargest {

  public static void main(String[] args) {

    //we use priority queue
    //min heap
    //key idea is that in min heap top element stays at the last
   /*

   sample ip op
   nums = [3,2,1,5,6,4]
    k = 2
    Return:
    5
    Because:
    largest = 6
    2nd largest = 5

Time: O(n log k)
Space: O(k)

    */
    int[] nums={3,2,1,5,6,4};
    int k=2;

    PriorityQueue<Integer> pq=new PriorityQueue<>();
    for(int num:nums){
      pq.add(num);
      if(pq.size()>k){
        pq.poll();
      }
    }
    System.out.println(pq.peek());
  }

}
