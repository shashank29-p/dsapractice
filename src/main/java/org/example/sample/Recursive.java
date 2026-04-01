package org.example;

public class Recursive {

  public static void main(String[] args) {
    String str="Hello, World";
    System.out.println(reverse(str));
  }

  public static String reverse(String input){
    if(input.isEmpty()){
      return input;
    }else {
      return reverse(input.substring(1))+ input.charAt(0);
    }
  }

}
