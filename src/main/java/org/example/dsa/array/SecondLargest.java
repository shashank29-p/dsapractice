package org.example.dsa.array;

public class SecondLargest {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,0};

        if(arr!=null && arr.length<2){
            return;
        }

        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for(int num:arr){
            if(num>largest){
                secondLargest=largest;
                largest=num;
            }else if (num>secondLargest && num!=largest){
                secondLargest=num;
            }
        }
        if(secondLargest==Integer.MIN_VALUE){
            System.out.println("Second largest doesnt exist");
        }

        System.out.println(secondLargest);
        System.out.println(largest);
    }
}
