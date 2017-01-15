package roy.question.pkg;

import roy.general.pkg.Node;

/**************************************************************************
 * author : Shilpita Roy
 * date   : Jan14,2017
 * purpose: Given a Linked List split alternative nodes in sub-lists.
 * 			Geek4Geeks
 * *****************************************************************************/

public class AlternateSplit {
	static Node list1;
	static Node list2 ;
	static Node head ;
	
	private static void alternateSplit(Node head) {
		if(head == null) return;
		if(head.next == null) {
			list1 = head;
			return;
		}
			
		Node l1 = head;
		Node l2 = head.next;
		list1 = l1;
		list2 = l2;
		
		while(l1!=null && l2!= null){
			l1.next = l2.next;
			if(l1.next != null){
				l2.next = l1.next.next;
			}else{
				l2.next = null;
				return;
			}
			
			l1 = l1.next;
			l2 = l2.next;
		}
	}
	
	public static void main(String[] args) {
		list1 = new Node();
		list2 = new Node();
		head = new Node(1);
		Node a = new Node(3);
		head.next = new Node(2);
		head.next.next = a;
		a.next = new Node(4);
		a.next.next = new Node(5);
		a.next.next.next = new Node(6);
		head.printList(head);
		alternateSplit(head);
		list1.printList(list1);
		list2.printList(list2);
	}
}
