package roy.question.pkg;

import roy.general.pkg.Node;

/**************************************************************************
 * author : Shilpita Roy
 * date   : Jan14,2017
 * purpose: Given a Linked List move the last node to the front
 * 			Geek4Geeks
 * *****************************************************************************/
public class MoveLastNodeToHead {
	
	public static Node lastNodetoFront(Node head){
		if(head == null || head.next == null) return head;
		Node current = head;
		Node last = head;
		Node prev = null;
		while(last.next != null){
			prev = last;
			last = last.next; 
		}
		prev.next = null;
		head = last;
		head.next = current;
		return head;
	}

	public static void main(String[] args) {
		Node head = new Node(1);
		Node a = new Node(3);
		head.next = new Node(2);
		head.next.next = a;
		a.next = new Node(4);
		a.next.next = new Node(5);
		head.printList(head);
		Node result =lastNodetoFront(head);
		result.printList(result);
	}

}
