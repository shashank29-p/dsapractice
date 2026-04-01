package org.example.dsa;

public class BinarySearch {

  public static void main(String[] args) {
    int[] arr = new int[]{1, 2, 3, 4, 5};
    int key = 2, l, h;
    l = 0;
    h = arr.length - 1;
    int mid;
    while (l <= h) {
      mid = (l + h) / 2;
      if (key == arr[mid]) {
        System.out.println(mid);
        return;
      }
      if (key < arr[mid]) {
        h = mid - 1;
      } else {
        l = mid + 1;
      }
    }
  }

}
