package org.example.dsa;

public class BuyChocolates {

  public static void main(String[] args) {
    int[] chocos={1,2,2};
    int money=3;
    //result 0 2 choc
    int min1=Integer.MAX_VALUE;
    int min2=Integer.MIN_VALUE;
    for(int choc:chocos){
      if(choc<min1){
        min2=min1;
        min1=choc;
      } else if (choc<min2) {
        min2=choc;
      }
    }

    int totalPrice= min1+min2;

    if(totalPrice<=money){
      System.out.println("Total price:"+ (totalPrice-money));
      return;
    }

    System.out.println("Money :"+ money);

  }

}
