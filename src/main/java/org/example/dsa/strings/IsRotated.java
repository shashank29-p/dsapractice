package org.example.dsa.strings;

public class IsRotated {

  public static void main(String[] args) {
    String input="abcd";
    String output="abcd";
    if (input.length() != output.length()) {
      System.out.println(false);
      return;
    }
    if((input+input).contains(output)){
      System.out.println(true);
    }else {
      System.out.println(false);
    }
  }

}
