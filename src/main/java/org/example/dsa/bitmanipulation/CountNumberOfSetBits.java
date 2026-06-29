package org.example.dsa.bitmanipulation;

public class CountNumberOfSetBits {

  public static void main(String[] args) {
    int num=13;
    int count = 0;
    while(num!=0){
      num=num&(num-1);
      count++;
    }

    System.out.println(count);

  }

}
