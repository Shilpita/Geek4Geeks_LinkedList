
public class ReverseLinkedList {
    static Node head;
	public void append(int new_data)
	{
	    
	    Node new_node = new Node(new_data);
	    if (head == null)
	    {
	        head = new Node(new_data);
	        return;
	    }
	    
	    new_node.next = null;
	    Node last = head; 
	    while (last.next != null)
	        last = last.next;
	    
	    last.next = new_node;
	    return;
	}
	
	public void printList()
	{
		Node linkedList = head;
		while (linkedList != null)
		{
			System.out.print(linkedList.data+" ");
			linkedList = linkedList.next;
		}
	}
	// iterative method
	public void reverseList(){
		Node current = head ;
		Node prev = null;
		Node next = null;
		
		
		while(current != null){
			next = current.next;
			current.next = prev;
			prev = current ;
			current = next ;
		}
		head = prev;
		
	}
	
	// recursive method
	public Node reverseRecList(Node head){
	
		if(head == null)
			return null;
		
		//recursively rotate rest of list
		Node temp = reverseRecList(head.next);
		if(temp == null)
			    return head;
		else{
				head.next.next = head;
				head.next = null ;       
		}
		
		return temp;
	}
	
	public static void main(String[] args) {
		ReverseLinkedList list = new ReverseLinkedList();
		list.append(1);
		list.append(2);
		list.append(3);
		list.append(4);
		list.append(5);
		list.append(6);
		list.printList();

		list.reverseList();
		
		System.out.println("\nIterative:");
		list.printList();
		
		head = list.reverseRecList(head);
		
		System.out.println("\nRecursive:");
		list.printList();
	}

}
