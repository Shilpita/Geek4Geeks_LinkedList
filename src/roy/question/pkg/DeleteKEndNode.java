package roy.question.pkg;
import roy.general.pkg.Node;
/**************************************************************************
 * author : Shilpita Roy
 * date   : 1 April 2016
 * purpose: Delete Kth end Node from Linked List
 * 			Geek4Geeks
 * *****************************************************************************/
public class DeleteKEndNode {
	static Node head;  // head of list
    public void insertHead(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.setNext(head);
        head = new_node;
    }
	public void append(int new_data)
	{
	    
	    Node new_node = new Node(new_data);
	    if (head == null)
	    {
	        head = new Node(new_data);
	        return;
	    }
	    
	    new_node.setNext(null);
	    Node last = head; 
	    while (last.getNext() != null)
	        last = last.getNext();
	    
	    last.setNext(new_node);
	    return;
	}
	public void printList()
	{
		Node linkedList = head;
		while (linkedList != null)
		{
			System.out.print(linkedList.getData()+" ");
			linkedList = linkedList.getNext();
		}
	}
	
	
	// recursive method
	public Node reverseRecList(Node head){
	
		if(head == null)
			return null;
		
		//recursively rotate rest of list
		Node temp = reverseRecList(head.getNext());
		if(temp == null)
			    return head;
		else{
				head.getNext().next = head;
				head.setNext(null) ;       
		}
		
		return temp;
	}
	
	public static Node deleteNode(Node head , int k){
		if(head  == null) 
			return null;
		if(head.getNext() == null && k==1)
			return null;
		Node current = head;
		int counter = 1;
		while (current.getNext()!= null){
			if(counter == k-1){
				Node temp = current.getNext();
				current.setNext(temp.getNext());
				return head;
			}else{
				counter++;
				current = current.getNext();
			}
		}
		return head;
	}
	
	
	
	public static void main(String[] args) {
		DeleteKEndNode list = new DeleteKEndNode();
		list.insertHead(1);
		list.append(2);
		list.append(5);
		//list.append(1);
	//	list.append(8);
		//list.append(2);
		//list.append(4);
		list.printList();
		head = list.reverseRecList(head);
		System.out.println("\n");
		list.printList();
		head = list.deleteNode(head, 2);
		System.out.println("\n");
		list.printList();
		head = list.reverseRecList(head);
		System.out.println("\n");
		list.printList();
	}

}
