package org.example.dsa.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MergeTwoArray {

  public static void main(String[] args) {
    int[] nums1=new int[]{1,2,3,0,0,0,0};
    int[] nums2=new int[]{2,5,6};
    merge(nums1,3,nums2,3);
  }


  public static void merge(int[] nums1, int m, int[] nums2, int n) {
    // [1.2.3.0.0.0] m=3 - [1.2.3]
    int counter=0;
    List<Integer> intList=new ArrayList<>();
    for (int j : nums1) {
      if (counter != m) {
        intList.add(j);
        counter++;
      } else {
        counter = 0;
        break;
      }
    }
    for (int j : nums2) {
      if (counter != n) {
        intList.add(j);
        counter++;
      } else {
        break;
      }
    }
    List<Integer> list=intList.stream().sorted().collect(Collectors.toList());
    for(int i=0;i<intList.size();i++){
        nums1[i] = list.get(i);
    }
  }

}
