package org.example.dsa.strings;

import java.util.ArrayList;
import java.util.List;

public class TextJustification {

  public static void main(String[] args) {
    String[] words=new String[]{"This", "is", "an", "example", "of", "text", "justification."};
    int maxWidth = 16;
    fullJustify(words,maxWidth);
  }

  public static List<String> fullJustify(String[] words, int maxWidth) {
    List<String> result = new ArrayList<>();
    List<String> lineWords = new ArrayList<>();
    int lineCharLen = 0;
    for (String word : words) {
      // check if word fits in current line
      if (lineCharLen + word.length() + lineWords.size() <= maxWidth) {
        lineWords.add(word);
        lineCharLen += word.length();
      } else {
        // justify current line (not last line)
        result.add(justify(lineWords, lineCharLen, maxWidth, false));

        // reset for next line
        lineWords.clear();
        lineCharLen = 0;

        lineWords.add(word);
        lineCharLen += word.length();
      }
    }
    // last line -> left justified
    result.add(justify(lineWords, lineCharLen, maxWidth, true));

    return result;
  }

  private static String justify(List<String> words, int lineLen, int maxWidth, boolean lastLine) {
    StringBuilder sb = new StringBuilder();

    // Case 1: last line OR single word
    if (lastLine || words.size() == 1) {
      for (int i = 0; i < words.size(); i++) {
        sb.append(words.get(i));
        if (i < words.size() - 1) sb.append(" ");
      }
      // pad remaining spaces at the end
      while (sb.length() < maxWidth) {
        sb.append(" ");
      }
      return sb.toString();
    }

    // Case 2: full justification
    int totalSpaces = maxWidth - lineLen;
    int gaps = words.size() - 1;

    int spacePerGap = totalSpaces / gaps;
    int extraSpaces = totalSpaces % gaps;

    for (int i = 0; i < words.size(); i++) {
      sb.append(words.get(i));
      if (i < gaps) {
        // add base spaces
        for (int j = 0; j < spacePerGap; j++) sb.append(" ");
        // add extra space to left gaps
        if (extraSpaces-- > 0) sb.append(" ");
      }
    }
    return sb.toString();
  }
}
