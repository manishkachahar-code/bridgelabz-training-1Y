package com.gla.PracticeQuestions;

import java.util.Stack;

public class ReverseStringStack {
    public static void main(String[] args) {
        String s = "Hello";
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            st.push(c);
        }
        String reverse = " ";
        while(!st.isEmpty()){
            reverse += st.pop();
        }
        System.out.println("Original String: " + s);
        System.out.println("Reverse String: " + reverse);
    }
}
