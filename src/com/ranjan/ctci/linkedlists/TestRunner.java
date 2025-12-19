package com.ranjan.ctci.linkedlists;

public class TestRunner {

	public static void main(String[] args) {
		Node head = new Node(1);
		head.print();
		head.appendToTail(2);
		head.print();
		head.appendToTail(3);
		head.print();
		head = head.deleteNode(head, 2);
		head.print();

		head.appendToTail(2);
		head.appendToTail(4);
		head.appendToTail(2);
		head.appendToTail(4);
		head.print();
		RemoveDuplicates removeDuplicates = new RemoveDuplicates();
		head = removeDuplicates.removeDuplicates(head);
		head.print();
	}

}
