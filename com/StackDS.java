package com;

import java.util.Stack;

public class StackDS {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);
        //stack.pop();
        stack.peek();

        System.out.println(stack);
        System.out.println(stack.peek());

    }
}
