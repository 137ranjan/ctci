package com.ranjan.ctci;

import com.ranjan.ctci.linkedlists.LinkedListNode;
import com.ranjan.ctci.linkedlists.LoopDetection;

public class Main {

    public static void main(String[] args) {
        LinkedListNode l1 = new LinkedListNode(1);
        l1.setNext(new LinkedListNode(2));
        l1.getNext().setNext(new LinkedListNode(3));
        l1.getNext().getNext().setNext(new LinkedListNode(2));
        l1.getNext().getNext().getNext().setNext(new LinkedListNode(1));
        //l1.getNext().getNext().getNext().getNext().setNext(l1.getNext().getNext());

        LoopDetection loopDetectionObj = new LoopDetection();
        LinkedListNode loopBeginning = loopDetectionObj.findBeginning(l1);
        if (loopBeginning == null) {
            System.out.println("No loop.");
        } else {
            System.out.println("Loop begins at : " + loopBeginning.getData());
        }
    }
}
