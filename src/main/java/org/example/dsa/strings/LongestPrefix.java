package org.example.dsa.strings;

import java.util.Arrays;

public class LongestPrefix {

  public static void main(String[] args) {
    String[] strs = {"flower","flow","flight"};
    System.out.println(longestCommonPrefix(strs));
  }

  public static String longestCommonPrefix(String[] strs) {
    //1st way horizantal scanning
    String prefix=strs[0];
    for(int i=1; i<strs.length;i++){
      while (strs[i].indexOf(prefix) != 0) {
        prefix = prefix.substring(0, prefix.length() - 1);
        if (prefix.isEmpty()) return "";
      }
    }

    //2nd way
    if (strs==null || strs.length==0) return "";
    Arrays.sort(strs);
    String start= strs[0];
    String end= strs[strs.length-1];
    int i=0;
    while(i<start.length() && i< end.length() && start.charAt(i)== end.charAt(i)){
      i++;
    }
     return start.substring(0,i);
  }

}
