package org.example.dsa.bitmanipulation;

public class MissingNumber {

  public static void main(String[] args) {

   /*
   *
   * Trick: XOR everything (3,0,1)
   * (0^1^2^3^4)^(3^0^1)
   * */

    int[] nums={3,0,1};
    int xor=0;
    int size=nums.length;
    for (int i=0;i<=size;i++){
      xor^=i;
    }

    for(int num:nums){
      xor^=num;
    }

    System.out.println(xor);

  }

}
