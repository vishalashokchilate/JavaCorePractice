// Time complexity of this is O(n),
// Approach: If any of the list is null, it will return other list else keep traversing both the list
// and start comparing from first node of both the list, node which has less value will be part of new mergelist
// and move that node to its next node and do'nt move the other node. keep doing this till any one of list reaches to end
// and handle some corner cases.


package Assessment;
import Assessment.Node;
import java.util.LinkedList;;


public class MergeListProblm {

	public static void main(String[] argv){
		
		System.out.println("Hello World");
		Node head1 = new Node(1,null);
		Node head2 = new Node(1,null);
		head1.insert(head1,2);
		head1.insert(head1,3);
		head1.insert(head1,4);
		head2.insert(head2,3);
		head2.insert(head2,5);
		head2.insert(head2,7);
		System.out.println("First Sorted List");
		head1.print(head1);
		System.out.println("Second Sorted List");
		head2.print(head2);
		
		MergeListProblm obj = new MergeListProblm();
		Node mergeNode = obj.mergeLists(head1, head2);
		System.out.println("Merge Sorted List");
		mergeNode.print(mergeNode);
		
	}
	
	public static Node mergeLists(Node head1, Node head2) {

        // your code goes here
		if (head1==null && head2!=null)
	    	  return head2;
	      if (head1!=null && head2==null)
	    	  return head1;
	      if (head1==null && head2==null)
	    	  return null;
	      Node head3 = new Node();
			Node node = head3;
	      while(head1!=null && head2!=null){
	    	  
	    	  if (head1.value <= head2.value){
	    		  node.next = head1;
	    		  head1=head1.next;
	    		 
	    	  }
	    	  	  else{
	    	  		  node.next = head2;
		    		  head2=head2.next;
		    		 }
	    	  	  
	    	  node = node.next;
	      }
	      
	     if(head1!=null)
	    	  node.next=head1;
	      if(head2!=null)
	    	  node.next=head2;
	      
	    return head3.next;

	}
	
}
