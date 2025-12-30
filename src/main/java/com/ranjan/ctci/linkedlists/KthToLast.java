package com.ranjan.ctci.linkedlists;

public class KthToLast {
    public Node kthToLast(Node head, int k) {
        Node first = head;
        Node second = head;
        int count = 0;

        while (first.next != null && count < k) {
            count++;
            first = first.next;
        }

        while (first.next != null) {
            first = first.next;
            second = second.next;
        }

        return second;
    }
}
