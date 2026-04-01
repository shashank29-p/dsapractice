package org.example;

import java.util.Stack;

public class BalanceParanthesis {

  public static void main(String[] args) {
    String expr = "{([])}[]";
    if (areBracketsBalanced(expr))
      System.out.println("Balanced");
    else
      System.out.println("Not Balanced");
  }
      public static boolean areBracketsBalanced(String s)
      {
        //One way
      /*  int i = -1;
        char[] stack = new char[s.length()];
        for (char ch : s.toCharArray()) {
          if (ch == '(' || ch == '{' || ch == '[')
            stack[++i] = ch;
          else {
            if (i >= 0
                && ((stack[i] == '(' && ch == ')')
                || (stack[i] == '{' && ch == '}')
                || (stack[i] == '[' && ch == ']')))
              i--;
            else
              return false;
          }
        }
        return i == -1;*/

        //Second way

        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
          char c= s.charAt(i);
          if(c=='{' || c=='[' || c=='('){
            stack.push(c);
            continue;
          }
          if(stack.isEmpty()){
            return false;
          }
          char check;
          switch (c){
            case '}':
             check=  stack.pop();
              if (check == '(' || check == '[') {return false;}
                break;
            case ']':
             check=  stack.pop();
              if (check == '{' || check == '(') {return false;}
                break;
            case ')':
             check= stack.pop();
              if (check == '{' || check == '[') {return false;}
                break;
          }
        }
        return (stack.isEmpty());
      }
}
