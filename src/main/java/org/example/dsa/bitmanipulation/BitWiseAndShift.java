package org.example.dsa.bitmanipulation;

public class BitWiseAndShift {

  public static void main(String[] args) {

    int left = 5;
    int right = 7;

    /*
    TRICK
    * Keep shifting both right until they match → that's the common prefix!
    left=5  = 101
    right=7 = 111
    shift 1: left=010  right=011  shift=1
    shift 2: left=001  right=001  shift=2  - equal! stop
    left << shift = 001 << 2 = 100 = 4
    */

    int shift = 0;
    while (left < right) {
      left >>= 1;
      right >>= 1;
      shift++;
    }
    int result = left << shift;
    System.out.println(result);
  }

}
