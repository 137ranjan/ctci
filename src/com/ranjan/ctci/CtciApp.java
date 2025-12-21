package com.ranjan.ctci;

import com.ranjan.ctci.linkedlists.KthToLast;
import com.ranjan.ctci.linkedlists.Node;

public class CtciApp {

    public static void main(String[] args) {
        Node head = new Node(1);
        head.appendToTail(2);
        head.appendToTail(3);
        head.appendToTail(4);
        head.appendToTail(5);
        head.print();
        int k = 0;
        KthToLast kthToLastObj = new KthToLast();
        Node kthToLast = kthToLastObj.kthToLast(head, k);
        System.out.println("Kth To Last item for k = " + k + "  is : " + kthToLast.getData() + " " + kthToLast);
        head.print();
    }
}
