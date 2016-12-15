import roy.general.pkg.Node;

/**************************************************************************
 * author : Shilpita Roy
 * date   : 1 April 2016
 * purpose: Add Insert Delete from Linked List
 * *****************************************************************************/
public class AddInsertLinkedList {
    Node head;  // head of list
    

    public void insertHead(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.setNext(head);
        head = new_node;
    }

	public void insertAfterNode(Node prev_node, int new_data)
	{
	    if (prev_node == null)
	    {
	        System.out.println("The given previous node is null");
	        return;
	    }
	 
	    Node new_node = new Node(new_data);
	    new_node.setNext(prev_node.getNext());
	    prev_node.setNext(new_node);
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

	public static void main(String[] args) {
		AddInsertLinkedList list = new AddInsertLinkedList();
		list.append(6);
		list.insertHead(5);
		list.insertHead(1);
		list.insertHead(8);
		list.insertAfterNode(list.head.getNext(), 2);
		  while (list.head != null)
	        {
	            System.out.print(list.head.getData()+" ");
	            list.head = list.head.getNext();
	        }
	}

}
