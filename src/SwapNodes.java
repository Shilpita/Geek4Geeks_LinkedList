
public class SwapNodes {
	Node head;  // head of list
    public void insertHead(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
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
	    
	    new_node.next = null;
	    Node last = head; 
	    while (last.next != null)
	        last = last.next;
	    
	    last.next = new_node;
	    return;
	}
	

	public void swapNodes(int x ,int y){
		if(x==y)
			return;
        // find x
		Node prevX = null , currX = head;
		while(currX != null && currX.data != x){
			prevX = currX ;
			currX = currX.next ;
		}
		
		// find y
		Node prevY = null , currY = head;
		while(currY != null && currY.data != y){
			prevY = currY ;
			currY = currY.next ;
		}
		//System.out.println("\n swap" +currX.data + currY.data);
		
		if(currY == null || currX == null)
			return;
		
		
		if (prevX != null)
			prevX.next = currY;
		else 
			head = currY;
		
		if (prevY != null)
			prevY.next = currX;
		else 
			head = currX;

        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;
	}
	
	
	public void printList()
	{
		Node tNode = head;
		while (tNode != null)
		{
			System.out.print(tNode.data+" ");
			tNode = tNode.next;
		}
	}
	
	public static void main(String[] args) {
		SwapNodes list = new SwapNodes();
		list.insertHead(0);
		list.append(6);
		list.append(5);
		list.append(1);
		list.append(8);
		list.append(2);
		list.printList();
		
		  list.swapNodes(6,2);
		  
		  System.out.print("\n");
		  list.printList();
		 
	}

}
