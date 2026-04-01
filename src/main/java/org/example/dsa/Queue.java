package org.example.dsa;

public class Queue {

  public static void main(String[] args) {

    int arr[]=new int[]{2,3,4,5,6};
    int key=6,l,h,mid;
    l=0; //0
    h=arr.length-1; //5
    while(l<=h){
      mid=(l+h)/2;
      if(key==arr[mid]){
        System.out.println(mid);
        break;
      }
      if(key<arr[mid]){
        h=mid-1;
      }else {
        l=mid+1;
      }
    }
  }

}
