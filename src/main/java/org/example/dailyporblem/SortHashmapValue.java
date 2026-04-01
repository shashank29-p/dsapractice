package org.example.dailyporblem;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class SortHashmapValue {

  public static void main(String[] args) {
    Map<String,String> map=new HashMap<>();
    map.put("name","raaj");
    map.put("name1","aman");
    map.put("name2","jack");
    map.put("name3","xavier");
    Map<String,String> sorted=map.entrySet().stream()
        .sorted(Map.Entry.comparingByValue())
        .collect(Collectors.toMap(Entry::getKey,Entry::getValue,(e1,e2)->e1, LinkedHashMap::new));
    System.out.println(sorted);
  }

}
