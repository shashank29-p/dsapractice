package org.example.dailyporblem;

import java.util.Arrays;
import java.util.Scanner;

public class InsertIntoArray {

  public static void main(String[] args) {
    System.out.println("Enter the array elements");
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();

    String[] elements = input.split(",");
    int[] a = new int[elements.length];

    for (int i = 0; i < elements.length; i++) {
      a[i] = Integer.parseInt(elements[i].trim());
    }
    Arrays.stream(a).forEach(System.out::println);

    System.out.println("Enter the element to insert");
    Scanner scanner1= new Scanner(System.in);
    int number=scanner1.nextInt();
    System.out.println("Position?");
    Scanner scanner2= new Scanner(System.in);
    int pos=scanner2.nextInt();
    for (int i = a.length - 2; i >= pos; i--) {
      a[i + 1] = a[i];
    }
    a[pos] = number;

    System.out.println("Array after insertion:");
    Arrays.stream(a).forEach(System.out::println);
  }

}
