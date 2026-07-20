package org.example.dsa.general;

public class fibonacci {

    public static void main(String[] args) {
        System.out.println(fibo(5));
    }

    public static int fibo(int n){
        if(n<=1){
            return n;
        }

        return fibo(n-1)+fibo(n-2);
    }

    public static int iterate(int n){
        if(n<=1) return n;
        int prev=0;
        int curr=1;

        for(int i=2; i<=n; i++){
            int next=curr+prev;
            prev=curr;
            curr=next;
        }
        return curr;
    }
}
