package roy.question.pkg;

import roy.general.pkg.Node;
/**************************************************************************
 * author : Shilpita Roy
 * date   : Jan14,2017
 * purpose: Given a Linked List and int k, reverse the list by block of k.
 * 			Input: 17->15->8->12->10->5->4->1->7->6->NULL  int k = 3
 *			Output: 8->15->17->5->10->12->7->1->4->6->NULL
 * 			Geek4Geeks
 * *****************************************************************************/

public class ReverseKGroup {
	private static Node head;
	public static Node reverseK(Node head, int k){
		if(head == null || head.next == null)
			return head;
		
		Node prev = null;
		Node next = null;
		Node curr = head;
		
        int length =0;
        while(curr!= null){
            curr = curr.next;
            length++;
        }
        curr = head;
        
        if(k > length)
           return head;
         
		
		int count =0;
		while(curr!= null && count < k){
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
			count++;
		}
		
		if(next!= null){
			System.out.println("\nhead:"+head.getData());
			head.next = reverseK(next,k);
			
		}
		return prev;
	}
	

	public static void main(String[] args) {
		head = new Node(16);
		Node a = new Node(14);
		Node b = new Node(7);
		Node c = new Node(12);
		Node d = new Node(5);
		Node e = new Node(6);
		
		head.next = a;
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = new Node(41);
		head.printList(head);

		Node result = reverseK(head,3);
		result.printList(result);
	}

}
