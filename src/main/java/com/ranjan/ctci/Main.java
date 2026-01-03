package com.ranjan.ctci;

import com.ranjan.ctci.linkedlists.LinkedListNode;
import com.ranjan.ctci.linkedlists.Palindrome;

public class Main {

    public static void main(String[] args) {
        LinkedListNode l1 = new LinkedListNode(1);
        l1.setNext(new LinkedListNode(2));
        l1.getNext().setNext(new LinkedListNode(3));
        l1.getNext().getNext().setNext(new LinkedListNode(2));
        l1.getNext().getNext().getNext().setNext(new LinkedListNode(1));

        LinkedListNode l2 = new LinkedListNode(1);
        l2.setNext(new LinkedListNode(2));
        l2.getNext().setNext(new LinkedListNode(2));
        l2.getNext().getNext().setNext(new LinkedListNode(1));

        Palindrome palindromeObj = new Palindrome();
        System.out.println(palindromeObj.isPalindrome2(l1));
    }
}
