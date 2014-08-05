package Assessment;


public class Node {

    public int value;

    public Node next;

    public Node() {

            value = 0;

            next = null;

    }
    public Node(int value, Node next) {

            this.value = value;

            this.next = next;

    }

    public void insert(Node head, int value){
   	 
    	while(head.next!=null)
    		head = head.next;
    	head.next = new Node(value, null);
    }

    
    public void print(Node node){
    	 
    	 while(node!=null){
    		 System.out.println(node.value);
    		 node = node.next;
    		 
    	 	}
    }

}

