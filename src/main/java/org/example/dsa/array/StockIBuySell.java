package org.example.dsa.array;

public class StockIBuySell {

  public static void main(String[] args) {
    //prices = [7,1,5,3,6,4]
    //output = 1

    //O(n)

    int minPrice = Integer.MAX_VALUE; //7
    int maxProfit = 0;
    int[] prices = {7, 1, 5, 3, 6, 4};
    for (int i = 0; i < prices.length; i++) {
      if (minPrice > prices[i]) {
        minPrice = prices[i];
      } else {
        int diff = prices[i] - minPrice;
        maxProfit = Math.max(diff, maxProfit);
      }
    }
    System.out.println(maxProfit);
  }

}
