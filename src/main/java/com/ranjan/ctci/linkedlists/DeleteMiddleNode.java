package com.ranjan.ctci.linkedlists;

public class DeleteMiddleNode {
    public void deleteMiddleNode(LinkedListNode node) throws Exception {
        if (node == null || node.next == null){
            throw new Exception("Node is null or it is last element");
        }
        LinkedListNode next = node.next;
        node.data = next.data;

        node.next = next.next;
    }
}
