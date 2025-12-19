package com.ranjan.ctci.linkedlists;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public Node removeDuplicates(Node head){
        Set<Integer> set = new HashSet<>();
        Node curr = head;
        Node prev = null;
        while ( curr != null && curr.next != null){
            if (set.contains(curr.data)){
                prev.next = curr.next;
                curr = curr.next.next;
            }else {
                set.add(curr.data);
                prev = curr;
                curr = curr.next;
            }
        }
        if (curr != null && set.contains(curr.data)){
            curr = null;
        }
        return head;
    }
}
