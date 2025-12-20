package com.ranjan.ctci;

import com.ranjan.ctci.linkedlists.Node;
import com.ranjan.ctci.linkedlists.RemoveDuplicates;

public class Runner {

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
		head = removeDuplicates.removeDuplicates2(head);
		head.print();
	}

}
