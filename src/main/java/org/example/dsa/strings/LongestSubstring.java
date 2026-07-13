package org.example.dsa.strings;

import java.util.HashMap;
import java.util.*;

public class LongestSubstring {
 //Non repeating char
  public static void main(String[] args) {

    String input="abcabcabc";
    int left=0;
    int start=0;
    int max=0;
    HashSet<Character> set=new HashSet<>();
    for(int right=0;right<input.length();right++){
      while(set.contains(input.charAt(right))){
        set.remove(input.charAt(left));
        left++;
      }

      set.add(input.charAt(right));

      if(right-left+1>max){
        max=right-left+1;
        start=left;
      }
    }
    System.out.print(input.substring(start,start+max));
  }

}
