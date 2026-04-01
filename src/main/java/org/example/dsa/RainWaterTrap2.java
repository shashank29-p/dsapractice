package org.example.dsa;

public class RainWaterTrap2 {

  public static void main(String[] args) {
    int[] arr = new int[]{4,2,0,3,2,5};
    int left = 0, right = arr.length - 1;
    int leftMax = 0, rightMax = 0;
    int tappedWater = 0;
    while (left < right) {
      if (arr[left] < arr[right]) {
        if (arr[left] >= leftMax) {
          leftMax = arr[left];
        } else {
          tappedWater += leftMax - arr[left];
        }
        left++;
      } else {
        if (arr[right] >= rightMax) {
          rightMax = arr[right];
        } else {
          tappedWater += rightMax - arr[right];
        }
        right--;
      }
    }
    System.out.println(tappedWater);
  }
}
