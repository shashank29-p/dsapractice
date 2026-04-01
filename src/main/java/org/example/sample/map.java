package org.example;

import java.util.Scanner;

public class map {

  public static void main(String[] args) {
    //System.setProperty("aws.accessKeyId","AKIA3OUR52QQOX55CGV7");
    //System.setProperty("aws.secretKey","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");
    System.out.println(System.getenv("aws.accessKeyId"));
    System.out.println(System.getenv("aws.secretKey"));
    System.out.println(System.getProperty("aws.secretKey"));
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter a para");
    String s = scanner.nextLine();
    String[] strings = s.split("\\s");
    System.out.println(strings);
    int palindromeCount = 0;
    int notPalindrome = 0;
    for (String ss : strings) {
      StringBuilder stringBuilder = new StringBuilder(ss);
      String s1 = String.valueOf(stringBuilder.reverse());
      if (ss.equals(s1)) {
        System.out.println("palindrome");
        System.out.println(palindromeCount++);
      } else {
        System.out.println("not palindrome");
        notPalindrome++;
        System.out.println(notPalindrome);
      }
    }
  }

}
