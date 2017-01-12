package roy.question.pkg;
import roy.general.pkg.Node;
/**************************************************************************
 * author : Shilpita Roy
 * date   : April5,2016
 * purpose: Swap Node without swapping data from Linked List
 * 			Geek4Geeks
 * *****************************************************************************/
public class SwapNodes {
	Node head;  // head of list
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
	

	public void swapNodes(int x ,int y){
		if(x==y)
			return;
        // find x
		Node prevX = null , currX = head;
		while(currX != null && currX.getData() != x){
			prevX = currX ;
			currX = currX.getNext() ;
		}
		
		// find y
		Node prevY = null , currY = head;
		while(currY != null && currY.getData() != y){
			prevY = currY ;
			currY = currY.getNext() ;
		}
		//System.out.println("\n swap" +currX.data + currY.data);
		
		if(currY == null || currX == null)
			return;
		
		
		if (prevX != null)
			prevX.setNext(currY);
		else 
			head = currY;
		
		if (prevY != null)
			prevY.setNext(currX);
		else 
			head = currX;

        Node temp = currX.getNext();
        currX.setNext(currY.getNext());
        currY.setNext(temp);
	}
	
	
	public void printList()
	{
		Node tNode = head;
		while (tNode != null)
		{
			System.out.print(tNode.getData()+" ");
			tNode = tNode.getNext();
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
