package com.ranjan.ctci;

import com.ranjan.ctci.stacksandqueues.SetOfStacks2;

public class Main {

    public static void main(String[] args) {
        SetOfStacks2 setOfStacks = new SetOfStacks2(3);
        setOfStacks.push(5);
        setOfStacks.push(6);
        setOfStacks.push(3);
        setOfStacks.push(7);
        setOfStacks.push(8);
        setOfStacks.push(9);
        System.out.println("popped element : " + setOfStacks.pop());
//        System.out.println("isEmpty = " + setOfStacks.isEmpty());
//        System.out.println("peek() = " + setOfStacks.peek());
        System.out.println("popped element : " + setOfStacks.pop());
        System.out.println("popped element : " + setOfStacks.pop());
        System.out.println("popped element : " + setOfStacks.pop());
        System.out.println("popped element : " + setOfStacks.pop());
        System.out.println("popped element : " + setOfStacks.pop());
        System.out.println("popped element : " + setOfStacks.pop());

    }
}
