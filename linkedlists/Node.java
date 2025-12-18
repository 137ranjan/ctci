package linkedlists;

public class Node {
    Node next;
    int data;

    public Node(int data) {
        this.data = data;
    }

    public void appendToTail(int data) {
        Node end = new Node(data);
        Node curr = this;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = end;
    }

    public Node deleteNode(Node head, int data) {
        Node curr = head;
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
    	Node curr = this;
    	while(curr != null) {
    		System.out.print(curr.data + "->");
    		curr = curr.next;
    	}
    	System.out.println("null");
    }
}