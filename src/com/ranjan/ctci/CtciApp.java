package com.ranjan.ctci;

import com.ranjan.ctci.linkedlists.DeleteMiddleNode;
import com.ranjan.ctci.linkedlists.Node;

public class CtciApp {

    public static void main(String[] args) {
        Node head = new Node(1);
        head.appendToTail(2);
        head.appendToTail(3);
        head.appendToTail(4);
        head.appendToTail(5);
        head.print();
        DeleteMiddleNode deleteMiddleNode= new DeleteMiddleNode();
        try {
            deleteMiddleNode.deleteMiddleNode(head.getNext().getNext());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        head.print();
    }
}
