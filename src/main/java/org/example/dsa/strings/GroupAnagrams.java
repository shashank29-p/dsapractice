package org.example.dsa.strings;

import java.util.HashMap;
import java.util.*;

public class GroupAnagrams {

  public static void main(String[] args) {
    String[] strings={"eat",
        "tea",
        "tan",
        "ate",
        "nat",
        "bat"};

    Map<String, List<String>> map=new HashMap<>();


    for(String str:strings){
      char[] chars=str.toCharArray();
      Arrays.sort(chars);
      String key=new String(chars);
      map.computeIfAbsent(key,k->new ArrayList<>(Collections.singleton(String.valueOf(chars))));
    }
    System.out.println(new ArrayList<>(map.values()));
  }

}
