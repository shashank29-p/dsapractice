package org.example;

public class StringCase {

  public static void main(String[] args) {
     String s= "This is life.This is life";
     int s1=s.length()/2;
     String abc= s.substring(0, s1).toUpperCase();
     String adc= s.substring(s1).toLowerCase();
    System.out.println(abc+adc);
  }

}
