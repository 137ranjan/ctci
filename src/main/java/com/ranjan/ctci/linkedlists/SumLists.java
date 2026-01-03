package com.ranjan.ctci.linkedlists;

public class SumLists {
    public LinkedListNode sumLists(LinkedListNode l1, LinkedListNode l2) {
        LinkedListNode result = null;
        int carry = 0;
        int rem = 0;
        LinkedListNode runner = new LinkedListNode(-1);
        result = runner;
        while (l1 != null && l2 != null) {
            int sum = l1.data + l2.data + carry;
            rem = sum % 10;
            carry = sum / 10;
            runner.next = new LinkedListNode(rem);
            runner = runner.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        if (l1 != null) {
            while (l1 != null) {
                int sum = l1.data + carry;
                rem = sum % 10;
                carry = sum / 10;
                runner.next = new LinkedListNode(rem);
                runner = runner.next;
                l1 = l1.next;
            }
        }
        if (l2 != null) {
            while (l2 != null) {
                int sum = l2.data + carry;
                rem = sum % 10;
                carry = sum / 10;
                runner.next = new LinkedListNode(rem);
                runner = runner.next;
                l2 = l2.next;
            }
        }

        if (carry != 0) {
            runner.next = new LinkedListNode(carry);
        }
        return result.next;
    }

    public LinkedListNode sumLists2(LinkedListNode l1, LinkedListNode l2, int carry) {
        if (l1 == null && l2 == null && carry == 0) {
            return null;
        }

        LinkedListNode result = new LinkedListNode(0);
        int value = carry;
        if (l1 != null) {
            value += l1.data;
        }
        if (l2 != null) {
            value += l2.data;
        }

        result.data = value % 10;

        if (l1 != null || l2 != null) {
            LinkedListNode more = sumLists2(l1 == null ? null : l1.next,
                    l2 == null ? null : l2.next,
                    value >= 10 ? 1 : 0);
            result.setNext(more);
        }
        return result;
    }

    static class PartialSum {
        public LinkedListNode sum = null;
        public int carry = 0;
    }

    public LinkedListNode sumListsReversed(LinkedListNode l1, LinkedListNode l2) {
        int len1 = length(l1);
        int len2 = length(l2);

        // Pad shorter list with zeroes
        if (len1 < len2) {
            l1 = padList(l1, len2 - len1);
        } else {
            l2 = padList(l2, len1 - len2);
        }

        // Add lists
        PartialSum sum = addListHelper(l1, l2);

        if (sum.carry == 0) {
            return sum.sum;
        } else {
            return insertBefore(sum.sum, sum.carry);
        }
    }

    private PartialSum addListHelper(LinkedListNode l1, LinkedListNode l2) {
        if (l1 == null && l2 == null) {
            return new PartialSum();
        }

        // Add smaller digits recursively
        PartialSum sum = addListHelper(l1.next, l2.next);

        // Add carry to current data
        int val = sum.carry + l1.data + l2.data;

        // Insert sum of current digits
        sum.sum = insertBefore(sum.sum, val % 10);
        sum.carry = val / 10;
        return sum;
    }

    private LinkedListNode padList(LinkedListNode l, int padding) {
        LinkedListNode head = l;
        for (int i = 0; i < padding; i++) {
            head = insertBefore(head, 0);
        }
        return head;
    }

    private LinkedListNode insertBefore(LinkedListNode list, int data) {
        LinkedListNode node = new LinkedListNode(data);
        if (list != null) {
            node.next = list;
        }
        return node;
    }

    private int length(LinkedListNode l) {
        LinkedListNode current = l;
        int length = 0;
        while (current != null) {
            length++;
            current = current.next;
        }
        return length;
    }
}
