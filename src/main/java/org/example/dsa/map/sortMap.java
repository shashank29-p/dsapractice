package org.example.dsa.map;

import java.util.*;
import java.util.stream.Collectors;

public class sortMap {
    public static void main(String[] args) {
        Map<String, Integer> map=new HashMap<>();
        map.put("alice",20);
        map.put("rak",30);
        map.put("menon",50);
        Map<String, Integer> revised= map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2)-> e1, LinkedHashMap::new));
        System.out.println(revised.values());
    }
}
