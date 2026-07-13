package org.example.dsa.strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LetterCombinations {

  public static void main(String[] args) {
    System.out.println( getCombination("23"));
  }

  public static List<?> getCombination(String digits) {

    if (digits == null || digits.isEmpty()) {
      return Collections.emptyList();
    }
    String[] letters = {
        "",     // 0
        "",     // 1
        "abc",  // 2
        "def",  // 3
        "ghi",  // 4
        "jkl",  // 5
        "mno",  // 6
        "pqrs", // 7
        "tuv",  // 8
        "wxyz"  // 9
    };

    List<String> result = new ArrayList<>();
    result.add("");
    for (char c : digits.toCharArray()) {
      List<String> temp = new ArrayList<>();
      System.out.println(c);
      String chars = letters[c-'0'];
      for (String prefix : result) {
        for (char cc : chars.toCharArray()) {
          temp.add(prefix + cc);
        }
      }
      result = temp;
    }
    return result;
  }

}
