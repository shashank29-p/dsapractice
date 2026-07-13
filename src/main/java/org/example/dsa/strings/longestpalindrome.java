package org.example.dsa.strings;

public class longestpalindrome {

  public static void main(String[] args) {
  longestpalindrome longestpalindrome=new longestpalindrome();
    System.out.println(longestpalindrome.longestPalindrome("addb"));
  }

  public String longestPalindrome(String s) {
    String result = "";
    for (int i = 0; i < s.length(); i++) {
      String odd = expand(s, i, i);       // "aba"
      String even = expand(s, i, i + 1);  // "abba"
      String longer = odd.length() > even.length() ? odd : even;
      if (longer.length() > result.length()) {
        result = longer;
      }
    }
    return result;
  }

  private String expand(String s, int left, int right) {
    while (left >= 0 && right < s.length() &&
        s.charAt(left) == s.charAt(right)) {
      left--;
      right++;
    }
    return s.substring(left + 1, right); // actual palindrome
  }

}
