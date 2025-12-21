package com.ranjan.ctci.linkedlists;

public class DeleteMiddleNode {
    public void deleteMiddleNode(Node node) throws Exception {
        if (node == null || node.next == null){
            throw new Exception("Node is null or it is last element");
        }
        Node next = node.next;
        node.data = next.data;

        node.next = next.next;
    }
}
