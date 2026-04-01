package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortHashMap {

  public static void main(String[] args) {
    Map<String,Integer> map=new HashMap<>();
    map.put("abc", 5);
    map.put("cd",20);
    map.put("cds",4);
    System.out.println(map);
    Map<String, Integer> sortedMap = map.entrySet()
        .stream()
        .sorted(Map.Entry.comparingByValue())
        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
            (e1, e2) -> e1, // Merge function for duplicate keys (keep the first value)
            LinkedHashMap::new // Use LinkedHashMap to maintain insertion order
        ));
    System.out.println(sortedMap);
  }

}
