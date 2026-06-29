package org.example.dsa.strings;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {

  public static void main(String[] args) {

    String input="abcabcabc";

    Map<Character,Integer> map=new HashMap<>();
    int left=0;
    int max=0;

    for(int right=0; right<input.length(); right++){
      char ch= input.charAt(right);

      if(map.containsKey(ch)){
        left=Math.max(left,map.get(ch)+1);
      }
      map.put(ch,right);
      max=Math.max(max,right-left+1);
    }
    System.out.println(input.substring(max));
  }

}
