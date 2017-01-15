package roy.question.pkg;

import roy.general.pkg.Node;

/**************************************************************************
 * author : Shilpita Roy
 * date   : Jan14,2017
 * purpose: Given a Linked List delete alternative nodes
 * 			Geek4Geeks
 * *****************************************************************************/
public class DeleteAlternateNodes {

	private static Node deleteAlternate(Node head) {
		if(head == null || head.next == null)
			return head;
		if(head.next.next == null){
			head.next = null;
			return head;
		}
		
		Node current = head;
		Node newNext = null;
		
		while(current.next != null && current.next.next!= null){
			newNext = current.next.next;
			current.next = newNext;
			current = newNext;
			if(current.next!= null && current.next.next == null)
				current.next = null;
		}
		
		return head;
	}
	
	public static void main(String[] args) {
		Node head = new Node(1);
		Node a = new Node(3);
		head.next = new Node(2);
		head.next.next = a;
		a.next = new Node(4);
		a.next.next = new Node(5);
		a.next.next.next = new Node(6);
		head.printList(head);
		Node result = deleteAlternate(head);
		result.printList(result);
	}

}
