package com.ranjan.ctci.linkedlists;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

    // with space complexity O(n) and time complexity O(n)
    public Node removeDuplicates(Node head) {
        Set<Integer> set = new HashSet<>();
        Node current = head;
        Node previous = null;
        while (current != null) {
            if (set.contains(current.data)) {
                previous.next = current.next;
            } else {
                set.add(current.data);
                previous = current;
            }
            current = current.next;
        }
        return head;
    }

    // with O(1) space complexity and O(n^2) time complexity
    public Node removeDuplicates2(Node head) {
        Node current = head;

        while (current != null) {
            Node runner = current;
            while (runner.next != null) {
                if (current.data == runner.next.data) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
        return head;
    }
}
