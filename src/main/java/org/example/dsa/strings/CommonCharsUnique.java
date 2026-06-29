package org.example.dsa.strings;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CommonCharsUnique {

  public static void main(String[] args) {

    String s1="developer";
    String s2="programmer";

    s1.chars().filter(c-> s2.indexOf(c)!=-1)
        .distinct().forEach(c-> System.out.println((char) c));

    Map<Character,Long> map=s1.chars().mapToObj(c-> (char) c)
        .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
    System.out.println(map);

    s2.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
  }

}
