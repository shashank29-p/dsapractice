package org.example;

import java.util.Scanner;
import java.util.Stack;
import java.util.stream.IntStream;

public class FileLoad {

  public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter a string to get the reverse: ");
    String abc= scanner.nextLine();
//knahsAhS iH
    Stack<String> strings=new Stack<>();
    for(int i=0 ; i<abc.length(); i++){
        strings.push(String.valueOf(abc.charAt(i)));
    }
    StringBuilder stringBuilder=new StringBuilder();
    for(int i=0;i<abc.length();i++){
      stringBuilder.append(strings.peek());
      strings.pop();
    }
    System.out.println(stringBuilder);
  }
}

