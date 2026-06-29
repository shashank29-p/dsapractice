package org.example.dsa.bitmanipulation;

public class SingleNumber {

  public static void main(String[] args) {
    int[] a={2,2,1};
  /*
   trick:For your example [2,2,1,1,4] (two 2s, two 1s):
    0 ^ 2 = 2
    2 ^ 2 = 0    - 2s cancel
    0 ^ 1 = 1
    1 ^ 1 = 0   - 1s cancel
    0 ^ 4 = 4   - only survivor
    */

    int result=0;

    for(int num:a){
      result^=num;
    }
    System.out.println(result);
  }
}
