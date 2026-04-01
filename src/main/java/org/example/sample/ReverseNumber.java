package org.example;

public class ReverseNumber {

  public static void main(String[] args) {
    int a= -320;
    getReverse(a);

  }
  static void getReverse(int x){
    int y;
    while (x>0){
      y= x%10;
      System.out.println(y);
      x=x/10;
    }
    if(x<0){
      StringBuilder stringBuilder=new StringBuilder(x);
      for(int i=0;i<stringBuilder.length();i++){
       if(Character.isAlphabetic(i) || !Character.isDigit(i)){
          
       }
      }
      stringBuilder.toString();
    }
  }

}
