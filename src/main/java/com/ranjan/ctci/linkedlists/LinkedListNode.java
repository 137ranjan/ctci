package com.ranjan.ctci.linkedlists;

public class LinkedListNode {
    LinkedListNode next;
    int data;

    public LinkedListNode(int data) {
        this.data = data;
    }

    public LinkedListNode getNext() {
        return next;
    }

    public void setNext(LinkedListNode next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void appendToTail(int data) {
        LinkedListNode end = new LinkedListNode(data);
        LinkedListNode curr = this;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = end;
    }

    public LinkedListNode deleteNode(LinkedListNode head, int data) {
        LinkedListNode curr = head;
        if (curr.data == data) {
            return curr.next;
        }
        while (curr.next != null) {
            if (curr.data == data) {
                curr.next = curr.next.next;
                return head;
            }
            curr = curr.next;
        }
        return head;
    }

    public void print() {
        LinkedListNode curr = this;
        while (curr != null) {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.println("null");
    }
}