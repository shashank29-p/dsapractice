package org.example;

public class Pattern {

  public static void main(String[] args) {
     String abc="CloudTech";
     for(int i=0;i<abc.length();i++){
       if(String.valueOf(abc.toLowerCase().charAt(i)).equals("c")){
         abc= abc.replace(String.valueOf(abc.charAt(i)),"");
       }
     }
    System.out.println(abc);
  }

}
