package org.example.dsa;

public class RainWaterTrap {

  public static void main(String[] args) {
    int[] arr = new int[]{1,8,6,2,5,4,8,3,7};
    int left = 0, right = arr.length - 1;
    int maxArea=0;
    while (left < right) {
      //A=W*L
      int currentArea= Math.min(arr[left],arr[right]) * (right-left);
      maxArea=Math.max(currentArea,maxArea);
      if(arr[left]<arr[right]){
        left += 1;
      }else {
        right -= 1;
      }
    }
    System.out.println(maxArea);
  }
}
