package org.example.dailyporblem;

import java.util.Arrays;

public class SwappingString {

  public static void main(String[] args) {
    String input="abfac";
    int a[]=new int[10];
    for(int i=0;i<input.length();i++){
      char charAt=input.charAt(i);
      for(int j=i+1;j<input.length();j++){
        if(charAt == input.charAt(j)){
         a[i]=j;
        }
      }
    }
    if(a!=null){
      Arrays.stream(a).forEach(System.out::println);
    }else {
      System.out.println(-1);
    }
  }

}
