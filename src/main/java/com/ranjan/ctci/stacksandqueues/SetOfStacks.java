package com.ranjan.ctci.stacksandqueues;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;
import java.util.Stack;

public class SetOfStacks {
    private final List<Stack<Integer>> stackList;
    private final int stackSizeLimit;
    private int currStackIndex;

    public SetOfStacks(int stackSizeLimit) {
        this.stackSizeLimit = stackSizeLimit;
        stackList = new ArrayList<>();
        stackList.add(new Stack<>());
        currStackIndex = 0;
    }

    public void push(int data) {
        if (stackList.get(currStackIndex).size() < stackSizeLimit) {
            Stack<Integer> currStack = stackList.get(currStackIndex);
            currStack.push(data);
        } else {
            Stack<Integer> newStack = new Stack<>();
            newStack.push(data);
            stackList.add(newStack);
            currStackIndex++;
        }
    }

    public int pop() {
        if (stackList.isEmpty()) throw new EmptyStackException();
        Stack<Integer> currStack = stackList.get(currStackIndex);
        if (currStack.isEmpty()) {
            if (currStackIndex == 0) {
                throw new EmptyStackException();
            }
            currStackIndex--;
            return pop();
        }
        int poppedData = currStack.pop();
        if (currStack.isEmpty()) {
            stackList.remove(currStackIndex);
            currStackIndex--;
        }
        return poppedData;
    }

    public int peek() {
        if (stackList.isEmpty()) throw new EmptyStackException();
        Stack<Integer> currStack = stackList.get(currStackIndex);
        if (currStack.isEmpty()) {
            if (currStackIndex == 0) {
                throw new EmptyStackException();
            }
            currStack = stackList.get(currStackIndex - 1);
            return currStack.peek();
        }
        return currStack.peek();
    }

    public boolean isEmpty() {
        return (currStackIndex == 0 && stackList.get(currStackIndex).isEmpty());
    }
}
