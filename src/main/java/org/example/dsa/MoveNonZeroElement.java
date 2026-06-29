package org.example.dsa;

public class MoveNonZeroElement {

  public static void main(String[] args) {
    int[] arr={4,0,2,0,1,8};

    int left=0;
    for(int right=0; right<arr.length;right++){
      if(arr[right]!=0){
        int temp= arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        left++;
      }
    }

    for(int ar: arr){
      System.out.print(ar);
    }
    moveNonZeroElement(arr);
  }























  public static void moveNonZeroElement(int[] arr){
    arr=new int[]{4,0,2,0,1,3};
    int left=0;
   for(int right=0;right<arr.length;right++){
     if(arr[right]!=0) {
       int temp = arr[left];
       arr[left] = arr[right];
       arr[right] = temp;
       left++;
     }
   }

   for(int a:arr){
     System.out.println();
     System.out.print(a);
   }
  }

}
