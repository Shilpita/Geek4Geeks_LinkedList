package roy.question.pkg;

import roy.general.pkg.Node;

/**************************************************************************
 * author : Shilpita Roy
 * date   : Jan14,2017
 * purpose: Given two Linked Lists check if they are identical.
 * 			Geek4Geeks
 * *****************************************************************************/

public class IdenticalLists {
	private static Node l1 ;
	private static Node l2 ;

	public static boolean isIdentical(Node l1, Node l2){
		Node a = l1;
		Node b = l2;
		
		while(a!= null && b!= null){
			if(a.getData() != b.getData())
				return false;
			a= a.next;
			b= b.next;
		}
		if(a == null && b!=null)
			return false;
		if(b == null && a!=null)
			return false;
		
		return true;
	}
	
	public static void main(String[] args) {
		l1 = new Node(1);
		l1.next = new Node(2);
		l1.next.next =new Node(3);
		l1.printList(l1);
		
//		l2 = null;
		l2 = new Node(1);
		l2.next = new Node(2);
	    l2.next.next =new Node(3);
		l2.printList(l2);
		
		System.out.println("\nlist1 is identical to list2 : "+ isIdentical(l1, l2));
	}

}


