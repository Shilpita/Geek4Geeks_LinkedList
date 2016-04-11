
public class DeleteNode {
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
	
	//recursively Delete node from linked list
	public Node deleteNode(int key, Node current){
		//Node current = head;
		if(current == null) 
				return null;
		if(head.data == key){
			head = head.next;
			  return head;
		}
		else if(current.next == null)
			return current;
		else if(current.next.data == key){
			Node temp = current.next;
			current.next = temp.next;
		  return head;
		}else
			return deleteNode(key,current.next);
	
	}
	
	public static void main(String[] args) {
		DeleteNode list = new DeleteNode();
		list.append(1);
		list.append(2);
		list.append(3);
		list.append(4);
		list.append(5);
		list.append(6);
		list.printList();

		head = list.deleteNode(6, head); 
		System.out.println("\nAfter Deleting :");
		list.printList();
	}

}
