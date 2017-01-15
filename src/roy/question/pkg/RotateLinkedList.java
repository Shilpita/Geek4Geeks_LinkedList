package roy.question.pkg;

import roy.general.pkg.Node;

/**************************************************************************
 * author : Shilpita Roy
 * date   : Jan13,2017
 * purpose: Rotate a list by kth position
 * 			Geek4Geeks
 * *****************************************************************************/
public class RotateLinkedList {
	public static Node rotatedList(Node head, int position){
		if(position == 0) return head;
		if(head == null) return null;
		Node current = head;
		Node prev = null;
		int count = 0;
		while(count < position && current != null){
			prev = current;
			current = current.next;
			count++;
		}
		if(current == null)return null;
		prev.next = null;
		Node temp = current;
		while(current.next != null){
			current = current.next;
		}
		current.next = head;
		head = temp;
		return head;
	}

	public static void main(String[] args) {
		
		Node head = new Node(10);
		Node a = new Node(20);
		Node b = new Node(30);
		Node c = new Node(40);
		head.next = a;
		a.next =b;
		b.next =c;
		c.next = new Node(50);
		c.next.next = new Node(60);
		head.printList(head);
		Node result = rotatedList(head, 3);
		result.printList(result);
	}

}
