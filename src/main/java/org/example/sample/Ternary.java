package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Ternary {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.println("enter a number:");
    int n = scn.nextInt(); //input the number
    System.out.println(""+callMethod(n));
  }

  public static int callMethod(int n){
    try {
      List<Integer> list = new ArrayList<>();
      list.add(n);
      List<String> aa = List.of("BC");
      aa.add("ss");
      System.out.println(list);
      return list.get(0).toString().length();
    }catch (Exception e){
      e.printStackTrace();
      return 0;
    }
  }
}
