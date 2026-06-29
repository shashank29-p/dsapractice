package org.example.dsa.strings;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWord {

  public static void main(String[] args) {
    String input=
        "developer";

   String op=  input.chars().sorted().collect(StringBuilder::new,StringBuilder::appendCodePoint, StringBuilder::append).toString();
    System.out.println(op);

    String myip="WE LOVE INDIA";

    String[] split=myip.split(" ");
    StringBuilder opText=new StringBuilder();
    for(String s:split){
      opText.append(new StringBuilder(s).reverse()).append(" ");
    }
    System.out.println(opText.toString());

    StringBuilder result = new StringBuilder();

    for(String s:split){
      for(int i=s.length()-1;i>=0;i--){
        result.append(s.charAt(i));
      }
      result.append(" ");
    }
    System.out.println(result);

  }

}
