package org.example.dsa.bitmanipulation;

public class ReverseBit {

  public static void main(String[] args) {


    /*
    * Trick:
    * Each step — take last bit of n, push into result:
      n=1011 → grab 1 → result=0001,  n=0101
      n=0101 → grab 1 → result=0011,  n=0010
      n=0010 → grab 0 → result=0110,  n=0001
      n=0001 → grab 1 → result=1101,  n=0000
      *
      * 32 bits length
    *
    * */


    int n=2147483644;
    int result=0;
    for(int i=0;i<32;i++){
      result<<=1;
      result|=(n&1);
      n>>=1;
    }
    System.out.println(result);

  }

}
