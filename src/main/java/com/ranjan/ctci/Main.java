package com.ranjan.ctci;

import com.ranjan.ctci.linkedlists.LinkedListNode;
import com.ranjan.ctci.linkedlists.Partition;

public class Main {

    public static void main(String[] args) {
        LinkedListNode head = new LinkedListNode(1);
        head.appendToTail(5);
        head.appendToTail(3);
        head.appendToTail(2);
        head.appendToTail(4);
        head.print();
        Partition partitionObj = new Partition();
        head = partitionObj.partitionAroundX(head, 3);
        head.print();
    }
}
