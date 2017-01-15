package roy.question.pkg;
/**************************************************************************
 * author : Shilpita Roy
 * date   : Jan14,2017
 * purpose: Given a Linked List swap a pair of adjacent nodes
 * 			Geek4Geeks
 * *****************************************************************************/
import roy.general.pkg.Node;

public class SwapPairs {
	/**
	 * The dummy node is used in place of prev. and first and second denote nodes of the pair to be swapped.
	 * @param head
	 * @return dummy.next
	 */
	public static Node swapPairNodes(Node head){
		if(head == null|| head.next == null) return head;
		Node dummy = new Node(Integer.MIN_VALUE);
		dummy.next = head;
		Node current = dummy;
		while(current.next!= null && current.next.next!= null){
			Node first = current.next;
			Node second= current.next.next;
			first.next = second.next;
			current.next = second;
			current.next.next = first;
			current = current.next.next;
		}
		return dummy.next;
	}

	public static void main(String[] args) {
		Node head = new Node(1);
		Node a = new Node(3);
		head.next = new Node(2);
		head.next.next = a;
		a.next = new Node(4);
		a.next.next = new Node(5);
		head.printList(head);

		Node result = swapPairNodes(head);
		
		result.printList(result);
	}

}
