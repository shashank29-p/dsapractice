package org.example.dsa;

public class LetterCount {

  public static void main(String[] args) {
    String s = "ddmmm";
    StringBuilder builder = new StringBuilder();
    int count = 1;
    for (int i = 1; i < s.length(); i++) {
      if (s.charAt(i) == s.charAt(i - 1)) {
        count++;
      } else {
        builder.append(s.charAt(i-1));
        builder.append(count);
        count = 1;
      }
    }
    builder.append(s.charAt(s.length()-1));
    builder.append(count);
    System.out.println(builder);
  }

}
