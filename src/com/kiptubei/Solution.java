
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kiptubei;

/**
 *
 * @author kiptubei
 */
import java.util.*;

public class Solution {
    
    public void solution(String input_str){
        
         // Declaring a stack
    Stack<Character> s = new Stack<Character>();
    // Iterating over the entire string.
    for (char st : input_str.toCharArray()) {
      //  If the input string contains an opening parenthesis,
      //  push in on to the stack.
      if (st == '(' || st == '{' || st == '[') {
        s.push(st);
      }
      else {
        // In the case of valid parentheses, the stack cannot be 
        // be empty if a closing parenthesis is encountered.
          if(s.empty()) {
            System.out.println(input_str + 
            " contains invalid parentheses.");
            return;
          }
          else{
          // If the input string contains a closing bracket,
          // then pop the corresponding opening parenthesis if
          // present.
          char top = (Character) s.peek();
          if(st == ')' && top == '(' ||
          st == '}' && top == '{' ||
          st == ']' && top == '['){
            s.pop();
          }
          else{
            System.out.println(input_str + 
            " contains invalid parentheses.");
            return;
          }
        }
      }
    }
    //  Checking the status of the stack to determine the
    //  validity of the string.
    if(s.empty()) {
      System.out.println(input_str + 
      " contains valid parentheses.");
    }
    else{
      System.out.println(input_str + 
      " contains invalid parentheses.");
    }
        
    }
}
