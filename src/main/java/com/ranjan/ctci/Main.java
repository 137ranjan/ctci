package com.ranjan.ctci;

import com.ranjan.ctci.stacksandqueues.MyQueue2;

public class Main {

    public static void main(String[] args) {
        MyQueue2<Character> myQueue2 = new MyQueue2<>();
        myQueue2.add('a');
        myQueue2.add('b');
        myQueue2.add('c');
        myQueue2.add('d');
        System.out.println(myQueue2.remove());
        myQueue2.add('e');
        System.out.println(myQueue2.remove());
        myQueue2.add('f');
        System.out.println(myQueue2.peek());
        System.out.println(myQueue2.remove());
        System.out.println(myQueue2.remove());
        System.out.println(myQueue2.remove());
        System.out.println(myQueue2.remove());
        System.out.println(myQueue2.remove());

    }
}
