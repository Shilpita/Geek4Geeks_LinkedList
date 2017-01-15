package roy.question.pkg;

import roy.general.pkg.Node;

/**************************************************************************
 * author : Shilpita Roy
 * date   : Jan14,2017
 * purpose: Given a Linked List segregate the even and odd valued nodes.
 * 			Input: 17->15->8->12->10->5->4->1->7->6->NULL
 *			Output: 8->12->10->4->6->17->15->5->1->7->NULL
 * 			Geek4Geeks
 * *****************************************************************************/

public class SegregateEvenOdd {
	private static Node head;
	public static void segregateOddEven(){
		if(head == null || head.next == null)
			return;
		
		Node prev = null;
		Node curr = head;   //-> LOOP POINTER
		Node fixEnd = head; //-> END OF THE ORIGINAL LIST
		Node newEnd = null; //-> END OF THE MODIFIED SEGREGATED LIST
		
		/* FIND THE END OF ORIGINAL LIST : fixEnd */
		while(fixEnd.next != null)
			fixEnd = fixEnd.next;
		
		/* MARK THE NEW END OF THE MODIFIED LIST: newEnd */
		newEnd = fixEnd;
		
		/* ADD ALL THE ODD VALUES TO THE END OF THE MODIFIED LIST TILL FIRST EVEN ENCOUNTERED */
		while(curr.getData()%2 != 0 && curr!= fixEnd){
			newEnd.next = curr;
			curr = curr.next; //->MOVE LOOP POINTER 
			newEnd = newEnd.next;
			newEnd.next = null;
		}
		
		/* MAKE THE FIRST ENCOUNTERED EVEN VALUE AS HEAD AND THEN GO THROUGH REST OF LIST */
		if(curr.getData()%2 == 0){
			head = curr;
			while(curr != fixEnd){ //->LOOP THROUGH TILL THE END OF ORIGINAL LIST : fixEnd
				if(curr.getData()%2 ==0){
					//IF EVEN KEEP MOVING
					prev = curr;
					curr = curr.next;
				}else{
					//IF ODD ENCOUNTERED MOVE TO END OF MODIFIED LIST : newEnd
					prev.next = curr.next;
					newEnd.next = curr; // move to end
					newEnd = newEnd.next;
					newEnd.next = null; // set new end next to null
					curr = prev.next; // move loop pointer
				}
			}
		} else prev = curr;
		
		if(newEnd!= fixEnd && fixEnd.getData()%2 !=0){
			prev.next = curr.next;
			newEnd.next = curr;
			newEnd = newEnd.next;
			newEnd.next = null;
		}
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
		segregateOddEven();
		head.printList(head);
	}

}
