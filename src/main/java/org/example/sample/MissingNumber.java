package org.example;

public class MissingNumber {

  public static void main(String[] args) {
    int[] a1={1,2,3,4,5,6,7,8,9,10};

    int sum= 10*11/2;
    System.out.println("sum: " +sum);
    int missingArraySum=0;
    for (int i=0; i<a1.length;i++){
      missingArraySum= missingArraySum+a1[i];
    }
    System.out.println("missing number: " + (sum-missingArraySum) );
  }

}
