package org.example.dsa.strings;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingChar {

  public static void main(String[] args) {
    String input= "aabbc";
    //output=c

    Optional<Entry<Character, Long>> map= Optional.of(input.chars().mapToObj(c -> (char) c)
        .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,
            Collectors.counting())).entrySet().stream().filter(e -> e.getValue() == 1).findFirst()
        .get());

    System.out.println(map.get());
  }

}
