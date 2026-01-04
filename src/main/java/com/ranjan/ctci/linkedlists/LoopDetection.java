package com.ranjan.ctci.linkedlists;

public class LoopDetection {
    public LinkedListNode findBeginning(LinkedListNode head) {
        LinkedListNode slow = head;
        LinkedListNode fast = head;

        // Find meeting point. This will be LOOP_SIZE - k steps into the linked list
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {  // collision
                break;
            }
        }

        // Error check - no meeting point, and therefore no loop
        if (fast == null || fast.next == null) {
            return null;
        }

        /* Move slow to Head. Keep fast at Meeting Point. Each are k steps from the
         *  Loop Start. If they move at the same pace, they must meet at Loop Start.
         * */
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        // both now point to the start of the loop.
        return fast;
    }
}
