package roy.question.pkg;

import roy.general.pkg.Node;

/**************************************************************************
 * author : Shilpita Roy
 * date   : Mar16,2017
 * purpose: Given a Linked List of data 0,1,2 sort them in ascending order.
 * 			step1) count occurrences of 0s 1s and 2s
 * 			step2) set the node data to 0,1,or 2 as per the count of their occurrences 
 * 			Geek4Geeks
 * 
 * The Time complexity is O(N)
 * *****************************************************************************/


public class SortNodes012 {
	private static Node head;
	
	public static int[] countOccurences(Node head){
		int[] result = {0,0,0};
		if(head == null) return result;
		Node node = head;
		while(node != null){
			++result[node.getData()];
			node = node.next;
		}
		return result;
	}
	
	public static Node sort012(Node head){
		int[] count = countOccurences(head);
		Node node = head;
			int i =0;
			while(node != null){
					if(count[i] > 0){
						node.setData(i);
						count[i]--;
						node = node.next;
				    }else{
				    	i++;
				    }
		}
			return head;
	}
	
	public static void main(String[] args) {
		head = new Node(1);
		Node a = new Node(2);
		Node b = new Node(0);
		Node c = new Node(1);
		Node d = new Node(2);
		Node e = new Node(0);
		Node f = new Node(2);
		
		head.next = a;
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = f;
		
		head.printList(head);
		
		int[] result = countOccurences(head);
		System.out.println("\n"+result[0]+result[1]+result[2]);
		
		Node node = sort012(head);
		node.printList(node);
	}

}
