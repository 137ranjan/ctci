package com.ranjan.ctci;

import com.ranjan.ctci.stacksandqueues.MyQueue2;
import com.ranjan.ctci.stacksandqueues.SortStack;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(9);
        stack.push(1);
        stack.push(8);
        stack.push(2);
        stack.push(7);
        stack.push(3);
        stack.push(7);
        stack.push(4);
        SortStack sortStack = new SortStack();
        sortStack.sort(stack);
        System.out.println(stack);

    }
}
