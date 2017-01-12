package roy.question.pkg;

import roy.general.pkg.Node;
/**************************************************************************
 * author : Shilpita Roy
 * date   : Jan7,2017
 * purpose: Get middle Node from Linked List
 * 			Geek4Geeks
 * *****************************************************************************/
public class MiddleLinkedList {
	public static Node middleNode(Node head){
		if(head == null) return null;
		Node slowPnt = head;
		Node fastPnt = head;
		while(fastPnt != null && fastPnt.next != null){
			slowPnt = slowPnt.next;
			fastPnt = fastPnt.next.next;
		}
		return slowPnt;	
	}

	public static void main(String[] args) {
		Node head = new Node(1);
		Node a = new Node(2);
		Node b = new Node(3);
		Node c = new Node(2);
		Node d = new Node(2);
		Node e = new Node(1);
		
		head.setNext(a);
		a.setNext(b);
		b.setNext(c);
		c.setNext(d);
		d.setNext(e);
		
		head.printList(head);
		Node middle = middleNode(head);
		System.out.println("\nMiddle of List "+middle.getData());
		
	}

}
