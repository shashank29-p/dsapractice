package org.example;

import java.util.HashMap;
import java.util.Map;

public class NestedHashmap {

  public void traverse(HashMap<String , Object> hashmap){
    for(String s:hashmap.keySet()){
   Object val=hashmap.get(s);
   if (val instanceof HashMap){
     System.out.println("nested");
     traverse((HashMap<String, Object>) val);
   }else if (val instanceof String){
     System.out.println(val);
   }
    }
  }

  public static void main(String[] args) {
    HashMap<String , Object> leafMap=new HashMap<>();
    HashMap<String , Object> nestedMap=new HashMap<>();
    HashMap<String , Object> parentMap=new HashMap<>();

    leafMap.put("leaf","leaf-value");
    nestedMap.put("nested",leafMap);
    parentMap.put("parent",nestedMap);
    NestedHashmap nestedHashmap=new NestedHashmap();
    nestedHashmap.traverse(parentMap);
  }

}
