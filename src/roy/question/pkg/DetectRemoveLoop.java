package roy.question.pkg;

import roy.general.pkg.Node;

/**************************************************************************
 * author : Shilpita Roy
 * date   : Mar3,2017
 * purpose: Given two Linked Lists check if they are identical.
 * 			Geek4Geeks
 * *****************************************************************************/
public class DetectRemoveLoop {
	
	public static boolean detectRemoveCycle(Node head){
		if(head == null || head.next == null)
			return false;
		boolean out =false;
		/****FLYOD ALGORITHM FOR LOOP DETECTIONUSING FAST AND SLOW POINTER*/
		Node fast = head;
		Node slow = head;
		while(slow != null && fast != null && fast.next != null){
			if(fast == slow){
				out = true;  
				//System.out.println("FOUND LOOP");
				break; // AS SOON AS CYCLE DETECTED BREAK FROM WHILE LOOP
			}
			fast = fast.next.next;
			slow = slow.next;
		}
		/***FIND THE START POINT OF THE CYCLE USING FAST POINTER****/
		if(slow == fast){
			//System.out.println("SET SLOW TO HEAD");
			slow = head; // SET SLOW POINTER TO HEAD OF LIST
			while(slow != fast.next){ // RUN LOOP TO DETECT THE STARTING POINT OF THE CYCLE
				slow = slow.next;
				fast = fast.next.next;
				//System.out.println("SLOW AND FAST NOT MATCHING");
			}
			
			fast.next.next = null; // SET THE START POINT OF THE CYCLE TO NULL
		}
		return out;
	}
	
	

	public static void main(String[] args) {
		Node head = new Node(16);
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
		e.next.next = new Node(42);
		e.next.next.next = d;
		//head.printList(head);
		boolean result = detectRemoveCycle(head);
		System.out.println("The list has cycle :"+ result);
		head.printList(head);
	}

}
