package org.example.dsa.strings;

import java.util.HashMap;
import java.util.Map;

public class Isomorphic {

  public static void main(String[] args) {
    String s1="foo";
    String s2="bar";

    if(s1.length()!=s2.length()){
      return;
    }
    Map<Character,Character> map1=new HashMap<>();
    Map<Character,Character> map2=new HashMap<>();

    for(int i=0;i<s1.length();i++){
      char c1= s1.charAt(i);
      char c2= s2.charAt(i);

      if(map1.containsKey(c1)&& map1.get(c1)!=c2){
        System.out.println(false);
        return;
      }
      if(map2.containsKey(c2) && map2.get(c2)!=c1){
        System.out.println(false);
        return;
      }
      map1.put(c1,c2);
      map2.put(c2,c1);
    }
    System.out.println("Isomorphic");
  }

}
