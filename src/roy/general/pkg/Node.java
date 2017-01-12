package roy.general.pkg;

/* Node Class */
    public class Node
    {
        private int data;
        public Node next;
        
        public Node(){
        	this.data = 0;
        	this.next = null;
        }
          
        // Constructor to create a new node
        public Node(int d) {
        	this.data = d;
        	this.next = null; 
        }

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public int getData() {
			return data;
		}

		protected void setData(int data) {
			this.data = data;
		}
		
		public void printList(Node head){
			Node n = head;
			System.out.println();
			while(n!= null){
				System.out.print(n.getData() +"\t");
				n = n.next;
			}
		}
    }
