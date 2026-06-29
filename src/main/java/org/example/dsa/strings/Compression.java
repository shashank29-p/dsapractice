package org.example.dsa.strings;

import java.util.HashMap;
import java.util.Map;

public class Compression {

  public static void main(String[] args) {
    String input = "aaabbc";
    //op: a3b2c1
    StringBuilder builder = new StringBuilder();
    int count = 1;
    for (int i = 1; i <= input.length(); i++) {
      if (i < input.length() && input.charAt(i - 1) == input.charAt(i)) {
        count++;
      } else {
        builder.append(input.charAt(i - 1)).append(count);
        count = 1;
      }
    }
    System.out.println(builder);

    //Frequency not compression
    Map<Character, Integer> map = new HashMap<>();
    for (char arr : input.toCharArray()) {
      if (map.containsKey(arr)) {
        map.put(arr, map.getOrDefault(arr, 1) + 1);
      } else {
        map.put(arr, 1);
      }
    }

    for (Map.Entry<Character, Integer> entry : map.entrySet()) {
      System.out.print(String.valueOf(entry.getKey()) + entry.getValue());
    }
  }

}
