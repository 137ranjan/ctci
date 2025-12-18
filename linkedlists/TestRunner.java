package linkedlists;

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
	}

}
