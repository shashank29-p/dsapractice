package org.example.dailyporblem;

import java.util.Scanner;

public class StringManipulation {

  public static void main(String[] args) {
    System.out.println("Enter the input");
    Scanner scanner=new Scanner(System.in);
    String input= scanner.next();
    // vowel =a , e , i , o, u
    int count=0;
    for (int i=0;i<input.length();i++){
      if(Character.isLetter(input.charAt(i)) && (input.charAt(i) == 'e' || input.charAt(i)=='a'
      || input.charAt(i)=='i' || input.charAt(i)=='o' || input.charAt(i)=='u')){
        count++;
      }
    }

    System.out.println("The number of vowels "+ count);
    System.out.println("The number of consonants "+ (input.length()-count));

  }
}
