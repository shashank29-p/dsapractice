package org.example.dailyporblem;

public class FindMissingNumber {

  public static void main(String[] args) {
    int[] arr={10,12,13,14,16,17};

    for(int i=1;i<arr.length;i++){
      if(arr[i-1]!=arr[i]-1 && arr[i]!=arr[i-1]+1 ){
        System.out.println(arr[i-1]+1);
      }
    }
  }

}
