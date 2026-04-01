package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings("checked")
public class SuppressWarning {
    public static void main(String[] args) {
            List<String> number = new ArrayList<>();
            number.add("category level 1");
            number.add("category level 2");
            number.add("category level 4");
            number.add("category level 5");
            number.add("category level 4");
        List<Integer> numbers = new ArrayList<>();
          for(String s: number){
           numbers.add(Integer.parseInt(s.substring(s.length()-1)));
          }
            // Sort the list in ascending order
            Collections.sort(numbers);

            System.out.println("Sorted Numbers: " + numbers);

            // Check if the numbers are sequential
            boolean isSequential = true;
            for (int i = 0; i < numbers.size() - 1; i++) {
                if (numbers.get(i + 1) != numbers.get(i) + 1) {
                    isSequential = false;
                    break;
                }
            }

            if (isSequential) {
                System.out.println("The numbers are sequential.");
            } else {
                System.out.println("The numbers are not sequential.");
            }
    }
}
