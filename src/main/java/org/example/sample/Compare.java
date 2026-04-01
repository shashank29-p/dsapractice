package org.example;

import com.google.common.collect.Comparators;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Compare {

  public static void main(String args[]) {
    List<Integer> list= new ArrayList<>(Arrays.asList(10000,200,30,3,4000,500));
  /*  for (int i = list.size() - 1; i >= 0; i--) {
      if (list.get(i) == 3) {
        list.remove(i);
      }
    }
    System.out.println(list);*/
    System.out.println(Collections.max(list));
  }
}
