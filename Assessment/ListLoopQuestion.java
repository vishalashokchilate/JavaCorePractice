package Assessment;

//import Assessment.MergeListProblem.Node;

// I have created two pointer to iterate through entire list, one pointer will move with one step and second pointer
// will move with two steps in each iteration. If there will be any loop in list, this two pointer eventuLLY enter into the loop and 
// relative distance 
// between this two pointers will decrease by 1 until they meet, is there wont be any loop they would not meet
// time complexity : as we have to traverse the entire list of n node, hence O(n). Space: O(1) since I have not used
// any extra space.

public class ListLoopQuestion {

	  public static class ListNode {

	     public int value;

	     public ListNode next;
	     
	     public ListNode(){
	    	 this.value = 0;
	    	 this.next = null;
	     }
	     
	     public ListNode(int value, ListNode next){
	    	 this.value = value;
	    	 this.next = next;
	     }
	     
	     public void insert(ListNode head, int value){
	    	 
	    	while(head.next!=null)
	    		head = head.next;
	    	head.next = new ListNode(value, null);
	    }
	     
	     
	     public void createloop(ListNode head, int value){
	    	 ListNode n = seach(head, value);
	    	 
		    	while(head.next!=null)
		    		head = head.next;
		    	head.next = n;
		    }
	     
	     
	     private ListNode seach(ListNode head, int value) {
	         ListNode temp = head;
	         while (temp != null) {
	             if (temp.value==value) {
	                 return temp;
	             }
	             temp = temp.next;
	         }
	         return null;
	     }
	     
	     public void print(ListNode node){
	    	 
	    	 while(node!=null){
	    		 System.out.println(node.value);
	    		 node = node.next;
	    		 
	    }
	     }
	    
	     
	  }
	  
	  
	  public static void main(String[] argv){
		  
		  ListNode head = new ListNode(10,null); // creating head of linked list
		  head.insert(head,20); // inserting at the end of list
		  head.insert(head,30);
		  head.insert(head,40);
		  head.insert(head,50);
		  head.print(head);  // printing list
		  
		    ListNode head1 = new ListNode(1,null);
			ListNode head2 = new ListNode(1,null);
			head1.insert(head1,2);
			head1.insert(head1,3);
			head1.insert(head1,4);
			head2.insert(head2,3);
			head2.insert(head2,5);
			head2.insert(head2,7);

		//	head1.print(head1);
			System.out.println("***");
		//	head2.print(head2);
			
		  
		  ListLoopQuestion l1 = new ListLoopQuestion();
	//  ListNode head3 = l1.mergeLists(head1, head2);
	//	  System.out.println("Mergr lIst: ");
	//	  head3.print(head3);
		  
		  System.out.println(l1.hasLoops(head));
		  head.createloop(head,	40);
		  System.out.println(l1.hasLoops(head));
		  
		  
	  }
	  
	  
	  
	  public boolean hasLoops( ListNode head ) {

		  if (head==null)
			  return false;
		  ListNode pt1 = head.next;
		  if (pt1==null)
			  return false;
		  ListNode pt2 = head.next.next;
		  while(pt1!=null && pt2!=null){
			  if (pt1==pt2)
				  return true;
			  pt1=pt1.next;
			  pt2=pt2.next;
			  if(pt2!=null)
				  pt2=pt2.next;
			  			  			  	  
		  }
		  
		  return false;	  
	 }

	  

	  
	  
	}