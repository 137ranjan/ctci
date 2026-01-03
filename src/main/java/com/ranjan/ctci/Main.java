package com.ranjan.ctci;

import com.ranjan.ctci.linkedlists.LinkedListNode;
import com.ranjan.ctci.linkedlists.SumLists;

public class Main {

    public static void main(String[] args) {
        // 8->7->9
        // 5->8->6
        // 1->4->6->5
        LinkedListNode l1 = new LinkedListNode(8);
        l1.appendToTail(7);
        l1.appendToTail(9);
        l1.print();

        LinkedListNode l2 = new LinkedListNode(5);
        l2.appendToTail(8);
        l2.appendToTail(6);
        l2.print();

        SumLists sumListsObj = new SumLists();
        LinkedListNode result = sumListsObj.sumListsReversed(l1, l2);
        result.print();
    }
}
