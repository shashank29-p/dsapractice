package org.example.dsa.bitmanipulation;

public class  IfPowerOfTwo {

  public static void main(String[] args) {
    /*
trick formula: (n & (n - 1)) == 0

1  - 00001
2  - 00010
4  - 00100
8  - 01000
16 - 10000

n   =  8  - 1000
n-1 =  7  -  0111
              ----
n & (n-1) =  0000  ✓ (Power of 2!)

     */

    int num = 5;

    if (num <= 0) {
      return;
    }
    if ((num & (num - 1))== 0) {
      System.out.println("power of two");
    } else {
      System.out.println("not");
    }
  }
}
