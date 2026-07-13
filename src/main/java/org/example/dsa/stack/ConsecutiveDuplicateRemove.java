package org.example.dsa.stack;

import java.util.Stack;

public class ConsecutiveDuplicateRemove {

    public static void main(String[] args) {
        String s="abbaca";
        //op:ca

        Stack<Character> characters=new Stack<>();
        if(s!=null && s.length()<0){
           return;
        }
        for(char c:s.toCharArray()){
            if(!characters.isEmpty() && c == characters.peek()){
                characters.pop();
            }else{
                characters.push(c);
            }
        }

        for (char c:characters){
            System.out.print(c);
        }
        characters.clear();
    }
}
