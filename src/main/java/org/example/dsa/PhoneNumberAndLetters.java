package org.example.dsa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;

public class PhoneNumberAndLetters {

  static Hashtable<String, List<String>> nokia = new Hashtable<>();

  public static void main(String[] args) {
    nokia.put("2", List.of("a", "b", "c"));
    nokia.put("3", List.of("d", "e", "f"));
    nokia.put("4", List.of("g", "h", "i"));
    nokia.put("5", List.of("j", "k", "l"));
    nokia.put("6", List.of("m", "n", "o"));
    nokia.put("7", List.of("p", "q", "r", "s"));
    nokia.put("8", List.of("t", "u", "v"));
    nokia.put("9", List.of("y", "w", "x", "z"));
    System.out.println(letterCombinations("23"));
  }

  public static List<String> letterCombinations(String digits) {
    List<String> result = new ArrayList<>();
    result.add("");
    if (digits == null || digits.isBlank()) {
      return Collections.emptyList();
    }
    for (char c : digits.toCharArray()) {
      List<String> letters = nokia.get(String.valueOf(c));
      List<String> newList = new ArrayList<>();

      for (String prefix : result) {
        for (String letter : letters) {
          newList.add(prefix + letter);
        }
      }
      result = newList;
    }
    return result;
  }

}
