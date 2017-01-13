package roy.question.pkg;

import roy.general.pkg.Node;

/**************************************************************************
 * author : Shilpita Roy
 * date   : Jan13,2017
 * purpose: Delete A node from linked List at a given position
 * 			Geek4Geeks
 * *****************************************************************************/
public class DeleteNodeAtPosition {
	private static Node head;
	public static void deleteAtPosition(int position){
		Node current = head;
		if(head == null) System.out.println("Empty List");
		else if (position ==0)
			head = current.next;
		else{
			Node prev = null;
			//Node next = null;
			int count =0;
			while(count < position && current != null ){
				prev = current;
				//next = current.next;
				current = current.next;
				count++;
			}
			if(current == null || current.next == null)
				return;
			Node next  = current.next;
			prev.next = next;
			//current.next = null;
		}
	}

	public static void main(String[] args) {
		head = new Node(5);
		Node l1 = new Node(2);
		head.setNext(l1);
		Node l2 = new Node(4);
		l1.setNext(l2);
		l2.setNext(new Node(8));
		l2.next.setNext(new Node(9));
		head.printList(head);
		deleteAtPosition(2);
		head.printList(head);
	}

}
