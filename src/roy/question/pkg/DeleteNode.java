package roy.question.pkg;
import roy.general.pkg.Node;
/**************************************************************************
 * author : Shilpita Roy
 * date   : Jan5,2016
 * purpose: Delete Node from Linked List
 * 			Geek4Geeks
 * *****************************************************************************/
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
	
	//recursively Delete node from linked list
	public Node deleteNode(int key, Node current){
		//Node current = head;
		if(current == null) 
				return null;
		if(head.getData() == key){
			head = head.getNext();
			  return head;
		}
		else if(current.getNext() == null)
			return current;
		else if(current.getNext().getData() == key){
			Node temp = current.getNext();
			current.setNext(temp.getNext());
		  return head;
		}else
			return deleteNode(key,current.getNext());
	
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
