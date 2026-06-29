package org.example.dsa.bitmanipulation;

public class AddBinary {

  public static void main(String[] args) {

    /*
    * Trick : maintain carry
    * sum= carry
    * result=sum%2
    * carry=sum/2
    * */
    String a = "11", b = "1";

    StringBuilder stringBuilder=new StringBuilder();
    int i=a.length()-1,j=b.length()-1;
    int carry=0;
    while(i>=0||j>=0||carry!=0){
      int sum=carry;

      if(i>=0) sum+=a.charAt(i--)-'0';
      if(j>=0) sum+=b.charAt(j--)-'0';

      stringBuilder.append(sum%2);

      carry=sum/2;
    }
    System.out.println(stringBuilder.reverse().toString());
  }

}
