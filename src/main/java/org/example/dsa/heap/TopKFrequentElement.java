package org.example.dsa.heap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

public class TopKFrequentElement {

  public static void main(String[] args) {
    /*

    PROBLEM IP OUTPUT:
nums = [1,1,1,2,2,3]
k = 2

Return:

[1,2]

Because:

1 appears 3 times
2 appears 2 times

We use min heap here because we need to Keep only top k frequent elements
DRY RUN
LET"S USE HASHMAP FOR FREQ AND HEAP COMBO
----------------------------------
pq = [2, 1]   (min-heap, freq: 2→2, 1→3)

Iteration 1:
  pq.poll() → returns 2  (lowest freq first)
  result[0] = 2,  i becomes 1
  result = [2, 0]

Iteration 2:
  pq.poll() → returns 1
  result[1] = 1,  i becomes 2
  result = [2, 1]

pq is empty → exit loop
return [2, 1]

Time: O(n log k)
Space: O(n)

*/
    int[] nums={1,1,1,2,2,3};
    int k=2;

    HashMap<Integer,Integer> map=new HashMap<>();
    PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->map.get(a)-map.get(b));

    for(int num:nums){
      map.put(num,map.getOrDefault(num,0)+1);
    }

    for(int num:map.keySet()){
      pq.add(num);
      if(pq.size()>k){
        pq.poll();
      }
    }

    int[] result=new int[k];
    int i=0;

    while(!pq.isEmpty()){
      result[i]=pq.poll();
      i++;
    }

    System.out.println(Arrays.toString(result));
  }

}
