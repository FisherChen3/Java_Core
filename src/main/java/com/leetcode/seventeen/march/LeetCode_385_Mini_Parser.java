package com.leetcode.seventeen.march;

/**
 * Created by Fisher on 3/18/2017.
 */

import java.util.List;
import java.util.Stack;


// first idea is to use stack
// negative integer is allowed
public class LeetCode_385_Mini_Parser {

    public static void main(String[] args) {
        LeetCode_385_Mini_Parser test = new LeetCode_385_Mini_Parser();
        test.deserialize("[0]");
    }

    public NestedInteger deserialize(String s) {
        Stack<NestedInteger> stack = new Stack<>();

        for(int i=0;i<s.length();i++){

            char c = s.charAt(i);
            if(c=='['){
                // by using this constructor, nestedInteger will have a nested list
                NestedInteger nInt = new NestedInteger();
                stack.push(nInt);
            } else if(c=='-' || (c>='0'&&c<='9')){
                StringBuilder sb = new StringBuilder();
                while(c=='-' || (c>='0' && c<='9')){
                    sb.append(c);
                    i++;
                    if(i==s.length()){
                        break;
                    }
                    c = s.charAt(i);
                }
                NestedInteger nInt = new NestedInteger(Integer.valueOf(sb.toString()));
                if(!stack.isEmpty()){
                    NestedInteger list = stack.peek();
                    list.add(nInt);
                }
                i--;  // let the for loop to handle this addition
                if(i==s.length()-1){
                    // loop is going to end
                    return nInt;
                }
            } else if(c==']'){
                // we are guaranteed that string is well formed
               if(i==s.length()-1){
                   // loop is going to end
                   return stack.pop();
               }
               NestedInteger nInt = stack.pop();
               stack.peek().add(nInt);
            }
        }
        return null;
    }

    // This is the interface that allows for creating nested lists.
// You should not implement it, or speculate about its implementation
    private class NestedInteger {
        // Constructor initializes an empty nested list.
      public NestedInteger(){}

        // Constructor initializes a single integer.
      public NestedInteger(int value){}

        // @return true if this NestedInteger holds a single integer, rather than a nested list.
        public boolean isInteger(){return false;}

        // @return the single integer that this NestedInteger holds, if it holds a single integer
        // Return null if this NestedInteger holds a nested list
        public Integer getInteger(){return null;}

        // Set this NestedInteger to hold a single integer.
        public void setInteger(int value){}

        // Set this NestedInteger to hold a nested list and adds a nested integer to it.
        public void add(NestedInteger ni){}

        // @return the nested list that this NestedInteger holds, if it holds a nested list
        // Return null if this NestedInteger holds a single integer
        public List<NestedInteger> getList(){return null;}
    }

}
