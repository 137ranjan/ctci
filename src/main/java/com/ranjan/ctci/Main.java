package com.ranjan.ctci;

import com.ranjan.ctci.stacksandqueues.StackWithMin2;

public class Main {

    public static void main(String[] args) {
        StackWithMin2 stackWithMin = new StackWithMin2();
        stackWithMin.push(5);
        stackWithMin.push(6);
        stackWithMin.push(3);
        stackWithMin.push(7);
        stackWithMin.pop();
        int min = stackWithMin.min();
        System.out.println("Minimum = " + min);
        stackWithMin.pop();
        min = stackWithMin.min();
        System.out.println("Minimum = " + min);
    }
}
