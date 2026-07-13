package org.example.dsa.array;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

  public static void main(String[] args) {
    int[] nums = {2, 2, 1, 1, 1, 2, 2};
    System.out.println(majorityElement(nums));
  }

  public static int majorityElement(int[] nums) {
    //Using hashmap creates extra space
    Map<Integer, Integer> countMap = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      countMap.put(nums[i], countMap.getOrDefault(nums[i], 0) + 1);
    }
    int max = 0, key = 0;
    for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
      if (entry.getValue() > max) {
        max = entry.getValue();
        key = entry.getKey();
      }
    }
    // return key;

    //second way Boyer–Moore Voting Algorithm
    int candidate = 0, count = 0;
    for (int num : nums) {
      if (count == 0) {
        candidate = num;
      }
      count += (num == candidate) ? 1 : -1;
    }
    return candidate;
  }

}
