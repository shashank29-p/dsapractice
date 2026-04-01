package org.example;

public class IsPalindrome {

  public static void main(String[] args) {
   String input=" I am kanak , I know malayalam";
   String[] words=input.split(" ");
   for (String word: words){
     if( isPal(word)){
       System.out.println(word);
     }
   }
  }

  public static boolean isPal(String input){
    int i1=0;
    int i2= input.length()-1;
    while (i2>i1){
      if (input.charAt(i1) != input.charAt(i2)){
        return false;
      }
      i1++;
      i2--;
    }
    return true;
  }

}
