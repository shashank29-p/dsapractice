package org.example;

public class Main {

  public static void main(String[] args) {
   int a=10;
   int b=20;
    System.out.println(a++ + ++b); //31
    System.out.println(++a + b++); //31
    System.out.println(++a + ++b);  //32
    System.out.println(a++ + b++); //30
  }
}
