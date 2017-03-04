package roy.question.pkg;

import roy.general.pkg.Node;

public class ReverseListRecursion {
	private static Node head;
	public static Node reverseRecursion(Node node){
		if(node == null || node.next == null)
			return node;
		
		Node result = reverseRecursion(node.next);
		node.next.next = node;
		node.next = null;
		
		return result;
	}
	
	public static void main(String[] args) {
		head = new Node(1);
		Node a = new Node(2);
		Node b = new Node(3);
		Node c = new Node(4);
		Node d = new Node(5);
		Node e = new Node(6);
		
		head.next = a;
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		
		head.printList(head);

		Node reverse = reverseRecursion(head);
		
		reverse.printList(reverse);
	}

}
