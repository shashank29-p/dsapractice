package org.example;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MultiMap {

  public static void main(String[] args) {
  /*  ListMultimap<String, Integer> multimap= ArrayListMultimap.create();
    multimap.put("anonymous",1);
    multimap.put("anonymous",1);
    multimap.put("anonymous",2);
    System.out.println(multimap.get("anonymous"));*/


    Map<String, Integer> map=new LinkedHashMap<>();
    map.put("s",1);
    map.put("w",3);
    map.put("a",4);
    System.out.println(map);

    List<String> list=new ArrayList<>();
    list.add("a");
    System.out.println("List size "+list.size());
    System.out.println(list.isEmpty());


   for( Map.Entry<String,Integer> maps:map.entrySet()){
     System.out.println(maps.getValue());
   }

  }

}
