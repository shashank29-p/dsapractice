package org.example.dsa.strings;

import java.util.Stack;

public class ValidParenthesis {

  public static void main(String[] args) {
    String input="()}}{{";
    Stack<Character> stack=new Stack<>();

    for(int i=0;i<input.length();i++){
      char c= input.charAt(i);
      if( stack.isEmpty() || c=='(' || c=='{' || c=='['){
        stack.push(c);
      }

      switch (c){
        case ')'->{
          if(stack.peek()=='(') stack.pop();
        }
        case '}'->{
          if(stack.peek()=='{') stack.pop();
        }
        case ']'->{
          if(stack.peek()=='[') stack.pop();
        }
        default -> {
         continue;
        }
      }
    }

    if(stack.isEmpty()){
      System.out.println("valid parenthesis");
    }else {
      System.out.println("not valid");
    }
  }

}
