package org.example.dsa.heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KClosest {

  public static void main(String[] args) {
    /*


    Core IDEA:
points = [[1,3],[-2,2],[5,0]],  k = 2
Answer: [[-2,2],[1,3]]
 dist = x² + y²

[1,3]  → 1+9  = 10
[-2,2] → 4+4  = 8    closer
[5,0]  → 25+0 = 25

logic (a, b) -> (b[0]*b[0] + b[1]*b[1]) - (a[0]*a[0] + a[1]*a[1])

The trick is the same as topKFrequent:
Keep heap size = k
Max heap → largest distance sits on TOP
When size > k → poll() removes the FARTHEST point
What remains = K closest points  ✅


Goal: Keep K smallest  →  evict largest  →  MAX heap  →  b - a
Goal: Keep K largest   →  evict smallest →  MIN heap  →  a - b
Goal: Keep K closest   →  evict farthest →  MAX heap  →  b - a
Goal: Keep K frequent  →  evict least    →  MIN heap  →  a - b
kth largest	min heap
k closest	max heap
Time: O(n log k)
Space: O(k)

*/
    int[][] nums={{1,3},{-2,2},{5,0}};
    int k = 2;

    PriorityQueue<int[]> pq=new PriorityQueue<>(
        (a,b)->( b[0]*b[0]+ b[1]*b[1]) - (a[0]*a[0]+a[1]*a[1])
    );

    for(int[] num:nums){
      pq.add(num);
      if(pq.size()>k){
        pq.poll();
      }
    }

    int[][] result=new int[k][2];

    for(int i=0;i<k;i++){
      result[i]=pq.poll();
    }

    System.out.println(Arrays.stream(result).toArray().toString());
  }

}
