package org.example.dsa.strings;

public class LongestRepeatingString {
    public static void main(String[] args) {
        String input="abbbcccddddddde";

        int count=1;
        int max=1;
        int index=0;
        char sh=input.charAt(0);

        for(int i=1; i<input.length();i++){
            if(input.charAt(i)==input.charAt(i-1)){
                count++;
            }else {
                if(count>max){
                    max=count;
                    sh=input.charAt(i-1);
                    index=i-count;
                }
                count=1;
            }
        }
        if(count>max){
            max=count;
            sh=input.charAt(input.length()-1);
            index=input.length()-count;
        }

        System.out.println(max);
        System.out.println(index);
        System.out.println(sh);
    }
}
