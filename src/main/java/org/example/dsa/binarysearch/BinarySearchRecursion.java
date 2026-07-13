package org.example.dsa.binarysearch;

public class BinarySearchRecursion {

  public static void main(String[] args) {
    int[] arr = new int[]{1, 2, 3, 4, 5};
    int key = 5, l, h;
    l = 0;
    h = arr.length - 1;
    System.out.println(bst(l, h, key, arr));
  }

  public static int bst(int l, int h, int key, int[] arr) {
    int mid;
    if (l == h) {
      if (arr[l] == key) {
        return l;
      } else {
        return 0;
      }
    } else {
      mid = (l + h) / 2;
      if (arr[mid] == key) {
        return mid;
      }
      if (key < arr[mid]) {
        return bst(l, mid - 1, key, arr);
      } else {
        return bst(mid + 1, h, key, arr);
      }
    }
  }

}
