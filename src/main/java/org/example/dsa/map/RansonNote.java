package org.example.dsa.map;

import java.util.*;

public class RansonNote {

    public static void main(String[] args) {
        String r="aa", m="aab";
        Map<Character,Integer> map=new HashMap<>();
        for(char c: m.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        for(char c:r.toCharArray()){
            if(!map.containsKey(c) || map.get(c)==0){
                System.out.println(true);
            }
            map.put(c,map.getOrDefault(c,0)-1);
        }
        System.out.println(false);
    }
}
