package roy.question.pkg;

import roy.general.pkg.Node;

public class MergeSortList {
	public static int getLengthList(Node list){
		if(list == null) return 0;
		int count =0;
		Node curr = list;
		while(curr!= null){
			curr = curr.next;
			count++;
		}
			return count;
	}
	public static Node mergeList(Node t1, Node t2){
		if(t1==null && t2 == null) return null;
		if(t1 == null && t2 != null) return t2;
		if(t2 == null && t1 != null) return t1;
		Node result = null;
		if(t1.getData() < t2.getData()){
			result = t1;
			result.next = mergeList(t1.next, t2);
		}else{
			result = t2;
			result.next = mergeList(t1, t2.next);
		}
		return result ;
	}
	
	public static Node sort(Node head){
		if(head == null) return null;
		if(head.next == null) return head;
		Node head1 = head;
		Node head2 = null;
		int mid = getLengthList(head)/2; 
		//System.out.println(mid);
		for(int i =0 ; i< mid-1 ; i++)
			head1 = head1.next;
		head2 = head1.next;
		head1.next = null;
		head1 = head;
		Node list1 = sort(head1);
		Node list2 = sort(head2);
		
		return mergeList(list1,list2);
	}

	public static void main(String[] args) {
		Node list = new Node(10);
		Node a = new Node(2);
		list.setNext(a);
		a.setNext(new Node(9));
		a.next.setNext(new Node(1));
		a.next.next.next =new Node(7);
		list.printList(list);
		list = sort(list);
		list.printList(list);
		
	}

}
